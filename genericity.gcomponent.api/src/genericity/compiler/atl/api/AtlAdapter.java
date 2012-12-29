package genericity.compiler.atl.api;

import java.io.IOException;

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
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import eclectic.adapt_transformation;
import gbind.dsl.BindingModel;

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
	
	public void doAdaptation(BindingModelLoader binding, String boundMetamodelName) {
	    adapt_transformation transformation = new adapt_transformation();
	    
	    String concreteMetamodelName = null;
	    
	    Util.registerResourceFactory();
		ModelManager manager = new ModelManager();
		EMFLoader    loader  = new EMFLoader(new JavaListConverter());
		BasicEMFModel in = null;
		try {
			in = binding.load(loader);
			concreteMetamodelName = ((BindingModel) in.allObjectsOf(BindingModel.class.getSimpleName()).get(0)).getBoundMetamodel().getName();
			
			// Atl model is only loaded once, the other times the transformation is re-applied 
			if ( inout == null )
				inout = atlTransformation.load(loader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ParametersModel parameters = new ParametersModel();
		parameters.addParameterObject(new BindingData(boundMetamodelName, concreteMetamodelName));
		
		// in.registerMethodHandler(new BasicMethodHandler(manager));
		manager.register("gbind", in);
		manager.register("socl", in);
		manager.register("atl", inout);
		manager.register("params", parameters);
		
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
