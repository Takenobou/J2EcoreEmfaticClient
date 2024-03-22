/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model kind="class"
 *        annotation="gmf.node label='Name'"
 * @generated
 */
public class RelationalForeignKey extends EObjectImpl implements EObject
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected RelationalTable referencedTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalForeignKey()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
	public RelationalTable getOwnedByTable()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOwnedByTable the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
	public void setOwnedByTable(RelationalTable newOwnedByTable)
	{
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null))
		{
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = newOwnedByTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	public RelationalTable getReferencedTable()
	{
		if (referencedTable != null && referencedTable.eIsProxy())
		{
			InternalEObject oldReferencedTable = referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalTable basicGetReferencedTable()
	{
		return referencedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs)
	{
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReferencedTable the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
	public void setReferencedTable(RelationalTable newReferencedTable)
	{
		if (newReferencedTable != referencedTable)
		{
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = newReferencedTable.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = referencedTable.eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // RelationalForeignKey
