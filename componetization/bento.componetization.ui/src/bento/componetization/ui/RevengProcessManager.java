package bento.componetization.ui;

// import genericity.typing.atl_types.AtlTypingPackage;

import genericity.compiler.atl.api.AtlTransformationLoader;
import genericity.compiler.atl.api.AtlTransformationLoader.FileBased;
import genericity.typecheck.atl.TypeCheckLauncher;
import genericity.typecheck.atl.TypeCheckLauncher.ErrorMessage;
import genericity.typing.atl_types.AtlTypingPackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;

import bento.componetization.atl.ConceptExtractor;
import bento.componetization.atl.MetamodelModel;
import bento.componetization.atl.MetamodelPrunner;
import bento.componetization.atl.hints.RemoveAssociationClass;
import bento.componetization.atl.refactorings.IConceptRefactoring;
import bento.componetization.atl.refactorings.IMatch;
import bento.componetization.atl.refactorings.PushDownFeature;
import bento.componetization.atl.refactorings.RemoveEmptyClass;
import bento.componetization.reveng.Concept;
import bento.componetization.reveng.Metamodel;
import bento.componetization.reveng.ModelKind;
import bento.componetization.reveng.RevengFactory;
import bento.componetization.reveng.RevengModel;
import bento.componetization.ui.forms.TemplatePage;

/**
 * This class is in charge of checking the consistency
 * of the files handled or extracted by the reverse engineering
 * process.
 * 
 * @author jesus
 *
 */
public class RevengProcessManager {
	private RevengModel model;
	private IProject project;
	private Resource resource;
	
	private BasicEMFModel atlModel;
	private boolean templateCoevolved = false;

	private BasicEMFModel typing;
	
	private IModel metamodelsAndConcepts;
	private HashMap<Metamodel, Resource> metamodelResources;
	private HashMap<Concept, Resource> conceptResources = new HashMap<Concept, Resource>();
	private FileBased atlLoader;
	
	
	public RevengProcessManager(Resource resource, IPath iPath) {
		this.resource = resource;
		this.model    = (RevengModel) resource.getContents().get(0);
		if ( model.getTransformation() == null ) {
			this.model.setTransformation( RevengFactory.eINSTANCE.createAtlTransformation() );
		}
		if ( model.getTemplate() == null ) {
			this.model.setTemplate( RevengFactory.eINSTANCE.createAtlTransformation() );
		}
		
		if ( this.model == null ) {
			throw new IllegalArgumentException("No model in Reveng resource");
		}
		IContainer container = ResourcesPlugin.getWorkspace().getRoot().getContainerForLocation(iPath);
		project       = container.getProject();
	}

	public RevengModel getModel() {
		return model;
	}

	public void save() throws IOException {
		resource.save(null);
		for(Resource r : conceptResources.values()) {
			r.save(null);
		}
		
		if ( templateCoevolved ) {
			saveATL();
			templateCoevolved = false;
		}
	}

	public String getTypeModelURI() {
		return this.project.getFile("resources/typing.xmi").getLocationURI().toString();
	}
	
	public boolean loadATL() throws IOException {
		if ( ! templateExists() ) {
			return false;
		}
		
		String path = model.getTemplate().getPath();
		this.atlLoader = new AtlTransformationLoader.FileBased( getFullPathFromProjectRelative(path) );
		
		EMFLoader loader = new EMFLoader(new JavaListConverter());
		this.atlModel = atlLoader.load(loader);
	
		return atlModel != null;
	}

	public void saveATL() {
		if ( model.getTemplate() == null )
			throw new IllegalStateException();
		
		String path = getFullPathFromProjectRelative(model.getTemplate().getPath());
		
		this.atlLoader.exportAdapted(path);
		
		// Not working!
//		AtlTransformationLoader.FileBased.exportAtlResource( 
//				atlModel.getHandler().getResource(),
//				path );
	}
	
	public IFolder getDefaultTemplateFolder() {
		IFolder f = project.getFolder(new Path("template"));
		return f;
	}
	
