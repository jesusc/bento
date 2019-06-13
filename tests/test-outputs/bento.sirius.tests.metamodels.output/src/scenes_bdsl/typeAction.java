/**
 */
package scenes_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.typeAction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see scenes_bdsl.Scenes_bdslPackage#gettypeAction()
 * @model
 * @generated
 */
public interface typeAction extends FeatureClass {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"FIGHT"</code>.
	 * The literals are from the enumeration {@link scenes_bdsl.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see scenes_bdsl.ActionType
	 * @see #setValue(ActionType)
	 * @see scenes_bdsl.Scenes_bdslPackage#gettypeAction_Value()
	 * @model default="FIGHT"
	 * @generated
	 */
	ActionType getValue();

	/**
	 * Sets the value of the '{@link scenes_bdsl.typeAction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see scenes_bdsl.ActionType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ActionType value);

} // typeAction
