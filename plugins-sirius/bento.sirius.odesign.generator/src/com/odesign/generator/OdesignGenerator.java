package com.odesign.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.diagram.EdgeArrows;
import org.eclipse.sirius.diagram.EdgeRouting;
import org.eclipse.sirius.diagram.LabelPosition;
import org.eclipse.sirius.diagram.LineStyle;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.style.CenterLabelStyleDescription;
import org.eclipse.sirius.diagram.description.style.EdgeStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.SquareDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.tool.ContainerCreationDescription;
import org.eclipse.sirius.diagram.description.tool.EdgeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.diagram.description.tool.ToolSection;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.UserColorsPalette;
import org.eclipse.sirius.viewpoint.description.UserFixedColor;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.InitEdgeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;

import com.odesign.generator.tools.Tools;
import com.odesign.generator.values.BorderedNodeCreation;
import com.odesign.generator.values.MetamodelElementFeature;

/**
 * @author souhaila
 *
 */

public class OdesignGenerator {

	private Resource resource;
	private EPackage epackage;
	private DiagramDescription diagramDescription;
	private EList<RepresentationDescription> diagramsList;
	private List<NodeMapping> nmlist = new ArrayList<>();
	private Group group;
	private Viewpoint viewPoint;
	private File generatedFile;
	private List<EdgeMapping> emlist = new ArrayList<>();

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public EPackage getEpackage() {

		return epackage;
	}

	public void setEpackage(EPackage epackage) {
		this.epackage = epackage;
	}

	public DiagramDescription getDiagramDescription() {
		return diagramDescription;
	}

	public void setDiagramDescription(DiagramDescription diagramDescription) {
		this.diagramDescription = diagramDescription;
	}

	public OdesignGenerator(String modelURI, File file) {
		super();

		ResourceSet rs = new ResourceSetImpl();
		this.resource = rs.getResource(URI.createFileURI(modelURI), true);

		TreeIterator<EObject> content = resource.getAllContents();

		while (content.hasNext()) {
			EObject obj = content.next();

			if (obj instanceof DiagramDescription) {
				this.diagramDescription = (DiagramDescription) obj;
				this.epackage = ((DiagramDescription) obj).getMetamodel().get(0);

			}

			if (obj instanceof Group) {
				this.diagramsList = ((Group) obj).getOwnedViewpoints().get(0).getOwnedRepresentations();
				this.group = (Group) obj;
			}

			if (obj instanceof Viewpoint) {
				((Viewpoint) obj).setModelFileExtension("*");
				this.viewPoint = (Viewpoint) obj;
				this.viewPoint.setName(this.viewPoint.getName() + "_GraphicalBinding");
			}
		}
	}