	public IFolder getDefaultComponentFolder() {
		IFolder f = project.getFolder(new Path("component"));
		return f;
	}
	
	
	private boolean templateExists() {
		if ( model.getTemplate() == null ) return false;
		IFile location = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(model.getTemplate().getPath()));		
		return location.exists();
	}

	/**
	 * Apply the typing process to the transformation template. 
	 * @return 
	 * @throws IOException 
	 */
	public TypingInfo applyTyping() throws IOException {
		if ( model.getTemplate() == null ) 
			throw new IllegalStateException();

		if ( ! loadATL() ) {
			// TODO: Show better message, reasons, etc...
			MessageDialog.openError(null, "ATL loading", "Could not load " + model.getTemplate().getPath());
			return null;
		}
									
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		
		List<EPackage> pkgs = new ArrayList<EPackage>();
		pkgs.add(AtlTypingPackage.eINSTANCE);
		typing = loader.emptyModelFromMemory(pkgs, getTypeModelURI());

		// String[] strMetamodels = getMetamodelPaths();

		metamodelsAndConcepts = this.loadTransformationMetamodels(model.getTransformation().getMetamodels());
		
		TypeCheckLauncher launcher = new TypeCheckLauncher();
		launcher.setWarningMode();
		try {
			launcher.launch(metamodelsAndConcepts, atlModel, typing);		
		} catch ( Exception e ) {
			e.printStackTrace();
		}
		
		return new TypingInfo(launcher.getMessages());

		// typing.serialize();
	}

	
	private String getFullPathFromProjectRelative(String path) {
		IFile location = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(path));
				//getFileForLocation(new Path(path));		
		return location.getRawLocation().toPortableString();
	}
	
	public IFile getTemplateFile() {
		return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(model.getTemplate().getPath()));
	}
	

	/*
	private String[] getMetamodelPaths() {
		String[] strMetamodels = new String[model.getTransformation().getMetamodels().size()];
		int i = 0;
		for (Metamodel meta : model.getTransformation().getMetamodels()) {
			strMetamodels[i] = getMetamodelURI(meta);
			i++;
		}
		return strMetamodels;
	}

	private String getMetamodelPath(Metamodel mm) {
		if ( mm.getExtractedConcept() != null ) {
			return mm.getExtractedConcept().getPath();
		}
		return mm.getPath();
	}
	*/

	public boolean pruneMetamodel(Metamodel metamodel) throws IOException {
		if ( ! metamodel.isBecomeConcept() )
			throw new IllegalArgumentException();
		
		// Already prunned
		if ( metamodel.getExtractedConcept() != null )
			return false;
			
		EPackage pkg = getMetamodelPackage(metamodel);
		
		MetamodelPrunner prunner = new MetamodelPrunner(atlModel,
				metamodelsAndConcepts, typing, pkg.getNsURI());
		
		EPackage initialConcept = prunner.extractSource(pkg.getName(), getDefaultConceptURI(metamodel), getDefaultConceptPrefix(metamodel));		
		
		Concept concept = RevengFactory.eINSTANCE.createConcept();
		metamodel.setExtractedConcept(concept);
		concept.setPath( getDefaultConceptPath(metamodel) );
		
		ResourceSetImpl rs = new ResourceSetImpl();
		Resource conceptResource = rs.createResource(URI.createURI(concept.getPath()));
		conceptResources.put(concept, conceptResource);
		conceptResource.getContents().add(initialConcept);
		conceptResource.save(null);
	
		return true;
	}

	private String getDefaultConceptPath(Metamodel metamodel) {
		IFile f = project.getFile(new Path("concepts/" + metamodel.getName() + ".ecore"));
		return f.getFullPath().toString();
	}

	private String getDefaultConceptURI(Metamodel metamodel) {
		return getMetamodelPackage(metamodel).getNsURI() + "/concept";
	}


	private String getDefaultConceptPrefix(Metamodel metamodel) {
		return getMetamodelPackage(metamodel).getNsPrefix() + "_concept";
	}

	protected EPackage getMetamodelPackage(Metamodel mm) {
		Resource r = metamodelResources.get(mm);
		if ( r.getContents().size() != 1 ) {
			throw new IllegalArgumentException("Metamodel " + mm.getPath() + " with more than one top-level package");
		}
		
		EPackage pkg = (EPackage) r.getContents().get(0);
		return pkg;
	}
	
    public IModel loadTransformationMetamodels(List<Metamodel> metamodels) throws IOException {
        metamodelResources = new HashMap<Metamodel, Resource>();
    	
    	ResourceSetImpl rs = new ResourceSetImpl();
        // Resource merged = rs.createResource(URI.createURI("reveng_metamodels.ecore"));
        
        for (Metamodel m : metamodels) {
        	boolean requirePruning = false;
        	
        	String path;
        	if ( m.getExtractedConcept() == null ) 
        		path = m.getPath();
        	else
        		path = m.getExtractedConcept().getPath();
        		
        	Resource r1 = null;
        	try {
        		r1 = rs.getResource(URI.createURI(path), true);
        	} catch ( Exception e ) { // Expected a ResourceException from EMF...
        		if ( m.getExtractedConcept() != null ) {
        			path = m.getPath(); 
        			r1 = rs.getResource(URI.createURI(path), true);
        			System.err.println("Could not load concept, loading normal meta-model (pruning required): " + path);
        			m.setExtractedConcept(null);
        			
        			// requirePruning = true;
        		} else {
        			// TODO: SHOW A NICE MESSAGE
        			throw new RuntimeException(e);
        		}
        	}
        	
        	metamodelResources.put(m, r1);
        	
        	if ( m.getExtractedConcept() != null ) {
        		this.conceptResources.put(m.getExtractedConcept(), r1);
        	}

        	// if ( requirePruning ) 
        	//	  pruneMetamodel(m);
        }

        return new MetamodelModel(metamodelResources.values());
    }

	public List<MatchInfo> findRefactorings(Metamodel metamodel) {
		ConceptExtractor ex = new ConceptExtractor(atlModel, metamodelsAndConcepts, typing, getMetamodelPackage(metamodel).getNsURI());

		List<MatchInfo> matches = new ArrayList<MatchInfo>();
		
		// TODO: Have a place to configure the available refactorings 
		IConceptRefactoring[] refactorings = new IConceptRefactoring[] {
				new PushDownFeature(ex, ex),
				new RemoveAssociationClass(ex, ex),
				new RemoveEmptyClass(ex, ex),
		};
		
		for (int i = 0; i < refactorings.length; i++) {
			IConceptRefactoring r = refactorings[i];			
			if ( r.match() ) {
				for(IMatch m: r.getAllMatches() ) {
					matches.add(new MatchInfo(r, m));
				}
			}			
		}
	
		return matches;
	}

	public void applyRefactorings(Metamodel metamodel, List<IMatch> matches) {
		// Not needed... each match stores the reference to the meta-model
		// ConceptExtractor ex = new ConceptExtractor(atlModel, metamodelsAndConcepts, typing, getMetamodelPackage(metamodel).getNsURI());

		for (IMatch m : matches) {
			m.apply();
			
			templateCoevolved = templateCoevolved || m.coevolutionRequired();
		}
		

	}

	public Resource getConcept(Metamodel metamodel) {
		return conceptResources.get(metamodel.getExtractedConcept());
	}

	
	public void createTemplateFile(IFile templateFile) {
		IFile transformation = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(this.model.getTransformation().getPath()));
		try {
			if ( templateFile.exists() ) {
				templateFile.delete(true, null);
			}
			transformation.copy(templateFile.getFullPath(), true, null);
			this.model.getTemplate().setPath( templateFile.getFullPath().toPortableString() );
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
	}

	public void packageComponent() {
		IFile component = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(this.model.getComponentPath()));
		try {
			if (!component.getParent().exists()) {
				((IFolder) component.getParent()).create(true, true, null);
			}
		} catch (CoreException e) {
			e.printStackTrace();
			return;
		}
		
		String componentName = component.getLocation().removeFileExtension().lastSegment();
		
		StringBuffer buf = new StringBuffer();
		buf.append("transformation component " + componentName + " { \n");
		
		EList<Metamodel> metamodels = model.getTransformation().getMetamodels();
		for (Metamodel metamodel : metamodels) {
			String name = metamodel.getExtractedConcept() != null ? metamodel.getExtractedConcept().getName() : metamodel.getName(); 
			String URI  = metamodel.getExtractedConcept() != null ? metamodel.getExtractedConcept().getPath() : metamodel.getPath(); 
			
			String conceptLine = "concept " + name + " : \"platform:/resource/" + URI + "\"";
			if ( metamodel.getKind() == ModelKind.IN ) {
				conceptLine = "source " + conceptLine;
			} else {
				conceptLine = "target " + conceptLine;				
			}

			buf.append("\t" + conceptLine + "\n");
		}
		
		for (Metamodel metamodel : metamodels) {
			String name = metamodel.getModelName().toLowerCase(); 
			String mmName = metamodel.getExtractedConcept() != null ? metamodel.getExtractedConcept().getName() : metamodel.getName(); 
			
			String conceptLine = "model " + name + " : " + mmName;
			if ( metamodel.getKind() == ModelKind.IN ) {
				conceptLine = "source " + conceptLine;
			} else {
				conceptLine = "target " + conceptLine;				
			}
		
			buf.append("\t" + conceptLine + "\n");
		}
		
		buf.append("\tdefinition atl \"platform:/resource/" + model.getTemplate().getPath() + "\" with \n");
		for (int i = 0; i < metamodels.size(); i++) {
			Metamodel metamodel = metamodels.get(i);
			String mmName = metamodel.getExtractedConcept() != null ? metamodel.getExtractedConcept().getName() : metamodel.getName(); 
			
			String line = metamodel.getModelName() + " : " + mmName + " = " + metamodel.getModelName().toLowerCase();
			if ( i + 1 < metamodels.size() )
				line += ", ";
			
			buf.append("\t\t" + line + "\n");
		}
		
		buf.append("}");
		
		ByteArrayInputStream is = null;
		try {
			is = new ByteArrayInputStream(buf.toString().getBytes());
			if (!component.exists()) {
				component.create(is, 0, null);
			} else {
				component.setContents(is, 0, null);
			}
		} catch (CoreException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/*
	        source concept OO      : "platform:/resource/genericity.benchmarks/components/oo2measure/metamodels/OO_concept.ecore"
	        target concept Measure : "platform:/resource/genericity.benchmarks/components/oo2measure/metamodels/Measure.ecore"
	        source model in  : OO
	        target model out : Measure
	        
	        definition atl "platform:/resource/genericity.benchmarks/components/oo2measure/trafo/oo2measure-all.atl" with IN : UML2 = in, OUT = out
		*/

		
		// component.setContents(sis, 0, null);
		
	}
	
}
