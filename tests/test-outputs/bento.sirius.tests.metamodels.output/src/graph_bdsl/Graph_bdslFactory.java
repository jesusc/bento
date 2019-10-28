/**
 */
package graph_bdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see graph_bdsl.Graph_bdslPackage
 * @generated
 */
public interface Graph_bdslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Graph_bdslFactory eINSTANCE = graph_bdsl.impl.Graph_bdslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Graph Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Model</em>'.
	 * @generated
	 */
	GraphModel createGraphModel();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>src Edge21</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>src Edge21</em>'.
	 * @generated
	 */
	srcEdge21 createsrcEdge21();

	/**
	 * Returns a new object of class '<em>tgt Edge22</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tgt Edge22</em>'.
	 * @generated
	 */
	tgtEdge22 createtgtEdge22();

	/**
	 * Returns a new object of class '<em>value Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>value Node</em>'.
	 * @generated
	 */
	valueNode createvalueNode();

	/**
	 * Returns a new object of class '<em>label Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>label Edge</em>'.
	 * @generated
	 */
	labelEdge createlabelEdge();

	/**
	 * Returns a new object of class '<em>None Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>None Element</em>'.
	 * @generated
	 */
	NoneElement createNoneElement();

	/**
	 * Returns a new object of class '<em>Intermediate Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Element</em>'.
	 * @generated
	 */
	IntermediateElement createIntermediateElement();

	/**
	 * Returns a new object of class '<em>Metamodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Element</em>'.
	 * @generated
	 */
	MetamodelElement createMetamodelElement();

	/**
	 * Returns a new object of class '<em>Metamodel Element Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Element Feature</em>'.
	 * @generated
	 */
	MetamodelElementFeature createMetamodelElementFeature();

	/**
	 * Returns a new object of class '<em>Virtual Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Attribute</em>'.
	 * @generated
	 */
	VirtualAttribute createVirtualAttribute();

	/**
	 * Returns a new object of class '<em>Sirius Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sirius Tag</em>'.
	 * @generated
	 */
	SiriusTag createSiriusTag();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Graph_bdslPackage getGraph_bdslPackage();

} //Graph_bdslFactory
