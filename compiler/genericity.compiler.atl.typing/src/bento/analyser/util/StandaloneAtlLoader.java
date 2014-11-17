package bento.analyser.util;

import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import atl.metamodel.ATLModel;

public class StandaloneAtlLoader implements AtlLoader {

	private String atlMetamodelPath;

	public StandaloneAtlLoader() {
		this("../../compiler/genericity.compiler.atl/src/genericity/typecheck/atl/ATL.ecore");
	}
	
	public StandaloneAtlLoader(String atlMetamodelPath) {
		this.atlMetamodelPath = atlMetamodelPath;
	}
 	
	@Override
	public ATLModel create(String modelURI) {
		ResourceSet rs = new ResourceSetImpl();
		Resource mm = rs.getResource(Util.createURI(atlMetamodelPath), true);
		Resource m  = rs.createResource(Util.createURI(modelURI));

		return ATLModel.createEmptyModel(mm, m);
	}
	
}
