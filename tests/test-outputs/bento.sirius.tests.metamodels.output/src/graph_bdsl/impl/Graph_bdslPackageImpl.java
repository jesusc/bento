/**
 */
package graph_bdsl.impl;

import graph_bdsl.BindingAttribute;
import graph_bdsl.BindingElement;
import graph_bdsl.Edge;
import graph_bdsl.GraphModel;
import graph_bdsl.Graph_bdslFactory;
import graph_bdsl.Graph_bdslPackage;
import graph_bdsl.IntermediateElement;
import graph_bdsl.MetamodelElement;
import graph_bdsl.MetamodelElementFeature;
import graph_bdsl.Node;
import graph_bdsl.NoneElement;
import graph_bdsl.SiriusTag;
import graph_bdsl.VirtualAttribute;
import graph_bdsl.labelEdge;
import graph_bdsl.srcEdge21;
import graph_bdsl.tgtEdge22;
import graph_bdsl.valueNode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Graph_bdslPackageImpl extends EPackageImpl implements Graph_bdslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcEdge21EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tgtEdge22EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noneElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelElementFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siriusTagEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see graph_bdsl.Graph_bdslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Graph_bdslPackageImpl() {
		super(eNS_URI, Graph_bdslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Graph_bdslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Graph_bdslPackage init() {
		if (isInited) return (Graph_bdslPackage)EPackage.Registry.INSTANCE.getEPackage(Graph_bdslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGraph_bdslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Graph_bdslPackageImpl theGraph_bdslPackage = registeredGraph_bdslPackage instanceof Graph_bdslPackageImpl ? (Graph_bdslPackageImpl)registeredGraph_bdslPackage : new Graph_bdslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGraph_bdslPackage.createPackageContents();

		// Initialize created meta-data
		theGraph_bdslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraph_bdslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Graph_bdslPackage.eNS_URI, theGraph_bdslPackage);
		return theGraph_bdslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphModel() {
		return graphModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphModel_Node() {
		return (EReference)graphModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphModel_Edge() {
		return (EReference)graphModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphModel_ContainsNoneElement() {
		return (EReference)graphModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphModel_ContainsBindingElement() {
		return (EReference)graphModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphModel_ContainsIntermediateElement() {
		return (EReference)graphModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphModel_ContainsMetamodelElement() {
		return (EReference)graphModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphModel_ContainsMetamodelElementFeature() {
		return (EReference)graphModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphModel_ContainsBindingAttribute() {
		return (EReference)graphModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphModel_ContainsVirtualAttribute() {
		return (EReference)graphModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphModel_SourceMM() {
		return (EAttribute)graphModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Value() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_ContainsvalueNode() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdge_Label() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_Src() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_Tgt() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_Eref_srcEdge21() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_Eref_tgtEdge22() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_ContainslabelEdge() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getsrcEdge21() {
		return srcEdge21EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getsrcEdge21_Name() {
		return (EAttribute)srcEdge21EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass gettgtEdge22() {
		return tgtEdge22EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute gettgtEdge22_Name() {
		return (EAttribute)tgtEdge22EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getvalueNode() {
		return valueNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getvalueNode_Value() {
		return (EAttribute)valueNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getlabelEdge() {
		return labelEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getlabelEdge_Value() {
		return (EAttribute)labelEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoneElement() {
		return noneElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBindingElement() {
		return bindingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBindingElement_ContainsSiriusTag() {
		return (EReference)bindingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBindingElement_NoneElement() {
		return (EReference)bindingElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermediateElement() {
		return intermediateElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermediateElement_BindingElement() {
		return (EReference)intermediateElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntermediateElement_MetamodelElement() {
		return (EReference)intermediateElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermediateElement_Id_target() {
		return (EAttribute)intermediateElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetamodelElement() {
		return metamodelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetamodelElement_VirtualAttribute() {
		return (EReference)metamodelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetamodelElement_MetamodelElementFeature() {
		return (EReference)metamodelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetamodelElement_Name() {
		return (EAttribute)metamodelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetamodelElementFeature() {
		return metamodelElementFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetamodelElementFeature_FeatureClass() {
		return (EReference)metamodelElementFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetamodelElementFeature_Name() {
		return (EAttribute)metamodelElementFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBindingAttribute() {
		return bindingAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualAttribute() {
		return virtualAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualAttribute_To_virtualAttribute() {
		return (EReference)virtualAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVirtualAttribute_Name() {
		return (EAttribute)virtualAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVirtualAttribute_Expression() {
		return (EAttribute)virtualAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSiriusTag() {
		return siriusTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSiriusTag_Tag() {
		return (EAttribute)siriusTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph_bdslFactory getGraph_bdslFactory() {
		return (Graph_bdslFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		graphModelEClass = createEClass(GRAPH_MODEL);
		createEReference(graphModelEClass, GRAPH_MODEL__NODE);
		createEReference(graphModelEClass, GRAPH_MODEL__EDGE);
		createEReference(graphModelEClass, GRAPH_MODEL__CONTAINS_NONE_ELEMENT);
		createEReference(graphModelEClass, GRAPH_MODEL__CONTAINS_BINDING_ELEMENT);
		createEReference(graphModelEClass, GRAPH_MODEL__CONTAINS_INTERMEDIATE_ELEMENT);
		createEReference(graphModelEClass, GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT);
		createEReference(graphModelEClass, GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE);
		createEReference(graphModelEClass, GRAPH_MODEL__CONTAINS_BINDING_ATTRIBUTE);
		createEReference(graphModelEClass, GRAPH_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE);
		createEAttribute(graphModelEClass, GRAPH_MODEL__SOURCE_MM);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__VALUE);
		createEReference(nodeEClass, NODE__CONTAINSVALUE_NODE);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__LABEL);
		createEReference(edgeEClass, EDGE__SRC);
		createEReference(edgeEClass, EDGE__TGT);
		createEReference(edgeEClass, EDGE__EREF_SRC_EDGE21);
		createEReference(edgeEClass, EDGE__EREF_TGT_EDGE22);
		createEReference(edgeEClass, EDGE__CONTAINSLABEL_EDGE);

		srcEdge21EClass = createEClass(SRC_EDGE21);
		createEAttribute(srcEdge21EClass, SRC_EDGE21__NAME);

		tgtEdge22EClass = createEClass(TGT_EDGE22);
		createEAttribute(tgtEdge22EClass, TGT_EDGE22__NAME);

		valueNodeEClass = createEClass(VALUE_NODE);
		createEAttribute(valueNodeEClass, VALUE_NODE__VALUE);

		labelEdgeEClass = createEClass(LABEL_EDGE);
		createEAttribute(labelEdgeEClass, LABEL_EDGE__VALUE);

		noneElementEClass = createEClass(NONE_ELEMENT);

		bindingElementEClass = createEClass(BINDING_ELEMENT);
		createEReference(bindingElementEClass, BINDING_ELEMENT__CONTAINS_SIRIUS_TAG);
		createEReference(bindingElementEClass, BINDING_ELEMENT__NONE_ELEMENT);

		intermediateElementEClass = createEClass(INTERMEDIATE_ELEMENT);
		createEReference(intermediateElementEClass, INTERMEDIATE_ELEMENT__BINDING_ELEMENT);
		createEReference(intermediateElementEClass, INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT);
		createEAttribute(intermediateElementEClass, INTERMEDIATE_ELEMENT__ID_TARGET);

		metamodelElementEClass = createEClass(METAMODEL_ELEMENT);
		createEReference(metamodelElementEClass, METAMODEL_ELEMENT__VIRTUAL_ATTRIBUTE);
		createEReference(metamodelElementEClass, METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE);
		createEAttribute(metamodelElementEClass, METAMODEL_ELEMENT__NAME);

		metamodelElementFeatureEClass = createEClass(METAMODEL_ELEMENT_FEATURE);
		createEReference(metamodelElementFeatureEClass, METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS);
		createEAttribute(metamodelElementFeatureEClass, METAMODEL_ELEMENT_FEATURE__NAME);

		bindingAttributeEClass = createEClass(BINDING_ATTRIBUTE);

		virtualAttributeEClass = createEClass(VIRTUAL_ATTRIBUTE);
		createEReference(virtualAttributeEClass, VIRTUAL_ATTRIBUTE__TO_VIRTUAL_ATTRIBUTE);
		createEAttribute(virtualAttributeEClass, VIRTUAL_ATTRIBUTE__NAME);
		createEAttribute(virtualAttributeEClass, VIRTUAL_ATTRIBUTE__EXPRESSION);

		siriusTagEClass = createEClass(SIRIUS_TAG);
		createEAttribute(siriusTagEClass, SIRIUS_TAG__TAG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodeEClass.getESuperTypes().add(this.getBindingElement());
		edgeEClass.getESuperTypes().add(this.getBindingElement());
		srcEdge21EClass.getESuperTypes().add(this.getBindingAttribute());
		tgtEdge22EClass.getESuperTypes().add(this.getBindingAttribute());
		valueNodeEClass.getESuperTypes().add(this.getBindingAttribute());
		labelEdgeEClass.getESuperTypes().add(this.getBindingAttribute());

		// Initialize classes, features, and operations; add parameters
		initEClass(graphModelEClass, GraphModel.class, "GraphModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphModel_Node(), this.getNode(), null, "node", null, 0, -1, GraphModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphModel_Edge(), this.getEdge(), null, "edge", null, 0, -1, GraphModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphModel_ContainsNoneElement(), this.getNoneElement(), null, "containsNoneElement", null, 0, -1, GraphModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphModel_ContainsBindingElement(), this.getBindingElement(), null, "containsBindingElement", null, 0, -1, GraphModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphModel_ContainsIntermediateElement(), this.getIntermediateElement(), null, "containsIntermediateElement", null, 0, -1, GraphModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphModel_ContainsMetamodelElement(), this.getMetamodelElement(), null, "containsMetamodelElement", null, 0, -1, GraphModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphModel_ContainsMetamodelElementFeature(), this.getMetamodelElementFeature(), null, "containsMetamodelElementFeature", null, 0, -1, GraphModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphModel_ContainsBindingAttribute(), this.getBindingAttribute(), null, "containsBindingAttribute", null, 0, -1, GraphModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphModel_ContainsVirtualAttribute(), this.getVirtualAttribute(), null, "containsVirtualAttribute", null, 0, -1, GraphModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphModel_SourceMM(), ecorePackage.getEString(), "SourceMM", "http://bento/sirius/tests/graph_bdsl", 0, 1, GraphModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Value(), ecorePackage.getEString(), "value", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_ContainsvalueNode(), this.getvalueNode(), null, "containsvalueNode", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_Label(), ecorePackage.getEString(), "label", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Src(), this.getNode(), null, "src", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Tgt(), this.getNode(), null, "tgt", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Eref_srcEdge21(), this.getsrcEdge21(), null, "eref_srcEdge21", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Eref_tgtEdge22(), this.gettgtEdge22(), null, "eref_tgtEdge22", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_ContainslabelEdge(), this.getlabelEdge(), null, "containslabelEdge", null, 0, -1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcEdge21EClass, srcEdge21.class, "srcEdge21", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getsrcEdge21_Name(), ecorePackage.getEString(), "name", null, 0, 1, srcEdge21.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tgtEdge22EClass, tgtEdge22.class, "tgtEdge22", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettgtEdge22_Name(), ecorePackage.getEString(), "name", null, 0, 1, tgtEdge22.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueNodeEClass, valueNode.class, "valueNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getvalueNode_Value(), ecorePackage.getEString(), "value", null, 0, 1, valueNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEdgeEClass, labelEdge.class, "labelEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getlabelEdge_Value(), ecorePackage.getEString(), "value", null, 0, 1, labelEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noneElementEClass, NoneElement.class, "NoneElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingElementEClass, BindingElement.class, "BindingElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingElement_ContainsSiriusTag(), this.getSiriusTag(), null, "containsSiriusTag", null, 0, -1, BindingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingElement_NoneElement(), this.getNoneElement(), null, "noneElement", null, 0, -1, BindingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intermediateElementEClass, IntermediateElement.class, "IntermediateElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntermediateElement_BindingElement(), this.getBindingElement(), null, "bindingElement", null, 0, 1, IntermediateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntermediateElement_MetamodelElement(), this.getMetamodelElement(), null, "metamodelElement", null, 0, -1, IntermediateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermediateElement_Id_target(), ecorePackage.getEString(), "id_target", null, 0, 1, IntermediateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metamodelElementEClass, MetamodelElement.class, "MetamodelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetamodelElement_VirtualAttribute(), this.getVirtualAttribute(), null, "virtualAttribute", null, 0, -1, MetamodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetamodelElement_MetamodelElementFeature(), this.getMetamodelElementFeature(), null, "metamodelElementFeature", null, 0, -1, MetamodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetamodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metamodelElementFeatureEClass, MetamodelElementFeature.class, "MetamodelElementFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetamodelElementFeature_FeatureClass(), this.getBindingAttribute(), null, "featureClass", null, 0, -1, MetamodelElementFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodelElementFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetamodelElementFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingAttributeEClass, BindingAttribute.class, "BindingAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualAttributeEClass, VirtualAttribute.class, "VirtualAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualAttribute_To_virtualAttribute(), this.getBindingAttribute(), null, "to_virtualAttribute", null, 0, 1, VirtualAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, VirtualAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualAttribute_Expression(), ecorePackage.getEString(), "Expression", null, 0, 1, VirtualAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siriusTagEClass, SiriusTag.class, "SiriusTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSiriusTag_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, SiriusTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Graph_bdslPackageImpl
