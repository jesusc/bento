package bento.componetization.ui;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.m2m.atl.core.emf.EMFModel;

import anatlyzer.atl.analyser.namespaces.MetamodelNamespace;
import anatlyzer.atl.editor.builder.AnalyserExecutor;
import anatlyzer.atl.editor.builder.AnalyserExecutor.CannotLoadMetamodel;
import anatlyzer.atl.index.AnalysisIndex;
import anatlyzer.atl.index.AnalysisResult;
import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.util.ATLSerializer;
import anatlyzer.atl.util.ATLUtils;
import anatlyzer.ui.util.AtlEngineUtils;
import bento.componetization.atl.ConceptExtractor;
import bento.componetization.atl.MetamodelPrunner;
import bento.componetization.atl.hints.RemoveAssociationClass;
import bento.componetization.atl.refactorings.IConceptRefactoring;
import bento.componetization.atl.refactorings.IMatch;
import bento.componetization.atl.refactorings.MakeLeafAbstractClassConcrete;
import bento.componetization.atl.refactorings.PushDownFeature;
import bento.componetization.atl.refactorings.RemoveEmptyClass;
import bento.componetization.atl.refactorings.RemoveUnusedFeature;
import bento.componetization.reveng.Concept;
import bento.componetization.reveng.Metamodel;
import bento.componetization.reveng.ModelKind;
import bento.componetization.reveng.RevengFactory;
import bento.componetization.reveng.RevengModel;

/**
 * This class is in charge of checking the consistency
 * of the files handled or extracted by the reverse engineering
 * process.
 * 
 * @author jesus
 *
 */
public class RevengProcessManager {
	/** The resource where the RevengModel belongs to. Needed for easy saving */
	private Resource resource;
	
	/** The configuration model of the reverse engineering process */
	private RevengModel model;
	
	/** The project where the process will happen */
	private IProject project;
	
	private boolean templateCoevolved = false;

	/**
	 * Creates a new manager.
	 * 
	 * @param resource The EMF resource containing the initial model to hold the reveng. information
	 * @param path The path of the .componetize file
	 */
	public RevengProcessManager(Resource resource, IPath path) {
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
		IContainer container = ResourcesPlugin.getWorkspace().getRoot().getContainerForLocation(path);
		project       = container.getProject();
	}

