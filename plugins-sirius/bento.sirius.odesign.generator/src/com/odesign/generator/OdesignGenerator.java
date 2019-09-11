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
import java.util.function.Consumer;
import java.util.function.Supplier;

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
import org.eclipse.sirius.diagram.description.AdditionalLayer;
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
import org.eclipse.sirius.diagram.description.style.LozengeNodeDescription;
import org.eclipse.sirius.diagram.description.style.SquareDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;
import org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription;
import org.eclipse.sirius.diagram.description.tool.ContainerCreationDescription;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.diagram.description.tool.EdgeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.ToolFactory;
import org.eclipse.sirius.diagram.description.tool.ToolSection;
import org.eclipse.sirius.viewpoint.FontFormat;
import org.eclipse.sirius.viewpoint.LabelAlignment;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.UserColorsPalette;
import org.eclipse.sirius.viewpoint.description.UserFixedColor;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.EditMaskVariables;
import org.eclipse.sirius.viewpoint.description.tool.InitEdgeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
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
	private List<DiagramDescription> diagramsList=new ArrayList<>();
	private List<NodeMapping> nmlist = new ArrayList<>();
	private Group group;
	private Viewpoint viewPoint;
	private File generatedFile;
	private List<EdgeMapping> emlist = new ArrayList<>();

	private EList<EdgeMapping> originalEdges;
	private EList<NodeMapping> originalNodes;
	private EList<ContainerMapping> originalContainers;
	private String originalPackageName;
	private String targetPackageName;

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public EPackage getEpackage() {

		return epackage;
	}


	public DiagramDescription getDiagramDescription() {
		return diagramDescription;
	}

	public void setDiagramDescription(DiagramDescription diagramDescription) {
		this.diagramDescription = diagramDescription;
	}
	
	

	public List<DiagramDescription> getDiagramsList() {
		return diagramsList;
	}

	public void setDiagramsList(EList<DiagramDescription> diagramsList) {
		this.diagramsList = diagramsList;
	}

	public Viewpoint getViewPoint() {
		return viewPoint;
	}

	public void setViewPoint(Viewpoint viewPoint) {
		this.viewPoint = viewPoint;
	}

	public EList<EdgeMapping> getOriginalEdges() {
		return originalEdges;
	}

	public void setOriginalEdges(EList<EdgeMapping> originalEdges) {
		this.originalEdges = originalEdges;
	}

	public EList<NodeMapping> getOriginalNodes() {
		return originalNodes;
	}

	public void setOriginalNodes(EList<NodeMapping> originalNodes) {
		this.originalNodes = originalNodes;
	}

	public EList<ContainerMapping> getOriginalContainers() {
		return originalContainers;
	}

	public void setOriginalContainers(EList<ContainerMapping> originalContainers) {
		this.originalContainers = originalContainers;
	}

	public String getOriginalPackageName() {
		return originalPackageName;
	}

	public void setOriginalPackageName(String originalPackageName) {
		this.originalPackageName = originalPackageName;
	}

	public void setEpackage(EPackage epackage) {
		this.epackage = epackage;
	}

	public void setGeneratedFile(File generatedFile) {
		this.generatedFile = generatedFile;
	}

	public OdesignGenerator(String modelURI, File file) {
		super();

		ResourceSet rs = new ResourceSetImpl();
		try {
		this.resource = rs.getResource(URI.createFileURI(modelURI), true);
		} catch(Exception e) {e.printStackTrace();}
		TreeIterator<EObject> content = resource.getAllContents();

		while (content.hasNext()) {
			EObject obj = content.next();

			if (obj instanceof DiagramDescription) {
				this.diagramDescription = (DiagramDescription) obj;
				this.epackage = ((DiagramDescription) obj).getMetamodel().get(0);
				this.originalEdges = this.diagramDescription.getAllEdgeMappings();
				this.originalNodes = this.diagramDescription.getAllNodeMappings();
				this.originalContainers = this.diagramDescription.getAllContainerMappings();
				this.diagramsList.add((DiagramDescription) obj);
			}

			if (obj instanceof Group) {
			//	this.diagramsList = ((Group) obj).getOwnedViewpoints().get(0).getOwnedRepresentations();
				this.group = (Group) obj;
			}

			if (obj instanceof Viewpoint) {
				((Viewpoint) obj).setModelFileExtension("*");
				this.viewPoint = (Viewpoint) obj;
				this.viewPoint.setName(this.viewPoint.getName() + "_GraphicalBinding");
			}
		}
	}

	public void GenerateNodesVersion(HashMap<EClass, List<EClass>> eclassMap,HashMap<EClass, List<EClass>> tagsERefs, File file, EPackage ep,
			EClass metamodelElement, EClass intermediateElement, DiagramDescription diagram) {

		// Let's assume there is only one meta-model for the moment
		if (diagramDescription.getMetamodel().size() != 1)
			throw new UnsupportedOperationException("Only one meta-model supported so far");
	
		this.originalPackageName = diagramDescription.getMetamodel().get(0).getName();
		this.targetPackageName = ep.getName();
		
		
		diagram.getMetamodel().clear();

		diagram.getMetamodel().add(ep);
		DiagramDescription dd = DescriptionFactory.eINSTANCE.createDiagramDescription();
		dd = diagram;
		
		String separator=".";
		if(dd.getDomainClass().contains("::"))
			separator="::";
	    AdditionalLayer layer=DescriptionFactory.eINSTANCE.createAdditionalLayer();
	    dd.getAdditionalLayers().add(layer);
	    layer.setName("Generated Layer");
	    
	    
	    AdditionalLayer attributesLayer=DescriptionFactory.eINSTANCE.createAdditionalLayer();
	    dd.getAdditionalLayers().add(attributesLayer);
	    attributesLayer.setName("Generated Attributes Layer");
	    
	    
	    AdditionalLayer siriusTagsLayer=DescriptionFactory.eINSTANCE.createAdditionalLayer();
	    dd.getAdditionalLayers().add(siriusTagsLayer);
	    siriusTagsLayer.setName("Sirius Tags Layer");
	    
	    
	    AdditionalLayer ereferencesLayerLayer=DescriptionFactory.eINSTANCE.createAdditionalLayer();
	    dd.getAdditionalLayers().add(ereferencesLayerLayer);
	    ereferencesLayerLayer.setName("EReferences Layer");
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
		featuresFixedColorRed.setName("red-rose");
		colorPallette.getEntries().add(featuresFixedColorRed);
		featuresFixedColorRed.setBlue(85);
		featuresFixedColorRed.setGreen(85);
		featuresFixedColorRed.setRed(169);

		
		UserFixedColor darkBlue = org.eclipse.sirius.viewpoint.description.DescriptionFactory.eINSTANCE
				.createUserFixedColor();
		colorPallette.getEntries().add(darkBlue);
		darkBlue.setBlue(171);
		darkBlue.setGreen(114);
		darkBlue.setRed(76);
		
		List<EdgeMapping> edgeList = new ArrayList<>();
		List<NodeMapping> nodeList = new ArrayList<>();
		List<ContainerMapping> containerList = new ArrayList<>();
		//dd.setName("Diagram");
		this.diagramsList.add(dd);

		
		//dd.setDefaultLayer(layer);
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

							NodeMapping siriusTagNode = DescriptionFactory.eINSTANCE.createNodeMapping();
							siriusTagNode .setName(((EdgeMapping) obj).getName()+"SiriusTag");
							siriusTagNode .setDomainClass(ep.getName() + separator+ "SiriusTag");
							siriusTagsLayer.getNodeMappings().add(siriusTagNode);
							
							LozengeNodeDescription lnd=StyleFactory.eINSTANCE.createLozengeNodeDescription();
							lnd.setLabelExpression("EbE");
							siriusTagNode.setStyle(lnd);
							lnd.setShowIcon(false);
							
							
							
							EdgeMapping edge = DescriptionFactory.eINSTANCE.createEdgeMapping();

							edge.getTargetMapping().add(siriusTagNode);
							edge.getSourceMapping().add((EdgeMapping) obj);
							edge.setName("EbEtagConnector_"+((EdgeMapping) obj).getName());
							edge.setUseDomainElement(false);
						//	edge.setTargetFinderExpression("feature:contains" + featureCLass.getName());
							siriusTagsLayer.getEdgeMappings().add(edge);

							
							
							
							EdgeStyleDescription edgestyle = StyleFactory.eINSTANCE.createEdgeStyleDescription();
							CenterLabelStyleDescription labelstyle = StyleFactory.eINSTANCE
									.createCenterLabelStyleDescription();
							edgestyle.setCenterLabelStyleDescription(labelstyle);
							edgestyle.setLineStyle(LineStyle.DASH_LITERAL);
							edgestyle.setRoutingStyle(EdgeRouting.TREE_LITERAL);
							edgestyle.setCenterLabelStyleDescription(labelstyle);
							edgestyle.setSourceArrow(EdgeArrows.NO_DECORATION_LITERAL);
							edgestyle.setTargetArrow(EdgeArrows.NO_DECORATION_LITERAL);
							edge.setStyle(edgestyle);
							
							for (EClass featureCLass : entry.getValue()) {

								NodeMapping nmd = DescriptionFactory.eINSTANCE.createNodeMapping();

								this.nmlist.add(nmd);
								nmd.setName(featureCLass.getName());
								nmd.setDomainClass(ep.getName() + separator+ featureCLass.getName());
								attributesLayer.getNodeMappings().add(nmd);

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
								attributesLayer.getEdgeMappings().add(em);

								EdgeStyleDescription edgestyle1 = StyleFactory.eINSTANCE.createEdgeStyleDescription();
								CenterLabelStyleDescription labelstyle1 = StyleFactory.eINSTANCE
										.createCenterLabelStyleDescription();
								edgestyle1.setCenterLabelStyleDescription(labelstyle1);
								edgestyle1.setLineStyle(LineStyle.DASH_LITERAL);
								edgestyle1.setRoutingStyle(EdgeRouting.TREE_LITERAL);
								edgestyle1.setCenterLabelStyleDescription(labelstyle1);
								edgestyle1.setSourceArrow(EdgeArrows.NO_DECORATION_LITERAL);
								edgestyle1.setTargetArrow(EdgeArrows.NO_DECORATION_LITERAL);
								em.setStyle(edgestyle1);
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

					
					
					NodeMapping siriusTagNode = DescriptionFactory.eINSTANCE.createNodeMapping();
					siriusTagNode .setName(((ContainerMapping) obj).getName()+"SiriusTag");
					siriusTagNode .setDomainClass(ep.getName() + separator+ "SiriusTag");
					siriusTagsLayer.getNodeMappings().add(siriusTagNode);
					
					LozengeNodeDescription lnd=StyleFactory.eINSTANCE.createLozengeNodeDescription();
					lnd.setLabelExpression("C");
					siriusTagNode.setStyle(lnd);
					lnd.setShowIcon(false);
					
					
					
					EdgeMapping edge = DescriptionFactory.eINSTANCE.createEdgeMapping();

					edge.getTargetMapping().add(siriusTagNode);
					edge.getSourceMapping().add((ContainerMapping) obj);
					edge.setName("CtagConnector_"+((ContainerMapping) obj).getName());
					edge.setUseDomainElement(false);
				//	edge.setTargetFinderExpression("feature:contains" + featureCLass.getName());
					siriusTagsLayer.getEdgeMappings().add(edge);
					
					

					EdgeStyleDescription edgestyle = StyleFactory.eINSTANCE.createEdgeStyleDescription();
					CenterLabelStyleDescription labelstyle = StyleFactory.eINSTANCE
							.createCenterLabelStyleDescription();
					edgestyle.setCenterLabelStyleDescription(labelstyle);
					edgestyle.setLineStyle(LineStyle.DASH_LITERAL);
					edgestyle.setRoutingStyle(EdgeRouting.TREE_LITERAL);
					edgestyle.setCenterLabelStyleDescription(labelstyle);
					edgestyle.setSourceArrow(EdgeArrows.NO_DECORATION_LITERAL);
					edgestyle.setTargetArrow(EdgeArrows.NO_DECORATION_LITERAL);
					edge.setStyle(edgestyle);
					
					
					// Make sure the expression is properly rewritten if needed
					ContainerMapping mapping = ((ContainerMapping) obj);
					adaptExpressionIfNeeded(mapping.getSemanticCandidatesExpression(), mapping::setSemanticCandidatesExpression);
					
					
					if (((ContainerMapping) obj).getDomainClass()
							.substring(((ContainerMapping) obj).getDomainClass().lastIndexOf(separator.substring(separator.length() - 1)) + 1)
							.equals(entry.getKey().getName())) {

						for (EClass featureCLass : entry.getValue()) {

							NodeMapping nmd = DescriptionFactory.eINSTANCE.createNodeMapping();

							this.nmlist.add(nmd);
							nmd.setName(featureCLass.getName());
							nmd.setDomainClass(ep.getName() + separator + featureCLass.getName());
							attributesLayer.getNodeMappings().add(nmd);

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
							attributesLayer.getEdgeMappings().add(em);

							EdgeStyleDescription edgestyle1 = StyleFactory.eINSTANCE.createEdgeStyleDescription();
							CenterLabelStyleDescription labelstyle1 = StyleFactory.eINSTANCE
									.createCenterLabelStyleDescription();
							edgestyle1.setLineStyle(LineStyle.DASH_LITERAL);
							edgestyle1.setRoutingStyle(EdgeRouting.TREE_LITERAL);
							edgestyle1.setCenterLabelStyleDescription(labelstyle1);
							edgestyle1.setSourceArrow(EdgeArrows.NO_DECORATION_LITERAL);
							edgestyle1.setTargetArrow(EdgeArrows.NO_DECORATION_LITERAL);

							em.setStyle(edgestyle1);
						}
//
					}

				}

				if (obj instanceof NodeMapping) {
					nodeList.add((NodeMapping) obj);
					((NodeMapping) obj).setDomainClass(ep.getName() + separator + ((NodeMapping) obj).getDomainClass()
							.substring(((NodeMapping) obj).getDomainClass().lastIndexOf(separator.substring(separator.length() - 1) ) + 1));
					
					NodeMapping siriusTagNode = DescriptionFactory.eINSTANCE.createNodeMapping();
					siriusTagNode .setName(((NodeMapping) obj).getName()+"SiriusTag");
					siriusTagNode .setDomainClass(ep.getName() + separator+ "SiriusTag");
					siriusTagsLayer.getNodeMappings().add(siriusTagNode);
					
					LozengeNodeDescription lnd=StyleFactory.eINSTANCE.createLozengeNodeDescription();
					lnd.setLabelExpression("N");
					siriusTagNode.setStyle(lnd);
					lnd.setShowIcon(false);
					
					
					
					EdgeMapping edge = DescriptionFactory.eINSTANCE.createEdgeMapping();

					edge.getTargetMapping().add(siriusTagNode);
					edge.getSourceMapping().add((NodeMapping) obj);
					edge.setName("NtagConnector_"+((NodeMapping) obj).getName());
					edge.setUseDomainElement(false);
				//	edge.setTargetFinderExpression("feature:contains" + featureCLass.getName());
					siriusTagsLayer.getEdgeMappings().add(edge);
					
					

					EdgeStyleDescription edgestyle = StyleFactory.eINSTANCE.createEdgeStyleDescription();
					CenterLabelStyleDescription labelstyle = StyleFactory.eINSTANCE
							.createCenterLabelStyleDescription();
					edgestyle.setCenterLabelStyleDescription(labelstyle);
					edgestyle.setLineStyle(LineStyle.DASH_LITERAL);
					edgestyle.setRoutingStyle(EdgeRouting.TREE_LITERAL);
					edgestyle.setCenterLabelStyleDescription(labelstyle);
					edgestyle.setSourceArrow(EdgeArrows.NO_DECORATION_LITERAL);
					edgestyle.setTargetArrow(EdgeArrows.NO_DECORATION_LITERAL);
					edge.setStyle(edgestyle);
					
					
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
							attributesLayer.getNodeMappings().add(nmd);

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
							attributesLayer.getEdgeMappings().add(em);

							EdgeStyleDescription edgestyle1 = StyleFactory.eINSTANCE.createEdgeStyleDescription();
							CenterLabelStyleDescription labelstyle1 = StyleFactory.eINSTANCE
									.createCenterLabelStyleDescription();
							edgestyle1.setLineStyle(LineStyle.DASH_LITERAL);
							edgestyle1.setRoutingStyle(EdgeRouting.TREE_LITERAL);
							edgestyle1.setCenterLabelStyleDescription(labelstyle1);
							edgestyle1.setSourceArrow(EdgeArrows.NO_DECORATION_LITERAL);
							edgestyle1.setTargetArrow(EdgeArrows.NO_DECORATION_LITERAL);
							edgestyle1.setCenterLabelStyleDescription(labelstyle1);
							em.setStyle(edgestyle1);
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
		
		
		for (Entry<EClass, List<EClass>> entry : tagsERefs.entrySet()) {

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
								ereferencesLayerLayer.getNodeMappings().add(nmd);

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
								em.setName(featureCLass.getName() + "_ref_con");
								em.setUseDomainElement(false);
								em.setTargetFinderExpression("feature:contains" + featureCLass.getName());
								ereferencesLayerLayer.getEdgeMappings().add(em);

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

					// Make sure the expression is properly rewritten if needed
					ContainerMapping mapping = ((ContainerMapping) obj);
					adaptExpressionIfNeeded(mapping.getSemanticCandidatesExpression(), mapping::setSemanticCandidatesExpression);
					
					
					if (((ContainerMapping) obj).getDomainClass()
							.substring(((ContainerMapping) obj).getDomainClass().lastIndexOf(separator.substring(separator.length() - 1)) + 1)
							.equals(entry.getKey().getName())) {

						for (EClass featureCLass : entry.getValue()) {

							NodeMapping nmd = DescriptionFactory.eINSTANCE.createNodeMapping();

							this.nmlist.add(nmd);
							nmd.setName(featureCLass.getName());
							nmd.setDomainClass(ep.getName() + separator + featureCLass.getName());
							ereferencesLayerLayer.getNodeMappings().add(nmd);

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
							em.setName(featureCLass.getName() + "_ref_con");
							em.setUseDomainElement(false);
							em.setTargetFinderExpression("feature:contains" + featureCLass.getName());
							ereferencesLayerLayer.getEdgeMappings().add(em);

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
							ereferencesLayerLayer.getNodeMappings().add(nmd);

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
							em.setName(featureCLass.getName() + "ref_con");
							em.setUseDomainElement(false);
							em.setTargetFinderExpression("feature:contains" + featureCLass.getName());
							ereferencesLayerLayer.getEdgeMappings().add(em);

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
		layer.getNodeMappings().add(nonemapping);	
		
		
		
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
		layer.getEdgeMappings().add(mapToNone);

		FlatContainerStyleDescription csd = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		ContainerMapping cm = DescriptionFactory.eINSTANCE.createContainerMapping();
		cm.setStyle(csd);
		csd.setWidthComputationExpression("12");
		csd.setHeightComputationExpression("8");
		csd.setShowIcon(false);
		csd.setLabelSize(10);
		
		csd.getLabelFormat().add(FontFormat.BOLD_LITERAL);
	
	    csd.setLabelColor(darkBlue);
		csd.setLabelExpression("aql:self.name");
		csd.setBorderSizeComputationExpression("3");
		csd.setBorderColor(featuresFixedColor);

		csd.setRoundedCorner(true);
		
		cm.setChildrenPresentation(ContainerLayout.VERTICAL_STACK);
		cm.setLabel(metamodelElement.getName());
		cm.setName(metamodelElement.getName());
		cm.setDomainClass(ep.getName() + "." + metamodelElement.getName());
		layer.getContainerMappings().add(cm);

		

		 
		
		
		//feature
		ContainerMapping nm = DescriptionFactory.eINSTANCE.createContainerMapping();
		nm.setName("Feature");
		nm.setDomainClass(ep.getName() + ".MetamodelElementFeature");
		nm.setSemanticCandidatesExpression("feature:metamodelElementFeature");
		FlatContainerStyleDescription csdfeature = StyleFactory.eINSTANCE.createFlatContainerStyleDescription();
		nm.setStyle(csdfeature);
		csdfeature.setShowIcon(false);
		csdfeature.setLabelExpression("aql:self.name");
		
 
		try {
		cm.getSubContainerMappings().add(nm);
		
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
		attributesLayer.getEdgeMappings().add(edgeintermediate);

		EdgeStyleDescription edgestyle = StyleFactory.eINSTANCE.createEdgeStyleDescription();
		CenterLabelStyleDescription labelstyle = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
		edgestyle.setCenterLabelStyleDescription(labelstyle);
		edgeintermediate.setStyle(edgestyle);
		edgestyle.setSizeComputationExpression("3");
        edgestyle.setTargetArrow(EdgeArrows.INPUT_FILL_CLOSED_ARROW_LITERAL);
        edgestyle.setStrokeColor(featuresFixedColorRed);
        edgestyle.setRoutingStyle(EdgeRouting.TREE_LITERAL);
        
		EdgeMapping pointTo = DescriptionFactory.eINSTANCE.createEdgeMapping();
		pointTo.setName("Bind attributes");
		pointTo.getSourceMapping().add(nm);

		pointTo.setTargetFinderExpression("feature:featureClass");
		for (NodeMapping nmiterator : this.nmlist) {
			pointTo.getTargetMapping().add(nmiterator);
		}
		
		//pointTo.setStyle(edgestyleVA);

		attributesLayer.getEdgeMappings().add(pointTo);

		EdgeStyleDescription edgestyle1 = StyleFactory.eINSTANCE.createEdgeStyleDescription();
		CenterLabelStyleDescription labelstyle1 = StyleFactory.eINSTANCE.createCenterLabelStyleDescription();
		edgestyle1.setCenterLabelStyleDescription(labelstyle1);
		pointTo.setStyle(edgestyle1);
		edgestyle1.setSizeComputationExpression("3");
		edgestyle1.setRoutingStyle(EdgeRouting.TREE_LITERAL);
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
		to_edgestyleVA.setSizeComputationExpression("3");
		to_edgestyleVA.setRoutingStyle(EdgeRouting.TREE_LITERAL);
		to_edgestyleVA.setCenterLabelStyleDescription(to_labelstyleVA);
		to_edgestyleVA.setStrokeColor(featuresFixedColor);

		to_virtualAttributeEdge.setStyle(to_edgestyleVA);

		layer.getEdgeMappings().add(to_virtualAttributeEdge);
		
// Tool section part 
		// Tool section creation
		ToolSection toolsec = ToolFactory.eINSTANCE.createToolSection();
		toolsec.setName("Generated Tools section");

		
		
//    	 DirectEditLabel directEditLable=ToolFactory.eINSTANCE.createDirectEditLabel();
//		 EditMaskVariables editMakVariable = org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createEditMaskVariables();	 
//		 editMakVariable.setMask("{0}");
//		 directEditLable.setMask(editMakVariable);
//		 directEditLable.setName("EditeLabel"+"MetamodelElement");
////		 
////		 try {
////		 directEditLable.getMapping().add((DiagramElementMapping)cm);}
////		 catch(Exception e) {
////			 e.printStackTrace();
////		 }
//		 directEditLable.getMapping();
//		 InitialOperation initialOperation=org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createInitialOperation();
//		 SetValue setValue= org.eclipse.sirius.viewpoint.description.tool.ToolFactory.eINSTANCE.createSetValue();
//		 setValue.setFeatureName("name");
//		 setValue.setValueExpression("[arg0/]");
//		 initialOperation.setFirstModelOperations(setValue);
//		 directEditLable.setInitialOperation(initialOperation);
//		 toolsec.getOwnedTools().add(directEditLable);
		
		
		
		
		
		
		
		
	
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
		nonecreation.setIconPath("/bento.sirius.odesign.generator/icons/trash.png");

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
		edgecreationdesc.setIconPath("/bento.sirius.odesign.generator/icons/link.png");
	
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
		layer.getToolSections().add(toolsec);
        containerCreation.setIconPath("/bento.sirius.odesign.generator/icons/class.png");
		for (NodeMapping nmapp : this.originalNodes) {
			mapToNone.getSourceMapping().add(nmapp);

		}

		for (EdgeMapping edgemapp : this.originalEdges) {
			mapToNone.getSourceMapping().add(edgemapp);
		}

		for (ContainerMapping nmapp : this.originalContainers) {
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
				
				
				
				//saveOdesign(file, ep);
		
	}

	
	
	public void saveOdesign(File file, EPackage ep) {
		
		try {
			// jesusc: we should probably find a better name
			String diagramName = this.viewPoint.getName() + "_" + ep.getName();

			this.generatedFile = new File(file.getAbsolutePath() + File.separator + diagramName + ".odesign");
			resource.save(new FileOutputStream(generatedFile), null);
			System.out.println("Saved: " + generatedFile.getAbsolutePath());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	private void adaptExpressionIfNeeded(String expr, Consumer<String> setter) {
		if (expr == null)
			return;
		
		String needle = this.originalPackageName + "::";
		String replacement = this.targetPackageName + "::";
		if (expr.contains(needle)) {
			String newExpr = expr.replace(needle, replacement);
			setter.accept(newExpr);
		}
	}

	public File getGeneratedFile() {
		return generatedFile;
	}

}
