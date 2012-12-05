package genericity.compiler.atl.api;

import eclectic.propagate_instantiation;
import genericity.compiler.atl.api.AtlTransformationLoader.FileBased;
import genericity.gcomponent.Util;
import genericity.gcomponent.instantiation.AdaptWithBinding;
import genericity.gcomponent.instantiation.AdaptedTransformation;
import genericity.gcomponent.instantiation.ComponentInstantiation;
import genericity.gcomponent.instantiation.ComponentInstantiationPackage;
import genericity.gcomponent.instantiation.ExecutableTransformation;
import genericity.language.gcomponent.GcomponentPackage;
import genericity.language.gcomponent.core.Component;
import genericity.language.gcomponent.core.CompositeComponent;
import genericity.language.gcomponent.core.Template;
import genericity.language.gcomponent.dsl.DefinitionRoot;
import genericity.language.gcomponent.technologies.AtlParameter;
import genericity.language.gcomponent.technologies.AtlTemplate;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.BasicMethodHandler;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.ModelManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

public class ComponentExecutor {

	private Component component;
	private FilePathResolver filePathResolver;
	private HashMap<ExecutableTransformation, AtlTransformationLoader> loaders = new HashMap<ExecutableTransformation, AtlTransformationLoader>();
	
	public ComponentExecutor(Resource r, FilePathResolver filePathResolver) {
		this.component = ((DefinitionRoot) r.getContents().get(0)).getComponent();
		this.filePathResolver = filePathResolver;
	}

	public void execute() throws MyComponentError {
		if ( component instanceof CompositeComponent ) {
			adaptComponent((CompositeComponent) component);
		} else {
			throw new MyComponentError("Only composite components can be executed");
		}
	}

	private void adaptComponent(CompositeComponent component) throws MyComponentError { 
		propagate_instantiation transformation = new propagate_instantiation();

		Resource copiedResource = Util.copyResolvingCrossReferences(component.eResource(), URI.createURI("file://tmp/temp.xmi"));
		
		ModelManager manager = new ModelManager();		
		EMFLoader    loader  = new EMFLoader(new JavaListConverter(), copiedResource.getResourceSet());
		BasicEMFModel in = null, out = null;
		
		try {
			// load input -> DSL with cross-references resolved
			in  = loader.basicModelFromMemory(GcomponentPackage.eINSTANCE, copiedResource);
			// System.out.println(copiedResource.getContents());
			// copiedResource.save(null);	
			
			// create empty output model
			ArrayList<EPackage> pkgs = new ArrayList<EPackage>();
			pkgs.add(ComponentInstantiationPackage.eINSTANCE);
			out = loader.emptyModelFromMemory(pkgs, "/tmp/temp-instantiated.xmi");
		} catch (Exception e) {
			e.printStackTrace();
			throw new MyComponentError("Could not load component models", e);
		}
		
		// in.registerMethodHandler(new BasicMethodHandler(manager));
		manager.register("comp", in);
		manager.register("inst", out);
		in.registerMethodHandler(new BasicMethodHandler(manager));
		out.registerMethodHandler(new BasicMethodHandler(manager));
		transformation.setModelManager(manager);

		transformation.configure_();
		transformation.start_();
			
		// adaptSwitch( component.getComposition().getStep() );
		
		out.getHandler().packRootElements();
		ComponentInstantiation ci = (ComponentInstantiation) out.getHandler().getResource().getContents().get(0);
		//System.out.println(out.getHandler().getResource().getContents());
		//out.serialize();
		
		adapt(ci);
		//execute(ci);
		
		//AtlInvoker invoker = new AtlInvoker();
		/*
		// After adaptation -> execute if final component
		for(ParameterModel s : component.getSourceModels()) {
			if ( s.getResourceName() != null ) {
				// TODO: For some reason I put type *... change
				invoker.addInModel(s.getResourceName(), s.getType().get(0).getUri());
			}
		}
		// TODO: How to deal with components that fix only some of the models and the
		//       others are left open.
		*/
	}

	private void adapt(ComponentInstantiation ci) {
		adapt((AdaptedTransformation) ci.getTransformation());
	}

	private void adapt(AdaptedTransformation transformation) {
		String atlTemplate = null;
		if ( transformation.getTemplate() instanceof AtlTemplate ) {
			atlTemplate = ((AtlTemplate) transformation.getTemplate()).getTemplate();
		} else {
			throw new UnsupportedOperationException();
		}
		
		FileBased atlLoader = new AtlTransformationLoader.FileBased(this.filePathResolver.resolve(atlTemplate));
		AtlAdapter adapter = new AtlAdapter( atlLoader );

		for(AdaptWithBinding step : transformation.getRequiredAdaptations()) {				
			BindingModelLoader loader = new BindingModelLoader.FileBased( step.getAppliedBinding().getFileName() );
			
			// Select the actual ATL model that is bound
			AtlParameter atlBoundModel = null;
			AtlTemplate template = (AtlTemplate) transformation.getTemplate();			
			for(AtlParameter p : template.getParameters()) {
				if ( p.getModel() == step.getConcreteModel() ) {
					atlBoundModel = p;
				}
			}
			
			adapter.doAdaptation(loader, atlBoundModel.getAtlMetamodelName());
		}

		
		atlLoader.exportAdapted(filePathResolver.createFileNameFromInitial(component.getName() + ".atl") );

		loaders.put(transformation, atlLoader);
	}

	private void execute(ComponentInstantiation ci) {
		execute((AdaptedTransformation) ci.getTransformation());		
	}

	private void execute(AdaptedTransformation transformation) {
		AtlTransformationLoader atlLoader = loaders.get(transformation);		
		
	}
}
