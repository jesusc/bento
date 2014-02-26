package genericity.compiler.atl.analyser;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import genericity.compiler.atl.analyser.namespaces.ITypeNamespace;
import genericity.compiler.atl.analyser.namespaces.MetamodelNamespace;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import atl.metamodel.ATLModel;
import atl.metamodel.ATLModelBaseObject;
import atl.metamodel.ATLModelBaseObjectInterface;
import atl.metamodel.ATLModelVisitor;
import atl.metamodel.ATL.CalledRule;
import atl.metamodel.ATL.ForEachOutPatternElement;
import atl.metamodel.ATL.Helper;
import atl.metamodel.ATL.LazyMatchedRule;
import atl.metamodel.ATL.Module;
import atl.metamodel.ATL.ModuleElement;
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
 * 
 * @author jesus
 *
 */
public class TopLevelTraversal extends AbstractAnalyserVisitor {
	
	private HashMap<ATLModelBaseObject, Type> typeAttr = new HashMap<ATLModelBaseObject, Type>();
	
	public TopLevelTraversal(ATLModel model, GlobalNamespace mm, Unit root, TypingModel typ, ErrorModel errors) {
		super(model, mm, root, typ, errors);
	}
	
	public void perform(ComputedAttributes attr) {
		this.attr = attr.pushVisitor(this);
		startVisiting(root);
		attr.popVisitor(this);
	}

	@Override
	public VisitingActions preRule(Rule self) {
		return actions(); // Do not visit anything else
	}
	
	
	@Override
	public void inAttribute(Attribute self) {
		OclContextDefinition ctx = self.container(OclFeatureDefinition.class).getContext_();
		if ( ctx == null ) {
			mm.getTransformationNamespace().extendType(self.getName(), attr.typeOf(self.getType()), self);
			return;
		}
		
		Type t = attr.typeOf(ctx.getContext_());
		ITypeNamespace nspace = (ITypeNamespace) t.getMetamodelRef();
		
		nspace.extendType(self.getName(), attr.typeOf(self.getType()), self);
	}

	@Override
	public void inOperation(Operation self) {
		OclContextDefinition ctx = self.container(OclFeatureDefinition.class).getContext_();
		if ( ctx == null ) {
			mm.getTransformationNamespace().extendType(self.getName(), attr.typeOf(self.getReturnType()), self);
			return;
		} else {
			Type t = attr.typeOf(ctx.getContext_());
			ITypeNamespace nspace = (ITypeNamespace) t.getMetamodelRef();
			
			nspace.extendType(self.getName(), attr.typeOf(self.getReturnType()), self);			
		}
	}

	/**
	 * Called and lazy rules are treated as global helpers with a return type belonging
	 * to a target meta-model.
	 */
	@Override
	public void inCalledRule(CalledRule self) {
		Type t = attr.typeOf(self.getOutPattern().getElements().get(0).getType()); 
		mm.getTransformationNamespace().extendType(self.getName(), t, self);
	}

	@Override
	public void inLazyMatchedRule(LazyMatchedRule self) {
		Type t = attr.typeOf(self.getOutPattern().getElements().get(0).getType()); 
		mm.getTransformationNamespace().extendType(self.getName(), t, self);
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
		attr.linkExprType(self.getIterator(), attr.typeOf(self.getType()));
	}
	
	
	
}
