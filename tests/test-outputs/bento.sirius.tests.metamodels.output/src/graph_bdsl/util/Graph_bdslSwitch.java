/**
 */
package graph_bdsl.util;

import graph_bdsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see graph_bdsl.Graph_bdslPackage
 * @generated
 */
public class Graph_bdslSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Graph_bdslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph_bdslSwitch() {
		if (modelPackage == null) {
			modelPackage = Graph_bdslPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Graph_bdslPackage.GRAPH_MODEL: {
				GraphModel graphModel = (GraphModel)theEObject;
				T result = caseGraphModel(graphModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graph_bdslPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseBindingElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graph_bdslPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = caseBindingElement(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graph_bdslPackage.SRC_EDGE21: {
				srcEdge21 srcEdge21 = (srcEdge21)theEObject;
				T result = casesrcEdge21(srcEdge21);
				if (result == null) result = caseBindingAttribute(srcEdge21);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graph_bdslPackage.TGT_EDGE22: {
				tgtEdge22 tgtEdge22 = (tgtEdge22)theEObject;
				T result = casetgtEdge22(tgtEdge22);
				if (result == null) result = caseBindingAttribute(tgtEdge22);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graph_bdslPackage.VALUE_NODE: {
				valueNode valueNode = (valueNode)theEObject;
				T result = casevalueNode(valueNode);
				if (result == null) result = caseBindingAttribute(valueNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graph_bdslPackage.LABEL_EDGE: {
				labelEdge labelEdge = (labelEdge)theEObject;
				T result = caselabelEdge(labelEdge);
				if (result == null) result = caseBindingAttribute(labelEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graph_bdslPackage.NONE_ELEMENT: {
				NoneElement noneElement = (NoneElement)theEObject;
				T result = caseNoneElement(noneElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graph_bdslPackage.BINDING_ELEMENT: {
				BindingElement bindingElement = (BindingElement)theEObject;
				T result = caseBindingElement(bindingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graph_bdslPackage.INTERMEDIATE_ELEMENT: {
				IntermediateElement intermediateElement = (IntermediateElement)theEObject;
				T result = caseIntermediateElement(intermediateElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graph_bdslPackage.METAMODEL_ELEMENT: {
				MetamodelElement metamodelElement = (MetamodelElement)theEObject;
				T result = caseMetamodelElement(metamodelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graph_bdslPackage.METAMODEL_ELEMENT_FEATURE: {
				MetamodelElementFeature metamodelElementFeature = (MetamodelElementFeature)theEObject;
				T result = caseMetamodelElementFeature(metamodelElementFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graph_bdslPackage.BINDING_ATTRIBUTE: {
				BindingAttribute bindingAttribute = (BindingAttribute)theEObject;
				T result = caseBindingAttribute(bindingAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graph_bdslPackage.VIRTUAL_ATTRIBUTE: {
				VirtualAttribute virtualAttribute = (VirtualAttribute)theEObject;
				T result = caseVirtualAttribute(virtualAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Graph_bdslPackage.SIRIUS_TAG: {
				SiriusTag siriusTag = (SiriusTag)theEObject;
				T result = caseSiriusTag(siriusTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphModel(GraphModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>src Edge21</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>src Edge21</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesrcEdge21(srcEdge21 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tgt Edge22</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tgt Edge22</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetgtEdge22(tgtEdge22 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>value Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>value Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casevalueNode(valueNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>label Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>label Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselabelEdge(labelEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>None Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>None Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoneElement(NoneElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingElement(BindingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateElement(IntermediateElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelElement(MetamodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Element Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Element Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelElementFeature(MetamodelElementFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingAttribute(BindingAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualAttribute(VirtualAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sirius Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sirius Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiriusTag(SiriusTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Graph_bdslSwitch
