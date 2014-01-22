package bento.componetization.atl;

import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import java.util.HashSet;
import java.util.Set;

import javax.management.RuntimeErrorException;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.IModel;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import atl.metamodel.ATLModel;
import bento.componetization.atl.hints.RemoveAssociationClass;
import bento.componetization.atl.refactorings.IConceptRefactoring;
import bento.componetization.atl.refactorings.PushDownFeature;
import bento.componetization.atl.refactorings.RemoveEmptyClass;

public class ConceptExtractor extends FootprintComputation implements IStaticAnalysisInfo, IMetamodelInfo {
	
	public ConceptExtractor(BasicEMFModel atlTransformation, IModel mm,
			BasicEMFModel typing, String slicedURI) {
		super(atlTransformation, mm, typing, slicedURI);
		// TODO Auto-generated constructor stub

		computeFootprint();
	}
	
	@Override
	public ATLModel getATL() {
		return new ATLModel(atlTransformation.getHandler().getResource());
	}

	public EPackage refactor() {
		// The order matters: In TrafoRunningExample RemoveAssociationClass -> PushDownFeature means
		//                    that generalization is never pushed down
		IConceptRefactoring[] refactorings = new IConceptRefactoring[] {
				new RemoveAssociationClass(this, this),
				new PushDownFeature(this, this),
				new RemoveAssociationClass(this, this),

				// new RemoveEmptyClass(this, this),
				
				// new SpecializeFeatureType(this, this),
				// new RemoveEmptyClass(this)
		};
		
		for (int i = 0; i < refactorings.length; i++) {
			IConceptRefactoring r = refactorings[i];
			
			if ( r.match() ) {
				r.apply();
			}
			
		}
		
		return pkg;
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

	@Override
	public Set<EClass> getImplicitlyUsedTypes() {
		return (Set<EClass>) this.indirectUsedTypes.clone();
	}

	
	// Meta-model info
	
	@Override
	public Set<EClass> getClasses() {
		HashSet<EClass> classes = new HashSet<EClass>();
		TreeIterator<Object> it = EcoreUtil.getAllContents(pkg, false);
		while ( it.hasNext() ) {
			Object o = it.next();
			if ( o instanceof EClass ) 
				classes.add((EClass) o);
		}
		
		return classes;
	}

	@Override
	public Set<EStructuralFeature> getFeatures() {
		HashSet<EStructuralFeature> features = new HashSet<EStructuralFeature>();
		TreeIterator<Object> it = EcoreUtil.getAllContents(pkg, false);
		while ( it.hasNext() ) {
			Object o = it.next();
			if ( o instanceof EStructuralFeature ) 
				features.add((EStructuralFeature) o);
		}
		
		return features;
	}

	@Override
	public ExpressionAnnotation findExpressionAnnotation(EObject expr) {
		for(Object o : this.typing.allObjectsOf(ExpressionAnnotation.class.getSimpleName()) ) {
			ExpressionAnnotation ann = (ExpressionAnnotation) o;
			if ( ann.getExpr() == expr ) {
				return ann;
			}
		}
		
		throw new RuntimeException("Typing for node " + expr + " not found");
	}

}
