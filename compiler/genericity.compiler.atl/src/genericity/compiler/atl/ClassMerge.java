package genericity.compiler.atl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclectic.idc.datatypes.ImmutableList;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.IClosure;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IModelMethodHandler;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.idc.jvm.runtime.IdcMetaclass;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;

import eclectic.callexpr;
import eclectic.composed_genericity;
import eclectic.ocl2ocl;
import eclectic.rewrite_class1;
import gbind.dsl.BindingModel;
import gbind.dsl.ClassBinding;
import gbind.dsl.ConcreteMetaclass;
import genericity.typing.atl_types.CollectionType;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.PrimitiveType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.UnionType;
import genericity.typing.atl_types.Unknown;
import genericity.typing.atl_types.annotations.BindingAnn;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

public class ClassMerge {

	BasicEMFModel typingModel = null;
	private BasicEMFModel boundMM;
	
	// TODO: Parameterize this
	// static String BOUND_METAMODEL_NAME = "UML";
	// static String TARGET_METAMODEL_NAME = "Simple";
	
	public static BasicEMFModel loadBoundMetamodel(EMFLoader loader, String... metamodels) throws IOException {
		ResourceSetImpl rs = new ResourceSetImpl();
		Resource merged = rs.createResource(URI.createURI("tgt_mm.ecore"));

		for (String path : metamodels) {
			Resource r1 = rs.getResource(URI.createURI(path), true);

			merged.getContents().addAll(r1.getContents());
		}
	
		BasicEMFModel mm = loader.basicModelFromMemory(EcorePackage.eINSTANCE, merged);	

		return mm;
	}	
	
	public static class BindingData {
		private String targetMetamodelName;
		private String boundMetamodelName;

		public BindingData(String boundMetamodelName, String targetMetamodelName) {
			this.boundMetamodelName = boundMetamodelName;
			this.targetMetamodelName = targetMetamodelName;
		}
		
		public String boundMetamodelName() {
			return boundMetamodelName;
		}

		public String concreteMetamodelName() {
			return targetMetamodelName;
		}
	}

	
	public void launch(BasicEMFModel atlTransformation, BasicEMFModel bindingModel, BasicEMFModel typ, BasicEMFModel boundMM, BindingData data) throws IOException {
		this.typingModel = typ;
		this.boundMM       = boundMM;
		
		eclectic.class_merge transformation = new eclectic.class_merge();

		Util.registerResourceFactory();
		ModelManager manager = new ModelManager();

		BasicEMFModel in = bindingModel;
		BasicEMFModel inout = atlTransformation;
		
		ParametersModel parameters = new ParametersModel();
		parameters.addParameterObject("BindingData", data);

		// in.registerMethodHandler(new BasicMethodHandler(manager));
		manager.register("gbind", in);
		manager.register("socl", in);
		manager.register("typ", typ);
		manager.register("params", parameters);
		manager.register("atl", inout);

		// in.registerMethodHandler(new
		// org.eclectic.idc.jvm.runtime.BasicMethodHandler(manager));
		in.registerMethodHandler(new CustomMethodHandler(manager));
		inout.registerMethodHandler(new CustomMethodHandler(manager));
		transformation.setModelManager(manager);

		transformation.configure_();
		transformation.start_();

	}

	// Copied from atl adapter in components.api
	public class CustomMethodHandler extends
			org.eclectic.idc.jvm.runtime.BasicMethodHandler {
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

	public class CustomMethodWrapper extends
			org.eclectic.idc.jvm.runtime.BasicMethodWrapper {
		public CustomMethodWrapper(IModel<?, ?> model, Object o) {
			super(model, o);
			
		}

		public Type atlType(Object object){
			List<EObject> annotations = typingModel.allObjectsOf("ExpressionAnnotation");
			for (EObject eObject : annotations) {
				ExpressionAnnotation ann = (ExpressionAnnotation) eObject;
				if ( ann.getExpr() == object ) {
					return ann.getType();
				}
			}
			
			throw new IllegalStateException("No type assigned to " + object + " at " + model.getFeature(object, "location"));
		}


		private Type bindingType(Object object) {
			List<EObject> annotations = typingModel.allObjectsOf("BindingAnn");
			for (EObject eObject : annotations) {
				BindingAnn ann = (BindingAnn) eObject;
				if ( ann.getBinding() == object ) {
					return ann.getSourceType();
				}
			}
			
			throw new IllegalStateException("No type assigned to " + object + " at " + model.getFeature(object, "location"));
		}
		public EClass findEClass(String name){
			List<EObject> eclasses = boundMM.allObjectsOf("EClass");
			for (EObject eObject : eclasses) {
				EClass eclass = (EClass) eObject;
				if ( eclass.getName().equals(name) ) {
					return eclass;
				}
			}
			
			throw new IllegalStateException("No meta-class found named " + name);
		}

		
		/**
		 * Applied over an OCL model element.
		 * 
		 * @param modelElement
		 * @return
		 */
		public Boolean conflict_with(Object classBinding) {
			ClassBinding cb1  = (ClassBinding) object;
			ClassBinding cb2  = (ClassBinding) classBinding;

			EList<ConcreteMetaclass> concretes1 = cb1.getConcrete();
			EList<ConcreteMetaclass> concretes2 = cb2.getConcrete();
			
			for (ConcreteMetaclass concreteMetaclass1 : concretes1) {
				if ( concreteMetaclass1.getName().toUpperCase().equals("NONE") )
					continue;

				for (ConcreteMetaclass concreteMetaclass2 : concretes2) {
					if ( concreteMetaclass2.getName().toUpperCase().equals("NONE") )
						continue;
					
					EClass e1 = findEClass(concreteMetaclass1.getName());
					EClass e2 = findEClass(concreteMetaclass2.getName());
			
					//if ( e1.isSuperTypeOf(e2) ) {
					if ( e2.isSuperTypeOf(e1) ) {
						return true;
					}
					
				}

			}
			
			return false;
			// return e1.isSuperTypeOf(e2);
		}
	
		public Boolean compatible_with(EClass ruleType) {
			Type type = bindingType(object);
			return checkType(type, ruleType);
		}


		private Boolean checkType(Type type, EClass ruleType) {
			if ( type instanceof Metaclass ) {
				Metaclass bindingType = (Metaclass) type;
				// return m.getKlass() == eclass; // .getName().equals(typeName);
				
				return bindingType.getKlass().isSuperTypeOf(ruleType);
			} else if ( type instanceof CollectionType ) {
				CollectionType ct = (CollectionType) type;
				return checkType(ct.getContainedType(), ruleType);			
			} else if ( type instanceof PrimitiveType ) {
				return false;
			} else if ( type instanceof UnionType ) {
				UnionType unionType = (UnionType) type;
				for (Type t : unionType.getPossibleTypes()) {
					if ( checkType(t, ruleType) ) {
						return true;
					}
				}
				return false;
			}
			throw new UnsupportedOperationException("Type not dealt with yet: " + type);
		}

	
	}

}
