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
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;

import eclectic.callexpr;
import eclectic.composed_genericity;
import eclectic.ocl2ocl;
import eclectic.rewrite_class1;
import gbind.dsl.BindingModel;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.PrimitiveType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.UnionType;
import genericity.typing.atl_types.Unknown;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

public class ClassMerge {

	BasicEMFModel typingModel = null;
	
	// TODO: Parameterize this
	// static String BOUND_METAMODEL_NAME = "UML";
	// static String TARGET_METAMODEL_NAME = "Simple";
	
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

	
	public void launch(BasicEMFModel atlTransformation, BasicEMFModel bindingModel, BasicEMFModel typ, BindingData data) throws IOException {
		this.typingModel = typ;
		
		eclectic.class_merge transformation = new eclectic.class_merge();

		Util.registerResourceFactory();
		ModelManager manager = new ModelManager();
		EMFLoader loader = new EMFLoader(new JavaListConverter());
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

	private static String withDir(String path) {
		return "." + File.separator + path;
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

		
		public Boolean conflict_with(Object modelElement) {
			String typeName1 = (String) model.getFeature(object, "name");
			String typeName2 = (String) model.getFeature(modelElement, "name");
			
			Metaclass m1 = (Metaclass) atlType(object);
			Metaclass m2 = (Metaclass) atlType(modelElement);
			
			EClass e1 = m1.getKlass();
			EClass e2 = m2.getKlass();
				
			
			// System.out.println(typeName1 + " - " + typeName2);
			// System.out.println(e1.isSuperTypeOf(e2));
			
			// System.out.println(e1);
			// System.out.println(e2);
			
			return e1.isSuperTypeOf(e2);
		}
		
		// TODO: RELLENAR
	}

}
