package genericity.compiler.atl.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.BasicMethodHandler;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.idc.jvm.runtime.ParametersModel;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import atl.metamodel.ATLModel;
import eclectic.adapt_transformation;
import gbind.dsl.BindingModel;
import gbind.dsl.MetamodelDeclaration;
import gbind.dsl.BindingOptions;
import genericity.compiler.atl.Class2Reference;
import genericity.compiler.atl.ClassMerge;
import genericity.compiler.atl.VirtualClasses;
import genericity.compiler.atl.analyser.Analyser;
import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import genericity.compiler.atl.api.AtlAdapter.BindingData;
import genericity.language.gcomponent.core.Metamodel;
import genericity.language.gcomponent.core.ParameterModel;
import genericity.language.gcomponent.technologies.AtlParameter;
import genericity.typecheck.atl.TypeCheckLauncher;
import genericity.typing.atl_types.AtlTypingPackage;

/**
 * Adapts an existing ATL transformation according to a given binding.
 * 
 * @author jesus
 */
public class AtlAdapter {

	private AtlTransformationLoader atlTransformation;
	private BasicEMFModel inout;
	
	public AtlAdapter(AtlTransformationLoader atlTransformation) {
		this.atlTransformation = atlTransformation;
		this.inout = null;
	}
	
	public void doAdaptation(BindingModelLoader binding, String boundMetamodelName, List<AtlParameter> templateParameters) {
	    adapt_transformation transformation = new adapt_transformation();
	    
	    String concreteMetamodelName = null;
	    MetamodelDeclaration boundMetamodel = null;
	    
	    Util.registerResourceFactory();
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in = null;
		try {
			in = binding.load(loader);
			boundMetamodel = ((BindingModel) in.allObjectsOf(BindingModel.class.getSimpleName()).get(0)).getBoundMetamodel();
			concreteMetamodelName = boundMetamodel.getName();
			
			// Atl model is only loaded once, the other times the transformation is re-applied 
			if ( inout == null )
				inout = atlTransformation.load(loader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BindingData bindingData = new BindingData(boundMetamodelName, concreteMetamodelName);
		ParametersModel parameters = new ParametersModel();
		parameters.addParameterObject(bindingData);
		
		List<EObject> optionsList = in.allObjectsOf("BindingOptions");
		if ( optionsList.size() > 0 ) {
			BindingOptions options = (BindingOptions) optionsList.get(0);
			if ( options.isEnableClassMerge() ) {
				try {
					transformClassMerge(loader, in, inout, templateParameters, boundMetamodel, bindingData);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new RuntimeException(e);
				}				
			}
		}
		
		if ( in.allObjectsOf("VirtualClassBinding").size() > 0 ) {
			try {
				transformVirtualClasses(loader, in, inout, templateParameters, bindingData);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		// in.registerMethodHandler(new BasicMethodHandler(manager));
		manager.register("gbind", in);
		manager.register("socl", in);
		manager.register("atl", inout);
		manager.register("params", parameters);

		inout.setInplaceMode();
		
		in.registerMethodHandler(new CustomMethodHandler(manager));
		inout.registerMethodHandler(new CustomMethodHandler(manager));
		transformation.setModelManager(manager);

		transformation.configure_();
		transformation.start_();
		
		// TODO: Define in/out modes for EMFModels
		// out.serialize();
		
		//inout.serialize(new FileOutputStream(withDir("tmp_/uml2java-adapted.atl.xmi")));
		//System.out.println("Finished " + Rewrite1.class.getSimpleName());
		
		System.out.println("Finished Atl Adaptation");
	}

	private void transformVirtualClasses(EMFLoader loader, BasicEMFModel bindingModel, BasicEMFModel atlTransformation, 
			List<AtlParameter> templateParameters, BindingData bindingData) throws IOException {
		// TODO Auto-generated method stub
		List<EPackage> pkgs = new ArrayList<EPackage>();
		pkgs.add(AtlTypingPackage.eINSTANCE);
		BasicEMFModel typing = loader
				.emptyModelFromMemory(pkgs, "tmp_/typing.xmi");

		ATLModel atlModel = new ATLModel(atlTransformation.getHandler().getResource());
		GlobalNamespace mm = loadMetamodels(loader, templateParameters);
		Analyser analyser = new Analyser(mm, atlModel, typing);
		analyser.setDoDependencyAnalysis(false);
		analyser.perform();
		
		/*
		String[] strMetamodels = new String[templateParameters.size()];
		int i = 0;
		for (Metamodel meta : templateParameters) {
			strMetamodels[i] = meta.getUri();
			i++;
		}
		
		BasicEMFModel mm = TypeCheckLauncher.loadTransformationMetamodels(loader, strMetamodels);
		TypeCheckLauncher typechecker = new TypeCheckLauncher();
		typechecker.setWarningMode();
		typechecker.launch(mm, atlTransformation, out);
		// TODO: GET ERRORS AND SHOW WARNINGS SOMEHOW
		*/
		
		VirtualClasses.BindingData data = new VirtualClasses.BindingData(bindingData.boundMetamodelName, bindingData.concreteMetamodelName);
		new VirtualClasses().launch(atlTransformation, bindingModel, typing, data);
		
		System.out.println("Finished virtual-classes transformation...");
	}

	private void transformClassMerge(EMFLoader loader, BasicEMFModel bindingModel, BasicEMFModel atlTransformation, 
			List<AtlParameter> templateParameters, MetamodelDeclaration boundMetamodel, BindingData bindingData) throws IOException {
		// TODO Auto-generated method stub
		List<EPackage> pkgs = new ArrayList<EPackage>();
		pkgs.add(AtlTypingPackage.eINSTANCE);
		BasicEMFModel typing = loader
				.emptyModelFromMemory(pkgs, "tmp_/typing.xmi");

		
		ATLModel atlModel = new ATLModel(atlTransformation.getHandler().getResource());
		GlobalNamespace mm = loadMetamodels(loader, templateParameters);
		Analyser analyser = new Analyser(mm, atlModel, typing);
		analyser.setDoDependencyAnalysis(false);
		analyser.perform();
		
		/*
		String[] strMetamodels = new String[templateParameters.size()];
		int i = 0;
		for (Metamodel meta : templateParameters) {
			strMetamodels[i] = meta.getUri();
			i++;
		}
		
		BasicEMFModel mm = TypeCheckLauncher.loadTransformationMetamodels(loader, strMetamodels);
		new TypeCheckLauncher().launch(mm, atlTransformation, out);
		*/
		
		BasicEMFModel boundMM = TypeCheckLauncher.loadTransformationMetamodels(loader, boundMetamodel.getMetamodelURI());
		
		ClassMerge.BindingData data = new ClassMerge.BindingData(bindingData.boundMetamodelName, bindingData.concreteMetamodelName);
		new ClassMerge().launch(atlTransformation, bindingModel, typing, boundMM, data);
		
		System.out.println("Finished class-merge transformation...");
	}

	private GlobalNamespace loadMetamodels(EMFLoader loader, List<AtlParameter> templateParameters) {
		ResourceSet rs = loader.getResourceSet();
		HashMap<String, Resource> logicalNamesToResources = new HashMap<String, Resource>();
		ArrayList<Resource> resources = new ArrayList<Resource>();
		for (AtlParameter atlParameter : templateParameters) {
			ParameterModel parameterModel = (ParameterModel) atlParameter.getModel();
			
			Resource r = null;
			
			r = rs.getResource(URI.createURI(parameterModel.getType().getUri()), true);

			resources.add(r);
			logicalNamesToResources.put(atlParameter.getAtlMetamodelName(), r);
		}

		return new GlobalNamespace(resources, logicalNamesToResources);
	}

	public Resource getResource() {
		inout.getHandler().packRootElements();
		return inout.getHandler().getResource();
	}

	public static class CustomMethodHandler extends org.eclectic.idc.jvm.runtime.BasicMethodHandler  {
		public CustomMethodHandler(ModelManager m) {
			super(m);
		}
		
		@Override
		public IMethodWrapper wrap(Object o) {
			try {
				return new CustomMethodWrapper(manager.getNamespace(o), o);
			} catch (NoModelFoundException e) {
				throw new IdcException(e);
			}
		}
	}	
	
	public static class CustomMethodWrapper extends org.eclectic.idc.jvm.runtime.BasicMethodWrapper {
		public CustomMethodWrapper(IModel<?, ?> model, Object o) {
			super(model, o);
		}
		
		public Boolean is_normal_feature_binding() {
			return ((EObject) object).eContainer() instanceof BindingModel;
		}
		
		public Boolean is_child_of(EObject parent) {			
			return checkIsChild((EObject) object, parent);
		}
		
		private boolean checkIsChild(EObject o, EObject parent) {
			if ( o == null )   return false;
			if ( o == parent ) return true;
			return checkIsChild(o.eContainer(), parent);
		}

		public EObject copy() {
			MyCopier copier = new MyCopier((EObject) object);
			EObject copied = copier.copy((EObject) object);
			copier.copyReferences();

			// EObject copied = (EObject) EcoreUtil.copy((EObject) this.object);
			BasicEMFModel m = (BasicEMFModel) ((IModel<?, ?>) this.model);
			m.getHandler().addToResource(copied);

			TreeIterator<EObject> it = copied.eAllContents();
			while (it.hasNext()) {
				m.getHandler().addToResource(it.next());
			}
			return copied;
		}

		public void replace_containing_property(Object obj) {
			//EcoreUtil.replace((EObject) this.object, (EObject) obj);
			
			
			BasicEMFModel m = (BasicEMFModel) ((IModel<?, ?>) this.model);
			EObject container = (EObject) this.model.getContainer(this.object);
						
			put_expression_in_container((EObject) this.object, container, (EObject) obj);
		}

		public String containing_property() {
			return ((EObject) object).eContainingFeature().getName();
		}
		

		public void set_inner_expression(Object obj, String featureName) {
			this.model.setFeature(((EObject) object), featureName, obj);			
		}

		private void put_expression_in_container(EObject original, EObject container, EObject v) {
			/*
			String containing_property;
			if (this.model.isKindOf(container, "Attribute")) {
				containing_property = "initExpression";
			} else if (this.model.isKindOf(container, "IfExp") || this.model.isKindOf(container, "IfStat") ) {
				containing_property = "condition";
			} else {
				containing_property = "source";
			}
			*/
			String containing_property = original.eContainingFeature().getName();
			BasicEMFModel m = (BasicEMFModel) ((IModel<?, ?>) this.model);
			m.delete(original);

			//System.out.println("Setting " + containing_property + container);
			//System.out.println(v);
			//System.out.println();
			
			this.model.setFeature(container, containing_property, v);
		}

		public void deattach() {
			// BasicEMFModel m = (BasicEMFModel) ((IModel<?, ?>) this.model);
			// m.delete((EObject) object);			
			// Deattach works, and seems safer that delete...
			
			EObject eobj = (EObject) object;			
			EcoreUtil.remove(eobj);
		}

	}	

	public static class MyCopier extends EcoreUtil.Copier {
		private EObject root;

		public MyCopier(EObject object) {
			super();
			this.root = object;
		}

		protected void copyReference(EReference eReference, EObject eObject,
				EObject copyEObject) {
			super.copyReference(eReference, eObject, copyEObject);

			if (eObject.eIsSet(eReference)) {
				if (eReference.isMany()) {
				} else {
					Object referencedEObject = eObject.eGet(eReference,
							resolveProxies);
					if (referencedEObject == null) {
					} else {
						Object copyReferencedEObject = get(referencedEObject);
						if (copyReferencedEObject == null) {
							if (useOriginalReferences
									&& eReference.getEOpposite() == null) {
							}
							// added to make a cross-reference to objects
							// outside the copy
							else {
								boolean isContained = EcoreUtil.isAncestor(
										root, (EObject) referencedEObject);
								if (useOriginalReferences && !isContained) {
									copyEObject.eSet(eReference,
											referencedEObject);
								}
							}
						} else {
						}
					}
				}
			}
		}
	}
	// End-of MyCopier

	public class BindingData {
		private String boundMetamodelName;
		private String concreteMetamodelName;

		public BindingData(String boundMetamodelName, String concreteMetamodelName) {
			this.boundMetamodelName = boundMetamodelName;
			this.concreteMetamodelName = concreteMetamodelName;
		}
		
		public String boundMetamodelName() {
			return boundMetamodelName;
		}
		
		public String concreteMetamodelName() {
			return concreteMetamodelName;
		}
		
	}
}
