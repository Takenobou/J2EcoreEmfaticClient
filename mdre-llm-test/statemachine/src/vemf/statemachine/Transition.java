/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
/**
 */
package statemachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link statemachine.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link statemachine.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}</li>
 *   <li>{@link statemachine.Transition#getActionLabel <em>Action Label</em>}</li>
 *   <li>{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getTransition()
 * @model annotation="diagraph node='null' ref\075source='null' ref\075target='null'"
 * @generated
 */
public interface Transition extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' attribute.
	 * @see #setSourceLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_SourceLabel()
	 * @model
	 * @generated
	 */
	String getSourceLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSourceLabel <em>Source Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' attribute.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' attribute.
	 * @see #setTargetLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_TargetLabel()
	 * @model
	 * @generated
	 */
	String getTargetLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTargetLabel <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' attribute.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see statemachine.StatemachinePackage#getTransition_Source()
	 * @model derived="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see statemachine.StatemachinePackage#getTransition_Target()
	 * @model derived="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Guard Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Label</em>' attribute.
	 * @see #setGuardLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardLabel()
	 * @model required="true"
	 * @generated
	 */
	String getGuardLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardLabel <em>Guard Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Label</em>' attribute.
	 * @see #getGuardLabel()
	 * @generated
	 */
	void setGuardLabel(String value);

	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see #setActionLabel(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionLabel()
	 * @model
	 * @generated
	 */
	String getActionLabel();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see statemachine.StatemachinePackage#getTransition_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see statemachine.StatemachinePackage#getTransition_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link statemachine.Transition#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // Transition
