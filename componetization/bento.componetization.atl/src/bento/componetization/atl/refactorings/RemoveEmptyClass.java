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
import bento.componetization.atl.IPruningInfo;
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

	public RemoveEmptyClass(IStaticAnalysisInfo analysis, IPruningInfo prunner) {
		super(analysis, prunner);
	}

	@Override
	public boolean match() {
		List<IMatch> matches = new ArrayList<IMatch>();
		
		Set<EClass> classes = prunner.getSelectedClasses();
		for (EClass srcClass : classes) {
			EClass tgtClass = prunner.getTargetClass(srcClass);
			if ( tgtClass.getEStructuralFeatures().size() == 0 ) {
				if ( analysis.getExplicitlyUsedTypes().contains(srcClass) )
					continue;
				
				
				IMatch m = checkMatchType(srcClass, tgtClass);
				if ( m != null )
					matches.add(m);
			}
		
		}
		
		return save(matches);
	}

	private IMatch checkMatchType(EClass srcClass, EClass tgtClass) {
		List<EReference> pointers = new ArrayList<EReference>();
		
		// This is an indirect way of getting all created target features 
		// (through the original source)
		for(EStructuralFeature f : prunner.getSelectedFeatures()) {
			if ( f instanceof EReference ) {
				EReference r = (EReference) prunner.getTargetFeature(f);
				if ( r.getEReferenceType() == tgtClass ) {
					pointers.add(r);
				}
			}
		}

		if ( pointers.size() == 0 )
			return new RemoveEmptyClassMatch_NoPointer(tgtClass);
		
		/*
		if ( pointers.size() <= maxPointersToEmptyClass ) 
			return new RemoveEmptyClassMatch_Pointer(tgtClass, pointers);
		*/
		
		return null;
	}

		
	public class RemoveEmptyClassMatch_NoPointer implements IMatch {
		private EClass tgtClass;


		public RemoveEmptyClassMatch_NoPointer(EClass tgtClass) {
			this.tgtClass = tgtClass;
		}

		
		@Override
		public void apply() {
			System.out.println("REFACTORING: Remove empty class " + tgtClass.getName());

			EcoreUtil.delete(tgtClass);
			// EcoreUtil.remove(tgtClass);
			// prunner.removeClass(tgtClass);
		
		}
	}	
}