	public void GenerateNodesVersion(HashMap<EClass, List<EClass>> eclassMap, File file, EPackage ep,
			EClass metamodelElement, EClass intermediateElement) {

		this.diagramDescription.getMetamodel().clear();
//		ep.setNsURI(ep.getName());
		this.diagramDescription.getMetamodel().add(ep);
		DiagramDescription dd = DescriptionFactory.eINSTANCE.createDiagramDescription();
		dd = this.diagramDescription;
		Layer layer = dd.getDefaultLayer();

		// Creating the colors pallette

		UserColorsPalette colorPallette = org.eclipse.sirius.viewpoint.description.DescriptionFactory.eINSTANCE
				.createUserColorsPalette();
		this.group.getUserColorsPalettes().add(colorPallette);
		UserFixedColor attributesFixedColor = org.eclipse.sirius.viewpoint.description.DescriptionFactory.eINSTANCE
				.createUserFixedColor();
		colorPallette.getEntries().add(attributesFixedColor);
		attributesFixedColor.setBlue(226);
		attributesFixedColor.setGreen(189);
		attributesFixedColor.setRed(161);

		UserFixedColor featuresFixedColor = org.eclipse.sirius.viewpoint.description.DescriptionFactory.eINSTANCE
				.createUserFixedColor();
		colorPallette.getEntries().add(featuresFixedColor);
		featuresFixedColor.setBlue(187);
		featuresFixedColor.setGreen(187);
		featuresFixedColor.setRed(134);

		List<EdgeMapping> edgeList = new ArrayList<>();
		List<NodeMapping> nodeList = new ArrayList<>();
		List<ContainerMapping> containerList = new ArrayList<>();
		dd.setName("Diagram");
		this.diagramsList.add(dd);

		layer.setName("Default Layer");
		dd.setDefaultLayer(layer);
		for (Entry<EClass, List<EClass>> entry : eclassMap.entrySet()) {

			List<EObject> all = new ArrayList<>();
			TreeIterator<EObject> content1 = this.resource.getAllContents();
			while (content1.hasNext()) {
				all.add(content1.next());
			}

			// TreeIterator<EObject> content = this.resource.getAllContents();
			// while (content.hasNext()) {
			Iterator<EObject> content = all.iterator();
			while (content.hasNext()) {
				EObject obj = null;
				try {
					obj = content.next();
				} catch (Throwable e) {
					e.printStackTrace();
					System.out.println("fail");
				}
				if (obj instanceof DiagramDescription) {
					((DiagramDescription) obj)
							.setDomainClass(ep.getName() + "::" + ((DiagramDescription) obj).getDomainClass()
									.substring(((DiagramDescription) obj).getDomainClass().lastIndexOf(":") + 1));

				}

				if (obj instanceof EdgeMapping) {
					edgeList.add((EdgeMapping) obj);
					if (((EdgeMapping) obj).isUseDomainElement()) {
						((EdgeMapping) obj).setDomainClass(ep.getName() + "::" + ((EdgeMapping) obj).getDomainClass()
								.substring(((EdgeMapping) obj).getDomainClass().lastIndexOf(":") + 1));
						if (((EdgeMapping) obj).getDomainClass()
								.substring(((EdgeMapping) obj).getDomainClass().lastIndexOf(":") + 1)
								.equals(entry.getKey().getName())) {

							for (EClass featureCLass : entry.getValue()) {

								NodeMapping nmd = DescriptionFactory.eINSTANCE.createNodeMapping();

								this.nmlist.add(nmd);
								nmd.setName(featureCLass.getName());
								nmd.setDomainClass(ep.getName() + "::" + featureCLass.getName());
								layer.getNodeMappings().add(nmd);

								SquareDescription sd = StyleFactory.eINSTANCE.createSquareDescription();
								sd.setColor(attributesFixedColor);

								sd.setBorderSizeComputationExpression("2");
								sd.setShowIcon(false);
								sd.setLabelPosition(LabelPosition.NODE_LITERAL);
								;
								sd.setHeight(3);
								sd.setBorderLineStyle(LineStyle.DASH_LITERAL);
								sd.setBorderSizeComputationExpression("2");
								sd.setWidth(12);
								String attrname = featureCLass.getName()
										.replace(Tools.upperCaseFirst(((EdgeMapping) obj).getName()), " ");

								sd.setLabelExpression("aql: '" + attrname + " = '+ self.eContainer()." + attrname);
								nmd.setStyle(sd);
								EdgeMapping em = DescriptionFactory.eINSTANCE.createEdgeMapping();

								em.getTargetMapping().add(nmd);
								em.getSourceMapping().add((EdgeMapping) obj);
								em.setName(featureCLass.getName() + "Connector");
								em.setUseDomainElement(false);
								em.setTargetFinderExpression("feature:contains" + featureCLass.getName());
								layer.getEdgeMappings().add(em);

								EdgeStyleDescription edgestyle = StyleFactory.eINSTANCE.createEdgeStyleDescription();
								CenterLabelStyleDescription labelstyle = StyleFactory.eINSTANCE
										.createCenterLabelStyleDescription();
								edgestyle.setCenterLabelStyleDescription(labelstyle);
								edgestyle.setLineStyle(LineStyle.DASH_LITERAL);
								edgestyle.setRoutingStyle(EdgeRouting.TREE_LITERAL);
								edgestyle.setCenterLabelStyleDescription(labelstyle);
								edgestyle.setSourceArrow(EdgeArrows.NO_DECORATION_LITERAL);
								edgestyle.setTargetArrow(EdgeArrows.NO_DECORATION_LITERAL);
								em.setStyle(edgestyle);
							}
//
						}
					}

				}
				if (obj instanceof ContainerMapping) {
					containerList.add((ContainerMapping) obj);
					((ContainerMapping) obj)
							.setDomainClass(ep.getName() + "::" + ((ContainerMapping) obj).getDomainClass()
									.substring(((ContainerMapping) obj).getDomainClass().lastIndexOf(":") + 1));

					if (((ContainerMapping) obj).getDomainClass()
							.substring(((ContainerMapping) obj).getDomainClass().lastIndexOf(":") + 1)
							.equals(entry.getKey().getName())) {

						for (EClass featureCLass : entry.getValue()) {

							NodeMapping nmd = DescriptionFactory.eINSTANCE.createNodeMapping();

							this.nmlist.add(nmd);
							nmd.setName(featureCLass.getName());
							nmd.setDomainClass(ep.getName() + "::" + featureCLass.getName());
							layer.getNodeMappings().add(nmd);

							SquareDescription sd = StyleFactory.eINSTANCE.createSquareDescription();
							sd.setBorderLineStyle(LineStyle.DASH_LITERAL);
							String attrname = featureCLass.getName()
									.replace(Tools.upperCaseFirst(((ContainerMapping) obj).getName()), " ");

							sd.setLabelExpression("aql: '" + attrname + " = '+ self.eContainer()." + attrname);
							nmd.setStyle(sd);
							EdgeMapping em = DescriptionFactory.eINSTANCE.createEdgeMapping();

							sd.setBorderLineStyle(LineStyle.DASH_LITERAL);
							sd.setBorderSizeComputationExpression("2");
							sd.setColor(attributesFixedColor);
							sd.setShowIcon(false);
							sd.setLabelPosition(LabelPosition.NODE_LITERAL);
							;
							sd.setHeight(3);
							sd.setWidth(12);

							em.getTargetMapping().add(nmd);
							em.getSourceMapping().add((ContainerMapping) obj);
							em.setName(featureCLass.getName() + "Connector");
							em.setUseDomainElement(false);
							em.setTargetFinderExpression("feature:contains" + featureCLass.getName());
							layer.getEdgeMappings().add(em);

							EdgeStyleDescription edgestyle = StyleFactory.eINSTANCE.createEdgeStyleDescription();
							CenterLabelStyleDescription labelstyle = StyleFactory.eINSTANCE
									.createCenterLabelStyleDescription();
							edgestyle.setLineStyle(LineStyle.DASH_LITERAL);
							edgestyle.setRoutingStyle(EdgeRouting.TREE_LITERAL);
							edgestyle.setCenterLabelStyleDescription(labelstyle);
							edgestyle.setSourceArrow(EdgeArrows.NO_DECORATION_LITERAL);
							edgestyle.setTargetArrow(EdgeArrows.NO_DECORATION_LITERAL);

							em.setStyle(edgestyle);
						}
//
					}

				}

				if (obj instanceof NodeMapping) {
					nodeList.add((NodeMapping) obj);
					((NodeMapping) obj).setDomainClass(ep.getName() + "::" + ((NodeMapping) obj).getDomainClass()
							.substring(((NodeMapping) obj).getDomainClass().lastIndexOf(":") + 1));
					// layer.getNodeMappings().add((NodeMapping) obj);
					System.out.println(((NodeMapping) obj).getDomainClass()
							.substring(((NodeMapping) obj).getDomainClass().lastIndexOf(":") + 1)
							.equalsIgnoreCase(entry.getKey().getName()));

					if (((NodeMapping) obj).getDomainClass()
							.substring(((NodeMapping) obj).getDomainClass().lastIndexOf(":") + 1)
							.equals(entry.getKey().getName())) {

						for (EClass featureCLass : entry.getValue()) {

							NodeMapping nmd = DescriptionFactory.eINSTANCE.createNodeMapping();

							this.nmlist.add(nmd);
							nmd.setName(featureCLass.getName());
							nmd.setDomainClass(ep.getName() + "::" + featureCLass.getName());
							layer.getNodeMappings().add(nmd);

							SquareDescription sd = StyleFactory.eINSTANCE.createSquareDescription();
							sd.setBorderSizeComputationExpression("2");
							sd.setBorderLineStyle(LineStyle.DASH_LITERAL);
							sd.setColor(attributesFixedColor);
							sd.setShowIcon(false);
							sd.setLabelPosition(LabelPosition.NODE_LITERAL);

							sd.setHeight(3);
							sd.setWidth(12);
							String attrname = featureCLass.getName()
									.replace(Tools.upperCaseFirst(((NodeMapping) obj).getName()), " ");

							sd.setLabelExpression("aql: '" + attrname + " = '+ self.eContainer()." + attrname);

							System.out.println(((NodeMapping) obj).getName());
							nmd.setStyle(sd);
							EdgeMapping em = DescriptionFactory.eINSTANCE.createEdgeMapping();
							// em.createEdge(nm, (NodeMapping)obj,);
							emlist.add(em);
							em.getTargetMapping().add(nmd);
							em.getSourceMapping().add((NodeMapping) obj);
							em.setName(featureCLass.getName() + "Connector");
							em.setUseDomainElement(false);
							em.setTargetFinderExpression("feature:contains" + featureCLass.getName());
							layer.getEdgeMappings().add(em);

							EdgeStyleDescription edgestyle = StyleFactory.eINSTANCE.createEdgeStyleDescription();
							CenterLabelStyleDescription labelstyle = StyleFactory.eINSTANCE
									.createCenterLabelStyleDescription();
							edgestyle.setLineStyle(LineStyle.DASH_LITERAL);
							edgestyle.setRoutingStyle(EdgeRouting.TREE_LITERAL);
							edgestyle.setCenterLabelStyleDescription(labelstyle);
							edgestyle.setSourceArrow(EdgeArrows.NO_DECORATION_LITERAL);
							edgestyle.setTargetArrow(EdgeArrows.NO_DECORATION_LITERAL);
							edgestyle.setCenterLabelStyleDescription(labelstyle);
							em.setStyle(edgestyle);
						}

					}
					// ((NodeMapping) obj).setDomainClass(ep.getName() + "::" + ((NodeMapping)
					// obj).getName());
				}

				if (obj instanceof CreateInstance) {
					// nodeList.add((CreateInstance) obj);
					((CreateInstance) obj).setTypeName(ep.getName() + "::" + ((CreateInstance) obj).getTypeName()
							.substring(((CreateInstance) obj).getTypeName().lastIndexOf(":") + 1));
				}

			}

		}

		ContainerMapping cm = DescriptionFactory.eINSTANCE.createContainerMapping();
		FlatContainerStyleDescription csd = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();

		cm.setStyle(csd);
		csd.setShowIcon(false);
		csd.setLabelExpression("aql:self.name");
		csd.setBorderSizeComputationExpression("2");
		csd.setBorderColor(featuresFixedColor);
		cm.setLabel(metamodelElement.getName());
		cm.setName(metamodelElement.getName());
		cm.setDomainClass(ep.getName() + "::" + metamodelElement.getName());
		dd.getAllLayers().get(0).getContainerMappings().add(cm);
		NodeMapping nm = DescriptionFactory.eINSTANCE.createNodeMapping();
		EList<EReference> listERef = metamodelElement.getEAllContainments();
		
			nm.setName(BorderedNodeCreation.getName());
			nm.setDomainClass(ep.getName() + "::MetamodelElementFeature");
			SquareDescription sd = StyleFactory.eINSTANCE.createSquareDescription();

			sd.setLabelExpression("aql:self.name");
			nm.setStyle(sd);

			sd.setLabelExpression("[name/]");
			cm.getBorderedNodeMappings().add(nm);

			sd.setColor(featuresFixedColor);
			sd.setShowIcon(false);
			sd.setLabelPosition(LabelPosition.NODE_LITERAL);
			// sd.setSizeComputationExpression("2");
			sd.setBorderSizeComputationExpression("2");
			sd.setBorderLineStyle(LineStyle.DASH_LITERAL);
			sd.setHeight(3);
			sd.setWidth(12);

		

		EdgeMapping edgeintermediate = DescriptionFactory.eINSTANCE.createEdgeMappingUsingDomainElement();
		edgeintermediate.setName(intermediateElement.getName());
		edgeintermediate.setDomainClass(ep.getName() + "::" + intermediateElement.getName());
		edgeintermediate.setSourceFinderExpression("[self.metamodElelement/]");
		edgeintermediate.setTargetFinderExpression("[self.bindingElement/]");
		edgeintermediate.getSourceMapping().add(cm);

		for (EdgeMapping edge : edgeList) {
			edgeintermediate.getTargetMapping().add(edge);

		}

		for (NodeMapping node : nodeList) {

			edgeintermediate.getTargetMapping().add(node);

		}

		for (ContainerMapping container : containerList) {

			edgeintermediate.getTargetMapping().add(container);

		}

		List<DiagramElementMapping> targetM = new ArrayList<>();

		for (DiagramElementMapping dem : edgeintermediate.getTargetMapping()) {
			targetM.add(dem);
		}

		
		for (DiagramElementMapping dem:targetM) {
			for (NodeMapping nme:this.nmlist) {
				if(nme.getName().equals(dem.getName())) {
					edgeintermediate.getTargetMapping().remove(dem);
				}
			}
			
			for (EdgeMapping nme:this.emlist) {
				if(nme.getName().equals(dem.getName())) {
					edgeintermediate.getTargetMapping().remove(dem);
				}
			}
		}
		edgeintermediate.setSemanticCandidatesExpression("feature:containsIntermediateElement");
		dd.getAllLayers().get(0).getEdgeMappings().add(edgeintermediate);

		EdgeStyleDescription edgestyle = StyleFactory.eINSTANCE.createEdgeStyleDescription();
		CenterLabelStyleDescription labelstyle = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
		edgestyle.setCenterLabelStyleDescription(labelstyle);
		edgeintermediate.setStyle(edgestyle);

		EdgeMapping pointTo = DescriptionFactory.eINSTANCE.createEdgeMapping();
		pointTo.setName("pointTo");
		pointTo.getSourceMapping().add(nm);
		for (NodeMapping nmiterator : this.nmlist) {
			pointTo.getTargetMapping().add(nmiterator);
		}
		EdgeStyleDescription edgestyle1 = StyleFactory.eINSTANCE.createEdgeStyleDescription();
		CenterLabelStyleDescription labelstyle1 = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
		edgestyle1.setCenterLabelStyleDescription(labelstyle1);

		pointTo.setStyle(edgestyle1);
		dd.getAllLayers().get(0).getEdgeMappings().add(pointTo);
// Tool section part 
		ToolSection toolsec = ToolFactory.eINSTANCE.createToolSection();

		toolsec.setName(com.odesign.generator.values.ToolSection.getName());
		EdgeCreationDescription featureedgecreationdesc = ToolFactory.eINSTANCE.createEdgeCreationDescription();
		featureedgecreationdesc.setName("Attribute Binding Edge");
		featureedgecreationdesc.setLabel("Attribute Binding Edge");
		featureedgecreationdesc.getEdgeMappings().add(pointTo);
		toolsec.getOwnedTools().add(featureedgecreationdesc);

		InitEdgeCreationOperation init3 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitEdgeCreationOperation();

		ChangeContext changecontext3 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createChangeContext();
	
		init3.setFirstModelOperations(changecontext3);
		SetValue setValue13 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
		setValue13.setFeatureName("featureClass");
		setValue13.setValueExpression("[target/]");

		changecontext3.getSubModelOperations().add(setValue13);

		changecontext3.setBrowseExpression("[source/]");
		featureedgecreationdesc.setInitialOperation(init3);

		EdgeCreationDescription edgecreationdesc = ToolFactory.eINSTANCE.createEdgeCreationDescription();

		NodeCreationDescription metamodelElementFeaturedesc = ToolFactory.eINSTANCE.createNodeCreationDescription();
		metamodelElementFeaturedesc.setName("Metamodel Element Feature");
		metamodelElementFeaturedesc.setLabel("Metamodel Element Feature");
		metamodelElementFeaturedesc.getNodeMappings().add(nm);
		metamodelElementFeaturedesc.setName(MetamodelElementFeature.getName());
		toolsec.getOwnedTools().add(metamodelElementFeaturedesc);

		ChangeContext changecontext11 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createChangeContext();
		changecontext11.setBrowseExpression("var:container");
		CreateInstance nodeInstance = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createCreateInstance();
		nodeInstance.setReferenceName("metamodelElementFeature");
		nodeInstance.setTypeName(ep.getName() + "::MetamodelElementFeature");
		nodeInstance.setVariableName("instance");
		changecontext11.getSubModelOperations().add(nodeInstance);
		InitialNodeCreationOperation init22 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitialNodeCreationOperation();

		metamodelElementFeaturedesc.setInitialOperation(init22);

		init22.setFirstModelOperations(changecontext11);

		metamodelElementFeaturedesc.setInitialOperation(init22);

		
		
		edgecreationdesc.setName("Class Binding Edge ");
		edgecreationdesc.getEdgeMappings().add(edgeintermediate);
		toolsec.getOwnedTools().add(edgecreationdesc);

		InitEdgeCreationOperation init = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitEdgeCreationOperation();

		ChangeContext changecontext = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createChangeContext();
		CreateInstance edgeInstance = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createCreateInstance();
		edgeInstance.setReferenceName("containsIntermediateElement");
		edgeInstance.setTypeName(ep.getName() + "::IntemediateElement");
		edgeInstance.setVariableName("instance");
		changecontext.getSubModelOperations().add(edgeInstance);
		init.setFirstModelOperations(changecontext);
		SetValue setValue1 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
		setValue1.setFeatureName("metamodElelement");
		setValue1.setValueExpression("[source/]");

		SetValue setValue2 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
		setValue2.setFeatureName("bindingElement");
		setValue2.setValueExpression("[target/]");
		edgeInstance.getSubModelOperations().add(setValue1);
		edgeInstance.getSubModelOperations().add(setValue2);
		changecontext.setBrowseExpression("[source.eContainer()/]");
		edgecreationdesc.setInitialOperation(init);

		ContainerCreationDescription containerCreation = ToolFactory.eINSTANCE.createContainerCreationDescription();
		containerCreation.setName("Metamodel Element");
		containerCreation.getContainerMappings().add(cm);
		toolsec.getOwnedTools().add(containerCreation);

		ChangeContext changecontext1 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createChangeContext();
		changecontext1.setBrowseExpression("var:container");
		CreateInstance containerInstance = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createCreateInstance();
		containerInstance.setReferenceName("containsMetamodelElement");
		containerInstance.setTypeName(ep.getName() + "::MetamodelElement");
		containerInstance.setVariableName("instance");
		changecontext1.getSubModelOperations().add(containerInstance);
		InitialNodeCreationOperation init2 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitialNodeCreationOperation();

		containerCreation.setInitialOperation(init2);

		init2.setFirstModelOperations(changecontext1);
		SetValue setValue3 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
		setValue3.setFeatureName("name");
		setValue3.setValueExpression("[name/]");

		containerInstance.getSubModelOperations().add(setValue3);

		containerCreation.setInitialOperation(init2);

		dd.getAllLayers().get(0).getToolSections().add(toolsec);

		try {
			// jesusc: we should probably find a better name
			String diagramName = this.diagramDescription.getName() + "_" + ep.getName();

			this.generatedFile = new File(file.getAbsolutePath() + File.separator + diagramName + ".odesign");
			resource.save(new FileOutputStream(generatedFile), null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public File getGeneratedFile() {
		return generatedFile;
	}

	public void GenerateContainersVersion(EPackage ep, File file, HashMap<EClass, List<EClass>> newClassifiers,
			EClass metamodelElement, EClass intermediateElement) throws FileNotFoundException, IOException {

		List<NodeMapping> creatednmList = new ArrayList<NodeMapping>();
		TreeIterator<EObject> content = this.resource.getAllContents();
		DiagramDescription dd = null;
		List<EdgeMapping> edgeList = new ArrayList<>();
		List<NodeMapping> nodeList = new ArrayList<>();
		NodeMapping nmd = DescriptionFactory.eINSTANCE.createNodeMapping();
		while (content.hasNext()) {
			EObject obj = content.next();
			if (obj instanceof DiagramDescription) {
				dd = (DiagramDescription) obj;
				((DiagramDescription) obj).setDomainClass(ep.getName() + "::" + ((DiagramDescription) obj).getName());
			}

			if (obj instanceof EdgeMapping) {

				edgeList.add((EdgeMapping) obj);
				if (((EdgeMapping) obj).isUseDomainElement() && !((EdgeMapping) obj).getDomainClass().isEmpty()) {
					((EdgeMapping) obj).setDomainClass(ep.getName() + "::" + ((EdgeMapping) obj).getName());
				}
			}
			if (obj instanceof NodeMapping) {
				if (!((NodeMapping) obj).getName().equals("") && !(creatednmList.contains((NodeMapping) obj))) {
					nodeList.add((NodeMapping) obj);
					ContainerMapping cm = DescriptionFactory.eINSTANCE.createContainerMapping();
					FlatContainerStyleDescription csd = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();

					cm.setStyle(csd);
					System.out.println("");
					cm.setLabel(((NodeMapping) obj).getLabel());
					cm.setName(((NodeMapping) obj).getName());
					cm.setDomainClass(ep.getName() + "::" + ((NodeMapping) obj).getName());
					dd.getAllLayers().get(0).getContainerMappings().add(cm);

					for (Entry<EClass, List<EClass>> entry : newClassifiers.entrySet()) {
						if (entry.getKey().getName().equals(((NodeMapping) obj).getDomainClass()
								.substring((((NodeMapping) obj).getDomainClass()).lastIndexOf(":") + 1))) {

							for (EClass eclass : entry.getValue()) {

								SquareDescription sd = StyleFactory.eINSTANCE.createSquareDescription();
								nmd.setName(eclass.getName());
								nmd.setLabel(eclass.getName());
								nmd.setDomainClass(ep.getName() + "::" + eclass.getName());
								sd.setLabelExpression(eclass.getName());
								nmd.setStyle(sd);
								cm.getBorderedNodeMappings().add(nmd);
								creatednmList.add(nmd);

							}

						}

					}

					dd.getAllLayers().get(0).getNodeMappings().remove(obj);
				}

			}
		}

		ContainerMapping cm = DescriptionFactory.eINSTANCE.createContainerMapping();
		FlatContainerStyleDescription csd = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();

		cm.setStyle(csd);

		cm.setLabel(metamodelElement.getName());
		cm.setName(metamodelElement.getName());
		cm.setDomainClass(ep.getName() + "::" + metamodelElement.getName());
		dd.getAllLayers().get(0).getContainerMappings().add(cm);
		NodeMapping nm = DescriptionFactory.eINSTANCE.createNodeMapping();
		EList<EReference> listERef = metamodelElement.getEAllContainments();
		for (EReference eref : listERef) {

			nm.setDomainClass(ep.getName() + "" + eref.getEType().getName());
			SquareDescription sd = StyleFactory.eINSTANCE.createSquareDescription();
			sd.setLabelExpression(eref.getEType().getName());
			cm.getBorderedNodeMappings().add(nm);

		}

		EdgeMapping edgeintermediate = DescriptionFactory.eINSTANCE.createEdgeMappingUsingDomainElement();
		edgeintermediate.setName(intermediateElement.getName());
		edgeintermediate.setDomainClass(ep.getName() + "::" + intermediateElement.getName());
		edgeintermediate.setSourceFinderExpression("[self.metamodElelement/]");
		edgeintermediate.setTargetFinderExpression("[self.bindingElement/]");
		edgeintermediate.getSourceMapping().add(cm);
		for (EdgeMapping edge : edgeList) {
			edgeintermediate.getTargetMapping().add(edge);
		}
		for (NodeMapping node : nodeList) {
			edgeintermediate.getTargetMapping().add(node);
		}


		edgeintermediate.setSemanticCandidatesExpression("feature:containsIntermediateElement");
		dd.getAllLayers().get(0).getEdgeMappings().add(edgeintermediate);

		EdgeStyleDescription edgestyle = StyleFactory.eINSTANCE.createEdgeStyleDescription();
		CenterLabelStyleDescription labelstyle = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
		edgestyle.setCenterLabelStyleDescription(labelstyle);
		edgeintermediate.setStyle(edgestyle);

		EdgeMapping pointTo = DescriptionFactory.eINSTANCE.createEdgeMapping();
		pointTo.setName("pointTo");
		pointTo.getSourceMapping().add(nm);
		pointTo.getTargetMapping().add(nmd);
		EdgeStyleDescription edgestyle1 = StyleFactory.eINSTANCE.createEdgeStyleDescription();
		CenterLabelStyleDescription labelstyle1 = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
		edgestyle1.setCenterLabelStyleDescription(labelstyle1);

		pointTo.setStyle(edgestyle1);
		dd.getAllLayers().get(0).getEdgeMappings().add(pointTo);

		// Tool section part
		ToolSection toolsec = ToolFactory.eINSTANCE.createToolSection();
		toolsec.setName("Tools");

		NodeCreationDescription metamodelElementFeatureDesc = ToolFactory.eINSTANCE.createNodeCreationDescription();
		metamodelElementFeatureDesc.setName("MetamodelElementFeature");
		metamodelElementFeatureDesc.getNodeMappings().add(nm);
		toolsec.getOwnedTools().add(metamodelElementFeatureDesc);

		ChangeContext changecontext11 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createChangeContext();
		changecontext11.setBrowseExpression("var:container");
		CreateInstance nodeInstance = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createCreateInstance();
		nodeInstance.setReferenceName("metamodelElementFeature");
		nodeInstance.setTypeName(ep.getName() + "::MetamodelElementFeature");
		nodeInstance.setVariableName("instance");
		changecontext11.getSubModelOperations().add(nodeInstance);
		InitialNodeCreationOperation init22 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitialNodeCreationOperation();

		metamodelElementFeatureDesc.setInitialOperation(init22);

		init22.setFirstModelOperations(changecontext11);

		metamodelElementFeatureDesc.setInitialOperation(init22);

		EdgeCreationDescription edgecreationdesc = ToolFactory.eINSTANCE.createEdgeCreationDescription();

		edgecreationdesc.setName(intermediateElement.getName());
		edgecreationdesc.getEdgeMappings().add(edgeintermediate);
		toolsec.getOwnedTools().add(edgecreationdesc);

		InitEdgeCreationOperation init = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitEdgeCreationOperation();

		ChangeContext changecontext = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createChangeContext();
		CreateInstance edgeInstance = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createCreateInstance();
		edgeInstance.setReferenceName("containsIntermediatElement");
		edgeInstance.setTypeName(ep.getName() + "::IntemediateElement");
		edgeInstance.setVariableName("instance");
		changecontext.getSubModelOperations().add(edgeInstance);
		init.setFirstModelOperations(changecontext);
		SetValue setValue1 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
		setValue1.setFeatureName("metamodElelement");
		setValue1.setValueExpression("[source/]");

		SetValue setValue2 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
		setValue2.setFeatureName("bindingElement");
		setValue2.setValueExpression("[target/]");
		edgeInstance.getSubModelOperations().add(setValue1);
		edgeInstance.getSubModelOperations().add(setValue2);
		changecontext.setBrowseExpression("[source.eContainer()/]");
		edgecreationdesc.setInitialOperation(init);

		ContainerCreationDescription containerCreation = ToolFactory.eINSTANCE.createContainerCreationDescription();
		containerCreation.setName(cm.getName());
		containerCreation.getContainerMappings().add(cm);
		toolsec.getOwnedTools().add(containerCreation);

		ChangeContext changecontext1 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createChangeContext();
		changecontext1.setBrowseExpression("var:container");
		CreateInstance containerInstance = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createCreateInstance();
		containerInstance.setReferenceName("conatainsMetamodelElement");
		containerInstance.setTypeName(ep.getName() + "::MetamodelElement");
		containerInstance.setVariableName("instance");
		changecontext1.getSubModelOperations().add(containerInstance);
		InitialNodeCreationOperation init2 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitialNodeCreationOperation();

		containerCreation.setInitialOperation(init2);

		init2.setFirstModelOperations(changecontext1);
		SetValue setValue3 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
		setValue3.setFeatureName("name");
		setValue3.setValueExpression("[name/]");

		containerInstance.getSubModelOperations().add(setValue3);

		containerCreation.setInitialOperation(init2);

		dd.getAllLayers().get(0).getToolSections().add(toolsec);

		
		
	}

}
