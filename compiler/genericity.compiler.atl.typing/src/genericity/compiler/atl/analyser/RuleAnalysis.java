package genericity.compiler.atl.analyser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import genericity.compiler.atl.analyser.namespaces.ClassNamespace;
import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import genericity.compiler.atl.analyser.namespaces.ITypeNamespace;
import genericity.compiler.atl.analyser.namespaces.MetamodelNamespace;
import genericity.typing.atl_types.CollectionType;
import genericity.typing.atl_types.EnumType;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.PrimitiveType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.TypeError;
import genericity.typing.atl_types.UnionType;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import atl.metamodel.ATLModel;
import atl.metamodel.ATLModelBaseObject;
import atl.metamodel.ATLModelBaseObjectInterface;
import atl.metamodel.ATLModelVisitor;
import atl.metamodel.ATL.Binding;
import atl.metamodel.ATL.CalledRule;
import atl.metamodel.ATL.ForEachOutPatternElement;
import atl.metamodel.ATL.Helper;
import atl.metamodel.ATL.LazyMatchedRule;
import atl.metamodel.ATL.Library;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.Module;
import atl.metamodel.ATL.ModuleElement;
import atl.metamodel.ATL.OutPatternElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.ATL.RuleVariableDeclaration;
import atl.metamodel.ATL.SimpleInPatternElement;
import atl.metamodel.ATL.SimpleOutPatternElement;
import atl.metamodel.ATL.Unit;
import atl.metamodel.ATLModelVisitor.VisitingActions;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.IntegerExp;
import atl.metamodel.OCL.Iterator;
import atl.metamodel.OCL.NavigationOrAttributeCallExp;
import atl.metamodel.OCL.OclContextDefinition;
import atl.metamodel.OCL.OclFeatureDefinition;
import atl.metamodel.OCL.OclModel;
import atl.metamodel.OCL.OclModelElement;
import atl.metamodel.OCL.OclType;
import atl.metamodel.OCL.OclUndefinedExp;
import atl.metamodel.OCL.Operation;
import atl.metamodel.OCL.Parameter;
import atl.metamodel.OCL.Primitive;
import atl.metamodel.OCL.RealExp;
import atl.metamodel.OCL.StringExp;
import atl.metamodel.OCL.VariableDeclaration;

/**
 * This traversal is in charge of analysing rule "calls".
 * 
 * @author jesus
 *
 */
public class RuleAnalysis extends AbstractAnalyserVisitor {
	
	
	public RuleAnalysis(ATLModel model, GlobalNamespace mm, Unit root, TypingModel typ, ErrorModel errors) {
		super(model, mm, root, typ, errors);
	}
	
	public void perform(ComputedAttributes attr) {
		this.attr = attr.pushVisitor(this);
		startVisiting(root);
		attr.popVisitor(this);
	}

	@Override
	public VisitingActions preBinding(Binding self) {
		return actions();
	}
	
	@Override
	public void beforeMatchedRule(MatchedRule self) {
		// self.getInPattern().getElements().get(0);
	}
	
	private HashSet<EStructuralFeature> compulsoryFeatures = null;
	private HashSet<EStructuralFeature> allWrittenCompulsoryFeatures = new HashSet<EStructuralFeature>();
	
	@Override
	public void beforeSimpleOutPatternElement(SimpleOutPatternElement self) {
		Metaclass mc = (Metaclass) attr.typeOf( self.getType() );
		setCurrentCompulsoryFeatures(mc);
	}

	@Override
	public void beforeForEachOutPatternElement(ForEachOutPatternElement self) {
		Metaclass mc = (Metaclass) attr.typeOf( self.getType() );
		setCurrentCompulsoryFeatures(mc);
	}

	
	@Override
	public void inSimpleOutPatternElement(SimpleOutPatternElement self) {
		checkCompulsoryFeature(self);
	}
	
	@Override
	public void inForEachOutPatternElement(ForEachOutPatternElement self) {
		checkCompulsoryFeature(self);
	}

