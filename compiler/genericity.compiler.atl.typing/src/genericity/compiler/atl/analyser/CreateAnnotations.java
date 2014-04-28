package genericity.compiler.atl.analyser;

import genericity.compiler.atl.analyser.namespaces.ClassNamespace;
import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import genericity.compiler.atl.analyser.namespaces.TransformationNamespace;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.ThisModuleType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.UnionType;
import genericity.typing.atl_types.analysis.ControlFlow;
import genericity.typing.atl_types.annotations.AtlAnnotation;
import genericity.typing.atl_types.annotations.BindingAnn;
import genericity.typing.atl_types.annotations.CallExprAnn;
import genericity.typing.atl_types.annotations.CalledRuleAnn;
import genericity.typing.atl_types.annotations.ContextHelperAnn;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import genericity.typing.atl_types.annotations.HelperAnn;
import genericity.typing.atl_types.annotations.LazyRuleAnn;
import genericity.typing.atl_types.annotations.MatchedRuleAnn;
import genericity.typing.atl_types.annotations.MatchedRuleOneAnn;
import genericity.typing.atl_types.annotations.ModuleCallableAnn;
import genericity.typing.atl_types.annotations.OutputPatternAnn;
import genericity.typing.atl_types.annotations.TransformationAnn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;

import atl.metamodel.ATLModel;
import atl.metamodel.ATL.Binding;
import atl.metamodel.ATL.CalledRule;
import atl.metamodel.ATL.Helper;
import atl.metamodel.ATL.InPatternElement;
import atl.metamodel.ATL.LazyMatchedRule;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.Module;
import atl.metamodel.ATL.ModuleElement;
import atl.metamodel.ATL.OutPatternElement;
import atl.metamodel.ATL.RuleVariableDeclaration;
import atl.metamodel.ATL.Unit;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.BooleanExp;
import atl.metamodel.OCL.CollectionOperationCallExp;
import atl.metamodel.OCL.EnumLiteralExp;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IntegerExp;
import atl.metamodel.OCL.IterateExp;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.MapExp;
import atl.metamodel.OCL.NavigationOrAttributeCallExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OclFeature;
import atl.metamodel.OCL.OclModelElement;
import atl.metamodel.OCL.OclUndefinedExp;
import atl.metamodel.OCL.Operation;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.OperatorCallExp;
import atl.metamodel.OCL.OrderedSetExp;
import atl.metamodel.OCL.Parameter;
import atl.metamodel.OCL.PropertyCallExp;
import atl.metamodel.OCL.RealExp;
import atl.metamodel.OCL.SequenceExp;
import atl.metamodel.OCL.SetExp;
import atl.metamodel.OCL.StringExp;
import atl.metamodel.OCL.TupleExp;
import atl.metamodel.OCL.TuplePart;
import atl.metamodel.OCL.VariableDeclaration;
import atl.metamodel.OCL.VariableExp;

/**
 * 
 * @author jesus
 *
 */
public class CreateAnnotations extends AbstractAnalyserVisitor {

	public CreateAnnotations(ATLModel model, GlobalNamespace mm, Unit root, TypingModel typ, ErrorModel errors) {
		super(model, mm, root, typ, errors);
	}
	
	public void perform(ComputedAttributes attr) {
		this.attr = attr.pushVisitor(this);
		startVisiting(root);
		attr.popVisitor(this);
	}

	@Override
	public void beforeModule(Module self) {
		// Need to explicity call the creation of helper and rule annotations
		List<ModuleElement> elements = self.getElements();
		for (ModuleElement moduleElement : elements) {			
			if ( moduleElement instanceof LazyMatchedRule ) {
				createLazyMatchedRuleAnnotation( (LazyMatchedRule) moduleElement );
			} else if ( moduleElement instanceof MatchedRule ) {
				createMatchedRuleAnnotation( (MatchedRule) moduleElement );
			} else 	if ( moduleElement instanceof Helper ) {
				createHelperAnnotation( (Helper) moduleElement );
			} else 	if ( moduleElement instanceof CalledRule ) {
				createCalledRuleAnnotation( (CalledRule) moduleElement );
			} else {
				throw new UnsupportedOperationException(moduleElement.getClass().getName());
			}
		}
	}	

