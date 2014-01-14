package tests.base;

import genericity.typecheck.atl.TypeCheckLauncher;
import genericity.typing.atl_types.AtlTypingPackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import bento.componetization.atl.CallSite;
import bento.componetization.atl.ConceptExtractor;
import bento.componetization.atl.MetamodelPrunner;
import bento.componetization.atl.MetamodelPrunner.Strategy;

public abstract class BaseTest {

	protected BasicEMFModel transformationMetamodels;
	protected BasicEMFModel atlTransformation;
	protected BasicEMFModel typingModel;
	private EPackage conceptPkg;
	private EPackage metamodelPkg;
	
	
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

		TypeCheckLauncher launcher = new TypeCheckLauncher();
		launcher.setWarningMode(); 
		launcher.launch(mm, atlTransformation, out);		
	
		transformationMetamodels = mm;
		typingModel = out;
	}
	
	public void saveConcept(String conceptFilename) throws IOException {
		XMIResourceImpl r =  new XMIResourceImpl(URI.createURI(conceptFilename));
		r.getContents().add(conceptPkg);
		r.save(null);
	}


	public void savePrunnedMetamodel(String filename) throws IOException {
		XMIResourceImpl r =  new XMIResourceImpl(URI.createURI(filename));
		r.getContents().add(metamodelPkg);
		r.save(null);
	}
	
	public MetamodelPrunner pruneMetamodel(String uri, String newURI, String newName) {
		MetamodelPrunner prunner = new MetamodelPrunner (atlTransformation, 
				getTransformationMetamodels(), getTypingModel(), uri);
		metamodelPkg = prunner.extractSource(newName, newURI, newName);
		
		return prunner ;
	}
	
	public ConceptExtractor extractConcept(String uri, String newURI, String newName) {
		// Extractor
		ConceptExtractor extractor = new ConceptExtractor(atlTransformation, 
				getTransformationMetamodels(), getTypingModel(), uri);

		printAnalysisInfo(extractor);		
		// Re-typing is needed after: PushDownFeature
		
		conceptPkg = extractor.refactor();

		return extractor;
	}

	protected void printAnalysisInfo(ConceptExtractor extractor) {
		Set<EClass> explicit = extractor.getExplicitlyUsedTypes();
		Set<EClass> implicit = extractor.getImplicitlyUsedTypes();
		Set<EStructuralFeature> features = extractor.getUsedFeatures();
		Set<CallSite> sites = extractor.getCallSites();
		
		System.out.println("== Analysis information");
		System.out.println();
		System.out.println("Explicit types");
		for (EClass eClass : explicit) {
			System.out.println(" " + eClass.getName());
		}	
		System.out.println();
		System.out.println("Implicit types");
		for (EClass eClass : implicit) {
			System.out.println(" " + eClass.getName());
		}	
		
		System.out.println();
		System.out.println("Features");
		for (EStructuralFeature f : features) {
			System.out.println("  " + f.getEContainingClass().getName() + "." + f.getName() );
		}	
		
		System.out.println();
		System.out.println("Call sites");		
		for (CallSite callSite : sites) {
			System.out.println("  " + callSite);
		}
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
