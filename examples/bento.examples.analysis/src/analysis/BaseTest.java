package analysis;

import genericity.compiler.atl.analyser.Analyser;
import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import genericity.compiler.atl.csp.CSPGenerator;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.ErrorSliceGenerator;
import genericity.compiler.atl.csp.GraphvizGenerator;
import genericity.compiler.atl.graph.DependencyGraph;
import genericity.typecheck.atl.AtlTransformationMetamodelsModel;
import genericity.typecheck.atl.TypeCheckLauncher;
import genericity.typing.atl_types.AtlTypingPackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import bento.analyser.footprint.EffectiveMetamodelBuilder;
import bento.analyser.footprint.TrafoMetamodelData;
import bento.componetization.atl.CallSite;
import bento.componetization.atl.ConceptExtractor;
import bento.componetization.atl.MetamodelPrunner;
import bento.componetization.atl.MetamodelPrunner.Strategy;

public abstract class BaseTest {

	protected BasicEMFModel atlTransformation;
	protected BasicEMFModel typingModel;
	private EPackage conceptPkg;
	private ResourceSet rs = new ResourceSetImpl();
	private Resource	prunnedResource;	
	
	private DependencyGraph dependencyGraph;
	private GlobalNamespace	mm;
	private EPackage	metamodelPkg;
	private Analyser	analyser;
	private ErrorSlice	slice;

	public void typing(String atlTransformationFile, Object[] metamodels, String[] names) throws IOException {
		typing(atlTransformationFile, metamodels, names, false);
	}
	
	public void typing(String atlTransformationFile, Object[] metamodels, String[] names, boolean doDependencyAnalysis) throws IOException {
		EMFLoader loader = new EMFLoader(new JavaListConverter(), rs);
		
		// BasicEMFModel boundMM = TypeCheckLauncher.loadTransformationMetamodels(loader, BOUND_METAMODEL);

		atlTransformation = loader
				.basicModelFromFile(
						withDir("../../compiler/genericity.compiler.atl/src/genericity/typecheck/atl/ATL.ecore"),
						withDir(atlTransformationFile));

 		List<EPackage> pkgs = new ArrayList<EPackage>();
		pkgs.add(AtlTypingPackage.eINSTANCE);
		BasicEMFModel out = loader
				.emptyModelFromMemory(pkgs, "tmp_/typing.xmi");

		mm = loadMetamodels2(metamodels, names); // TypeCheckLauncher.loadTransformationMetamodels(loader, metamodels);
		analyser = new Analyser(mm, atlTransformation, out);
		analyser.setDoDependencyAnalysis(doDependencyAnalysis);
		analyser.perform();
	
		dependencyGraph = analyser.getDependencyGraph();
		
		typingModel = out;	
		
		System.out.println("Finished typing " + atlTransformationFile + "\n");
	}
	
	/*
	public MetamodelPrunner pruneMetamodel(String logicalName, String newURI, String newName, String filename) {
		prunnedResource = rs.createResource(URI.createURI(filename));
		
		MetamodelPrunner prunner = new MetamodelPrunner (atlTransformation, 
				getTransformationMetamodels(mm), getTypingModel(), uri);
		metamodelPkg = prunner.extractSource(prunnedResource, newName, newURI, newName);
		System.out.println(metamodelPkg);
		return prunner ;
	}	
	*/
	

	protected void generateGraphviz() {
		new GraphvizGenerator(dependencyGraph).visualize("tmp_/output.dot");
	}	
	
	protected void generateCSP() {
		if ( slice == null )
			throw new IllegalStateException("Error slice should be computed before generating CSP");
		
		String s = new CSPGenerator(dependencyGraph, slice).generate();
		if ( ! s.trim().isEmpty() )
			System.out.println(s);
	}
	
	protected void generateErrorSlice(String metamodelName, String errorSliceMMUri) throws IOException {
		XMIResourceImpl r =  new XMIResourceImpl(URI.createURI(errorSliceMMUri));
		slice = new ErrorSliceGenerator(analyser, dependencyGraph).generate(r, metamodelName);
		r.save(null);
	}
	
	protected void generateEffectiveMetamodel(String logicalName, String outputPath) throws IOException {
		XMIResourceImpl r =  new XMIResourceImpl(URI.createURI(outputPath));
		TrafoMetamodelData data = new TrafoMetamodelData(atlTransformation, mm.getNamespace(logicalName), typingModel, logicalName);
		new EffectiveMetamodelBuilder(data).extractSource(r, logicalName, logicalName, logicalName, logicalName);
		r.save(null);
	}
	

	private AtlTransformationMetamodelsModel getTransformationMetamodels(GlobalNamespace ns) {
		return new AtlTransformationMetamodelsModel(ns.getLogicalNamesToMetamodels().values(), ns.getLogicalNamesToMetamodels());
	}

	private GlobalNamespace loadMetamodels2(Object[] metamodels, String[] names) {
		int i = 0;
		HashMap<String, Resource> logicalNamesToResources = new HashMap<String, Resource>();
		ArrayList<Resource> resources = new ArrayList<Resource>();
		for (Object fileOrResource : metamodels) {
			Resource r = null;
			if ( fileOrResource instanceof String ) {
				r = rs.getResource(URI.createURI((String) fileOrResource), true);
			} else {
				r = (Resource) fileOrResource;
			}
			resources.add(r);
			logicalNamesToResources.put(names[i], r);
			i++;
		}

		return new GlobalNamespace(resources, logicalNamesToResources);
	}
	
	public void saveConcept(String conceptFilename) throws IOException {
		XMIResourceImpl r =  new XMIResourceImpl(URI.createURI(conceptFilename));
		r.getContents().add(conceptPkg);
		r.save(null);
	}


	public Resource savePrunnedMetamodel(String filename) throws IOException {
		prunnedResource.save(null);
		
		return prunnedResource;
	}
		
	public BasicEMFModel getAtlTransformation() {
		return atlTransformation;
	}
	
	public BasicEMFModel getTypingModel() {
		return typingModel;
	}
	
	public static String withDir(String path) {
		return "." + File.separator + path;
	}
}
