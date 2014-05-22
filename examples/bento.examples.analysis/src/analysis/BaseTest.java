package analysis;

import genericity.compiler.atl.analyser.Analyser;
import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import genericity.compiler.atl.analyser.namespaces.MetamodelNamespace;
import genericity.compiler.atl.csp.CSPGenerator;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.ErrorSliceGenerator;
import genericity.compiler.atl.csp.GraphvizGenerator;
import genericity.compiler.atl.graph.ProblemGraph;
import genericity.compiler.atl.graph.ProblemPath;
import genericity.typing.atl_types.AtlTypingPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
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

import atl.metamodel.ATLModel;
import atl.metamodel.ATL.CalledRule;
import atl.metamodel.ATL.Helper;
import atl.metamodel.ATL.LazyMatchedRule;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.Module;
import atl.metamodel.ATL.ModuleElement;
import atl.metamodel.OCL.OclModel;
import bento.analyser.footprint.EffectiveMetamodelBuilder;
import bento.analyser.footprint.TrafoMetamodelData;
import bento.analyser.util.StandaloneAtlLoader;
import bento.analysis.atl_analysis.Problem;
import bento.componetization.atl.CallSite;
import bento.componetization.atl.ConceptExtractor;
import bento.componetization.atl.MetamodelPrunner;
import bento.componetization.atl.MetamodelPrunner.Strategy;

public abstract class BaseTest {

	protected ATLModel atlTransformation;
	protected BasicEMFModel typingModel;
	private EPackage conceptPkg;
	private ResourceSet rs = new ResourceSetImpl();
	private Resource	prunnedResource;	
	
	private ProblemGraph dependencyGraph;
	private GlobalNamespace	mm;
	private EPackage	metamodelPkg;
	private Analyser	analyser;
	private ErrorSlice	slice;
	private String	atlTransformationFile;

	public void typing(String atlTransformationFile, Object[] metamodels, String[] names) throws IOException {
		typing(atlTransformationFile, metamodels, names, false);
	}
	
	public void typing(String atlTransformationFile, Object[] metamodels, String[] names, boolean doDependencyAnalysis) throws IOException {
		EMFLoader loader = new EMFLoader(new JavaListConverter(), rs);
		this.atlTransformationFile = atlTransformationFile;
		// BasicEMFModel boundMM = TypeCheckLauncher.loadTransformationMetamodels(loader, BOUND_METAMODEL);

		BasicEMFModel atlTransformationEmfModel = loader
				.basicModelFromFile(
						withDir("../../compiler/genericity.compiler.atl/src/genericity/typecheck/atl/ATL.ecore"),
						withDir(atlTransformationFile));

		atlTransformation = new ATLModel(atlTransformationEmfModel.getHandler().getResource());
		
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
	
	protected void printStatistics() {
		int helpers = 0, matchedRules = 0, lazyRules = 0, calledRules = 0;
		Module module = atlTransformation.allObjectsOf(Module.class).get(0);
		for(ModuleElement e : module.getElements()) {
			if      ( e instanceof Helper ) helpers++;
			else if ( e instanceof MatchedRule ) matchedRules++;
			else if ( e instanceof LazyMatchedRule ) lazyRules++;
			else if ( e instanceof CalledRule ) calledRules++;
			else throw new UnsupportedOperationException();
		}
		
		System.out.println("Transformation statistics");
		if ( helpers > 0 ) 		System.out.println(" * Helpers : " + helpers);
		if ( matchedRules > 0 ) System.out.println(" * Matched rules : " + matchedRules);
		if ( lazyRules > 0 ) 	System.out.println(" * Lazy rules : " + lazyRules);
		if ( calledRules > 0 ) 	System.out.println(" * Called rules : " + calledRules);
				
		int sourceClasses = 0;
		int targetClasses = 0;
		for(OclModel model : module.getInModels()) {
			MetamodelNamespace ns = mm.getNamespace(model.getMetamodel().getName());
			sourceClasses += ns.getAllClasses().size();
		}

		for(OclModel model : module.getOutModels()) {
			MetamodelNamespace ns = mm.getNamespace(model.getMetamodel().getName());
			targetClasses += ns.getAllClasses().size();
		}

		System.out.println("Metamodel statistics");
		System.out.println(" * Source meta-model(s) : " + sourceClasses);
		System.out.println(" * Target meta-model(s) : " + targetClasses);

		System.out.println();
	}

	
	protected void printErrorsByType() {
		HashMap<Class<?>, List<Problem>> problemsByType = new HashMap<Class<?>, List<Problem>>();
		for(Problem p : analyser.getErrors().getAnalysis().getProblems()) {
			if ( ! problemsByType.containsKey(p.getClass()) ) 
				problemsByType.put(p.getClass(), new ArrayList<Problem>());
			
			problemsByType.get(p.getClass()).add(p);
		}
		
		System.out.println("Problems by type");
		for(Entry<Class<?>, List<Problem>> e : problemsByType.entrySet()) {
			System.out.print(" * " + e.getKey().getSimpleName() + " ");
			System.out.println(e.getValue().size());	
		}
		System.out.println();
		
	}

	protected void generateGraphviz() {
		generateGraphviz(null);
	}	
	
	protected void generateGraphviz(String location) {
		new GraphvizGenerator(dependencyGraph).visualize("tmp_/output.dot", location);
	}	
	
	
	protected void generateCSP() throws IOException {
		generateCSP(null);
	}
	
	protected void generateCSP(String location) throws IOException {
		//if ( slice == null )
		//	throw new IllegalStateException("Error slice should be computed before generating CSP");
				
		String s = new CSPGenerator(dependencyGraph, slice, new StandaloneAtlLoader()).generateLoc(location, analyser);
		if ( location != null ) {
			// Debugging purposes
			System.out.println(s);
		}
		if ( ! s.trim().isEmpty() ) {
			
			FileWriter fw = new FileWriter("tmp_/errors.txt", true);
			fw.write(atlTransformationFile + "\n");
			fw.write(s);
			fw.write("#########################################\n\n");
			fw.close();
			// System.out.println(s);
		}
	}
	
	protected void generateErrorSlice(String metamodelName, String errorSliceMMUri) throws IOException {
		XMIResourceImpl r =  new XMIResourceImpl(URI.createURI(errorSliceMMUri));
		slice = new ErrorSliceGenerator(analyser, dependencyGraph).generate(r, metamodelName);
		r.save(null);
	}
	

	protected void generateErrorSlice(String metamodelName, String errorSliceMMUri, String location) throws IOException {
		XMIResourceImpl r =  new XMIResourceImpl(URI.createURI(errorSliceMMUri));
		slice = new ErrorSliceGenerator(analyser, dependencyGraph).generate(r, metamodelName, location);
		r.save(null);
	}
	
	protected void generateEffectiveMetamodel(String logicalName, String outputPath) throws IOException {
		XMIResourceImpl r =  new XMIResourceImpl(URI.createURI(outputPath));
		TrafoMetamodelData data = new TrafoMetamodelData(atlTransformation, mm.getNamespace(logicalName), typingModel, logicalName);
		new EffectiveMetamodelBuilder(data).extractSource(r, logicalName, logicalName, logicalName, logicalName);
		r.save(null);
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
		
	
	public BasicEMFModel getTypingModel() {
		return typingModel;
	}
	
	public static String withDir(String path) {
		return "." + File.separator + path;
	}
}
