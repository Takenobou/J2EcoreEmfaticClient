/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M
/**
 */
package main;

import main.sub.subsub.SSC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link main.M#getP <em>P</em>}</li>
 * </ul>
 *
 * @see main.MainPackage#getM()
 * @model kind="class"
 * @generated
 */
public class M extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected SSC p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected M()
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
		return MainPackage.Literals.M;
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' reference.
	 * @see #setP(SSC)
	 * @see main.MainPackage#getM_P()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	public SSC getP()
	{
		if (p != null && p.eIsProxy())
		{
			InternalEObject oldP = p;
			p = (SSC)eResolveProxy(oldP);
			if (p != oldP)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.M__P, oldP, p));
			}
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSC basicGetP()
	{
		return p;
	}

	/**
	 * Sets the value of the '{@link main.M#getP <em>P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newP the new value of the '<em>P</em>' reference.
	 * @see #getP()
	 * @generated
	 */
	public void setP(SSC newP)
	{
		SSC oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.M__P, oldP, p));
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
			case MainPackage.M__P:
				if (resolve) return getP();
				return basicGetP();
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
			case MainPackage.M__P:
				setP((SSC)newValue);
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
			case MainPackage.M__P:
				setP((SSC)null);
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
			case MainPackage.M__P:
				return p != null;
		}
		return super.eIsSet(featureID);
	}

} // M