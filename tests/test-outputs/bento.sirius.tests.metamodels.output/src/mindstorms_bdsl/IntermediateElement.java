/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.IntermediateElement#getBindingElement <em>Binding Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.IntermediateElement#getMetamodelElement <em>Metamodel Element</em>}</li>
 * </ul>
 *
 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getIntermediateElement()
 * @model
 * @generated
 */
public interface IntermediateElement extends EObject {
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
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getIntermediateElement_BindingElement()
	 * @model
	 * @generated
	 */
	BindingElement getBindingElement();

	/**
	 * Sets the value of the '{@link mindstorms_bdsl.IntermediateElement#getBindingElement <em>Binding Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Element</em>' reference.
	 * @see #getBindingElement()
	 * @generated
	 */
	void setBindingElement(BindingElement value);

	/**
	 * Returns the value of the '<em><b>Metamodel Element</b></em>' reference list.
	 * The list contents are of type {@link mindstorms_bdsl.MetamodelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Element</em>' reference list.
	 * @see mindstorms_bdsl.Mindstorms_bdslPackage#getIntermediateElement_MetamodelElement()
	 * @model
	 * @generated
	 */
	EList<MetamodelElement> getMetamodelElement();

} // IntermediateElement
