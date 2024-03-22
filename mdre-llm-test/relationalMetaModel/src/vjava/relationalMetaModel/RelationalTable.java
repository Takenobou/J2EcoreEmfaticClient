/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
/**
 */
package relationalMetaModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @extends Object
 * @generated
 */
public class RelationalTable extends Object implements Object
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
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> foreignKeys;

	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalTable()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @generated
	 */
	public RelationalSchema getSchema()
	{
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
	{
		msgs = eBasicSetContainer(newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSchema the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	public void setSchema(RelationalSchema newSchema)
	{
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null))
		{
			if (EcoreUtil.isAncestor(this, (EObject)newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = newSchema.eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newName the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @generated
	 */
	public List<RelationalForeignKey> getForeignKeys()
	{
		if (foreignKeys == null)
		{
			foreignKeys = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return foreignKeys;
	}

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @generated
	 */
	public List<RelationalForeignKey> getReferencedBy()
	{
		if (referencedBy == null)
		{
			referencedBy = new BasicInternalEList<RelationalForeignKey>(RelationalForeignKey.class);
		}
		return referencedBy;
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
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

} // RelationalTable
