package genericity.compiler.atl.analyser;

import java.util.HashMap;
import java.util.HashSet;

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
	public void beforeRule(Rule self) {
		self.getOutPattern().getElements();
	}
	
	private HashSet<EStructuralFeature> compulsoryFeatures = null;
	private HashSet<EStructuralFeature> allWrittenCompulsoryFeatures = new HashSet<EStructuralFeature>();
	
	@Override
	public void beforeSimpleOutPatternElement(SimpleOutPatternElement self) {
		compulsoryFeatures = new HashSet<EStructuralFeature>();
		
		Metaclass mc = (Metaclass) attr.typeOf( self.getType() );
		for(EStructuralFeature f : mc.getKlass().getEAllStructuralFeatures() ) {
			if ( f.getLowerBound() != 0 && f.getDefaultValue() == null ) {
				compulsoryFeatures.add(f);
			}
		}
	}
	
	@Override
	public void inSimpleOutPatternElement(SimpleOutPatternElement self) {
		
		if ( compulsoryFeatures.size() != 0 ) {
			for (EStructuralFeature f : compulsoryFeatures) {
				if ( f instanceof EReference && allWrittenCompulsoryFeatures.contains( ((EReference) f).getEOpposite()) ) 
					continue; // Assumes that if the opposite is written in other rule, it is the one that corresponds to this object
				
				errors.signalNoBindingForCompulsoryFeature(f, self);				
			}
		}
		compulsoryFeatures = null;
	}
	
	@Override
	public void inBinding(Binding self) {
		Type t = attr.typeOf(self.getValue());
	
		Type targetVar = attr.typeOf( self.getOutPatternElement() );
		ClassNamespace ns = (ClassNamespace) targetVar.getMetamodelRef();
		EStructuralFeature f = ns.getFeatureInfo(self.getPropertyName());
		
		// The feature is removed from the current compulsoryFeatures set, which is
		// checked later to be empty
		compulsoryFeatures.remove(f);
		allWrittenCompulsoryFeatures.add(f);
		
		// Assignments of 0/1:1 features with collections
		if ( (! f.isMany()) && t instanceof CollectionType  ) {
			errors.signalBindingExpectedOneAssignedMany(self, (Metaclass) targetVar, self.getPropertyName());
		}
		
		// Assignment of attributes with objects
		if ( f instanceof EAttribute && !(t instanceof PrimitiveType )) {
			if (t instanceof CollectionType && ((CollectionType) t).getContainedType() instanceof PrimitiveType ) {
				// That's fine
			} else if ( t instanceof EnumType && f.getEType() instanceof EEnum ) {
				// That's fine				
			} else {
				errors.signalBindingPrimitiveExpectedButObjectAssigned(self, (Metaclass) targetVar, self.getPropertyName());
			}
		}
		
		// Assignment of references with primitive values
		if ( f instanceof EReference && 
				(t instanceof PrimitiveType || t instanceof EnumType ||
				(t instanceof CollectionType && ((CollectionType) t).getContainedType() instanceof PrimitiveType) )) {

			errors.signalBindingObjectExpectedButPrimitiveAssigned(self, (Metaclass) targetVar, self.getPropertyName());
		}		
		
		
		
		/* TODO: Other analysis */
		/*
		 * - Compulsory features in the meta-model not assigned
		 * 
		 */
		
	}
	
}
