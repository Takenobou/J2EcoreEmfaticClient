/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.State#getLabel <em>Label</em>}</li>
 *   <li>{@link statemachine.State#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link statemachine.State#getReachable <em>Reachable</em>}</li>
 *   <li>{@link statemachine.State#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getState()
 * @model abstract="true"
 *        annotation="diagraph node='null' ref\075successors='null' ref\075reachable='null'"
 * @generated
 */
public interface State extends Declaration
{
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see statemachine.StatemachinePackage#getState_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link statemachine.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Successors()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<State> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Reachable</b></em>' reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reachable</em>' reference list.
	 * @see statemachine.StatemachinePackage#getState_Reachable()
	 * @model transient="true" derived="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<State> getReachable();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see statemachine.StatemachinePackage#getState_Id()
	 * @model required="true" derived="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link statemachine.State#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void printReachable();

} // State
