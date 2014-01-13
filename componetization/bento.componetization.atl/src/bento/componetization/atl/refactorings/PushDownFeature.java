package bento.componetization.atl.refactorings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;

import bento.componetization.atl.BaseRefactoring;
import bento.componetization.atl.CallSite;
import bento.componetization.atl.IPruningInfo;
import bento.componetization.atl.IStaticAnalysisInfo;

public class PushDownFeature extends BaseRefactoring {

	private int maxFeatureUses = 1;
	
	public PushDownFeature(IStaticAnalysisInfo analysis, IPruningInfo prunner) {
		super(analysis, prunner);
	}

 	
	@Override
	public boolean match() {
		List<PushDownFeatureMatch> matches = new ArrayList<PushDownFeatureMatch>();
		
		Set<EClass> classes = prunner.getSelectedClasses();
		Set<EStructuralFeature> features = prunner.getSelectedFeatures();
		for (EClass eClass : classes) {
			for(EStructuralFeature f : eClass.getEStructuralFeatures()) {
				if ( features.contains(f) ) {
					Set<CallSite> occurences = findFeatureInCallSites(f);
					if ( occurences != null ) {
						matches.add( new PushDownFeatureMatch(f, occurences) );
					}
				}
			}
		}
	
		return save(matches);
	}
	
	
	private Set<CallSite> findFeatureInCallSites(EStructuralFeature f) {
		HashSet<CallSite> sites = new HashSet<CallSite>();
		for(CallSite site : analysis.getCallSites()) {
			if ( site.getFeature() == f && site.getReceptor() != f.getEContainingClass() ) {
				
				// There is an additional condition, do not select references that which points to
				// the containing class or to a superclass
				if ( f instanceof EReference ) {
					if ( f.getEType() == f.getEContainingClass() || 
						 f.getEContainingClass().getEAllSuperTypes().contains(f.getEType()) ) {
						continue;
					}
				}
				
				sites.add(site);
			}
		}
		
		if ( sites.size() > 0 && sites.size() <= maxFeatureUses )
			return sites;
			
		return null;
	}

	public class PushDownFeatureMatch implements IMatch {

		private Set<CallSite> occurrences;
		private EStructuralFeature feature;

		public PushDownFeatureMatch(EStructuralFeature f, Set<CallSite> occurrences) {
			System.out.println("Found " + occurrences);
			this.feature     = f;
			this.occurrences = occurrences;
		}

		@Override
		public void apply() {
			System.out.println("REFACTORING: Push down feature " + feature.getEContainingClass().getName() + "." + feature.getName());

			EStructuralFeature targetFeature = prunner.getTargetFeature(feature);
		
			for (CallSite site : occurrences) {
				EClass targetClass = prunner.getTargetClass(site.getReceptor());
				
				targetClass.getEStructuralFeatures().add( copyFeature(targetFeature) );
			}
		
			EcoreUtil.remove(targetFeature);
		}
		
		private EStructuralFeature copyFeature(EStructuralFeature targetOriginal) {
			EStructuralFeature copy = EcoreUtil.copy(targetOriginal);
			return copy;
		}
		
	}

	
	
}
