package com.odesign.generator.tools;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.style.SquareDescription;
import org.eclipse.sirius.diagram.description.style.StyleFactory;

public class OdesignTools {
	public static NodeMapping createNode(String name, EPackage epackage, String domainClass, String semanticcandidate, DiagramDescription dd ) {
		
		NodeMapping nodemapping = DescriptionFactory.eINSTANCE.createNodeMapping();
		nodemapping.setName(name);
		nodemapping.setDomainClass(epackage.getName() + "."+domainClass);
		nodemapping.setSemanticCandidatesExpression(semanticcandidate);
		dd.getAdditionalLayers().get(0).getNodeMappings().add(nodemapping);	
		SquareDescription sdnode = StyleFactory.eINSTANCE.createSquareDescription();
		nodemapping.setStyle(sdnode);
		sdnode.setLabelExpression("");
		
		
		return nodemapping;
		
	}
	
	
	public static DiagramDescription CreateDiagram() {
		
		
		return null;
		
	}
	
	
	
	
}
