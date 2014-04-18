package genericity.compiler.atl.csp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

import atl.metamodel.OCL.OclExpression;
import bento.analyser.footprint.IEffectiveMetamodelData;

import genericity.compiler.atl.analyser.Analyser;
import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.analyser.TypingModel;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.annotations.ContextHelperAnn;

public class ErrorSlice implements IEffectiveMetamodelData {
	private HashSet<EClass> explicitTypes = new HashSet<EClass>();
	private HashSet<EStructuralFeature> explicitFeatures = new HashSet<EStructuralFeature>();

	private HashMap<String, java.util.List<ContextHelperAnn>> helpers = 
			new HashMap<String, java.util.List<ContextHelperAnn>>();
	
	
	private Analyser	analyser;
	private String	metamodelName;
	
	public ErrorSlice(Analyser analyser, String metamodelName) {
		this.analyser = analyser;
		this.metamodelName = metamodelName;
	}

	public void addExplicitMetaclass(Metaclass type) {
		if ( type.getModel().getName().equals(metamodelName) )
			explicitTypes.add(type.getKlass());
	}
	
	public TypingModel getTypingModel() {
		return analyser.getTyping();
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

	public void addHelper(ContextHelperAnn contextHelperAnn) {
		String ctxTypeName = TypeUtils.getTypeName(contextHelperAnn.getContextType());
		
		if ( ! helpers.containsKey(ctxTypeName) ) {
			helpers.put(ctxTypeName, new ArrayList<ContextHelperAnn>());
		}
		
		helpers.get(ctxTypeName).add(contextHelperAnn);		
	}
	
	public HashMap<String, java.util.List<ContextHelperAnn>> getHelpers() {
		return helpers;
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
			
			for(ContextHelperAnn ctx : helpers.get(className)) {
				ann.getDetails().put("def " + ctx.getName(), genUSEOperation(ctx));
			}
			result.add(ann);
		}
		
		return result;
	}

	private String genUSEOperation(ContextHelperAnn ctx) {
		String s = ctx.getName() + "(";
		for(int i = 0; i < ctx.getNames().size(); i++) {
			s += ctx.getNames().get(i) + " : " + TypeUtils.getTypeName(ctx.getArguments().get(i));
			if ( i + 1 < ctx.getNames().size() ) {
				s += ","; 
			}
		}
		s += ")";
		s += " : " + TypeUtils.getTypeName(ctx.getReturnType()) + " = ";
		
		OclExpression body = (OclExpression) analyser.getATLModel().findWrapper(ctx.getExpr().getExpr());
		s += OclGenerator.gen(body); 
		return s;
	}
}
