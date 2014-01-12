package bento.componetization.atl.hints;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import bento.componetization.atl.BaseRefactoring;
import bento.componetization.atl.CallSite;
import bento.componetization.atl.IPruningInfo;
import bento.componetization.atl.IStaticAnalysisInfo;
import bento.componetization.atl.refactorings.IMatch;
import bento.componetization.atl.refactorings.PushDownFeature.PushDownFeatureMatch;

/**
 * This hints indicates the removal of a class that is between two classes
 * acting as an association. 
 * 
 * An intermediate a class typically includes a reference to navigate to the
 * associated class ("navigation reference"), and we assume that it is referenced
 * by a containment reference only once. For example, Class <>--> Generalization --> Class
 * 
 * To apply the refactoring, the association class must not be used explicitly
 * in the transformation, and no feature must be used except the "navigation reference".
 * 
 * The template must be rewritten to replace navigations through the intermediate
 * class. For example,
 * <pre>
 * 		aClass.generalizations->collect(g | g.general)
 * 		=>
 * 		aClass.superclasses
 * </pre>
 * 
 * @author jesus
 *
 */
public class RemoveAssociationClass extends BaseRefactoring {

	public RemoveAssociationClass(IStaticAnalysisInfo analysis, IPruningInfo prunner) {
		super(analysis, prunner);
	}

	@Override
	public boolean match() {
		List<IMatch> matches = new ArrayList<IMatch>();
		
		Set<EClass> classes = prunner.getSelectedClasses();
		Set<EStructuralFeature> features = prunner.getSelectedFeatures();
		for (EClass intermediate : classes) {
			EReference pointingFeature = null;
			
			for(EStructuralFeature f : features) {
				if ( f instanceof EReference && f.getEType() == intermediate ) {
					// The intermediate class cannot be pointed by
					// more than one class.
					if ( pointingFeature != null ) {
						pointingFeature = null;
						break;
					}
					pointingFeature = (EReference) f;
				}
			}
			
			if ( pointingFeature != null && pointingFeature.isContainment() )  {
				EClass prunnedClass = prunner.getTargetClass(intermediate);
				if ( prunnedClass.getEReferences().size() == 1 &&   
					 prunnedClass.getEAttributes().size() == 0 ) {
					
					System.out.println("FOUND FOR " + intermediate.getName());
					
				}
			}
			
		}
	
		
		
		
		return save(matches);
	}

}
