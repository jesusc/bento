package bento.atl.editor.builder;

import genericity.compiler.atl.analyser.Analyser;
import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.ErrorSliceGenerator;
import genericity.compiler.atl.graph.DependencyGraph;
import genericity.compiler.atl.graph.ErrorPathGenerator;
import genericity.typing.atl_types.AtlTypingPackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.m2m.atl.engine.parser.AtlSourceManager;

import atl.metamodel.ATLModel;
import atl.metamodel.ATL.Module;
import atl.metamodel.OCL.OclModel;
import bento.analyser.footprint.EffectiveMetamodelBuilder;
import bento.analyser.footprint.TrafoMetamodelData;
import bento.analysis.atl_analysis.Problem;
import bento.analysis.atl_analysis.atl_error.LocalProblem;

public class AnalyserExecutor {

	public AnalyserData exec(IResource resource) throws IOException, CoreException {
		AtlSourceManager manager = new AtlSourceManager();
		
		IFile file = (IFile)ResourcesPlugin.getWorkspace().getRoot().findMember(resource.getFullPath());
		manager.updateDataSource(file.getContents());
		
		
		
		// manager.updateDataSource(resource.get)
		
		/*
		String path = resource.getFullPath().toOSString();
		FileBased atlLoader = new AtlTransformationLoader.FileBased( path );
		
		EMFLoader loader = new EMFLoader(new JavaListConverter());
		BasicEMFModel atlModel_tmp = atlLoader.load(loader);
		*/
		
		ATLModel atlModel = new ATLModel(manager.getModel().eResource());
		Module module = atlModel.allObjectsOf(Module.class).get(0);
		
		System.out.println(module);
		
		HashMap<String, Resource> logicalNamesToResources = new HashMap<String, Resource>();
		Map<String, List<EPackage>> atlPackages = manager.getMetamodelPackages(-1);
		for(String k : atlPackages.keySet()) {
			logicalNamesToResources.put(k, atlPackages.get(k).get(0).eResource());
		}
		
		// System.out.println( manager.getMetamodelLocations() );
		// System.out.println( manager.getMetamodelPackages(-1));
		
		GlobalNamespace gn = new GlobalNamespace(logicalNamesToResources.values(), logicalNamesToResources);

		// Init typing model...
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());		
		List<EPackage> pkgs = new ArrayList<EPackage>();
		pkgs.add(AtlTypingPackage.eINSTANCE);
		BasicEMFModel typing = loader.emptyModelFromMemory(pkgs, "typing.xmi");

		
		Analyser analyser = new Analyser(gn, atlModel, typing);
		analyser.setDoDependencyAnalysis(false);
		analyser.perform();
		//-- @path CD1=/test-atl/metamodels/ClassCD.ecore
		//-- @path CD2=/test-atl/metamodels/ClassCD.ecore

		/*
		for(Problem p : analyser.getErrors().getAnalysis().getProblems() ) {
			if ( p instanceof LocalProblem ) {
				System.out.println(p.getClass().getName() + " - " + ((LocalProblem) p).getLocation());
			}
		}
		*/
		
		return new AnalyserData(analyser, gn);

		
		// return analyser.getErrors().getAnalysis().getProblems();

		/*
		mm = loadMetamodels2(metamodels, names); // TypeCheckLauncher.loadTransformationMetamodels(loader, metamodels);
		analyser = new Analyser(mm, atlTransformation, out);
		analyser.setDoDependencyAnalysis(doDependencyAnalysis);
		analyser.perform();
	
		dependencyGraph = analyser.getDependencyGraph();
		*/
	}

	public static class AnalyserData {
		private List<Problem> problems;
		private Analyser analyser;
		private GlobalNamespace namespace;
		private DependencyGraph graph;

		public AnalyserData(Analyser analyser, GlobalNamespace gn) {
			this.analyser = analyser;
			this.problems = analyser.getErrors().getAnalysis().getProblems();
			this.namespace = gn;
		}

		public void computeProblemGraph(Problem p) {			
			graph = new ErrorPathGenerator(null, analyser.getTyping(), analyser.getATLModel()).perform(p);
		}
		
		public List<Problem> getProblems() {
			return problems;
		}
		
		public EPackage getSourceMetamodel() {
			Module mod = analyser.getATLModel().allObjectsOf(Module.class).get(0);
			String n = mod.getInModels().get(0).getMetamodel().getName();
			return (EPackage) namespace.getNamespace(n).getResource().getContents().get(0);
		}

		public EPackage generateErrorSlice(Problem p) {
			Module mod = analyser.getATLModel().allObjectsOf(Module.class).get(0);
			OclModel m = mod.getInModels().get(0);
			String mm  = m.getMetamodel().getName();
			String uri = mm + "_" + "error";
			
			XMIResourceImpl r =  new XMIResourceImpl(URI.createURI(uri));
			ErrorSlice slice = new ErrorSliceGenerator(analyser, graph).generate(p, r, mm);

			return (EPackage) r.getContents().get(0);
			// r.getContents()
			// r.save(null);
		}
		
		public EPackage generateEffectiveMetamodel(Problem p) { //throws IOException {
			Module mod = analyser.getATLModel().allObjectsOf(Module.class).get(0);
			OclModel m = mod.getInModels().get(0);
			String mm  = m.getMetamodel().getName();
			String uri = mm + "_" + "effective";
			
			XMIResourceImpl r =  new XMIResourceImpl(URI.createURI(uri));
			TrafoMetamodelData data = new TrafoMetamodelData(analyser.getATLModel(), 
					namespace.getNamespace(mm), 
					analyser.getTyping().getImpl(), uri);
			
			String logicalName = mm;
			new EffectiveMetamodelBuilder(data).extractSource(r, logicalName, logicalName, logicalName, logicalName);
			
			return (EPackage) r.getContents().get(0);
			
		}

		public DependencyGraph getGraph() {
			return graph;
		}
		
	}
	
}