package bento.componetization.atl.hints;

import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import atl.metamodel.ATLModel;
import atl.metamodel.ATLModelBaseObject;
import atl.metamodel.OCL.NavigationOrAttributeCallExp;
import atl.metamodel.OCL.OclExpression;
import bento.componetization.atl.BaseRefactoring;
import bento.componetization.atl.IMetamodelInfo;
import bento.componetization.atl.IStaticAnalysisInfo;
import bento.componetization.atl.refactorings.IMatch;

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

	public RemoveAssociationClass(IStaticAnalysisInfo analysis, IMetamodelInfo metamodel) {
		super(analysis, metamodel);
	}

	@Override
	public boolean match() {
		List<IMatch> matches = new ArrayList<IMatch>();
		
		Set<EClass> classes = metamodel.getClasses();
		Set<EStructuralFeature> features = metamodel.getFeatures();
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
				if ( intermediate.getEReferences().size() == 1 &&   
					 intermediate.getEAttributes().size() == 0 ) {

					matches.add( new RemoveAssociationClassMatch( 
							intermediate, pointingFeature) );
					// System.out.println("FOUND FOR " + intermediate.getName());					
				}
			}
			
			// TODO: Additional checks: no subclasses
			
		}
		
		
		return save(matches);
	}

	public class RemoveAssociationClassMatch implements IMatch {

		private EClass intermediateClass;
		private EReference pointingFeature;

		/**
		 * Takes a prunned class and a feature pointing to such class.
		 * The prunned class is assumed to have only one reference.
		 * 
		 * @param prunnedClass
		 * @param targetFeature
		 */
		public RemoveAssociationClassMatch(EClass intermediateClass,
				EReference pointingFeature) {
			
			this.intermediateClass  = intermediateClass;
			this.pointingFeature = pointingFeature;
		}

		@Override
		public Collection<EClass> getAffectedClasses() {
			ArrayList<EClass> info = new ArrayList<EClass>();
			info.add(intermediateClass);
			return info;
		}
		
		@Override
		public void apply() {
			if ( ! evolveTransformation() ) {
				System.out.println("REFACTORING (NOT APPLIED): Remove association class " + intermediateClass.getName());
			}
			
			System.out.println("REFACTORING: Remove association class " + intermediateClass.getName());

			pointingFeature.setContainment(false);
			pointingFeature.setEType( intermediateClass.getEReferences().get(0).getEType()  );
			EcoreUtil.delete(intermediateClass);
		}

		private boolean evolveTransformation() {
			ATLModel atlModel = analysis.getATL();
			EReference intermediateReference = intermediateClass.getEReferences().get(0);
			EClass targetType = intermediateReference.getEReferenceType();
			
			
			List<? extends NavigationOrAttributeCallExp> navs = atlModel.allObjectsOf(NavigationOrAttributeCallExp.class);
			
			for (NavigationOrAttributeCallExp nav : navs) {
				ExpressionAnnotation ann = analysis.findExpressionAnnotation(nav.original_());
				if ( ann.getUsedFeature() == pointingFeature ) {
					findClosingExpression(nav, targetType);
				}
			}
			
			return false;
		}

		private void findClosingExpression(NavigationOrAttributeCallExp nav, EClass targetType) {
			ATLModelBaseObject container = nav.container_();
			while ( container != null && container instanceof OclExpression ) {
				OclExpression expr = (OclExpression) container;
				
				ExpressionAnnotation ann = analysis.findExpressionAnnotation(expr.original_());
				
				System.out.println(expr.original_());
				System.out.println(ann.getType());
				
				container = expr.container_();
			}
		}

	}
}
