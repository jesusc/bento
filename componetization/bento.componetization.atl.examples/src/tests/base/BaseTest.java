package tests.base;

import genericity.typecheck.atl.TypeCheckLauncher;
import genericity.typing.atl_types.AtlTypingPackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import bento.componetization.atl.ConceptExtractor;
import bento.componetization.atl.ConceptExtractor.Strategy;

public abstract class BaseTest {

	protected BasicEMFModel transformationMetamodels;
	protected BasicEMFModel atlTransformation;
	protected BasicEMFModel typingModel;
	private EPackage conceptPkg;
	
	public void typing(String atlTransformationFile, String... metamodels) throws IOException {
		EMFLoader loader = new EMFLoader(new JavaListConverter());
		
		BasicEMFModel mm = TypeCheckLauncher.loadTransformationMetamodels(loader, metamodels);
		// BasicEMFModel boundMM = TypeCheckLauncher.loadTransformationMetamodels(loader, BOUND_METAMODEL);
				
		atlTransformation = loader
				.basicModelFromFile(
						withDir("../../compiler/genericity.compiler.atl/src/genericity/typecheck/atl/ATL.ecore"),
						withDir(atlTransformationFile));

		List<EPackage> pkgs = new ArrayList<EPackage>();
		pkgs.add(AtlTypingPackage.eINSTANCE);
		BasicEMFModel out = loader
				.emptyModelFromMemory(pkgs, "tmp_/typing.xmi");

		new TypeCheckLauncher().launch(mm, atlTransformation, out);		
	
		transformationMetamodels = mm;
		typingModel = out;
	}
	
	public void saveConcept(String conceptFilename) throws IOException {
		XMIResourceImpl r =  new XMIResourceImpl(URI.createURI(conceptFilename));
		r.getContents().add(conceptPkg);
		r.save(null);
	}

	public void extractConcept(String uri, String newURI, String newName, Strategy strategy) {
		// Extractor
		ConceptExtractor extractor = new ConceptExtractor(atlTransformation, 
				getTransformationMetamodels(), getTypingModel(), uri);
		extractor.setStrategy(strategy);
		conceptPkg = extractor.extractSource(newName, newURI, newName);
		
	}
	
	public BasicEMFModel getAtlTransformation() {
		return atlTransformation;
	}
	
	public BasicEMFModel getTransformationMetamodels() {
		return transformationMetamodels;
	}
	
	public BasicEMFModel getTypingModel() {
		return typingModel;
	}
	

	public static String withDir(String path) {
		return "." + File.separator + path;
	}
}
