/**
 */
package ptnetLoLA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
 * @model
 * @generated
 */
public interface TransitionExt extends Transition
{
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Probability()
	 * @model default="1.0"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MinTime()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMinTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Cost()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MaxTime()
	 * @model default="0"
	 * @generated
	 */
	int getMaxTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(int value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Confidentiality()
	 * @model
	 * @generated
	 */
	Confidentiality getConfidentiality();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(Confidentiality value);

} // TransitionExt
/**
 */
package ptnetLoLA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
 * @model
 * @generated
 */
public interface TransitionExt extends Transition
{
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Probability()
	 * @model default="1.0"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MinTime()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMinTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Cost()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MaxTime()
	 * @model default="0"
	 * @generated
	 */
	int getMaxTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(int value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Confidentiality()
	 * @model
	 * @generated
	 */
	Confidentiality getConfidentiality();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(Confidentiality value);

} // TransitionExt
/**
 */
package ptnetLoLA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
 * @model
 * @generated
 */
public interface TransitionExt extends Transition
{
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Probability()
	 * @model default="1.0"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MinTime()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMinTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Cost()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MaxTime()
	 * @model default="0"
	 * @generated
	 */
	int getMaxTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(int value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Confidentiality()
	 * @model
	 * @generated
	 */
	Confidentiality getConfidentiality();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(Confidentiality value);

} // TransitionExt
/**
 */
package ptnetLoLA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
 * @model
 * @generated
 */
public interface TransitionExt extends Transition
{
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Probability()
	 * @model default="1.0"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MinTime()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMinTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Cost()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MaxTime()
	 * @model default="0"
	 * @generated
	 */
	int getMaxTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(int value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Confidentiality()
	 * @model
	 * @generated
	 */
	Confidentiality getConfidentiality();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(Confidentiality value);

} // TransitionExt
/**
 */
package ptnetLoLA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
 * @model
 * @generated
 */
public interface TransitionExt extends Transition
{
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Probability()
	 * @model default="1.0"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MinTime()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMinTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Cost()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MaxTime()
	 * @model default="0"
	 * @generated
	 */
	int getMaxTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(int value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Confidentiality()
	 * @model
	 * @generated
	 */
	Confidentiality getConfidentiality();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(Confidentiality value);

} // TransitionExt
/**
 */
package ptnetLoLA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
 * @model
 * @generated
 */
public interface TransitionExt extends Transition
{
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Probability()
	 * @model default="1.0"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MinTime()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMinTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Cost()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MaxTime()
	 * @model default="0"
	 * @generated
	 */
	int getMaxTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(int value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Confidentiality()
	 * @model
	 * @generated
	 */
	Confidentiality getConfidentiality();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(Confidentiality value);

} // TransitionExt
/**
 */
package ptnetLoLA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
 * @model
 * @generated
 */
public interface TransitionExt extends Transition
{
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Probability()
	 * @model default="1.0"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MinTime()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMinTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Cost()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MaxTime()
	 * @model default="0"
	 * @generated
	 */
	int getMaxTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(int value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Confidentiality()
	 * @model
	 * @generated
	 */
	Confidentiality getConfidentiality();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(Confidentiality value);

} // TransitionExt
/**
 */
package ptnetLoLA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
 * @model
 * @generated
 */
public interface TransitionExt extends Transition
{
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Probability()
	 * @model default="1.0"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MinTime()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMinTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Cost()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MaxTime()
	 * @model default="0"
	 * @generated
	 */
	int getMaxTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(int value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Confidentiality()
	 * @model
	 * @generated
	 */
	Confidentiality getConfidentiality();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(Confidentiality value);

} // TransitionExt
/**
 */
package ptnetLoLA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
 * @model
 * @generated
 */
public interface TransitionExt extends Transition
{
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Probability()
	 * @model default="1.0"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MinTime()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMinTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Cost()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MaxTime()
	 * @model default="0"
	 * @generated
	 */
	int getMaxTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(int value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Confidentiality()
	 * @model
	 * @generated
	 */
	Confidentiality getConfidentiality();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(Confidentiality value);

} // TransitionExt
/**
 */
package ptnetLoLA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}</li>
 * </ul>
 *
 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt()
 * @model
 * @generated
 */
public interface TransitionExt extends Transition
{
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Probability()
	 * @model default="1.0"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MinTime()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMinTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Cost()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_MaxTime()
	 * @model default="0"
	 * @generated
	 */
	int getMaxTime();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(int value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link ptnetLoLA.Confidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #setConfidentiality(Confidentiality)
	 * @see ptnetLoLA.PtnetLoLAPackage#getTransitionExt_Confidentiality()
	 * @model
	 * @generated
	 */
	Confidentiality getConfidentiality();

	/**
	 * Sets the value of the '{@link ptnetLoLA.TransitionExt#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see ptnetLoLA.Confidentiality
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(Confidentiality value);

} // TransitionExt
