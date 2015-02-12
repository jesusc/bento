package bento.componetization.atl.refactorings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import bento.componetization.atl.BaseRefactoring;
import bento.componetization.atl.IMetamodelInfo;
import bento.componetization.atl.IStaticAnalysisInfo;

/**
 * This refactoring changes the type of a reference to a more
 * specific one.
 * 
 * @author jesus
 *
 */
public class SpecializeFeatureType extends BaseRefactoring {

	private int maxFeatureUses = 1;
	
	public SpecializeFeatureType(IStaticAnalysisInfo analysis, IMetamodelInfo metamodel) {
		super(analysis, metamodel);
	}

 	
	@Override
	public boolean match() {
		List<SpecializeFeatureTypeMatch> matches = new ArrayList<SpecializeFeatureTypeMatch>();
		/*
		Set<EClass> explicit   = analysis.getExplicitlyUsedTypes();
		Set<EClass> allSrcClass = prunner.getSelectedClasses();
		Set<EClass> allTgtClass = new HashSet<EClass>();
		
		for (EClass eClass : allSrcClass) {
			allTgtClass.add( prunner.getTargetClass(eClass) );
		}
		
		Set<EStructuralFeature> features = prunner.getSelectedFeatures();
		for (EStructuralFeature eStructuralFeature : features) {
			if ( eStructuralFeature instanceof EReference ) {
				EReference r = (EReference) eStructuralFeature;
				if ( explicit.contains( r.getEType() ) )
					continue;
				
				EClass theSubClass = findMostConcreteSubclass(allTgtClass, prunner.getTargetClass((EClass) r.getEType()));

				if ( theSubClass != null ) {
					matches.add(new SpecializeFeatureTypeMatch((EReference) prunner.getTargetFeature(r), theSubClass));
				}
				
			}
		}
		*/
		return save(matches);
	}


	private EClass findMostConcreteSubclass(Set<EClass> allClasses, EClass type) {
		ArrayList<EClass> directSubclasses = new ArrayList<EClass>();

		for (EClass subclass : allClasses) {
			if ( subclass.getESuperTypes().contains( type ) ) {
				directSubclasses.add(subclass);
			}
		}

		if ( directSubclasses.size() == 1 ) {
			return findMostConcreteSubclass(allClasses, directSubclasses.get(0));
		}
		return type;
	}
	
	public class SpecializeFeatureTypeMatch extends BaseMatch {

		private EClass newFeatureType;
		private EReference feature;

		public SpecializeFeatureTypeMatch(EReference f, EClass newFeatureType) {
			super(SpecializeFeatureType.this);
			this.feature     = f;
			this.newFeatureType = newFeatureType;
		}

		@Override
		public Collection<EClass> getAffectedClasses() {
			ArrayList<EClass> info = new ArrayList<EClass>();
			info.add(feature.getEContainingClass());
			return info;
		}
		
		@Override
		public void apply() {
			if ( feature.getEContainingClass() == null ) {				
				System.out.println("CANNOT APPLY SpecializeFeatureType: " + feature.getName());
				return;
			}
			System.out.println("REFACTORING: Specialize Feature Type " + feature.getEContainingClass().getName() + "." + feature.getName() + " to " + newFeatureType.getName());

			// EStructuralFeature targetFeature = prunner.getTargetFeature(feature);
			// targetFeature.setEType( prunner.getTargetClass(newFeatureType) );

			feature.setEType(newFeatureType);
		}

		@Override
		public boolean coevolutionRequired() {
			return false;
		}

	}

	
	
}
