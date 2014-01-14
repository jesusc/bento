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
import bento.componetization.atl.IMetamodelInfo;
import bento.componetization.atl.IStaticAnalysisInfo;
import bento.componetization.atl.refactorings.PushDownFeature.PushDownFeatureMatch;

/**
 * This refactoring remove empty classes in an inheritance hierarchy,
 * taking into account that classes explicitly named in the transformation
 * cannot be removed.
 * 
 * TODO: So far it only removes empty top superclasses because
 *       the pruning algorithm already removes intermediate empty
 *       superclasses, but this may probably needs to be changed.
 * 
 * @author jesus
 *
 */
public class RemoveEmptyClass extends BaseRefactoring {

	public RemoveEmptyClass(IStaticAnalysisInfo analysis, IMetamodelInfo metamodel) {
		super(analysis, metamodel);
	}

	@Override
	public boolean match() {
		List<IMatch> matches = new ArrayList<IMatch>();

		Set<EClass> classes = metamodel.getClasses();
		for (EClass eClass : classes) {
			if ( eClass.getEStructuralFeatures().size() == 0 ) {
				if ( analysis.getExplicitlyUsedTypes().contains(eClass) )
					continue;
								
				IMatch m = checkMatchType(eClass);
				if ( m != null )
					matches.add(m);
			}
		
		}
		
		return save(matches);
	}

	private IMatch checkMatchType(EClass eClass) {
		List<EReference> pointers = new ArrayList<EReference>();
		
		for(EStructuralFeature f : metamodel.getFeatures()) {
			if ( f instanceof EReference ) {
				EReference r = (EReference) f;
				if ( r.getEReferenceType() == eClass ) {
					pointers.add(r);
				}
			}
		}

		if ( pointers.size() == 0 )
			return new RemoveEmptyClassMatch_NoPointer(eClass);
		
		//if ( pointers.size() <= maxPointersToEmptyClass ) 
		//	return new RemoveEmptyClassMatch_Pointer(tgtClass, pointers);
		
		
		return null;
	}

		
	public class RemoveEmptyClassMatch_NoPointer implements IMatch {
		private EClass eClass;


		public RemoveEmptyClassMatch_NoPointer(EClass eClass) {
			this.eClass = eClass;
		}

		
		@Override
		public void apply() {
			System.out.println("REFACTORING: Remove empty class " + eClass.getName());
			
			Set<EClass> classes = metamodel.getClasses();
			for (EClass possibleSubclass : classes) {
				if ( possibleSubclass.getESuperTypes().contains(eClass) ) {
					possibleSubclass.getESuperTypes().remove(eClass);
					for(EClass superclass : eClass.getESuperTypes() ) {
						possibleSubclass.getESuperTypes().add(superclass);
					}
				}
			}
			
			EcoreUtil.delete(eClass, true);
			// EcoreUtil.remove(tgtClass);
			// prunner.removeClass(tgtClass);
		
		}
	}	
}