	@Override
	public void inModule(Module self) {
		TransformationAnn ann = typ.createTransformationAnnotation(self);
		
		List<ModuleElement> elements = self.getElements();
		for (ModuleElement moduleElement : elements) {
			AtlAnnotation me = attr.annotationOf(moduleElement);
			
			if ( moduleElement instanceof LazyMatchedRule ) {
				ann.getLazyRules().add( (LazyRuleAnn) me );
			} else if ( moduleElement instanceof MatchedRule ) {
				ann.getMatchedRules().add( (MatchedRuleAnn) me );
			} else 	if ( moduleElement instanceof Helper ) {
				ann.getHelpers().add( (HelperAnn) me );
			} else 	if ( moduleElement instanceof CalledRule ) {
				ann.getCalledRules().add( (CalledRuleAnn) me );
			} else {
				throw new UnsupportedOperationException(moduleElement.getClass().getName());
			}
		}
		
		attr.linkAnnotation(self, ann);
	}
	
	public void createHelperAnnotation(Helper self) {
		Type returnType = null;
		String name = null;
		String[] names = new String[0];
		Type[] arguments = new Type[0];
		if ( self.getDefinition().getFeature() instanceof Attribute ) {
			returnType = attr.typeOf( ((Attribute) self.getDefinition().getFeature()).getType() );
			name       = ((Attribute) self.getDefinition().getFeature()).getName();
		} else {
			returnType = attr.typeOf( ((Operation) self.getDefinition().getFeature()).getReturnType() );
			name       = ((Operation) self.getDefinition().getFeature()).getName();
		
			List<Parameter> params = ((Operation) self.getDefinition().getFeature()).getParameters();
			names 	  = new String[params.size()];
			arguments = new Type[params.size()];
			for(int i = 0; i < params.size(); i++) {
				names[i]     = params.get(i).getVarName();
				arguments[i] = attr.typeOf(params.get(i));
			}
		}
		
		HelperAnn ann = null;
		if ( self.getDefinition().getContext_() == null ) {			
			ann = typ.createModuleHelper(self, returnType);
		} else {
			ann = typ.createContextHelper(self, attr.typeOf(self.getDefinition().getContext_().getContext_()), returnType); 
		}
		
		for(int i = 0; i < names.length; i++) {
			ann.getNames().add(names[i]);
			ann.getArguments().add(arguments[i]);
		}
		
		ann.setName(name);
		
		attr.linkAnnotation(self, ann);
	}
	
	@Override
	public void inHelper(Helper self) {
		HelperAnn h = attr.annotationOf(self);
		OclExpression body = null;
		if ( self.getDefinition().getFeature() instanceof Attribute ) {
			body = ((Attribute) self.getDefinition().getFeature()).getInitExpression();
		} else {
			body = ((Operation) self.getDefinition().getFeature()).getBody();
		}
		h.setExpr(attr.<ExpressionAnnotation> annotationOf(body));
	}
	
	public void createCalledRuleAnnotation(CalledRule self) {
		// TODO: Complete called rule annotations
		System.err.println("TODO: Complete called rule annotations");
		
		CalledRuleAnn ann = typ.createCalledRuleAnn(self); // , (Metaclass) srcType, (Metaclass) tgtType);
		
		attr.linkAnnotation(self, ann);		
	}
	
	public void createLazyMatchedRuleAnnotation(LazyMatchedRule self) {
		Type srcType = attr.typeOf( self.getInPattern().getElements().get(0) );
		Type tgtType = attr.typeOf( self.getOutPattern().getElements().get(0) );

		LazyRuleAnn ann = typ.createLazyRuleAnn(self, (Metaclass) srcType, (Metaclass) tgtType);
		
		attr.linkAnnotation(self, ann);
	}
	
	public void createMatchedRuleAnnotation(MatchedRule self) {
		Type srcType = attr.typeOf( self.getInPattern().getElements().get(0) );
		Type tgtType = attr.typeOf( self.getOutPattern().getElements().get(0) );
		MatchedRuleAnn ann = null;
		
		if ( self.getInPattern().getElements().size() != 1 ) { 
			Metaclass[] types = new Metaclass[self.getInPattern().getElements().size()];
			int i = 0;
			for (InPatternElement type : self.getInPattern().getElements()) {
				types[i++] = (Metaclass) attr.typeOf(type);
			}
			ann = typ.createMatchedRuleManyAnn(self, types, (Metaclass) tgtType);			
		} else {
			ann = typ.createMatchedRuleOneAnn(self, (Metaclass) srcType, (Metaclass) tgtType);			
		}
		
		attr.linkAnnotation(self, ann);
	}
	
