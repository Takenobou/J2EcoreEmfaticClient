/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Place#getToken <em>Token</em>}</li>
 *   <li>{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Place extends Node
{
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected int token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalMarking() <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_MARKING_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Place()
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
		return PtnetLoLAPackage.Literals.PLACE;
	}

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(int)
	 * @generated
	 */
	public int getToken()
	{
		return token;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newToken the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	public void setToken(int newToken)
	{
		token = newToken;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' attribute.
	 * @see #setFinalMarking(int)
	 * @generated
	 */
	public int getFinalMarking()
	{
		// TODO: implement this method to return the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' attribute.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(int newFinalMarking)
	{
		// TODO: implement this method to set the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return getToken();
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken((Integer)newValue);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking((Integer)newValue);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking(FINAL_MARKING_EDEFAULT);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return token != TOKEN_EDEFAULT;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking() != FINAL_MARKING_EDEFAULT;
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
		result.append(" (token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} // Place
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Place#getToken <em>Token</em>}</li>
 *   <li>{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Place extends Node
{
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected int token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalMarking() <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_MARKING_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Place()
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
		return PtnetLoLAPackage.Literals.PLACE;
	}

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(int)
	 * @generated
	 */
	public int getToken()
	{
		return token;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newToken the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	public void setToken(int newToken)
	{
		token = newToken;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' attribute.
	 * @see #setFinalMarking(int)
	 * @generated
	 */
	public int getFinalMarking()
	{
		// TODO: implement this method to return the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' attribute.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(int newFinalMarking)
	{
		// TODO: implement this method to set the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return getToken();
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken((Integer)newValue);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking((Integer)newValue);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking(FINAL_MARKING_EDEFAULT);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return token != TOKEN_EDEFAULT;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking() != FINAL_MARKING_EDEFAULT;
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
		result.append(" (token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} // Place
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Place#getToken <em>Token</em>}</li>
 *   <li>{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Place extends Node
{
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected int token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalMarking() <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_MARKING_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Place()
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
		return PtnetLoLAPackage.Literals.PLACE;
	}

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(int)
	 * @generated
	 */
	public int getToken()
	{
		return token;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newToken the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	public void setToken(int newToken)
	{
		token = newToken;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' attribute.
	 * @see #setFinalMarking(int)
	 * @generated
	 */
	public int getFinalMarking()
	{
		// TODO: implement this method to return the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' attribute.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(int newFinalMarking)
	{
		// TODO: implement this method to set the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return getToken();
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken((Integer)newValue);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking((Integer)newValue);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking(FINAL_MARKING_EDEFAULT);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return token != TOKEN_EDEFAULT;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking() != FINAL_MARKING_EDEFAULT;
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
		result.append(" (token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} // Place
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Place#getToken <em>Token</em>}</li>
 *   <li>{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Place extends Node
{
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected int token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalMarking() <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_MARKING_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Place()
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
		return PtnetLoLAPackage.Literals.PLACE;
	}

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(int)
	 * @generated
	 */
	public int getToken()
	{
		return token;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newToken the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	public void setToken(int newToken)
	{
		token = newToken;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' attribute.
	 * @see #setFinalMarking(int)
	 * @generated
	 */
	public int getFinalMarking()
	{
		// TODO: implement this method to return the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' attribute.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(int newFinalMarking)
	{
		// TODO: implement this method to set the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return getToken();
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken((Integer)newValue);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking((Integer)newValue);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking(FINAL_MARKING_EDEFAULT);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return token != TOKEN_EDEFAULT;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking() != FINAL_MARKING_EDEFAULT;
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
		result.append(" (token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} // Place
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Place#getToken <em>Token</em>}</li>
 *   <li>{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Place extends Node
{
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected int token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalMarking() <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_MARKING_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Place()
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
		return PtnetLoLAPackage.Literals.PLACE;
	}

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(int)
	 * @generated
	 */
	public int getToken()
	{
		return token;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newToken the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	public void setToken(int newToken)
	{
		token = newToken;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' attribute.
	 * @see #setFinalMarking(int)
	 * @generated
	 */
	public int getFinalMarking()
	{
		// TODO: implement this method to return the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' attribute.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(int newFinalMarking)
	{
		// TODO: implement this method to set the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return getToken();
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken((Integer)newValue);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking((Integer)newValue);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking(FINAL_MARKING_EDEFAULT);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return token != TOKEN_EDEFAULT;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking() != FINAL_MARKING_EDEFAULT;
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
		result.append(" (token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} // Place
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Place#getToken <em>Token</em>}</li>
 *   <li>{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Place extends Node
{
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected int token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalMarking() <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_MARKING_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Place()
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
		return PtnetLoLAPackage.Literals.PLACE;
	}

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(int)
	 * @generated
	 */
	public int getToken()
	{
		return token;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newToken the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	public void setToken(int newToken)
	{
		token = newToken;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' attribute.
	 * @see #setFinalMarking(int)
	 * @generated
	 */
	public int getFinalMarking()
	{
		// TODO: implement this method to return the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' attribute.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(int newFinalMarking)
	{
		// TODO: implement this method to set the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return getToken();
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken((Integer)newValue);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking((Integer)newValue);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking(FINAL_MARKING_EDEFAULT);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return token != TOKEN_EDEFAULT;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking() != FINAL_MARKING_EDEFAULT;
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
		result.append(" (token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} // Place
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Place#getToken <em>Token</em>}</li>
 *   <li>{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Place extends Node
{
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected int token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalMarking() <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_MARKING_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Place()
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
		return PtnetLoLAPackage.Literals.PLACE;
	}

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(int)
	 * @generated
	 */
	public int getToken()
	{
		return token;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newToken the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	public void setToken(int newToken)
	{
		token = newToken;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' attribute.
	 * @see #setFinalMarking(int)
	 * @generated
	 */
	public int getFinalMarking()
	{
		// TODO: implement this method to return the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' attribute.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(int newFinalMarking)
	{
		// TODO: implement this method to set the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return getToken();
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken((Integer)newValue);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking((Integer)newValue);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking(FINAL_MARKING_EDEFAULT);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return token != TOKEN_EDEFAULT;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking() != FINAL_MARKING_EDEFAULT;
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
		result.append(" (token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} // Place
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Place#getToken <em>Token</em>}</li>
 *   <li>{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Place extends Node
{
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected int token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalMarking() <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_MARKING_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Place()
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
		return PtnetLoLAPackage.Literals.PLACE;
	}

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(int)
	 * @generated
	 */
	public int getToken()
	{
		return token;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newToken the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	public void setToken(int newToken)
	{
		token = newToken;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' attribute.
	 * @see #setFinalMarking(int)
	 * @generated
	 */
	public int getFinalMarking()
	{
		// TODO: implement this method to return the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' attribute.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(int newFinalMarking)
	{
		// TODO: implement this method to set the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return getToken();
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken((Integer)newValue);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking((Integer)newValue);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking(FINAL_MARKING_EDEFAULT);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return token != TOKEN_EDEFAULT;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking() != FINAL_MARKING_EDEFAULT;
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
		result.append(" (token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} // Place
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Place#getToken <em>Token</em>}</li>
 *   <li>{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Place extends Node
{
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected int token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalMarking() <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_MARKING_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Place()
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
		return PtnetLoLAPackage.Literals.PLACE;
	}

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(int)
	 * @generated
	 */
	public int getToken()
	{
		return token;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newToken the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	public void setToken(int newToken)
	{
		token = newToken;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' attribute.
	 * @see #setFinalMarking(int)
	 * @generated
	 */
	public int getFinalMarking()
	{
		// TODO: implement this method to return the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' attribute.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(int newFinalMarking)
	{
		// TODO: implement this method to set the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return getToken();
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken((Integer)newValue);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking((Integer)newValue);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking(FINAL_MARKING_EDEFAULT);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return token != TOKEN_EDEFAULT;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking() != FINAL_MARKING_EDEFAULT;
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
		result.append(" (token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} // Place
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Place#getToken <em>Token</em>}</li>
 *   <li>{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Place extends Node
{
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected int token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalMarking() <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_MARKING_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Place()
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
		return PtnetLoLAPackage.Literals.PLACE;
	}

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(int)
	 * @generated
	 */
	public int getToken()
	{
		return token;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newToken the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	public void setToken(int newToken)
	{
		token = newToken;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' attribute.
	 * @see #setFinalMarking(int)
	 * @generated
	 */
	public int getFinalMarking()
	{
		// TODO: implement this method to return the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' attribute.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(int newFinalMarking)
	{
		// TODO: implement this method to set the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return getToken();
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken((Integer)newValue);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking((Integer)newValue);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking(FINAL_MARKING_EDEFAULT);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return token != TOKEN_EDEFAULT;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking() != FINAL_MARKING_EDEFAULT;
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
		result.append(" (token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} // Place
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Place#getToken <em>Token</em>}</li>
 *   <li>{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Place extends Node
{
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected int token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalMarking() <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_MARKING_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Place()
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
		return PtnetLoLAPackage.Literals.PLACE;
	}

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(int)
	 * @generated
	 */
	public int getToken()
	{
		return token;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newToken the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	public void setToken(int newToken)
	{
		token = newToken;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' attribute.
	 * @see #setFinalMarking(int)
	 * @generated
	 */
	public int getFinalMarking()
	{
		// TODO: implement this method to return the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' attribute.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(int newFinalMarking)
	{
		// TODO: implement this method to set the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return getToken();
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken((Integer)newValue);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking((Integer)newValue);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking(FINAL_MARKING_EDEFAULT);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return token != TOKEN_EDEFAULT;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking() != FINAL_MARKING_EDEFAULT;
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
		result.append(" (token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} // Place
/**
 */
package ptnetLoLA;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.Place#getToken <em>Token</em>}</li>
 *   <li>{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Place extends Node
{
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected int token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalMarking() <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_MARKING_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Place()
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
		return PtnetLoLAPackage.Literals.PLACE;
	}

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(int)
	 * @generated
	 */
	public int getToken()
	{
		return token;
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newToken the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	public void setToken(int newToken)
	{
		token = newToken;
	}

	/**
	 * Returns the value of the '<em><b>Final Marking</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Marking</em>' attribute.
	 * @see #setFinalMarking(int)
	 * @generated
	 */
	public int getFinalMarking()
	{
		// TODO: implement this method to return the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Sets the value of the '{@link ptnetLoLA.Place#getFinalMarking <em>Final Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFinalMarking the new value of the '<em>Final Marking</em>' attribute.
	 * @see #getFinalMarking()
	 * @generated
	 */
	public void setFinalMarking(int newFinalMarking)
	{
		// TODO: implement this method to set the 'Final Marking' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return getToken();
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking();
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken((Integer)newValue);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking((Integer)newValue);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				setFinalMarking(FINAL_MARKING_EDEFAULT);
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
			case PtnetLoLAPackage.PLACE__TOKEN:
				return token != TOKEN_EDEFAULT;
			case PtnetLoLAPackage.PLACE__FINAL_MARKING:
				return getFinalMarking() != FINAL_MARKING_EDEFAULT;
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
		result.append(" (token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} // Place
