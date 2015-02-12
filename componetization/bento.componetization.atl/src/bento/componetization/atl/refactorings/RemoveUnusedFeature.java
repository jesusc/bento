package bento.componetization.atl.refactorings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import anatlyzer.footprint.CallSite;
import bento.componetization.atl.BaseRefactoring;
import bento.componetization.atl.IMetamodelInfo;
import bento.componetization.atl.IStaticAnalysisInfo;
import bento.componetization.atl.refactorings.PushDownFeature.PushDownFeatureMatch;

/**
 * Removes a feature which is never explicitly used.
 * This is typically needed as a form of "repruning".
 * 
 * @author jesus
 *
 */
public class RemoveUnusedFeature extends BaseRefactoring {

	public RemoveUnusedFeature(IStaticAnalysisInfo analysis, IMetamodelInfo metamodel) {
		super(analysis, metamodel);
	}

 	
	@Override
	public boolean match() {
		List<RemoveUnusedFeatureMatch> matches = new ArrayList<RemoveUnusedFeatureMatch>();
		
		Set<EStructuralFeature> features = metamodel.getFeatures();
		for(EStructuralFeature f : features) {
			if ( ! analysis.getUsedFeatures().contains(f) ) {
				matches.add( new RemoveUnusedFeatureMatch(f) );
			}
		}
	
		return save(matches);
	}
	
	
	public class RemoveUnusedFeatureMatch extends BaseMatch {

		private EStructuralFeature feature;

		public RemoveUnusedFeatureMatch(EStructuralFeature f) {
			super(RemoveUnusedFeature.this);
			this.feature     = f;
		}

		@Override
		public Collection<EClass> getAffectedClasses() {
			ArrayList<EClass> info = new ArrayList<EClass>();
			info.add(feature.getEContainingClass());
			return info;
		}
		
		@Override
		public void apply() {
			System.out.println("REFACTORING: Remove unused feature " + feature.getEContainingClass().getName() + "." + feature.getName());
		
			EcoreUtil.delete(feature);
		}
		
		@Override
		public boolean coevolutionRequired() {
			return false;
		}
		
	}

	
	
}
