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
import genericity.typing.atl_types.Unknown;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

public class Class2Reference {

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
		
		eclectic.class2reference transformation = new eclectic.class2reference();

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


		public Boolean hasType(String typeName) {
			Type type = atlType();
			if ( type instanceof Metaclass ) {
				Metaclass m = (Metaclass) type;
				return m.getKlass().getName().equals(typeName);
			} else if ( type instanceof PrimitiveType ) {
				return false;
			}
			throw new UnsupportedOperationException();
		}
		
		public Type atlType(){
			List<EObject> annotations = typingModel.allObjectsOf("ExpressionAnnotation");
			for (EObject eObject : annotations) {
				ExpressionAnnotation ann = (ExpressionAnnotation) eObject;
				if ( ann.getExpr() == object ) {
					return ann.getType();
				}
			}
			throw new IllegalStateException("No type assigned to " + object);
		}

		public String typeName (){
			Type t = atlType();
			if ( t instanceof Metaclass ) {
				return ((Metaclass) t).getName();
			} else if ( t instanceof Unknown ) {
				return "unknown!!!!";
			} else {
				return t.eClass().getName(); // It is almost like returning "false"
			}
		}
		
		public Boolean is_normal_feature_binding() {
			return ((EObject) object).eContainer() instanceof BindingModel;
		}

		
	}

	/*
	public static class BindingData {
		public String boundMetamodelName() {
			return BOUND_METAMODEL_NAME;
		}

		public String concreteMetamodelName() {
			return TARGET_METAMODEL_NAME;
		}
	}
	*/
}
