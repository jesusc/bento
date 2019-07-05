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
import org.eclipse.sirius.diagram.ContainerLayout;
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
import org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription;
import org.eclipse.sirius.diagram.description.tool.ContainerCreationDescription;
import org.eclipse.sirius.diagram.description.tool.EdgeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.diagram.description.tool.ToolSection;
import org.eclipse.sirius.viewpoint.LabelAlignment;
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

import com.odesign.generator.tools.BindingTools;
import com.odesign.generator.tools.OdesignTools;
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

	private EList<EdgeMapping> oroginalEdges;
	private EList<NodeMapping> oroginalNodes;
	private EList<ContainerMapping> oroginalContainers;

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
				this.oroginalEdges = this.diagramDescription.getAllEdgeMappings();
				this.oroginalNodes = this.diagramDescription.getAllNodeMappings();
				this.oroginalContainers = this.diagramDescription.getAllContainerMappings();

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

		this.diagramDescription.getMetamodel().add(ep);
		DiagramDescription dd = DescriptionFactory.eINSTANCE.createDiagramDescription();
		dd = this.diagramDescription;
		
		String separator=".";
		if(dd.getDomainClass().contains("::"))
			separator="::";
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

		UserFixedColor featuresFixedColorRed = org.eclipse.sirius.viewpoint.description.DescriptionFactory.eINSTANCE
				.createUserFixedColor();
		colorPallette.getEntries().add(featuresFixedColorRed);
		featuresFixedColor.setBlue(0);
		featuresFixedColor.setGreen(0);
		featuresFixedColor.setRed(255);

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
							.setDomainClass(ep.getName() + separator + ((DiagramDescription) obj).getDomainClass()
									.substring(((DiagramDescription) obj).getDomainClass().lastIndexOf(separator.substring(separator.length() - 1)) + 1));

				}

				if (obj instanceof EdgeMapping) {

					if (((EdgeMapping) obj).isUseDomainElement()) {
						edgeList.add((EdgeMapping) obj);
						((EdgeMapping) obj).setDomainClass(ep.getName() + separator + ((EdgeMapping) obj).getDomainClass()
								.substring(((EdgeMapping) obj).getDomainClass().lastIndexOf(separator.substring(separator.length() - 1)) + 1));
						if (((EdgeMapping) obj).getDomainClass()
								.substring(((EdgeMapping) obj).getDomainClass().lastIndexOf(separator.substring(separator.length() - 1)) + 1)
								.equals(entry.getKey().getName())) {

							for (EClass featureCLass : entry.getValue()) {

								NodeMapping nmd = DescriptionFactory.eINSTANCE.createNodeMapping();

								this.nmlist.add(nmd);
								nmd.setName(featureCLass.getName());
								nmd.setDomainClass(ep.getName() + separator+ featureCLass.getName());
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
								String classname = ((EdgeMapping) obj).getDomainClass()
										.substring(((((EdgeMapping) obj).getDomainClass()).lastIndexOf(separator.substring(separator.length() - 1))) + 1);
								String attrname = featureCLass.getName().toLowerCase().replace(classname.toLowerCase(),
										" ");
								System.out.println(featureCLass);
								System.out.println(classname);

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
							.setDomainClass(ep.getName() + separator + ((ContainerMapping) obj).getDomainClass()
									.substring(((ContainerMapping) obj).getDomainClass().lastIndexOf(separator.substring(separator.length() - 1)) + 1));

					if (((ContainerMapping) obj).getDomainClass()
							.substring(((ContainerMapping) obj).getDomainClass().lastIndexOf(separator.substring(separator.length() - 1)) + 1)
							.equals(entry.getKey().getName())) {

						for (EClass featureCLass : entry.getValue()) {

							NodeMapping nmd = DescriptionFactory.eINSTANCE.createNodeMapping();

							this.nmlist.add(nmd);
							nmd.setName(featureCLass.getName());
							nmd.setDomainClass(ep.getName() + separator + featureCLass.getName());
							layer.getNodeMappings().add(nmd);

							SquareDescription sd = StyleFactory.eINSTANCE.createSquareDescription();
							sd.setBorderLineStyle(LineStyle.DASH_LITERAL);
							String classname = ((ContainerMapping) obj).getDomainClass()
									.substring(((((ContainerMapping) obj).getDomainClass()).lastIndexOf(separator.substring(separator.length() - 1))) + 1);
							String attrname = featureCLass.getName().toLowerCase().replace(classname.toLowerCase(),
									" ");
							System.out.println(featureCLass.getName());
							System.out.println(classname);

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
					((NodeMapping) obj).setDomainClass(ep.getName() + separator + ((NodeMapping) obj).getDomainClass()
							.substring(((NodeMapping) obj).getDomainClass().lastIndexOf(separator.substring(separator.length() - 1) ) + 1));
					
					System.out.println(((NodeMapping) obj).getDomainClass()
							.substring(((NodeMapping) obj).getDomainClass().lastIndexOf(separator.substring(separator.length() - 1) ) + 1)
							.equalsIgnoreCase(entry.getKey().getName()));

					if (((NodeMapping) obj).getDomainClass()
							.substring(((NodeMapping) obj).getDomainClass().lastIndexOf(separator.substring(separator.length() - 1)) + 1)
							.equals(entry.getKey().getName())) {

						for (EClass featureCLass : entry.getValue()) {

							NodeMapping nmd = DescriptionFactory.eINSTANCE.createNodeMapping();

							this.nmlist.add(nmd);
							nmd.setName(featureCLass.getName());
							nmd.setDomainClass(ep.getName() +separator  + featureCLass.getName());
							layer.getNodeMappings().add(nmd);

							SquareDescription sd = StyleFactory.eINSTANCE.createSquareDescription();
							sd.setBorderSizeComputationExpression("2");
							sd.setBorderLineStyle(LineStyle.DASH_LITERAL);
							sd.setColor(attributesFixedColor);
							sd.setShowIcon(false);
							sd.setLabelPosition(LabelPosition.NODE_LITERAL);

							sd.setHeight(3);
							sd.setWidth(12);
							String classname = ((NodeMapping) obj).getDomainClass()
									.substring(((((NodeMapping) obj).getDomainClass()).lastIndexOf(separator.substring(separator.length() - 1))) + 1);
							String attrname = featureCLass.getName().toLowerCase().replace(classname.toLowerCase(),
									" ");
							System.out.println(featureCLass);
							System.out.println(classname);
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
					// ((NodeMapping) obj).setDomainClass(ep.getName() + "." + ((NodeMapping)
					// obj).getName());
				}

				if (obj instanceof CreateInstance) {
					// nodeList.add((CreateInstance) obj);
					((CreateInstance) obj).setTypeName(ep.getName() + separator  + ((CreateInstance) obj).getTypeName()
							.substring(((CreateInstance) obj).getTypeName().lastIndexOf(separator.substring(separator.length() - 1)) + 1));
				}

			}

		}

		// The NONE creation
		
		NodeMapping nonemapping = DescriptionFactory.eINSTANCE.createNodeMapping();
		nonemapping.setName("None Element");
		nonemapping.setDomainClass(ep.getName() + ".NoneElement");
		nonemapping.setSemanticCandidatesExpression("feature:containsNoneElement");
		dd.getAllLayers().get(0).getNodeMappings().add(nonemapping);	
		
		
		//NodeMapping noneNodeMapping=OdesignTools.createNode("None", ep, "NoneElement","containsNoneElement", dd);
		WorkspaceImageDescription workspaceimage = StyleFactory.eINSTANCE.createWorkspaceImageDescription();

		workspaceimage.setLabelExpression("[''/]");
		nonemapping.setStyle(workspaceimage);
		// workspaceimage.setWorkspacePath(value);
	workspaceimage.setWorkspacePath("/com.workflow2.editor.design/trash -128.png");
		workspaceimage.setIconPath("/com.workflow2.editor.design/trash -128.png");
		
		workspaceimage.setShowIcon(false);
		

		
		EdgeStyleDescription edgestylenone = StyleFactory.eINSTANCE.createEdgeStyleDescription();
		CenterLabelStyleDescription labelstylenone = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
		edgestylenone.setCenterLabelStyleDescription(labelstylenone);
		edgestylenone.setRoutingStyle(EdgeRouting.TREE_LITERAL);
		edgestylenone.setStrokeColor(featuresFixedColorRed);
		
		
		
		EdgeMapping mapToNone = DescriptionFactory.eINSTANCE.createEdgeMapping();
		mapToNone.setName("Map to NONE");

		// pointTo.setTargetExpression("feature:featureClass");
		mapToNone.setTargetFinderExpression("feature:noneElement");
		mapToNone.getTargetMapping().add(nonemapping);
		mapToNone.setStyle(edgestylenone);
		dd.getAllLayers().get(0).getEdgeMappings().add(mapToNone);

		FlatContainerStyleDescription csd = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		ContainerMapping cm = DescriptionFactory.eINSTANCE.createContainerMapping();
		cm.setStyle(csd);
		csd.setWidthComputationExpression("6");
		csd.setHeightComputationExpression("7");
		csd.setShowIcon(false);
		
		csd.setLabelExpression("aql:self.name");
		csd.setBorderSizeComputationExpression("2");
		csd.setBorderColor(featuresFixedColor);

		
		cm.setChildrenPresentation(ContainerLayout.VERTICAL_STACK);
		cm.setLabel(metamodelElement.getName());
		cm.setName(metamodelElement.getName());
		cm.setDomainClass(ep.getName() + "." + metamodelElement.getName());
		dd.getAllLayers().get(0).getContainerMappings().add(cm);

		
		
		
		//feature
		ContainerMapping nm = DescriptionFactory.eINSTANCE.createContainerMapping();
		nm.setName("Feature");
		nm.setDomainClass(ep.getName() + ".MetamodelElementFeature");
		nm.setSemanticCandidatesExpression("feature:metamodelElementFeature");
		FlatContainerStyleDescription csdfeature = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		nm.setStyle(csdfeature);
		csdfeature.setShowIcon(false);
		csdfeature.setLabelExpression("aql:self.name");
		//csdfeature.setBorderSizeComputationExpression("2");
		//csdfeature.setBorderColor(featuresFixedColor);	
	//	dd.getAllLayers().get(0).getContainerMappings().add(nm);
		try {
		cm.getSubContainerMappings().add(nm);
		//cm.getAllContainerMappings().add(nm);
		}catch(Exception e) {e.printStackTrace();}

	

		EdgeMapping edgeintermediate = DescriptionFactory.eINSTANCE.createEdgeMappingUsingDomainElement();
		edgeintermediate.setName(intermediateElement.getName());
		edgeintermediate.setDomainClass(ep.getName() + "." + intermediateElement.getName());
		edgeintermediate.setSourceFinderExpression("[metamodelElement/]");
		edgeintermediate.setTargetFinderExpression("[bindingElement/]");
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

		for (DiagramElementMapping dem : targetM) {
			for (NodeMapping nme : this.nmlist) {
				if (nme.getName().equals(dem.getName())) {
					edgeintermediate.getTargetMapping().remove(dem);
				}
			}

			for (EdgeMapping nme : this.emlist) {
				if (nme.getName().equals(dem.getName())) {
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
		pointTo.setName("Bind attributes");
		pointTo.getSourceMapping().add(nm);

		pointTo.setTargetFinderExpression("feature:featureClass");
		for (NodeMapping nmiterator : this.nmlist) {
			pointTo.getTargetMapping().add(nmiterator);
		}
		
		//pointTo.setStyle(edgestyleVA);

		dd.getAllLayers().get(0).getEdgeMappings().add(pointTo);

		EdgeStyleDescription edgestyle1 = StyleFactory.eINSTANCE.createEdgeStyleDescription();
		CenterLabelStyleDescription labelstyle1 = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
		edgestyle1.setCenterLabelStyleDescription(labelstyle1);
		pointTo.setStyle(edgestyle1);
		
		ContainerMapping virtualAttributeContainer=DescriptionFactory.eINSTANCE.createContainerMapping();
		virtualAttributeContainer.setName("Virtual Attribute");
		virtualAttributeContainer.setDomainClass(ep.getName() + separator+"VirtualAttribute");
		virtualAttributeContainer.setSemanticCandidatesExpression("feature:virtualAttribute");
		FlatContainerStyleDescription csdVirtualATtribute = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		
		virtualAttributeContainer.setStyle(csdVirtualATtribute );
		csdVirtualATtribute.setShowIcon(false);
		csdVirtualATtribute.setBackgroundColor(featuresFixedColor);
		csdVirtualATtribute.setLabelExpression("aql:self.name");
		cm.getSubContainerMappings().add(virtualAttributeContainer);
		
		


		EdgeMapping to_virtualAttributeEdge = DescriptionFactory.eINSTANCE.createEdgeMapping();
		to_virtualAttributeEdge.setName("Map a virtual attribute");
		to_virtualAttributeEdge.getSourceMapping().add(virtualAttributeContainer);

		to_virtualAttributeEdge.setTargetFinderExpression("feature:featureClass");
		for (NodeMapping nmiterator : this.nmlist) {
			to_virtualAttributeEdge.getTargetMapping().add(nmiterator);
		}

		to_virtualAttributeEdge.setTargetFinderExpression("feature:to_virtualAttribute");

		EdgeStyleDescription to_edgestyleVA = StyleFactory.eINSTANCE.createEdgeStyleDescription();
		CenterLabelStyleDescription to_labelstyleVA = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
		to_edgestyleVA.setCenterLabelStyleDescription(to_labelstyleVA);
		to_edgestyleVA.setStrokeColor(featuresFixedColor);

		to_virtualAttributeEdge.setStyle(to_edgestyleVA);

		dd.getAllLayers().get(0).getEdgeMappings().add(to_virtualAttributeEdge);
		
// Tool section part 

		// Tool section creation
		ToolSection toolsec = ToolFactory.eINSTANCE.createToolSection();
		toolsec.setName("Generated Tools section");

		// Bind attributes edge
		EdgeCreationDescription featureedgecreationdesc = ToolFactory.eINSTANCE.createEdgeCreationDescription();
		featureedgecreationdesc.setName("Bind Attributes");
		featureedgecreationdesc.setLabel("Bind Attributes");
		featureedgecreationdesc.getEdgeMappings().add(pointTo);
		toolsec.getOwnedTools().add(featureedgecreationdesc);
		ChangeContext changecontext3 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createChangeContext();
		InitEdgeCreationOperation init3 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitEdgeCreationOperation();
		init3.setFirstModelOperations(changecontext3);
		SetValue setValue13 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
		setValue13.setFeatureName("featureClass");
		setValue13.setValueExpression("var:target");
		changecontext3.getSubModelOperations().add(setValue13);
		changecontext3.setBrowseExpression("var:source");
		featureedgecreationdesc.setInitialOperation(init3);
		
		
		
		
		
		//None node creation
		NodeCreationDescription nonecreation = ToolFactory.eINSTANCE.createNodeCreationDescription();
		nonecreation.setName("NONE");
		nonecreation.setLabel("NONE");
		nonecreation.getNodeMappings().add(nonemapping);
		toolsec.getOwnedTools().add(nonecreation);
		ChangeContext changecontextnone = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createChangeContext();
		changecontextnone.setBrowseExpression("var:container");
		CreateInstance noneInstance = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createCreateInstance();
		noneInstance.setReferenceName("containsNoneElement");
		noneInstance.setTypeName(ep.getName() + separator+"NoneElement");
		noneInstance.setVariableName("instance");
		changecontextnone.getSubModelOperations().add(noneInstance);
		InitialNodeCreationOperation initnone = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitialNodeCreationOperation();
		nonecreation.setInitialOperation(initnone);
		initnone.setFirstModelOperations(changecontextnone);
		nonecreation.setInitialOperation(initnone);
		nonecreation.setIconPath("/com.workflow2.editor.design/trash.png");

		//MetamodelELement feature Node
		ContainerCreationDescription metamodelElementFeaturedesc = ToolFactory.eINSTANCE.createContainerCreationDescription();
		metamodelElementFeaturedesc.setName("Feature");
		metamodelElementFeaturedesc.setLabel("Feature");
		metamodelElementFeaturedesc.getContainerMappings().add(nm);	
		toolsec.getOwnedTools().add(metamodelElementFeaturedesc);		
		ChangeContext changecontext11 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createChangeContext();
		changecontext11.setBrowseExpression("var:container");
		CreateInstance nodeInstance = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createCreateInstance();
		nodeInstance.setReferenceName("metamodelElementFeature");
		nodeInstance.setTypeName(ep.getName() + separator+"MetamodelElementFeature");
		nodeInstance.setVariableName("instance");
		changecontext11.getSubModelOperations().add(nodeInstance);
		InitialNodeCreationOperation init22 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createInitialNodeCreationOperation();
		metamodelElementFeaturedesc.setInitialOperation(init22);
		init22.setFirstModelOperations(changecontext11);
		metamodelElementFeaturedesc.setInitialOperation(init22);
		
		
		//Virtual Attribute
				ContainerCreationDescription virtualAttributedesc = ToolFactory.eINSTANCE.createContainerCreationDescription();
				virtualAttributedesc.setName("Virtual Attribute");
				virtualAttributedesc.setLabel("Virtual Attribute");
				virtualAttributedesc.getContainerMappings().add(virtualAttributeContainer);	
				toolsec.getOwnedTools().add(virtualAttributedesc);		
				ChangeContext changecontextVA = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createChangeContext();
				changecontextVA.setBrowseExpression("var:container");
				CreateInstance nodeInstanceVA = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createCreateInstance();
				nodeInstanceVA.setReferenceName("virtualAttribute");
				nodeInstanceVA.setTypeName(ep.getName() + ".VirtualAttribute");
				nodeInstanceVA.setVariableName("instance");
				changecontextVA.getSubModelOperations().add(nodeInstanceVA);
				InitialNodeCreationOperation initVA = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createInitialNodeCreationOperation();
				virtualAttributedesc.setInitialOperation(initVA);
				initVA.setFirstModelOperations(changecontextVA);
				virtualAttributedesc.setInitialOperation(initVA);
		
		
		
		//The edge from metamodelEElemnt to BindingEelement: IntermediateElement
		EdgeCreationDescription edgecreationdesc = ToolFactory.eINSTANCE.createEdgeCreationDescription();
		edgecreationdesc.setName("Bind Classes");
		edgecreationdesc.getEdgeMappings().add(edgeintermediate);
		toolsec.getOwnedTools().add(edgecreationdesc);
		InitEdgeCreationOperation init = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitEdgeCreationOperation();
		ChangeContext changecontextIntermediate = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createChangeContext();
		CreateInstance edgeInstance = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createCreateInstance();
		edgeInstance.setReferenceName("containsIntermediateElement");
		edgeInstance.setTypeName(ep.getName() + ".IntermediateElement");
		edgeInstance.setVariableName("instance");
		changecontextIntermediate.getSubModelOperations().add(edgeInstance);
		init.setFirstModelOperations(changecontextIntermediate);
		SetValue setValue1 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
		setValue1.setFeatureName("metamodelElement");
		setValue1.setValueExpression("var:source");
		SetValue setValue2 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
		setValue2.setFeatureName("bindingElement");
		setValue2.setValueExpression("var:target");
		edgeInstance.getSubModelOperations().add(setValue1);
		edgeInstance.getSubModelOperations().add(setValue2);
		changecontextIntermediate.setBrowseExpression("[source.eContainer()/]");
		edgecreationdesc.setInitialOperation(init);

	
		//The container of MetamodelElement
		ContainerCreationDescription containerCreation = ToolFactory.eINSTANCE.createContainerCreationDescription();
		containerCreation.setName("Class");
		containerCreation.getContainerMappings().add(cm);
		toolsec.getOwnedTools().add(containerCreation);
		ChangeContext changecontext1 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createChangeContext();
		changecontext1.setBrowseExpression("var:container");
		CreateInstance containerInstance = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createCreateInstance();
		containerInstance.setReferenceName("containsMetamodelElement");
		containerInstance.setTypeName(ep.getName() + ".MetamodelElement");
		containerInstance.setVariableName("instance");
		changecontext1.getSubModelOperations().add(containerInstance);
		InitialNodeCreationOperation init2 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitialNodeCreationOperation();
		containerCreation.setInitialOperation(init2);
		init2.setFirstModelOperations(changecontext1);
		SetValue setValue3 = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
		setValue3.setFeatureName("name");
		setValue3.setValueExpression("aql:'Class name'");
		containerInstance.getSubModelOperations().add(setValue3);
		containerCreation.setInitialOperation(init2);
		dd.getAllLayers().get(0).getToolSections().add(toolsec);
        
		for (NodeMapping nmapp : this.oroginalNodes) {
			mapToNone.getSourceMapping().add(nmapp);

		}

		for (EdgeMapping edgemapp : this.oroginalEdges) {
			mapToNone.getSourceMapping().add(edgemapp);
		}

		for (ContainerMapping nmapp : this.oroginalContainers) {
			mapToNone.getSourceMapping().add(nmapp);
		}
		
		

		EdgeCreationDescription edgecreationdescNone = ToolFactory.eINSTANCE.createEdgeCreationDescription();

		edgecreationdescNone.setName("Map To NONE");
		edgecreationdescNone.getEdgeMappings().add(mapToNone);
		toolsec.getOwnedTools().add(edgecreationdescNone);

		InitEdgeCreationOperation initNone = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createInitEdgeCreationOperation();

		ChangeContext changecontextNone = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
				.createChangeContext();
		changecontextNone.setBrowseExpression("var:source");
		initNone.setFirstModelOperations(changecontextNone);
		SetValue setValueNone = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
		setValueNone.setFeatureName("noneElement");
		setValueNone.setValueExpression("var:target");
		changecontextNone.getSubModelOperations().add(setValueNone);
		
		edgecreationdescNone.setInitialOperation(initNone);

		
		// Bind attributes edge
				EdgeCreationDescription vaedgecreationdesc = ToolFactory.eINSTANCE.createEdgeCreationDescription();
				vaedgecreationdesc.setName("Bind virtual attribute");
				vaedgecreationdesc.setLabel("Bind virtual attribute");
				vaedgecreationdesc.getEdgeMappings().add(to_virtualAttributeEdge);
				toolsec.getOwnedTools().add(vaedgecreationdesc);
				ChangeContext changecontextVAE = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
						.createChangeContext();
				InitEdgeCreationOperation initVAE = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE
						.createInitEdgeCreationOperation();
				initVAE.setFirstModelOperations(changecontextVAE);
				SetValue setValueVAE = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
				setValueVAE.setFeatureName("to_virtualAttribute");
				setValueVAE.setValueExpression("var:target");
				changecontextVAE.getSubModelOperations().add(setValueVAE);
				changecontextVAE.setBrowseExpression("var:source");
				vaedgecreationdesc.setInitialOperation(initVAE);

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

}
