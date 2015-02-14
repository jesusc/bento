package bento.componetization.atl.hints;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.types.CollectionType;
import anatlyzer.atl.types.Metaclass;
import anatlyzer.atlext.ATL.ATLFactory;
import anatlyzer.atlext.ATL.Helper;
import anatlyzer.atlext.ATL.Library;
import anatlyzer.atlext.ATL.Module;
import anatlyzer.atlext.ATL.Unit;
import anatlyzer.atlext.OCL.Attribute;
import anatlyzer.atlext.OCL.CollectionOperationCallExp;
import anatlyzer.atlext.OCL.Iterator;
import anatlyzer.atlext.OCL.IteratorExp;
import anatlyzer.atlext.OCL.NavigationOrAttributeCallExp;
import anatlyzer.atlext.OCL.OCLFactory;
import anatlyzer.atlext.OCL.OclExpression;
import anatlyzer.atlext.OCL.OclFeatureDefinition;
import anatlyzer.atlext.OCL.OclModel;
import anatlyzer.atlext.OCL.OclModelElement;
import anatlyzer.atlext.OCL.OperationCallExp;
import anatlyzer.atlext.OCL.PropertyCallExp;
import anatlyzer.atlext.OCL.SequenceType;
import anatlyzer.atlext.OCL.TupleExp;
import anatlyzer.atlext.OCL.TuplePart;
import anatlyzer.atlext.OCL.TupleType;
import anatlyzer.atlext.OCL.TupleTypeAttribute;
import anatlyzer.atlext.OCL.VariableDeclaration;
import anatlyzer.atlext.OCL.VariableExp;
import bento.componetization.atl.BaseRefactoring;
import bento.componetization.atl.IMetamodelInfo;
import bento.componetization.atl.IStaticAnalysisInfo;
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
			List<OperationCallExp> allInstances = null;
			
			if (analysis.getExplicitlyUsedTypes().contains(intermediate)) {
				if ( !analysis.getRuleUsages(intermediate).isEmpty() ||
					 !analysis.getHelperUsages(intermediate).isEmpty() ) {
					continue;
				} else {
					allInstances = analysis.getAllInstancesUsages(intermediate);
				}
			} else {
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
				if (intermediate.getEReferences().size() > 0 && intermediate.getEReferences().size() <= 2 && intermediate.getEAttributes().size() == 0) {
					if ( intermediate.getEReferences().size() == 2 ) {
						// Find the opposite of the pointing feature. This is needed to decide
						// which of the two references is the one to follow.
						// The decision is made in RemoveAssociationClassMatch constructor.
						if ( ! intermediate.getEReferences().contains(pointingFeature.getEOpposite() ) )
							continue;
					}
					
					RemoveAssociationClassMatch match = new RemoveAssociationClassMatch(intermediate, pointingFeature, allInstances);
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

	public class RemoveAssociationClassMatch extends BaseMatch {

		private EClass		intermediateClass;
		private EReference	pointingFeature;
		private ArrayList<AssociationNavigationInfo> navigations = new ArrayList<AssociationNavigationInfo>();
		private ArrayList<UpdateAllInstances> updateAllInstances = new ArrayList<UpdateAllInstances>();

		private EReference intermediateReference;
		private List<OperationCallExp> allInstances;

		/**
		 * Takes a prunned class and a feature pointing to such class. The
		 * prunned class is assumed to have only one reference.
		 * @param allInstances 
		 * 
		 * @param prunnedClass
		 * @param targetFeature
		 */
		public RemoveAssociationClassMatch(EClass intermediateClass, EReference pointingFeature, List<OperationCallExp> allInstances) {
			super(RemoveAssociationClass.this);
			this.intermediateClass = intermediateClass;
			this.pointingFeature = pointingFeature;
			this.intermediateReference = intermediateClass.getEReferences().get(0);
			if ( pointingFeature.getEOpposite() == intermediateReference ) 
				intermediateReference = intermediateClass.getEReferences().get(1);
			this.allInstances = allInstances;
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
			
			for(UpdateAllInstances up : updateAllInstances) {
				up.coevolve(this);
			}
			
			// Modify concept
			pointingFeature.setContainment(false);
			pointingFeature.setName(introducedFeatureName());
			pointingFeature.setEType(intermediateClass.getEReferences().get(0).getEType());
			for(EReference r : new ArrayList<EReference>(intermediateClass.getEReferences()) ) {
				EcoreUtil.delete(r);			
			}
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
				if (nav.getUsedFeature() == pointingFeature) {
					OclExpression closing = findClosingExpression(nav, targetType);

					// This is the condition to know if the transformation can
					// be co-evolved!
					if (closing == null)
						return false;

					navigations.add(new AssociationNavigationInfo(nav, closing));
				}
			}
			
			
			// Check allInstances
			if ( allInstances != null && allInstances.size() > 0 ) {
				updateAllInstances.add(new UpdateAllInstances());
			}

			return true;
		}

		/**
		 * Finds the first expression whose type is exactly the targetType.
		 * This is to determine the extent of the refactoring.
		 * 
		 * @param nav
		 * @param targetType
		 * @return
		 */
		private OclExpression findClosingExpression(NavigationOrAttributeCallExp nav, EClass targetType) {
			EObject container = nav.eContainer();
			while (container != null && container instanceof OclExpression) {
				OclExpression expr = (OclExpression) container;

				if (expr.getInferredType() instanceof Metaclass ) {
					Metaclass c = (Metaclass) expr.getInferredType();
					if (c.getKlass() == targetType) {
						return expr;
					}
				}
				
				// Also needs to work with multivalued expressions
				if ( expr.getInferredType() instanceof CollectionType && ((CollectionType) expr.getInferredType()).getContainedType() instanceof Metaclass ) {
					Metaclass c = (Metaclass) ((CollectionType) expr.getInferredType()).getContainedType();
					if (c.getKlass() == targetType) {
						return expr;
					}
				}

				container = expr.eContainer();
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
			OclExpression src = (OclExpression) nav.eContainer();
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
				NavigationOrAttributeCallExp nav = (NavigationOrAttributeCallExp) src;
				if ( nav.getUsedFeature() == m.intermediateReference ) {
					// Replace "src", the navigation expression in its container, by its source (receptor element)					
					replace(src, pcall.getSource());
					return null; // ?? Cannot proceed an return pcall.getSource()...
				}
			} else if ( src instanceof IteratorExp ) {
				IteratorExp it = (IteratorExp) src;
				refactor(it.getBody(), m);
				
				// Re-refactor collect(g| g)
				if ( it.getName().equals("collect") && it.getBody() instanceof VariableExp ) {
					replace(src, pcall.getSource() );					
					return null; // ??
				}
			}
			
			return pcall.getSource();
		}
	}

	public class UpdateAllInstances {

		public void coevolve(RemoveAssociationClassMatch match) {
			ATLModel atl = analysis.getATL();
			String helperName = "AllInstancesOf_" + match.intermediateClass.getName();
			String firstVarName = "specific"; // TODO: CHANGE
			String secondVarName = "general"; // TODO: CHANGE
			
			// A trick to get the OclModel...
			OperationCallExp allInstancesOp = match.allInstances.get(0);
			OclModel model = ((OclModelElement) allInstancesOp.getSource()).getModel();
			
			Helper helper = ATLFactory.eINSTANCE.createStaticHelper();
			// Helper helper = atl.create(Helper.class);
			
			OclFeatureDefinition definition = OCLFactory.eINSTANCE.createOclFeatureDefinition(); 
			helper.setDefinition(definition);	
			
			SequenceType returnType = OCLFactory.eINSTANCE.createSequenceType();
			TupleType    tupleType  = OCLFactory.eINSTANCE.createTupleType();
			returnType.setElementType(tupleType);
			
			TupleTypeAttribute att1 = OCLFactory.eINSTANCE.createTupleTypeAttribute(); 
			att1.setName(firstVarName);
			att1.setType( OCLFactory.eINSTANCE.createOclAnyType() );
			tupleType.getAttributes().add(att1);
			// TODO. SET THE TYPE OF THE TUPLE PARTS!!
			
			if ( secondVarName != null ) {
				TupleTypeAttribute att2 = OCLFactory.eINSTANCE.createTupleTypeAttribute(); 
				att2.setName(secondVarName);				
				att2.setType( OCLFactory.eINSTANCE.createOclAnyType() );
				tupleType.getAttributes().add(att2);
			}
			
			
			Attribute feature = OCLFactory.eINSTANCE.createAttribute();
			feature.setName( helperName );
			// feature.setType( atl.create(OclAnyType.class) );
			feature.setType( returnType );
			definition.setFeature(feature);
			
			CollectionOperationCallExp flatten = OCLFactory.eINSTANCE.createCollectionOperationCallExp();
			flatten.setOperationName("flatten");
			feature.setInitExpression(flatten);
			
			IteratorExp collect1 = OCLFactory.eINSTANCE.createIteratorExp();
			// feature.setInitExpression(collect1);			
			flatten.setSource(collect1);
			collect1.setName("collect");
			Iterator itVarCollect1 = OCLFactory.eINSTANCE.createIterator();
			itVarCollect1.setVarName(firstVarName);
			collect1.getIterators().add(itVarCollect1);
			
			OperationCallExp allInstancesCall = OCLFactory.eINSTANCE.createOperationCallExp();
			allInstancesCall.setOperationName("allInstances");
			collect1.setSource(allInstancesCall);
			
			OclModelElement classOclModelElement = OCLFactory.eINSTANCE.createOclModelElement();
			classOclModelElement.setName("Class"); // TODO: This is hardcoded!!!
			classOclModelElement.setModel(model);
			allInstancesCall.setSource(classOclModelElement);
			
			IteratorExp collect2 = OCLFactory.eINSTANCE.createIteratorExp();
			Iterator itVarCollect2 = OCLFactory.eINSTANCE.createIterator();
			itVarCollect2.setVarName(secondVarName);
			collect2.getIterators().add(itVarCollect2);
			collect1.setBody(collect2);			
			collect2.setName("collect");
			
			NavigationOrAttributeCallExp navReference = OCLFactory.eINSTANCE.createNavigationOrAttributeCallExp();
			navReference.setName( match.introducedFeatureName() );
			VariableExp varExp = OCLFactory.eINSTANCE.createVariableExp();
			varExp.setReferredVariable(itVarCollect1);
			navReference.setSource(varExp);
			collect2.setSource(navReference);
			
			TupleExp tupleValue = OCLFactory.eINSTANCE.createTupleExp();
			collect2.setBody(tupleValue);

			TuplePart part1 = OCLFactory.eINSTANCE.createTuplePart();
			part1.setVarName(firstVarName);
			VariableExp refToIt1 = OCLFactory.eINSTANCE.createVariableExp();
			refToIt1.setReferredVariable(itVarCollect1);
			part1.setInitExpression(refToIt1);
			tupleValue.getTuplePart().add(part1);

			TuplePart part2 = OCLFactory.eINSTANCE.createTuplePart();
			part2.setVarName(secondVarName);
			VariableExp refToIt2 = OCLFactory.eINSTANCE.createVariableExp();
			refToIt2.setReferredVariable(itVarCollect2);
			part2.setInitExpression(refToIt2);
			tupleValue.getTuplePart().add(part2);


			Unit u = atl.allObjectsOf(Unit.class).get(0);
			if ( u instanceof Library ) {
				((Library) u).getHelpers().add(helper);
			} else if ( u instanceof Module ) {
				((Module) u).getElements().add(helper);
			}
	
			for (OperationCallExp op : match.allInstances) {
				NavigationOrAttributeCallExp call = OCLFactory.eINSTANCE.createNavigationOrAttributeCallExp();
				call.setName( helperName );
				
				// op.setOperationName( helperName );
				
				VariableDeclaration thisModule =  OCLFactory.eINSTANCE.createVariableDeclaration();
				thisModule.setVarName("thisModule");
				
				VariableExp exp =  OCLFactory.eINSTANCE.createVariableExp();
				exp.setReferredVariable(thisModule);
				
				call.setSource(exp);
				
				replace(op, call);
				// op.getSource().replaceBy(exp);
			}
		}

	}


	private void replace(EObject src, EObject replacement) {
		EcoreUtil.replace(src, replacement);
	}

}
