package bento.componetization.atl;

import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import java.beans.Expression;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ConceptExtractor extends MetamodelPrunner implements IStaticAnalysisInfo, IPruningInfo {
	
	public ConceptExtractor(BasicEMFModel atlTransformation, BasicEMFModel mm,
			BasicEMFModel typing, String slicedURI) {
		super(atlTransformation, mm, typing, slicedURI);
		// TODO Auto-generated constructor stub
	}

	public void refactor() {
		IConceptRefactoring[] refactorings = new IConceptRefactoring[] {
				new PushDownFeature(this, this),
				new RemoveEmptyClass(this, this)
		};
		
		for (int i = 0; i < refactorings.length; i++) {
			IConceptRefactoring r = refactorings[i];
			
			if ( r.match() ) {
				r.apply();
			}
			
		}
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public Set<CallSite> getCallSites() {
		return (Set<CallSite>) this.callSites.clone();
	}


	@Override
	@SuppressWarnings("unchecked")
	public Set<EClass> getExplicitlyUsedTypes() {
		return (Set<EClass>) this.directUsedTypes.clone();
	}
	
	//
	// IPruningInfo
	//
	
	
	@Override
	public Set<EClass> getSelectedClasses() { return traceClass.keySet(); }

	@Override
	public Set<EStructuralFeature> getSelectedFeatures() { return traceFeature.keySet(); };

	@Override
	public EClass getTargetClass(EClass klass) { return traceClass.get(klass); }

	@Override
	public EStructuralFeature getTargetFeature(EStructuralFeature feature) { return traceFeature.get(feature); }
	



//	private void fillFeatures(HashSet<EClass> usedTypes) {
//	List<EObject> annotations = typing.allObjectsOf(ExpressionAnnotation.class.getSimpleName());
//	HashSet<EStructuralFeature> features = new HashSet<EStructuralFeature>();
//	
//	for (EObject eObject : annotations) {
//		ExpressionAnnotation ann = (ExpressionAnnotation) eObject;
//		for (EClass eClass : usedTypes) {
//			if ( ann.getType() instanceof Metaclass && ((Metaclass) ann.getType()).getKlass() == eClass ) {
//				
//				if ( ann.getUsedFeature() != null && ! features.contains(ann.getUsedFeature() )) {
//				
//					features.add((EStructuralFeature) ann.getUsedFeature());
//					
//					// This is not fine actually, because two classes share the same feature through
//					// some supertype...
//					copyFeature(((Metaclass) ann.getType()).getKlass(), (EStructuralFeature) ann.getUsedFeature());
//				}
//				
//			}
//		}
//	}
//
//	// If f.getEContainingClass is used, the effect is to re-create the
//	// whole inheritance hierarchy
//	/*
//	for (EStructuralFeature f : features) {
//		copyFeature(f.getEContainingClass(), f);
//	}
//	*/
////}

}
