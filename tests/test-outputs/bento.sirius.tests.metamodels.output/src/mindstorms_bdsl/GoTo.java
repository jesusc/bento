/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.GoTo#getX <em>X</em>}</li>
 *   <li>{@link mindstorms_bdsl.GoTo#getY <em>Y</em>}</li>
 *   <li>{@link mindstorms_bdsl.GoTo#getContainsnameGoTo <em>Containsname Go To</em>}</li>
 *   <li>{@link mindstorms_bdsl.GoTo#getContainsxGoTo <em>Containsx Go To</em>}</li>
 *   <li>{@link mindstorms_bdsl.GoTo#getContainsyGoTo <em>Containsy Go To</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoTo()
 * @model
 * @generated
 */
public interface GoTo extends Action, BindingElement {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoTo_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.GoTo#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoTo_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.GoTo#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Containsname Go To</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameGoTo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Go To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Go To</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoTo_ContainsnameGoTo()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameGoTo> getContainsnameGoTo();

	/**
	 * Returns the value of the '<em><b>Containsx Go To</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.xGoTo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsx Go To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsx Go To</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoTo_ContainsxGoTo()
	 * @model containment="true"
	 * @generated
	 */
	EList<xGoTo> getContainsxGoTo();

	/**
	 * Returns the value of the '<em><b>Containsy Go To</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.yGoTo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsy Go To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsy Go To</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoTo_ContainsyGoTo()
	 * @model containment="true"
	 * @generated
	 */
	EList<yGoTo> getContainsyGoTo();

} // GoTo
