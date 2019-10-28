/**
 */
package graph_bdsl.impl;

import graph_bdsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Graph_bdslFactoryImpl extends EFactoryImpl implements Graph_bdslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Graph_bdslFactory init() {
		try {
			Graph_bdslFactory theGraph_bdslFactory = (Graph_bdslFactory)EPackage.Registry.INSTANCE.getEFactory(Graph_bdslPackage.eNS_URI);
			if (theGraph_bdslFactory != null) {
				return theGraph_bdslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Graph_bdslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph_bdslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Graph_bdslPackage.GRAPH_MODEL: return createGraphModel();
			case Graph_bdslPackage.NODE: return createNode();
			case Graph_bdslPackage.EDGE: return createEdge();
			case Graph_bdslPackage.SRC_EDGE21: return createsrcEdge21();
			case Graph_bdslPackage.TGT_EDGE22: return createtgtEdge22();
			case Graph_bdslPackage.VALUE_NODE: return createvalueNode();
			case Graph_bdslPackage.LABEL_EDGE: return createlabelEdge();
			case Graph_bdslPackage.NONE_ELEMENT: return createNoneElement();
			case Graph_bdslPackage.INTERMEDIATE_ELEMENT: return createIntermediateElement();
			case Graph_bdslPackage.METAMODEL_ELEMENT: return createMetamodelElement();
			case Graph_bdslPackage.METAMODEL_ELEMENT_FEATURE: return createMetamodelElementFeature();
			case Graph_bdslPackage.VIRTUAL_ATTRIBUTE: return createVirtualAttribute();
			case Graph_bdslPackage.SIRIUS_TAG: return createSiriusTag();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphModel createGraphModel() {
		GraphModelImpl graphModel = new GraphModelImpl();
		return graphModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public srcEdge21 createsrcEdge21() {
		srcEdge21Impl srcEdge21 = new srcEdge21Impl();
		return srcEdge21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public tgtEdge22 createtgtEdge22() {
		tgtEdge22Impl tgtEdge22 = new tgtEdge22Impl();
		return tgtEdge22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public valueNode createvalueNode() {
		valueNodeImpl valueNode = new valueNodeImpl();
		return valueNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public labelEdge createlabelEdge() {
		labelEdgeImpl labelEdge = new labelEdgeImpl();
		return labelEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoneElement createNoneElement() {
		NoneElementImpl noneElement = new NoneElementImpl();
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermediateElement createIntermediateElement() {
		IntermediateElementImpl intermediateElement = new IntermediateElementImpl();
		return intermediateElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetamodelElement createMetamodelElement() {
		MetamodelElementImpl metamodelElement = new MetamodelElementImpl();
		return metamodelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetamodelElementFeature createMetamodelElementFeature() {
		MetamodelElementFeatureImpl metamodelElementFeature = new MetamodelElementFeatureImpl();
		return metamodelElementFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualAttribute createVirtualAttribute() {
		VirtualAttributeImpl virtualAttribute = new VirtualAttributeImpl();
		return virtualAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SiriusTag createSiriusTag() {
		SiriusTagImpl siriusTag = new SiriusTagImpl();
		return siriusTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph_bdslPackage getGraph_bdslPackage() {
		return (Graph_bdslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Graph_bdslPackage getPackage() {
		return Graph_bdslPackage.eINSTANCE;
	}

} //Graph_bdslFactoryImpl
