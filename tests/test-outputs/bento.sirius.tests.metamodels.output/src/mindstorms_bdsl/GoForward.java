/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go Forward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.GoForward#getCm <em>Cm</em>}</li>
 *   <li>{@link mindstorms_bdsl.GoForward#isInfinite <em>Infinite</em>}</li>
 *   <li>{@link mindstorms_bdsl.GoForward#getContainsnameGoForward <em>Containsname Go Forward</em>}</li>
 *   <li>{@link mindstorms_bdsl.GoForward#getContainscmGoForward <em>Containscm Go Forward</em>}</li>
 *   <li>{@link mindstorms_bdsl.GoForward#getContainsinfiniteGoForward <em>Containsinfinite Go Forward</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoForward()
 * @model
 * @generated
 */
public interface GoForward extends Action, BindingElement {
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
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoForward_Cm()
	 * @model
	 * @generated
	 */
	int getCm();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.GoForward#getCm <em>Cm</em>}' attribute.
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
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoForward_Infinite()
	 * @model
	 * @generated
	 */
	boolean isInfinite();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.GoForward#isInfinite <em>Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infinite</em>' attribute.
	 * @see #isInfinite()
	 * @generated
	 */
	void setInfinite(boolean value);

	/**
	 * Returns the value of the '<em><b>Containsname Go Forward</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.nameGoForward}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Go Forward</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Go Forward</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoForward_ContainsnameGoForward()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameGoForward> getContainsnameGoForward();

	/**
	 * Returns the value of the '<em><b>Containscm Go Forward</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.cmGoForward}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containscm Go Forward</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containscm Go Forward</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoForward_ContainscmGoForward()
	 * @model containment="true"
	 * @generated
	 */
	EList<cmGoForward> getContainscmGoForward();

	/**
	 * Returns the value of the '<em><b>Containsinfinite Go Forward</b></em>' containment reference list.
	 * The list contents are of type {@link mindstorms_bdsl.infiniteGoForward}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsinfinite Go Forward</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsinfinite Go Forward</em>' containment reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getGoForward_ContainsinfiniteGoForward()
	 * @model containment="true"
	 * @generated
	 */
	EList<infiniteGoForward> getContainsinfiniteGoForward();

} // GoForward