	@Override
	public void inMatchedRule(MatchedRule self) {
		MatchedRuleAnn ann = attr.annotationOf(self);
		
		if ( self.getInPattern().getFilter() != null ) {
			ann.setFilter( attr.<ExpressionAnnotation> annotationOf(self.getInPattern().getFilter()) ); 
		}
		
		// Replicated in inMatchedRule	
		for (OutPatternElement ope : self.getOutPattern().getElements()) {
			OutputPatternAnn customOP = typ.createOutputPattern( ope, attr.typeOf(ope.getType()) );
			List<Binding> bindings = ope.getBindings();
			for (Binding binding : bindings) {
				customOP.getBindings().add( (BindingAnn) attr.annotationOf(binding) );
			}
			
			ann.getOutputPatterns().add(customOP);
		}
	}
	
	@Override
	public void inLazyMatchedRule(LazyMatchedRule self) {
		LazyRuleAnn ann = attr.annotationOf(self);

		InPatternElement inPatternElement = self.getInPattern().getElements().get(0);
		ann.getNames().add(inPatternElement.getVarName());
		ann.getArguments().add(attr.typeOf(inPatternElement));
		
		// Replicated from inMatchedRule
		for (OutPatternElement ope : self.getOutPattern().getElements()) {
			OutputPatternAnn customOP = typ.createOutputPattern( ope, attr.typeOf(ope.getType()) );
			List<Binding> bindings = ope.getBindings();
			for (Binding binding : bindings) {
				customOP.getBindings().add( (BindingAnn) attr.annotationOf(binding) );
			}
			
			ann.getOutputPatterns().add(customOP);
		}
	}
	
	@Override
	public void inBinding(Binding self) {
		Type srcType = attr.typeOf(self.getValue());
		
		Type targetVar = attr.typeOf( self.getOutPatternElement() );
		ClassNamespace ns = (ClassNamespace) targetVar.getMetamodelRef();
		Type tgtType = ns.getFeatureType(self.getPropertyName(), self);
		
		//Type tgtType = attr.typeOf(self.g);
		
		BindingAnn ann = typ.createBindingAnnotation(self, srcType, tgtType);
		
		ann.setValue( attr.<ExpressionAnnotation> annotationOf(self.getValue()) ); 
	
		attr.linkAnnotation(self, ann);

		// System.out.println(self.getLocation() + " " + TypeUtils.typeToString(srcType));
		for(Metaclass m: typ.getInvolvedMetaclasses(srcType)) {
			ClassNamespace srcNs = (ClassNamespace) m.getMetamodelRef();
			ArrayList<ClassNamespace> nss = new ArrayList<ClassNamespace>(srcNs.getAllSubclasses());
			nss.add(srcNs);
			for(ClassNamespace sub : nss) {
				for(MatchedRule r : sub.getResolvingRules() ) {
					// System.out.println("Resolved by " + r.getName());
					ann.getResolvedBy().add( attr.<MatchedRuleOneAnn>annotationOf(r) ) ;					
				}
			}
		}
		
		
		createControlFlowGraph(ann);
		
	}


	
	private void createControlFlowGraph(BindingAnn ann) {
		ControlFlow cflow = typ.createControlFlow();
		ann.setControlFlow(cflow);		
		
		// ann.getValue()
	}

	@Override
	public void inRuleVariableDeclaration(RuleVariableDeclaration self) {
		// Ignored for the moment, not sure if needed
	}

	@Override
	public void inVariableDeclaration(VariableDeclaration self) {
		// Ignored for the moment
	}

	@Override
	public void inIfExp(IfExp self) {
		attr.linkAnnotation(self, 
				typ.createIfExprAnnnotation(self, attr.typeOf(self), 
						attr.<ExpressionAnnotation> annotationOf(self.getCondition()),
						attr.<ExpressionAnnotation> annotationOf(self.getThenExpression()),
						attr.<ExpressionAnnotation> annotationOf(self.getElseExpression()) ));		
	}
	
	@Override
	public void inLetExp(LetExp self) {
		attr.linkAnnotation(self, 
				typ.createLetExprAnnnotation(self, attr.typeOf(self), 
						attr.<ExpressionAnnotation> annotationOf(self.getVariable().getInitExpression()),
						attr.<ExpressionAnnotation> annotationOf(self.getIn_()) ));		
	}
	