	private void setCurrentCompulsoryFeatures(Metaclass mc) {
		compulsoryFeatures = new HashSet<EStructuralFeature>();
		
		for(EStructuralFeature f : mc.getKlass().getEAllStructuralFeatures() ) {
			if ( f.getLowerBound() != 0 && f.getDefaultValue() == null ) {
				compulsoryFeatures.add(f);
			}
		}
	}

	private void checkCompulsoryFeature(OutPatternElement self) {
		if ( compulsoryFeatures.size() != 0 ) {
			for (EStructuralFeature f : compulsoryFeatures) {
				if ( f instanceof EReference && allWrittenCompulsoryFeatures.contains( ((EReference) f).getEOpposite()) ) 
					continue; // Assumes that if the opposite is written in other rule, it is the one that corresponds to this object
				
				
				if ( f.getDefaultValueLiteral() == null )
					errors.signalNoBindingForCompulsoryFeature(f, self);				
			}
		}
		compulsoryFeatures = null;
	}

	@Override
	public void inBinding(Binding self) {
		Type rightType = attr.typeOf(self.getValue());
	
		Type targetVar = attr.typeOf( self.getOutPatternElement() );
		ClassNamespace ns = (ClassNamespace) targetVar.getMetamodelRef();
		EStructuralFeature f = ns.getFeatureInfo(self.getPropertyName());
		
		// The feature is removed from the current compulsoryFeatures set, which is
		// checked later to be empty
		compulsoryFeatures.remove(f);
		allWrittenCompulsoryFeatures.add(f);
		
		if ( rightType instanceof UnionType ) {
			UnionType ut = (UnionType) rightType;
			for(Type t : ut.getPossibleTypes() ) {
				analyseBinding(self, t, targetVar, f);
			}
		} else {
			analyseBinding(self, rightType, targetVar, f);
		}
	}

	private void analyseBinding(Binding self, Type rightType, Type targetVar, EStructuralFeature f) {
		if ( rightType instanceof TypeError )
			return;
		
		// Assignments of 0/1:1 features with collections
		if ( (! f.isMany()) && rightType instanceof CollectionType  ) {
			errors.signalBindingExpectedOneAssignedMany(self, (Metaclass) targetVar, self.getPropertyName());
		}
		
		// Assignment of attributes with objects
		if ( f instanceof EAttribute && !(rightType instanceof PrimitiveType )) {
			if (rightType instanceof CollectionType && ((CollectionType) rightType).getContainedType() instanceof PrimitiveType ) {
				// That's fine
			} else if ( rightType instanceof EnumType && f.getEType() instanceof EEnum ) {
				// That's fine				
			} else {
				errors.signalBindingPrimitiveExpectedButObjectAssigned(self, (Metaclass) targetVar, self.getPropertyName());
			}
		}
		
		// Assignment of references with primitive values
		if ( f instanceof EReference && 
				(rightType instanceof PrimitiveType || rightType instanceof EnumType ||
				(rightType instanceof CollectionType && ((CollectionType) rightType).getContainedType() instanceof PrimitiveType) )) {

			errors.signalBindingObjectExpectedButPrimitiveAssigned(self, (Metaclass) targetVar, self.getPropertyName());
		}		
		
		if ( f instanceof EReference ) {
			analyseRuleResolution(self, rightType, (EReference) f);
		}
		
		/* TODO: Other analysis */
		/*
		 * - Compulsory features in the meta-model not assigned
		 * - Assignments object-object due to: lazy/called rules, or implicit assignment
		 */
	}

