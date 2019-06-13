/**
 */
package scenes_bdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intemediate Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.IntemediateElement#getBindingElement <em>Binding Element</em>}</li>
 *   <li>{@link scenes_bdsl.IntemediateElement#getMetamodElelement <em>Metamod Elelement</em>}</li>
 * </ul>
 *
 * @see scenes_bdsl.Scenes_bdslPackage#getIntemediateElement()
 * @model
 * @generated
 */
public interface IntemediateElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Element</em>' reference.
	 * @see #setBindingElement(BindingElement)
	 * @see scenes_bdsl.Scenes_bdslPackage#getIntemediateElement_BindingElement()
	 * @model required="true"
	 * @generated
	 */
	BindingElement getBindingElement();

	/**
	 * Sets the value of the '{@link scenes_bdsl.IntemediateElement#getBindingElement <em>Binding Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Element</em>' reference.
	 * @see #getBindingElement()
	 * @generated
	 */
	void setBindingElement(BindingElement value);

	/**
	 * Returns the value of the '<em><b>Metamod Elelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamod Elelement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamod Elelement</em>' reference.
	 * @see #setMetamodElelement(MetamodelElement)
	 * @see scenes_bdsl.Scenes_bdslPackage#getIntemediateElement_MetamodElelement()
	 * @model required="true"
	 * @generated
	 */
	MetamodelElement getMetamodElelement();

	/**
	 * Sets the value of the '{@link scenes_bdsl.IntemediateElement#getMetamodElelement <em>Metamod Elelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamod Elelement</em>' reference.
	 * @see #getMetamodElelement()
	 * @generated
	 */
	void setMetamodElelement(MetamodelElement value);

} // IntemediateElement
