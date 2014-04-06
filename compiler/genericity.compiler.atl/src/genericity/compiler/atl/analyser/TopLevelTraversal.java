package genericity.compiler.atl.analyser;

import genericity.compiler.atl.analyser.namespaces.ClassNamespace;
import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import genericity.compiler.atl.analyser.namespaces.ITypeNamespace;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;
import atl.metamodel.ATLModel;
import atl.metamodel.ATL.Binding;
import atl.metamodel.ATL.CalledRule;
import atl.metamodel.ATL.ForEachOutPatternElement;
import atl.metamodel.ATL.LazyMatchedRule;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.RuleVariableDeclaration;
import atl.metamodel.ATL.SimpleInPatternElement;
import atl.metamodel.ATL.SimpleOutPatternElement;
import atl.metamodel.ATL.Unit;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.Iterator;
import atl.metamodel.OCL.OclContextDefinition;
import atl.metamodel.OCL.OclFeature;
import atl.metamodel.OCL.OclFeatureDefinition;
import atl.metamodel.OCL.Operation;
import atl.metamodel.OCL.Parameter;
import atl.metamodel.OCL.VariableDeclaration;

/**
 * 
 * @author jesus
 *
 */
public class TopLevelTraversal extends AbstractAnalyserVisitor {
	
	public TopLevelTraversal(ATLModel model, GlobalNamespace mm, Unit root, TypingModel typ, ErrorModel errors) {
		super(model, mm, root, typ, errors);
	}
	
	public void perform(ComputedAttributes attr) {
		this.attr = attr.pushVisitor(this);
		startVisiting(root);
		attr.popVisitor(this);
	}

	//@Override
	//public VisitingActions preRule(Rule self) {
		// return actions(); // Do not visit anything else
	//}


	@Override
	public void inBinding(Binding self) {
		Metaclass targetVar = (Metaclass) attr.typeOf( self.getOutPatternElement().getType() );
		ClassNamespace ns = (ClassNamespace) targetVar.getMetamodelRef();
		
		Type t = null;
		if ( ! ns.hasFeature(self.getPropertyName()) ) {
			t = this.errors.signalNoFeature(targetVar.getKlass(), self.getPropertyName(), self); // No need to halt, recovery is just "ignore"
		} else {
			t = ns.getFeatureType(self.getPropertyName(), self);
		}
		
		attr.linkStructType(t);
	}
	
	
	@Override
	public void inAttribute(Attribute self) {
		extendTypeForAttribute(self, mm, attr,  attr.typeOf(self.getType()));
	}

	public static void extendTypeForAttribute(Attribute self, GlobalNamespace mm, ComputedAttributes attr, Type t) {
		OclContextDefinition ctx = self.container(OclFeatureDefinition.class).getContext_();
		if ( ctx == null ) {
			mm.getTransformationNamespace().extendType(self.getName(), t, self);
			return;
		}
		
		Type ctxType = attr.typeOf(ctx.getContext_());
		ITypeNamespace nspace = (ITypeNamespace) ctxType.getMetamodelRef();
		
		nspace.extendType(self.getName(), t, self);
	}
	
	@Override
	public void inOperation(Operation self) {
		extendTypeForOperation(self, mm, attr,  attr.typeOf(self.getReturnType()));
	}
	
	public static void extendTypeForOperation(Operation self, GlobalNamespace mm, ComputedAttributes attr, Type t) {	
		OclContextDefinition ctx = self.container(OclFeatureDefinition.class).getContext_();
		if ( ctx == null ) {
			mm.getTransformationNamespace().extendType(self.getName(), t, self);
			return;
		} else {
			Type ctxType = attr.typeOf(ctx.getContext_());
			ITypeNamespace nspace = (ITypeNamespace) ctxType.getMetamodelRef();
			
			nspace.extendType(self.getName(), t, self);			
		}
	}

	
	/**
	 * Called and lazy rules are treated as global helpers with a return type belonging
	 * to a target meta-model.
	 */
	@Override
	public void inCalledRule(CalledRule self) {
		if ( self.getIsEndpoint() || self.getIsEntrypoint() )
			return;

		Type t = attr.typeOf(self.getOutPattern().getElements().get(0).getType()); 
		mm.getTransformationNamespace().extendType(self.getName(), t, self);
	}

	@Override
	public void inLazyMatchedRule(LazyMatchedRule self) {
		Type t = attr.typeOf(self.getOutPattern().getElements().get(0).getType()); 
		mm.getTransformationNamespace().extendType(self.getName(), t, self);
	}
	
	@Override
	public void inMatchedRule(MatchedRule self) {
		Metaclass m = (Metaclass) attr.typeOf(self.getInPattern().getElements().get(0));
		Type t = attr.typeOf(self.getOutPattern().getElements().get(0).getType()); 
		
		ClassNamespace ns = (ClassNamespace) m.getMetamodelRef();
		// System.out.println("TopLevelTraversal.inMatchedRule(): " + self.getName());
		ns.extendType(self.getName(), t, self);
	}

	//  
	// Variables 
	//

	/** 
	 * The evaluation order to the variable declarations of a rule is important!
	 */
	public VisitingActions preMatchedRule(atl.metamodel.ATL.MatchedRule self) { 
		return new VisitingActions("variables" , "inPattern", "outPattern" , "actionBlock"); 
	} 

	public VisitingActions preLazyMatchedRule(atl.metamodel.ATL.LazyMatchedRule self) { 
		return new VisitingActions("variables" , "inPattern", "outPattern" , "actionBlock" ); 
	} 

	@Override
	public void inVariableDeclaration(VariableDeclaration self) {
		assert(!( self instanceof SimpleInPatternElement || self instanceof Iterator));
		
		// This is left for another pass
		if ( self.getVarName().equals("self") ||
			 self.getVarName().equals("thisModule")	) return;

		// TODO: Ver que debe estar partida en dos reglas de eclectic
		if ( self.getType() != null ) {
			attr.linkExprType( attr.typeOf(self.getType()) );
			// type[self] <- type[self.type]
			// TODO: Get the type of the variable declaration
		} else {
			// This is left for another pass
			
			// TODO: Get the type of the initExpression
			// type[self] <- type[self.initExpression]
		}		
	}
	
	@Override
	public void inRuleVariableDeclaration(RuleVariableDeclaration self) {
		if ( self.getType() != null ) {
			attr.linkExprType( attr.typeOf(self.getType()) );			
		}
	}
	
	@Override
	public void inParameter(Parameter self) {
		attr.linkExprType( attr.typeOf(self.getType()) );
	}
	
	@Override
	public void inSimpleInPatternElement(SimpleInPatternElement self) {
		attr.linkExprType( attr.typeOf(self.getType()) );
	}
	
	@Override
	public void inSimpleOutPatternElement(SimpleOutPatternElement self) {
		attr.linkExprType( attr.typeOf(self.getType()) );
	}
	
	@Override
	public void inForEachOutPatternElement(ForEachOutPatternElement self) {
		attr.linkExprType( attr.typeOf(self.getType()) );
	
		// Deal only with the case of iterators defined for ForEachOutPatternElement,
		// which type is given by the enclosing foreach
		// attr.linkExprType(self.getIterator(), attr.typeOf(self.getType()));
		// This was wrong, right? Now in TypeAnalysisTraversal
	}
	
	
	
}