	@Override
	public void inVariableExp(VariableExp self) {
		attr.linkAnnotation(self, typ.createGenericExprAnnnotation(self, attr.typeOf(self)));
	}
	
	//
	// Navigation:
	//
	//   Invocations to methods, features, etc. => OperationCall
	//   Invocations to iterators               => IteratorExpression
	//
	
	@Override
	public void inIterateExp(IterateExp self) {
		attr.linkAnnotation(self, 
				typ.createIterateExprAnnnotation(self, attr.typeOf(self), 
						attr.<ExpressionAnnotation> annotationOf(self.getSource()),
						attr.<ExpressionAnnotation> annotationOf(self.getBody()),
						attr.<ExpressionAnnotation> annotationOf(self.getResult().getInitExpression() )));		
	}
	
	@Override
	public void inIteratorExp(IteratorExp self) {
		attr.linkAnnotation(self, 
				typ.createIteratorExprAnnnotation(self, attr.typeOf(self), 
						attr.<ExpressionAnnotation> annotationOf(self.getSource()),
						attr.<ExpressionAnnotation> annotationOf(self.getBody()) ));		
	}
	
	@Override
	public void inNavigationOrAttributeCallExp(NavigationOrAttributeCallExp self) {
		CallExprAnn ann = annotationOperationCall(self, Collections.<OclExpression> emptyList());
		
		Type srcType = attr.typeOf(self.getSource());
		ann.setReceptorType( srcType );
		
		if ( srcType instanceof Metaclass ) {
			ClassNamespace cn = (ClassNamespace) srcType.getMetamodelRef();
			EStructuralFeature f = cn.getFeatureInfo(self.getName());
			if ( f != null  ) {
				ann.setUsedFeature(f);
			} else {
				computeResolvers(self, ann, self.getName());				
			}
		} else if ( srcType instanceof UnionType ) {
			System.err.println("TODO: How to deal with this in createannotations... setUsedFeature...");
		}
		
		
	}
	
	@Override
	public void inOperationCallExp(OperationCallExp self) {
		CallExprAnn ann = annotationOperationCall(self, self.getArguments());
		computeResolvers(self, ann, self.getOperationName());
	}

	private void computeResolvers(PropertyCallExp self, CallExprAnn ann, String featureOrOperationName) {
		if ( ann.getSource().getType() instanceof Metaclass && !(self.getSource() instanceof OclModelElement) ) {
			ann.setIsStaticCall(false);
			ClassNamespace cn = (ClassNamespace) ann.getSource().getType().getMetamodelRef();
			if ( cn.getAttachedOclFeature(featureOrOperationName) != null ) {
			
				//System.out.println(TypeUtils.typeToString(ann.getSource().getType()) + "." + self.getOperationName() + " - " + self.getLocation());
				OclFeature op = cn.getAttachedOclFeature(featureOrOperationName);
			
				Helper h = op.container_().container(Helper.class);
				ann.setStaticResolver( attr.<HelperAnn>annotationOf(h) );
				ann.getDynamicResolvers().add( attr.<ContextHelperAnn>annotationOf(h) ) ;
			}
			
			for(ClassNamespace sub : cn.getAllSubclasses()) {
				if ( sub.getAttachedOclFeature(featureOrOperationName) != null ) {
					OclFeature op =  sub.getAttachedOclFeature(featureOrOperationName);
					Helper h = op.container_().container(Helper.class);
					ann.getDynamicResolvers().add( attr.<ContextHelperAnn>annotationOf(h) ) ;					
				}
			}
			
		} else if ( ann.getSource().getType() instanceof ThisModuleType ) {
			ann.setIsStaticCall(true);
			TransformationNamespace tn = (TransformationNamespace) ann.getSource().getType().getMetamodelRef();
			if ( tn.getAttachedOclFeature(featureOrOperationName) != null ) {
				OclFeature op = tn.getAttachedOclFeature(featureOrOperationName);
				Helper h = op.container_().container(Helper.class);

				ModuleCallableAnn x = attr.<ModuleCallableAnn>annotationOf(h);
				ann.setStaticResolver( x );
			} else if ( tn.hasLazyRule(featureOrOperationName) ) {
				LazyMatchedRule r = tn.getLazyRule(featureOrOperationName);
				ModuleCallableAnn x = attr.<ModuleCallableAnn>annotationOf(r);
				ann.setStaticResolver( x  );
			} else if ( tn.hasCalledRule(featureOrOperationName) ) {
				CalledRule r = tn.getCalledRule(featureOrOperationName);
				ModuleCallableAnn x = attr.<ModuleCallableAnn>annotationOf(r);
				ann.setStaticResolver( x  );
			}
		}
	}
	
