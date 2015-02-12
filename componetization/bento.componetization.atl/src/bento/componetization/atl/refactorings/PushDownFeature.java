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

/**
 * Moves a feature to a subclass if it is used only by N subclasses,
 * where is a parameter of the refactoring.
 * 
 * @author jesus
 *
 */
public class PushDownFeature extends BaseRefactoring {

	private int maxFeatureUses = 1;
	
	public PushDownFeature(IStaticAnalysisInfo analysis, IMetamodelInfo metamodel) {
		super(analysis, metamodel);
	}

 	
	@Override
	public boolean match() {
		List<PushDownFeatureMatch> matches = new ArrayList<PushDownFeatureMatch>();
		
		Set<EClass> classes = metamodel.getClasses();
		Set<EStructuralFeature> features = metamodel.getFeatures();
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

	public class PushDownFeatureMatch extends BaseMatch {

		private Set<CallSite> occurrences;
		private EStructuralFeature feature;

		public PushDownFeatureMatch(EStructuralFeature f, Set<CallSite> occurrences) {
			super(PushDownFeature.this);
			this.feature     = f;
			this.occurrences = occurrences;
		}

		@Override
		public Collection<EClass> getAffectedClasses() {
			ArrayList<EClass> info = new ArrayList<EClass>();
			info.add(feature.getEContainingClass());
			return info;
		}
		
		@Override
		public void apply() {
			System.out.println("REFACTORING: Push down feature " + feature.getEContainingClass().getName() + "." + feature.getName());

		
			for (CallSite site : occurrences) {
				EClass siteClass = site.getReceptor();
				
				siteClass.getEStructuralFeatures().add( copyFeature(feature) );
			}
		
			EcoreUtil.delete(feature);
		}
		
		private EStructuralFeature copyFeature(EStructuralFeature targetOriginal) {
			EStructuralFeature copy = EcoreUtil.copy(targetOriginal);
			return copy;
		}
		
		@Override
		public boolean coevolutionRequired() {
			return false;
		}
		
	}

	
	
}
