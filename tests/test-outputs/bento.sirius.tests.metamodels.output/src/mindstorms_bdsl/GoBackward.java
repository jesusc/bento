/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go Backward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.GoBackward#getCm <em>Cm</em>}</li>
 *   <li>{@link mindstorms_bdsl.GoBackward#isInfinite <em>Infinite</em>}</li>
 *   <li>{@link mindstorms_bdsl.GoBackward#getContainsnameGoBackward <em>Containsname Go Backward</em>}</li>
 *   <li>{@link mindstorms_bdsl.GoBackward#getContainscmGoBackward <em>Containscm Go Backward</em>}</li>
 *   <li>{@link mindstorms_bdsl.GoBackward#getContainsinfiniteGoBackward <em>Containsinfinite Go Backward</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoBackward()
 * @model
 * @generated
 */
public interface GoBackward extends Action, BindingElement {
	/**
	 * Returns the value of the '<em><b>Cm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cm</em>' attribute.
	 * @see #setCm(int)
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoBackward_Cm()
	 * @model
	 * @generated
	 */
	int getCm();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.GoBackward#getCm <em>Cm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cm</em>' attribute.
	 * @see #getCm()
	 * @generated
	 */
	void setCm(int value);

	/**
	 * Returns the value of the '<em><b>Infinite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infinite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infinite</em>' attribute.
	 * @see #setInfinite(boolean)
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoBackward_Infinite()
	 * @model
	 * @generated
	 */
	boolean isInfinite();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.GoBackward#isInfinite <em>Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infinite</em>' attribute.
	 * @see #isInfinite()
	 * @generated
	 */
	void setInfinite(boolean value);

	/**
	 * Returns the value of the '<em><b>Containsname Go Backward</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameGoBackward}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Go Backward</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Go Backward</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoBackward_ContainsnameGoBackward()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameGoBackward> getContainsnameGoBackward();

	/**
	 * Returns the value of the '<em><b>Containscm Go Backward</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.cmGoBackward}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containscm Go Backward</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containscm Go Backward</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoBackward_ContainscmGoBackward()
	 * @model containment="true"
	 * @generated
	 */
	EList<cmGoBackward> getContainscmGoBackward();

	/**
	 * Returns the value of the '<em><b>Containsinfinite Go Backward</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.infiniteGoBackward}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsinfinite Go Backward</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsinfinite Go Backward</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoBackward_ContainsinfiniteGoBackward()
	 * @model containment="true"
	 * @generated
	 */
	EList<infiniteGoBackward> getContainsinfiniteGoBackward();

} // GoBackward
