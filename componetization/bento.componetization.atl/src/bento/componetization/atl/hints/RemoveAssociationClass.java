package bento.componetization.atl.hints;

import genericity.typing.atl_types.Metaclass;
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
import atl.metamodel.OCL.CollectionOperationCallExp;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.NavigationOrAttributeCallExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.PropertyCallExp;
import atl.metamodel.OCL.VariableExp;
import bento.componetization.atl.BaseRefactoring;
import bento.componetization.atl.IMetamodelInfo;
import bento.componetization.atl.IStaticAnalysisInfo;
import bento.componetization.atl.hints.RemoveAssociationClass.RemoveAssociationClassMatch;
import bento.componetization.atl.refactorings.IMatch;

/**
 * This hints indicates the removal of a class that is between two classes
 * acting as an association.
 * 
 * An intermediate a class typically includes a reference to navigate to the
 * associated class ("navigation reference"), and we assume that it is
 * referenced by a containment reference only once. For example, Class <>-->
 * Generalization --> Class
 * 
 * To apply the refactoring, the association class must not be used explicitly
 * in the transformation, and no feature must be used except the
 * "navigation reference".
 * 
 * The template must be rewritten to replace navigations through the
 * intermediate class. For example,
 * 
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
			if (analysis.getExplicitlyUsedTypes().contains(intermediate)) {
				continue;
			}

			EReference pointingFeature = null;

			for (EStructuralFeature f : features) {
				if (f instanceof EReference && f.getEType() == intermediate) {
					// The intermediate class cannot be pointed by
					// more than one class.
					if (pointingFeature != null) {
						pointingFeature = null;
						break;
					}
					pointingFeature = (EReference) f;
				}
			}

			if (pointingFeature != null && pointingFeature.isContainment()) {
				if (intermediate.getEReferences().size() == 1 && intermediate.getEAttributes().size() == 0) {

					RemoveAssociationClassMatch match = new RemoveAssociationClassMatch(intermediate, pointingFeature);
					if (match.couldEvolveTransformation())
						matches.add(match);
					// System.out.println("FOUND FOR " +
					// intermediate.getName());
				}
			}

			// TODO: Additional checks: no subclasses

		}

		return save(matches);
	}

	public class RemoveAssociationClassMatch implements IMatch {

		private EClass		intermediateClass;
		private EReference	pointingFeature;
		private ArrayList<AssociationNavigationInfo> navigations = new ArrayList<AssociationNavigationInfo>();
		private EReference intermediateReference;

		/**
		 * Takes a prunned class and a feature pointing to such class. The
		 * prunned class is assumed to have only one reference.
		 * 
		 * @param prunnedClass
		 * @param targetFeature
		 */
		public RemoveAssociationClassMatch(EClass intermediateClass, EReference pointingFeature) {

			this.intermediateClass = intermediateClass;
			this.pointingFeature = pointingFeature;
			this.intermediateReference = intermediateClass.getEReferences().get(0);
		}

		@Override
		public Collection<EClass> getAffectedClasses() {
			ArrayList<EClass> info = new ArrayList<EClass>();
			info.add(intermediateClass);
			return info;
		}

		@Override
		public void apply() {

			System.out.println("REFACTORING: Remove association class " + intermediateClass.getName());

			// Co-evolve transformation
			for(AssociationNavigationInfo n: navigations) {
				n.coevolve(this);
			}
			
			// Modify concept
			pointingFeature.setContainment(false);
			pointingFeature.setName(introducedFeatureName());
			pointingFeature.setEType(intermediateClass.getEReferences().get(0).getEType());
			EcoreUtil.delete(intermediateClass);
		
		}


		public String introducedFeatureName() {
			String segment = Character.toUpperCase(intermediateReference.getName().charAt(0)) +
						intermediateReference.getName().substring(1);
			return pointingFeature.getName() + segment; 
		}
		
		protected boolean couldEvolveTransformation() {
			ATLModel atlModel = analysis.getATL();
			EClass targetType = intermediateReference.getEReferenceType();

			List<? extends NavigationOrAttributeCallExp> navs = atlModel
					.allObjectsOf(NavigationOrAttributeCallExp.class);

			for (NavigationOrAttributeCallExp nav : navs) {
				ExpressionAnnotation ann = analysis.findExpressionAnnotation(nav.original_());
				if (ann.getUsedFeature() == pointingFeature) {
					OclExpression closing = findClosingExpression(nav, targetType);

					// This is the condition to know if the transformation can
					// be co-evolved!
					if (closing == null)
						return false;

					navigations.add(new AssociationNavigationInfo(nav, closing));
				}
			}

			return true;
		}

		private OclExpression findClosingExpression(NavigationOrAttributeCallExp nav, EClass targetType) {

			ATLModelBaseObject container = nav.container_();
			while (container != null && container instanceof OclExpression) {
				OclExpression expr = (OclExpression) container;

				ExpressionAnnotation ann = analysis.findExpressionAnnotation(expr.original_());

				if (ann.getType() instanceof Metaclass) {
					Metaclass c = (Metaclass) ann.getType();
					if (c.getKlass() == targetType) {
						return expr;
					}
				}

				container = expr.container_();
			}

			return null;
		}

		@Override
		public boolean coevolutionRequired() {
			return this.navigations.size() > 0;
		}

	}

	public class AssociationNavigationInfo {
		private NavigationOrAttributeCallExp	nav;
		private OclExpression					closing;

		public AssociationNavigationInfo(NavigationOrAttributeCallExp nav, OclExpression closing) {
			this.nav = nav;
			this.closing = closing;
		}

		public void coevolve(RemoveAssociationClassMatch m) {
			nav.setName( m.introducedFeatureName() );
	
			// Follow the path until closing
			OclExpression src = (OclExpression) nav.container_();
			while ( src != closing ) {
				src = refactor(src, m);
			}
			refactor(src, m);
			
		}

		private OclExpression refactor(OclExpression src, RemoveAssociationClassMatch m) {
			if ( ! (src instanceof PropertyCallExp) ) {
				// throw new IllegalArgumentException("Found : " + src);
				return null;
			}
			
			PropertyCallExp pcall = (PropertyCallExp) src;
			
			// If the intermediate reference is navigated, it is removed!
			if ( src instanceof NavigationOrAttributeCallExp ) {
				ExpressionAnnotation ann = analysis.findExpressionAnnotation(src.original_());
				if ( ann.getUsedFeature() == m.intermediateReference ) {
					// Replace "src", the navigation expression in its container, by its source (receptor element)					
					src.replaceBy( pcall.getSource() );
					return null; // ?? Cannot proceed an return pcall.getSource()...
				}
			} else if ( src instanceof IteratorExp ) {
				IteratorExp it = (IteratorExp) src;
				refactor(it.getBody(), m);
				
				// Re-refactor collect(g| g)
				if ( it.getName().equals("collect") && it.getBody() instanceof VariableExp ) {
					src.replaceBy( pcall.getSource() );					
					return null; // ??
				}
			}
			
			return pcall.getSource();
		}
	}

}
