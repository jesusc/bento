package bento.componetization.atl;

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

public class PullDownFeature implements IConceptRefactoring {

	private int maxFeatureUses = 1;
	
	private IStaticAnalysisInfo analysis;
	private IPruningInfo pruner;

	private List<? extends IMatch> storedMatches = null;

	public PullDownFeature(IStaticAnalysisInfo analysis, IPruningInfo pruner) {
		this.analysis = analysis;
		this.pruner   = pruner;
	}
 	
	@Override
	public boolean match() {
		List<PullDownFeatureMatch> matches = new ArrayList<PullDownFeatureMatch>();
		
		Set<EClass> classes = pruner.getSelectedClasses();
		Set<EStructuralFeature> features = pruner.getSelectedFeatures();
		for (EClass eClass : classes) {
			for(EStructuralFeature f : eClass.getEStructuralFeatures()) {
				if ( features.contains(f) ) {
					Set<CallSite> occurences = findFeatureInCallSites(f);
					if ( occurences != null ) {
						matches.add( new PullDownFeatureMatch(f, occurences) );
					}
				}
			}
		}
	
		return save(matches);
	}
	
	private boolean save(List<? extends IMatch> matches) {
		if ( matches.size() == 0 )
			return false;
		
		this.storedMatches  = matches;
		return true;
	}

	@Override
	public void apply() {
		if ( storedMatches == null ) throw new IllegalStateException();
		
		for (IMatch m : storedMatches) {
			m.apply();
		}
		
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

	public class PullDownFeatureMatch implements IMatch {

		private Set<CallSite> occurrences;
		private EStructuralFeature feature;

		public PullDownFeatureMatch(EStructuralFeature f, Set<CallSite> occurrences) {
			System.out.println("Found " + occurrences);
			this.feature     = f;
			this.occurrences = occurrences;
		}

		@Override
		public void apply() {
			EStructuralFeature targetFeature = pruner.getTargetFeature(feature);
		
			for (CallSite site : occurrences) {
				EClass targetClass = pruner.getTargetClass(site.getReceptor());
				
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
