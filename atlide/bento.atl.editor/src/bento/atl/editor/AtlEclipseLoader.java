package bento.atl.editor;

import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;

import genericity.compiler.atl.api.AtlTransformationLoader;
import atl.metamodel.ATLModel;
import bento.analyser.util.AtlLoader;

public class AtlEclipseLoader implements AtlLoader {

	@Override
	public ATLModel create(String modelURI) {
		ModelFactory modelFactory = new EMFModelFactory();
		EMFReferenceModel atlMetamodel;
		try {
			atlMetamodel = (EMFReferenceModel) modelFactory.getBuiltInResource("ATL.ecore");
			EMFModel atlModel = (EMFModel) modelFactory.newModel(atlMetamodel);
			atlMetamodel.setIsTarget(true);
			return ATLModel.createEmptyModel(atlMetamodel.getResource(), atlModel.getResource());
		} catch (ATLCoreException e) {
			throw new RuntimeException(e);
		}
	}

}