	/**
	 * Creates the template file, adapting its meta-model tags as needed.
	 * It also copies the meta-models and initializes the concepts as needed.
	 * 
	 * Modify the template path and the concept's paths in the configuration model.
	 */
	public void copyComponentFiles(IFile transformation, IFile templateFile) {
		try {
			if ( templateFile.exists() ) {
				templateFile.delete(true, null);
			}

			EMFModel loaded = AtlEngineUtils.loadATLFile(transformation);		
			ATLModel original = new ATLModel(loaded.getResource(), transformation.getLocation().toPortableString()); 
			
			for(Metamodel m : this.model.getTransformation().getMetamodels()) {
				if ( m.getPath().startsWith("/") ) {
					IFile f = getFileLocation(m.getPath());
					String fileName = null;
					if ( m.isBecomeConcept() ) {
						fileName = m.getExtractedConcept().getName() + ".ecore";
					} else {
						fileName = f.getLocation().segment(f.getLocation().segmentCount() - 1);
					}
					IFile target = project.getFolder("metamodels").getFile(fileName);
					
					ATLUtils.replacePathTag(original.getRoot(), m.getName(), target.getFullPath().toPortableString());
					
					if ( target.exists() ) {
						target.delete(true, null);
					}
					f.copy(target.getFullPath(), true, null);
					
					// Set the computed path for the concept meta-model
					if ( m.isBecomeConcept() ) {
						m.getExtractedConcept().setPath(target.getFullPath().toPortableString());
					}
				}
			}
			
			ATLSerializer.serialize(original, templateFile.getLocation().toPortableString());
			templateFile.refreshLocal(1, null);

			// transformation.copy(templateFile.getFullPath(), true, null);
			this.model.getTemplate().setPath( templateFile.getFullPath().toPortableString() );

			save();
			
		} catch (CoreException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}


	
	
	/**
	 * @return the root element of the underlying model
	 */
	public RevengModel getModel() {
		return model;
	}
	
	/**
	 * Load the template file and apply the static analysis.
	 * 
	 * The configured template must exists, otherwise it returns false.
	 * 
	 * @return false if the template does not exist.
	 */
	/*
	protected boolean loadATL() {
		if ( ! templateExists() ) {
			return false;
		}
		
		String path = model.getTemplate().getPath();
		EMFModel loaded = AtlEngineUtils.loadATLFile(getFileLocation(path));		
		this.atlModel = new ATLModel(loaded.getResource(), path); 
	
		return true;
	}
	*/

	/**
	 * Save all information of the process: the .componetize file, the concepts and the 
	 * template if it has been co-evolved.
	 * 
	 * @throws IOException
	 */
	public void save() throws IOException {
		resource.save(null);
		
		/*
		if ( true ) throw new UnsupportedOperationException("Save the concepts!");
//		for(Resource r : conceptResources.values()) {
//			r.save(null);
//		}
		
		if ( templateCoevolved ) {
			saveATL();
			templateCoevolved = false;
		}
		*/
	}

	/**
	 * Serializes the template to disk.
	 */
	protected void saveATL() {
		Assert.isNotNull(model.getTemplate());
		
		try {
			IFile atlFile     = getTemplateFile();
			ATLModel original = getATLModel(); 
			ATLSerializer.serialize(original, atlFile.getLocation().toPortableString());
			atlFile.refreshLocal(1, null);
		} catch (IOException | CoreException e) {
			e.printStackTrace();
			MessageDialog.openError(null, "ATL saving", "Could not save " + model.getTemplate().getPath());
		}
	}

	/**
	 * Apply the typing process to the transformation template. 
	 * 
	 * Precondition: the transformation template must exists.
	 *  
	 * @return 
	 * @throws IOException 
	 */
	/*
	public TypingInfo applyTyping() throws IOException {
		if ( model.getTemplate() == null ) 
			throw new IllegalStateException();

		if ( ! loadATL() ) {
			// TODO: Show better message, reasons, etc...
			// TODO: Move this to helper method in ITask?? The problem is that in Luna it seems that
			//       message dialogs cannot be shown outside an UI thread...
			Display.getDefault().syncExec(new Runnable() {				
				@Override
				public void run() {
					MessageDialog.openError(null, "ATL loading", "Could not load " + model.getTemplate().getPath());
				}
			});
			return null;
		}
									
		
		metamodelsAndConcepts = this.loadTransformationMetamodels(model.getTransformation().getMetamodels());
		
		// TODO: Use ATL Model directly
		Analyser analyser = new Analyser(metamodelsAndConcepts, getATLModel());
		analyser.setDoDependencyAnalysis(false);
		analyser.perform();
	
		return new TypingInfo(analyser.getErrors().getAnalysis().getProblems());
	}
	*/
	
	
	public IFolder getDefaultTemplateFolder() {
		IFolder f = project.getFolder(new Path("transformation"));
		return f;
	}
	
	public IFolder getDefaultComponentFolder() {
		IFolder f = project.getFolder(new Path("component"));
		return f;
	}
	
	
//	private boolean templateExists() {
//		if ( model.getTemplate() == null ) return false;
//		IFile location = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(model.getTemplate().getPath()));		
//		return location.exists();
//	}


	/**
	 * Prune a meta-model, extracting a concept which is saved to this.
	 * 
	 * @param metamodel The meta-model to be pruned.
	 * @return true if a new concept has been saved and thus a retyping is needed.
	 * @throws IOException
	 */
	public boolean pruneMetamodel(Metamodel metamodel) throws IOException {
		Assert.isTrue(metamodel.isBecomeConcept());
		Concept concept = metamodel.getExtractedConcept();
		
		// Already prunned
		// if ( metamodel.getExtractedConcept() != null )
		// 	return false;
		// Not checking this anymore.
		
		MetamodelNamespace ns = getMetamodelNamespace(metamodel);
		
		MetamodelPrunner prunner = new MetamodelPrunner(getATLModel(), ns);
		EPackage pkg = getMetamodelPackage(ns);
		
		ResourceSetImpl rs = new ResourceSetImpl();
		Resource conceptResource = rs.createResource(URI.createURI(concept.getPath()));

		EPackage initialConcept = prunner.extractSource(conceptResource, pkg.getName(), concept.getNsURI(), getDefaultConceptPrefix(ns));		
		
		conceptResource.getContents().add(initialConcept);
		conceptResource.save(null);
	
		return true;
	}
	
	/**
	 * Force the type checker to do a fresh run. This is typically needed
	 * when the concept/meta-models are changed (and saved to disk) or 
	 * the template is evolved and serialized.
	 */
	public AnalysisResult applyTyping() {
		try {
			return new AnalyserExecutor().exec(getTemplateFile(), true);
		} catch (IOException | CoreException | CannotLoadMetamodel e) {
			e.printStackTrace();
			WorkspaceLogger.generateLogEntry(Status.ERROR, e);
		}	
		return null;
	}
	
	/*
    public IStaticAnalysisInfo computeStaticAnalysis(Metamodel metamodel) {
		MetamodelNamespace mm = metamodelsAndConcepts.getNamespace(metamodel.getName());
    	return new ConceptExtractor(getATLModel(), mm, getMetamodelPackage(metamodel).getNsURI());
    }
    */
    
	public List<MatchInfo> findRefactorings(Metamodel metamodel) {
		MetamodelNamespace mm = getMetamodelNamespace(metamodel);
		System.out.println("===> Refactorings over " + mm);
		ConceptExtractor ex = new ConceptExtractor(getATLModel(), mm, getMetamodelPackage(mm).getNsURI());

		// ConceptExtractor ex = new ConceptExtractor(atlModel, metamodelsAndConcepts, typing, getMetamodelPackage(metamodel).getNsURI());

		List<MatchInfo> matches = new ArrayList<MatchInfo>();
		
		// TODO: Have a place to configure the available refactorings 
		IConceptRefactoring[] refactorings = new IConceptRefactoring[] {
				new MakeLeafAbstractClassConcrete(ex, ex),
				new PushDownFeature(ex, ex),
				new RemoveAssociationClass(ex, ex),
				new RemoveEmptyClass(ex, ex),
				new RemoveUnusedFeature(ex, ex)
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

	/**
	 * Apply a set of selected refactorings.
	 * 
	 * At the end of the process the concept is saved, and the template retyped.
	 * 
	 * @param metamodel
	 * @param matches
	 */
	public void applyRefactorings(Metamodel metamodel, List<IMatch> matches) {
		for (IMatch m : matches) {
			m.apply();
			
			templateCoevolved = templateCoevolved || m.coevolutionRequired();
		}
		
		Resource r = getConceptResource(metamodel);
		try {
			r.save(null);
		} catch (IOException e) {
			e.printStackTrace();
			WorkspaceLogger.generateLogEntry(Status.ERROR, e);
		}
		
		if ( templateCoevolved ) {
			saveATL();
		}
			
		
		applyTyping();
		
	}

	/**
	 * Returns the resource associated to a concept. If the resource has not 
	 * been loaded yet, it is loaded and stored for later uses.
	 * 
	 * @param metamodel
	 * @return The resource associated to the concept.
	 */
	public Resource getConceptResource(Metamodel metamodel) {
		AnalysisResult r = getTemplateAnalysis();
		Resource resource = r.getNamespace().getLogicalNamesToMetamodels().get(metamodel.getName());
		if ( resource == null ) {
			// Try with the concept name... 
			resource = r.getNamespace().getLogicalNamesToMetamodels().get(metamodel.getExtractedConcept().getName());
		}
		return resource;
	}

	
	public void packageComponent() {
		IFile component = project.getFolder("META-INF").getFile(this.model.getComponentPath() + ".gcomponent");
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
			String mmName = metamodel.getName(); // metamodel.getExtractedConcept() != null ? metamodel.getExtractedConcept().getName() : metamodel.getName(); 
			
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
	}

	//
	// Model query methods
	//
	
	/**
	 * @return the meta-models that will become concepts
	 */
	public Stream<Metamodel> getMetamodelToBecomeConcepts() {
		return this.model.getTransformation().getMetamodels().stream().
			filter(m -> m.isBecomeConcept());
	}

	/**
	 * Checks whether the concept associated to the meta-model exists
	 * in the project.
	 * @param metamodel The meta-model associated to the concept
	 * @return true if the meta-model exists.
	 */
	public boolean existsConceptMetamodel(Metamodel metamodel) {
		Assert.isNotNull(metamodel.getExtractedConcept());
		return getFileLocation(metamodel.getExtractedConcept().getPath()).exists();
	}

	public IFile getTemplateFile() {
		return getFileLocation(model.getTemplate().getPath());
	}

	/**
	 * @return true if the template file has been configured and it exists on disk.
	 */
	public boolean isTemplateCreated() {
		if ( model.getTemplate() != null && model.getTemplate().getPath() != null ) {
			return getTemplateFile().exists();
		}
		return false;
	}


	//
	// Helper methods 
	//

	private IFile getFileLocation(String path) {
		IFile location = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(path));
		return location;
	}
	
//	private String getFullPathFromProjectRelative(String path) {
//		return getFileLocation(path).getRawLocation().toPortableString();
//	}

	private AnalysisResult getTemplateAnalysis() {
		AnalysisResult r = AnalysisIndex.getInstance().getAnalysis(getTemplateFile());
		if ( r == null ) {
			r = applyTyping();
		}
		return r;
	}

	private ATLModel getATLModel() {
		return getTemplateAnalysis().getAnalyser().getATLModel();
	}

	private EPackage getMetamodelPackage(MetamodelNamespace ns) {
		Resource r = ns.getResource();
		if ( r.getContents().size() != 1 ) {
			throw new IllegalArgumentException("Metamodel " + ns.getName() + " with more than one top-level package");
		}
		
		EPackage pkg = (EPackage) r.getContents().get(0);
		return pkg;
	}

	private MetamodelNamespace getMetamodelNamespace(Metamodel metamodel) {
		AnalysisResult r = getTemplateAnalysis();
		MetamodelNamespace ns = r.getNamespace().getNamespace(metamodel.getName());
		if ( ns == null ) {
			ns = r.getNamespace().getNamespace(metamodel.getExtractedConcept().getName());
		}
		return ns;
	}

	private String getDefaultConceptPrefix(MetamodelNamespace ns) {
		return getMetamodelPackage(ns).getNsPrefix() + "_concept";
	}
	
	/*
	// Perhaps should be public
	private String getDefaultConceptURI(Metamodel metamodel) {
		return getMetamodelPackage(metamodel).getNsURI() + "/concept";
	}
	*/

}
