package bento.componetization.atl.hints;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
			if ( analysis.getExplicitlyUsedTypes().contains(intermediate) ) {
				continue;
			}

			
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

					System.out.println(pointingFeature);
					System.out.println((EReference) prunner.getTargetFeature(pointingFeature));
					matches.add( new RemoveAssociationClassMatch( 
							prunnedClass, 
							(EReference) prunner.getTargetFeature(pointingFeature) ) );
					// System.out.println("FOUND FOR " + intermediate.getName());					
				}
			}
			
			// TODO: Additional checks: no subclasses
			
		}
	
		return save(matches);
	}

	public class RemoveAssociationClassMatch implements IMatch {

		private EClass prunnedClass;
		private EReference pointingFeature;

		/**
		 * Takes a prunned class and a feature pointing to such class.
		 * The prunned class is assumed to have only one reference.
		 * 
		 * @param prunnedClass
		 * @param targetFeature
		 */
		public RemoveAssociationClassMatch(EClass prunnedClass,
				EReference pointingFeature) {
			
			this.prunnedClass  = prunnedClass;
			this.pointingFeature = pointingFeature;
		}

		@Override
		public void apply() {
			System.out.println("REFACTORING: Remove association class " + prunnedClass.getName());

			pointingFeature.setContainment(false);
			pointingFeature.setEType( prunnedClass.getEReferences().get(0).getEType()  );
			System.out.println(pointingFeature.getEType().getName());
			EcoreUtil.delete(prunnedClass);
		}
	}
}