	@Override
	public void inCollectionOperationCallExp(CollectionOperationCallExp self) {
		annotationOperationCall(self, self.getArguments());
	}

	@Override
	public void inOperatorCallExp(OperatorCallExp self) {
		annotationOperationCall(self, self.getArguments());
	}

	private CallExprAnn annotationOperationCall(PropertyCallExp self, List<OclExpression> arguments) {
		CallExprAnn exprAnn = (CallExprAnn) 
				typ.createCallExprAnnnotation(self, attr.typeOf(self), 
				(ExpressionAnnotation) attr.annotationOf(self.getSource()),
				getAnnotations( arguments ) );
		
		// System.out.println("Ann: " +  TypeUtils.typeToString(exprAnn.getType()) + " - " + self.getLocation());
		
		
		attr.linkAnnotation(self,  exprAnn);		

		return exprAnn;
	}
	
	// 
	// Literal values
	// 
	
	@Override
	public void inOclModelElement(OclModelElement self) {
		attr.linkAnnotation(self, typ.createGenericExprAnnnotation(self, attr.typeOf(self)));
	}
	
	@Override
	public void inEnumLiteralExp(EnumLiteralExp self) {
		attr.linkAnnotation(self, typ.createGenericExprAnnnotation(self, attr.typeOf(self)));
	}
	
	@Override
	public void inStringExp(StringExp self) {
		attr.linkAnnotation(self, typ.createGenericExprAnnnotation(self, attr.typeOf(self)));
	}

	@Override
	public void inIntegerExp(IntegerExp self) {
		attr.linkAnnotation(self, typ.createGenericExprAnnnotation(self, attr.typeOf(self)));
	}

	@Override
	public void inRealExp(RealExp self) {
		attr.linkAnnotation(self, typ.createGenericExprAnnnotation(self, attr.typeOf(self)));
	}

	@Override
	public void inBooleanExp(BooleanExp self) {
		attr.linkAnnotation(self, typ.createGenericExprAnnnotation(self, attr.typeOf(self)));
	}
	
	@Override
	public void inOclUndefinedExp(OclUndefinedExp self) {
		attr.linkAnnotation(self, typ.createGenericExprAnnnotation(self, attr.typeOf(self)));
	}

	@Override
	public void inSequenceExp(SequenceExp self) {
		attr.linkAnnotation(self, typ.createCollectionExprAnnnotation(self, attr.typeOf(self), getAnnotations(self.getElements())) );
	}
		
	@Override
	public void inSetExp(SetExp self) {
		attr.linkAnnotation(self, typ.createCollectionExprAnnnotation(self, attr.typeOf(self), getAnnotations(self.getElements())) );
	}	

	@Override
	public void inOrderedSetExp(OrderedSetExp self) {
		attr.linkAnnotation(self, typ.createCollectionExprAnnnotation(self, attr.typeOf(self), getAnnotations(self.getElements())) );
	}

	@Override
	public void inMapExp(MapExp self) {
		attr.linkAnnotation(self, typ.createMapExprAnnnotation(self, attr.typeOf(self)));
	}

	@Override
	public void inTupleExp(TupleExp self) {
		ExpressionAnnotation[] anns = new ExpressionAnnotation[self.getTuplePart().size()];
		int i = 0;
		for(TuplePart p : self.getTuplePart()) {
			AtlAnnotation ann = attr.annotationOf( p.getInitExpression() );
			anns[i] = (ExpressionAnnotation) ann;
			i++;
		}
		
		attr.linkAnnotation(self, typ.createTupleExprAnnotation(self, attr.typeOf(self), anns));
	}

	private ExpressionAnnotation[] getAnnotations(List<atl.metamodel.OCL.OclExpression> elements) {
		ExpressionAnnotation[] anns = new ExpressionAnnotation[elements.size()];
		for(int i = 0; i < elements.size(); i++) {
			anns[i] = (ExpressionAnnotation) attr.annotationOf(elements.get(i));
		}
		return anns;
	}
}
