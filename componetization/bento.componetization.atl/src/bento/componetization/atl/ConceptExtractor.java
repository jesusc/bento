package bento.componetization.atl;

import genericity.compiler.atl.analyser.namespaces.MetamodelNamespace;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
import atl.metamodel.ATL.Helper;
import atl.metamodel.ATL.PatternElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.OclContextDefinition;
import atl.metamodel.OCL.OclModelElement;
import atl.metamodel.OCL.OclType;
import atl.metamodel.OCL.OperationCallExp;
import bento.analyser.footprint.CallSite;
import bento.analyser.footprint.FootprintComputation;
import bento.componetization.atl.hints.RemoveAssociationClass;
import bento.componetization.atl.refactorings.IConceptRefactoring;
import bento.componetization.atl.refactorings.PushDownFeature;
import bento.componetization.atl.refactorings.RemoveEmptyClass;

public class ConceptExtractor extends FootprintComputation implements IStaticAnalysisInfo, IMetamodelInfo {
	
	public ConceptExtractor(ATLModel atlModel, MetamodelNamespace mm,
			BasicEMFModel typing, String slicedURI) {
		super(atlModel, mm, typing, slicedURI);

		computeFootprint();
	}

	/*
	public ConceptExtractor(BasicEMFModel atlTransformation, IModel mm,
			BasicEMFModel typing, String slicedURI) {
		super(atlTransformation, mm, typing, slicedURI);
		// TODO Auto-generated constructor stub

		computeFootprint();
	}
	*/

	public MetamodelNamespace refactor() {
		// The order matters: In TrafoRunningExample RemoveAssociationClass -> PushDownFeature means
		//                    that generalization is never pushed down
		IConceptRefactoring[] refactorings = new IConceptRefactoring[] {
				// new RemoveAssociationClass(this, this),
				// new PushDownFeature(this, this),
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
		
		return mm;
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
		/*
		TreeIterator<Object> it = EcoreUtil.getAllContents(pkg, false);
		while ( it.hasNext() ) {
			Object o = it.next();
			if ( o instanceof EClass ) 
				classes.add((EClass) o);
		}
		*/
		classes.addAll(mm.getAllClasses());
		
		return classes;
	}

	@Override
	public Set<EStructuralFeature> getFeatures() {
		HashSet<EStructuralFeature> features = new HashSet<EStructuralFeature>();
		List<EClass> classes = mm.getAllClasses();
		for (EClass eClass : classes) {
			for (EStructuralFeature f : eClass.getEStructuralFeatures()) {
				features.add(f);
			}
		}
		/*
		TreeIterator<Object> it = EcoreUtil.getAllContents(pkg, false);
		while ( it.hasNext() ) {
			Object o = it.next();
			if ( o instanceof EStructuralFeature ) 
				features.add((EStructuralFeature) o);
		}
		*/
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

	@Override
	public List<OperationCallExp> getAllInstancesUsages(EClass clazz) {
		ArrayList<OperationCallExp> result = new ArrayList<OperationCallExp>();

		List<? extends OperationCallExp> elements = getATL().allObjectsOf(OperationCallExp.class);
		for (OperationCallExp op : elements) {
			if ( op.getOperationName().equals("allInstances") ) {
				if ( op.getSource() instanceof OclModelElement  &&
					 ((OclModelElement) op.getSource()).getName().equals(clazz.getName()) ) {
			
					result.add(op);
				}
			}
		}
		
		return result;
 	}

	@Override
	public HashSet<Rule> getRuleUsages(EClass clazz) {
		HashSet<Rule> result = new HashSet<Rule>();

		List<? extends PatternElement> elements = getATL().allObjectsOf(PatternElement.class);
		// Improve to consider subtypes...
		for (PatternElement patternElement : elements) {
			if ( checkCompatibility(patternElement.getType(), clazz) ) {
				Rule r = (Rule) patternElement.container_().container_();
				result.add(r);
			}
		}
		
		return result;
 	}

	@Override
	public List<Helper> getHelperUsages(EClass clazz) {
		ArrayList<Helper> result = new ArrayList<Helper>();

		List<? extends Helper> elements = getATL().allObjectsOf(Helper.class);
		for (Helper h : elements) {
			OclContextDefinition context = h.getDefinition().getContext_();
			if ( context == null )
				continue;
			
			if ( checkCompatibility(context.getContext_(), clazz) ) {
				result.add(h);
			}
		}
		
		return result;
		
	}


	/** TODO: CHECK SUBTYPES */
	private boolean checkCompatibility(OclType t, EClass clazz) {
		return t.getName().equals(clazz.getName());
	}
	
}
