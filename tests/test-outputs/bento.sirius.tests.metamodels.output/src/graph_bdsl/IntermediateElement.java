/**
 */
package graph_bdsl;

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
 *   <li>{@link graph_bdsl.IntermediateElement#getBindingElement <em>Binding Element</em>}</li>
 *   <li>{@link graph_bdsl.IntermediateElement#getMetamodelElement <em>Metamodel Element</em>}</li>
 *   <li>{@link graph_bdsl.IntermediateElement#getId_target <em>Id target</em>}</li>
 * </ul>
 *
 * @see graph_bdsl.Graph_bdslPackage#getIntermediateElement()
 * @model
 * @generated
 */
public interface IntermediateElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Element</em>' reference.
	 * @see #setBindingElement(BindingElement)
	 * @see graph_bdsl.Graph_bdslPackage#getIntermediateElement_BindingElement()
	 * @model
	 * @generated
	 */
	BindingElement getBindingElement();

	/**
	 * Sets the value of the '{@link graph_bdsl.IntermediateElement#getBindingElement <em>Binding Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Element</em>' reference.
	 * @see #getBindingElement()
	 * @generated
	 */
	void setBindingElement(BindingElement value);

	/**
	 * Returns the value of the '<em><b>Metamodel Element</b></em>' reference list.
	 * The list contents are of type {@link graph_bdsl.MetamodelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel Element</em>' reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getIntermediateElement_MetamodelElement()
	 * @model
	 * @generated
	 */
	EList<MetamodelElement> getMetamodelElement();

	/**
	 * Returns the value of the '<em><b>Id target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id target</em>' attribute.
	 * @see #setId_target(String)
	 * @see graph_bdsl.Graph_bdslPackage#getIntermediateElement_Id_target()
	 * @model
	 * @generated
	 */
	String getId_target();

	/**
	 * Sets the value of the '{@link graph_bdsl.IntermediateElement#getId_target <em>Id target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id target</em>' attribute.
	 * @see #getId_target()
	 * @generated
	 */
	void setId_target(String value);

} // IntermediateElement