	/**
	 * Analyse if a binding is properly resolved by some rule.
	 * 
	 * @param self
	 * @param rightType
	 * @param f
	 */
	private void analyseRuleResolution(Binding self, Type rightType, EReference f) {
		if ( rightType instanceof Metaclass ) {
			Metaclass rightMetaclass = (Metaclass) rightType;
			ClassNamespace ns = (ClassNamespace) rightType.getMetamodelRef();
			
			List<MatchedRule> rules = ns.getResolvingRules();
			boolean isAssignable    = TypeUtils.isClassAssignableTo(rightMetaclass.getKlass(), f.getEReferenceType());
			if ( rules.size() == 0 && ! isAssignable ) {
				errors.signalBindingWithoutRule(self, rightMetaclass.getKlass(), f.getEReferenceType());

				// System.err.println("!!!!! WARNING!!! No rule for binding.  " + f.getEContainingClass().getName() + "." + f.getName() + " <- " + TypeUtils.typeToString(rightType) + ". " + self.getLocation());
			} else if ( ! isAssignable ){
				findPossibleUnresolvedClasses(self, rightMetaclass, f.getEReferenceType()); //, rules);				
				findRulesWithWrongTargetType(self, rightMetaclass, f.getEReferenceType(), rules);
			}
		} else if ( rightType instanceof CollectionType ) {
			CollectionType ct = (CollectionType) rightType;
			analyseRuleResolution(self, ct.getContainedType(), f);
		} else if ( rightType instanceof UnionType ) {
			UnionType ut = (UnionType) rightType;
			for(Type t : ut.getPossibleTypes() ) {
				analyseRuleResolution(self, t, f);
			}
		}
	}

	private void findRulesWithWrongTargetType(Binding b, Metaclass rightType, EClass targetType, List<MatchedRule> resolvingRules) {
		ArrayList<MatchedRule> problematicRules = new ArrayList<MatchedRule>();
		ArrayList<EClass> targetClasses = new ArrayList<EClass>();
		
		for (MatchedRule matchedRule : resolvingRules) {
			Metaclass m = (Metaclass) attr.typeOf( matchedRule.getOutPattern().getElements().get(0) );
			if ( ! TypeUtils.isClassAssignableTo(m.getKlass(), targetType)  ) {
				problematicRules.add(matchedRule);
				targetClasses.add(m.getKlass());
				// System.err.println("Problem in rule " + matchedRule.getName() + " " + m.getName() + " - " + targetType.getName() + "/" + TypeUtils.typeToString(rightType) + "." + b.getLocation() + " " + matchedRule.getLocation());
			}
		}
		
		if ( problematicRules.size() > 0 ) {
			errors.signalBindingWithResolvedByIncompatibleRule(b, rightType.getKlass(), targetType, problematicRules, targetClasses);
		}
	}

	private void findPossibleUnresolvedClasses(Binding b, Metaclass rightMetaclass, EClass targetType) { //, List<MatchedRule> rules) {
		LinkedList<ClassNamespace> pending = new LinkedList<ClassNamespace>();
		pending.add( (ClassNamespace) rightMetaclass.getMetamodelRef() );
	
		LinkedList<ClassNamespace> notResolved = new LinkedList<ClassNamespace>();
		
		while ( ! pending.isEmpty() ) {
			ClassNamespace ns = pending.pop();
			
			if ( ns.getRules().isEmpty() ) {
				Collection<ClassNamespace> direct = ns.getDirectSubclasses();
				if ( direct.size() > 0 ) {
					pending.addAll(direct);
				} else {
					notResolved.add(ns);
				}
			}
		}
		
		if ( notResolved.size() > 0 ) {
			ArrayList<EClass> problematicClasses = new ArrayList<EClass>(notResolved.size());
			for (ClassNamespace classNamespace : notResolved) {
				problematicClasses.add(classNamespace.getKlass());
			}
			
			errors.signalBindingPossiblyUnresolved(b, rightMetaclass.getKlass(), targetType, problematicClasses);

			// BindingPossiblyUnresolved
			// System.out.println("Problems with " + notResolved);
		}
		
		/*
		ns.getDirectSubclasses();
		
		System.out.println("* " + rightMetaclass.getName());
		for (MatchedRule matchedRule : rules) {
			System.out.println(matchedRule.getName());
		}
		*/
		// System.out.println("RuleAnalysis.findPossibleUnresolvedClasses()");
	}
}

