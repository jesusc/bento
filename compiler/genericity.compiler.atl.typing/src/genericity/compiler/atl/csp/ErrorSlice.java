package genericity.compiler.atl.csp;

import genericity.compiler.atl.analyser.Analyser;
import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.analyser.TypingModel;
import genericity.typing.atl_types.BooleanType;
import genericity.typing.atl_types.CollectionType;
import genericity.typing.atl_types.EnumType;
import genericity.typing.atl_types.FloatType;
import genericity.typing.atl_types.IntegerType;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.SequenceType;
import genericity.typing.atl_types.SetType;
import genericity.typing.atl_types.StringType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.Unknown;
import genericity.typing.atl_types.annotations.ContextHelperAnn;
import genericity.typing.atl_types.annotations.HelperAnn;
import genericity.typing.atl_types.annotations.ModuleHelperAnn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

import atl.metamodel.ATLModel;
import atl.metamodel.OCL.OclExpression;
import bento.analyser.footprint.IEffectiveMetamodelData;

public class ErrorSlice implements IEffectiveMetamodelData {
	private HashSet<EClass> explicitTypes = new HashSet<EClass>();
	private HashSet<EStructuralFeature> explicitFeatures = new HashSet<EStructuralFeature>();

	private HashMap<String, java.util.Set<HelperAnn>> helpers = 
			new HashMap<String, java.util.Set<HelperAnn>>();
	
	
	private Analyser	analyser;
	private String	metamodelName;
	
	public ErrorSlice(Analyser analyser, String metamodelName) {
		if ( analyser == null ) throw new IllegalArgumentException();
		this.analyser = analyser;
		this.metamodelName = metamodelName;
		
		// Ugly hack
		EClass thisModuleClass = EcoreFactory.eINSTANCE.createEClass();
		thisModuleClass.setName(Analyser.USE_THIS_MODULE_CLASS);
		addMetaclassNeededInError(thisModuleClass);
	}

	/*
	private HashSet<OclExpression> alreadyTraversed = new HashSet<OclExpression>();
	public void markTraversed(OclExpression expr) {
		alreadyTraversed.add(expr);
	}
	
	public boolean alreadyTraversed(OclExpression expr) {
		return alreadyTraversed.contains(expr);
	}
	*/


	public void addExplicitMetaclass(Metaclass type) {
		if ( type.getModel().getName().equals(metamodelName) )
			explicitTypes.add(type.getKlass());
	}
	
	public void addMetaclassNeededInError(EClass eClass) {
		explicitTypes.add(eClass);
	}
	
	public TypingModel getTypingModel() {
		return analyser.getTyping();
	}

	public ATLModel getATLModel() {
		return analyser.getATLModel();
	}
	
	public void addExplicitFeature(EStructuralFeature f ) {
		explicitFeatures.add(f);
	}

	@Override
	public Set<EClass> getClasses() {
		return Collections.unmodifiableSet(this.explicitTypes);
	}

	@Override
	public Set<EStructuralFeature> getFeatures() {
		return Collections.unmodifiableSet(this.explicitFeatures);
	}

	public boolean addHelper(ContextHelperAnn contextHelperAnn) {
		String ctxTypeName = TypeUtils.getTypeName(contextHelperAnn.getContextType());
		
		return addHelperAux(contextHelperAnn, ctxTypeName);
	}
	
	public boolean addHelper(ModuleHelperAnn moduleHelper) {
		return addHelperAux(moduleHelper, Analyser.USE_THIS_MODULE_CLASS);
	}
	
	private boolean addHelperAux(HelperAnn helper, String ctxTypeName) {
		if ( ! helpers.containsKey(ctxTypeName) ) {
			helpers.put(ctxTypeName, new HashSet<HelperAnn>());
		}
		
		return helpers.get(ctxTypeName).add(helper);	
	}
	
	/**
	 * The implementation of this method generates helpers in USE format.
	 */
	@Override
	public Collection<EAnnotation> getPackageAnnotations() {
		ArrayList<EAnnotation> result = new ArrayList<EAnnotation>();
		for(String className : helpers.keySet()) {
			EAnnotation ann = EcoreFactory.eINSTANCE.createEAnnotation();
			ann.setSource("operations: " + className);
			
			ann.getDetails().put("class", className);
			
			for(HelperAnn ctx : helpers.get(className)) {
				ann.getDetails().put("def " + ctx.getName(), genUSEOperation(ctx, className));
			}
			result.add(ann);
		}
		
		return result;
	}

	private String genUSEOperation(HelperAnn ctx, String className) {
		String s = ctx.getName() + "(";
		
		// The first parameter is always the ThisModule object */
		s += "thisModule : " + Analyser.USE_THIS_MODULE_CLASS;
		
		for(int i = 0; i < ctx.getNames().size(); i++) {
			s += "," + ctx.getNames().get(i) + " : " + TypeUtils.getTypeName(ctx.getArguments().get(i));
//			if ( i + 1 < ctx.getNames().size() ) {
//				s += ","; 
//			}
		}
		s += ")";
		
		if ( ctx.getReturnType() instanceof EnumType ) {
			s += " : " + "Integer" + " = ";
		} else {
			s += " : " + toUSETypeName(ctx.getReturnType()) + " = ";
		}

		OclExpression body = (OclExpression) analyser.getATLModel().findWrapper(ctx.getExpr().getExpr());
		s += OclGenerator.gen(body, analyser); 
		return s;
	}

	private String toUSETypeName(Type t) {
		if (t instanceof Metaclass) {
			return ((Metaclass) t).getName();
		} else if (t instanceof StringType) {
			return "String";
		} else if (t instanceof BooleanType) {
			return "Boolean";
		} else if (t instanceof IntegerType) {
			return "Integer";
		} else if (t instanceof FloatType) {
			return "Float";
		} else if (t instanceof Unknown) {
			return "OclAny";
		} else if (t instanceof CollectionType) {
			String typeName = null;
			if (t instanceof SequenceType)
				typeName = "Set"; //"Sequence";
			if (t instanceof SetType)
				typeName = "Set";

			return typeName + "("
					+ toUSETypeName(((CollectionType) t).getContainedType())
					+ ")";
		}
		throw new UnsupportedOperationException(t.getClass().getName());
	}

	
}
