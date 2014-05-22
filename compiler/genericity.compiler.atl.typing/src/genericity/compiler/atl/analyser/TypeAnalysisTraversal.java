package genericity.compiler.atl.analyser;

import genericity.compiler.atl.analyser.namespaces.CollectionNamespace;
import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import genericity.compiler.atl.analyser.namespaces.ITypeNamespace;
import genericity.compiler.atl.analyser.namespaces.MetamodelNamespace;
import genericity.compiler.atl.analyser.recovery.IRecoveryAction;
import genericity.typing.atl_types.BooleanType;
import genericity.typing.atl_types.CollectionType;
import genericity.typing.atl_types.EmptyCollectionType;
import genericity.typing.atl_types.EnumType;
import genericity.typing.atl_types.ThisModuleType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.TypeError;
import genericity.typing.atl_types.Unknown;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import atl.metamodel.ATLModel;
import atl.metamodel.ATLModelBaseObject;
import atl.metamodel.ATL.Binding;
import atl.metamodel.ATL.CalledRule;
import atl.metamodel.ATL.ForEachOutPatternElement;
import atl.metamodel.ATL.ForStat;
import atl.metamodel.ATL.Helper;
import atl.metamodel.ATL.LazyMatchedRule;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.Module;
import atl.metamodel.ATL.ModuleElement;
import atl.metamodel.ATL.OutPattern;
import atl.metamodel.ATL.OutPatternElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.ATL.RuleVariableDeclaration;
import atl.metamodel.ATL.SimpleInPatternElement;
import atl.metamodel.ATL.SimpleOutPatternElement;
import atl.metamodel.ATL.Unit;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.BooleanExp;
import atl.metamodel.OCL.CollectionOperationCallExp;
import atl.metamodel.OCL.EnumLiteralExp;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IntegerExp;
import atl.metamodel.OCL.IterateExp;
import atl.metamodel.OCL.Iterator;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.LoopExp;
import atl.metamodel.OCL.MapExp;
import atl.metamodel.OCL.NavigationOrAttributeCallExp;
import atl.metamodel.OCL.OclContextDefinition;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OclFeature;
import atl.metamodel.OCL.OclFeatureDefinition;
import atl.metamodel.OCL.OclUndefinedExp;
import atl.metamodel.OCL.Operation;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.OperatorCallExp;
import atl.metamodel.OCL.OrderedSetExp;
import atl.metamodel.OCL.RealExp;
import atl.metamodel.OCL.SequenceExp;
import atl.metamodel.OCL.SetExp;
import atl.metamodel.OCL.StringExp;
import atl.metamodel.OCL.TupleExp;
import atl.metamodel.OCL.TuplePart;
import atl.metamodel.OCL.VariableDeclaration;
import atl.metamodel.OCL.VariableExp;
import bento.analysis.atl_analysis.atl_error.LocalProblem;

public class TypeAnalysisTraversal extends AbstractAnalyserVisitor {

	public TypeAnalysisTraversal(ATLModel model, GlobalNamespace mm, Unit root, TypingModel typ, ErrorModel errors) {
		super(model, mm, root, typ, errors);
	
		attr = new ComputedAttributes(this);
		mm.setDependencies(new EcoreTypeConverter(typ), errors);
	}
		
	
	public void perform() {
		// 1. Get meta-model elements for the explicitly named types
		ExplicitTypeTraversal explicit = new ExplicitTypeTraversal(model, mm, root, typ, errors);
		explicit.perform(attr);
		
		// 2. Process helpers and operations
		TopLevelTraversal helperOperations = new TopLevelTraversal(model, mm, root, typ, errors);
		helperOperations.perform(attr);
		
		startVisiting(root);

		CreateAnnotations annotations = new CreateAnnotations(model, mm, root, typ, errors);
		annotations .perform(attr);

		RuleAnalysis ruleAnalysis = new RuleAnalysis(model, mm, root, typ, errors);
		ruleAnalysis.perform(attr);

	}
	
	
	private ThisModuleType thisModuleType;

	private ThisModuleType getThisModuleType() {
		if ( thisModuleType == null ) {
			thisModuleType = typ.createThisModuleType();
			thisModuleType.setMetamodelRef(mm.getTransformationNamespace());
		}
		return thisModuleType;
	}

	
	public VisitingActions preModule(atl.metamodel.ATL.Module self) { 
		return actions("libraries", "inModels", "outModels", 
				filter("getHelpers", self), filter("getRules", self));
	} 
	
	@Override
	public VisitingActions preMatchedRule(MatchedRule self) {
		return actions("variables", "inPattern", "outPattern" , "actionBlock"); 
	}
	
	@Override
	public VisitingActions preLazyMatchedRule(LazyMatchedRule self) {
		return actions("variables", "inPattern", "outPattern" , "actionBlock"); 
	}

	@Override
	public VisitingActions preCalledRule(CalledRule self) {
		return actions("parameters", "variables", "outPattern" , "actionBlock"); 
	}
	
	
	public List<Helper> getHelpers(atl.metamodel.ATL.Module self) {
		LinkedList<Helper> helpers = new LinkedList<Helper>();
		for (ModuleElement me : self.getElements()) {
			if ( me instanceof Helper ) {
				Helper h = (Helper) me;
				OclFeature f = h.getDefinition().getFeature();
				if ( f instanceof Operation ) {
					if ( attr.typeOf( ((Operation) f).getReturnType() ) instanceof Unknown ) {
						helpers.addFirst(h);
						continue;
					} 
				} else if ( f instanceof Attribute ) {
					if ( attr.typeOf( ((Attribute) f).getType() ) instanceof Unknown ) {
						helpers.addFirst(h);
						continue;						
					}
				}
				
				helpers.addLast((Helper) me);				
			}
		}
		return helpers;
	}

	public List<Rule> getRules(atl.metamodel.ATL.Module self) {
		ArrayList<Rule> rules = new ArrayList<Rule>();
		for (ModuleElement me : self.getElements()) {
			if ( me instanceof Rule ) 
				rules.add((Rule) me);
		}
		return rules;
	}

	@Override
	public void inOperation(Operation self) {
		Type declared = attr.typeOf(self.getReturnType());
		Type inferred = attr.typeOf(self.getBody());
		
		if ( declared instanceof Unknown ) {
			TopLevelTraversal.extendTypeForOperation(self, mm, attr, inferred);
		}
	}
	
	@Override
	public void inAttribute(Attribute self) {
		Type declared = attr.typeOf(self.getType());
		Type inferred = attr.typeOf(self.getInitExpression());

		if ( declared instanceof Unknown ) {
			TopLevelTraversal.extendTypeForAttribute(self, mm, attr, inferred);
		}
	}
	
	

	public VisitingActions preLetExp(atl.metamodel.OCL.LetExp self) { return actions("type" , "variable" , "in_"); } 

	
	@Override
	public void inBinding(Binding self) {
	//	System.out.println("Binding: " + self.getLocation() + " is " + TypeUtils.typeToString(attr.typeOf(self.getValue())) + " - " + attr.typeOf(self.getValue()));
	}
	
	@Override
	public void inLetExp(LetExp self) {
		attr.linkExprType( attr.typeOf( self.getIn_() ) );
	}
	
	@Override
	public void inVariableDeclaration(VariableDeclaration self) {
		treatVariableDeclaration(self);
	}


	private void treatVariableDeclaration(VariableDeclaration self) {
		Type exprType = attr.typeOf( self.getInitExpression() );
		if ( self.getType() == null ) {
			attr.linkExprType(exprType);
		} else {
			Type declared = attr.typeOf( self.getType() );

			if ( ! typ.assignableTypes(declared, exprType) ) {
				errors.warningVarDclIncoherentTypes(exprType, declared, self);
			
				if ( AnalyserContext.isVarDclInferencePreferred() && typ.moreConcrete(declared, exprType) == exprType ) {
					attr.linkExprType(exprType);					
				}
			} else {
				attr.linkExprType(exprType);
			}
			
			/*
			// Try to find out the most concrete type...
			// TODO: So far only a simple strategy
			if ( declared instanceof Unknown ) {
				attr.linkExprType(exprType);
			} else {			
				attr.linkExprType( declared ); 
			}
			*/
		}
	}
	
	@Override
	public void inRuleVariableDeclaration(RuleVariableDeclaration self) {
		treatVariableDeclaration(self);
		/*
		Type t = attr.typeOf( self.getInitExpression() );
		if ( self.getType() != null ) {
			// Decide about the most concrete type
			// TODO: WARNING MAY ARISE IF THEY DO NO COINCIDE
		} else {
			attr.linkExprType(t);
		}
		*/
	}


	@Override
	public VisitingActions preIfExp(IfExp self) {
		return actions("type", "condition", 
				method("createIfScope", self, true), "thenExpression" , method("createIfScope", self, false), 
				"elseExpression");
	}
	
	public void createIfScope(IfExp self, java.lang.Boolean open) {
		if ( attr.typeOf(self.getCondition()) instanceof BooleanType ) {		
			BooleanType t = (BooleanType) attr.typeOf(self.getCondition());
			if ( t.getKindOfTypes().isEmpty() ) 
				return;
		}
		
		
		// System.out.println(t);
		//if ( open ) attr.pushScope();
		//else        attr.popScope();
	}
	
	@Override
	public void inIfExp(IfExp self) {
		final Type thenPart = attr.typeOf(self.getThenExpression());
		final Type elsePart = attr.typeOf(self.getElseExpression());
				
		// TODO: Perhaps not the same type but compatible types!
		if ( ! typ.equalTypes(thenPart, elsePart) ) {
			if ( thenPart instanceof CollectionType && elsePart instanceof CollectionType ) {
				CollectionType ctThen = (CollectionType) thenPart;
				CollectionType ctElse = (CollectionType) elsePart;
				
				if ( ctThen.getContainedType() instanceof EmptyCollectionType && ! (ctElse.getContainedType() instanceof EmptyCollectionType) ) {
					attr.linkExprType( elsePart );
					return;
				} else if ( ctElse.getContainedType() instanceof EmptyCollectionType && ! (ctThen.getContainedType() instanceof EmptyCollectionType) ) {
					attr.linkExprType( thenPart );					
					return;
				}
			} else if ( thenPart instanceof TypeError ) {
				attr.linkExprType( elsePart );					
				return;
			} else if ( elsePart instanceof TypeError ) {
				attr.linkExprType( thenPart );					
				return;
			} 

			Type recovered = typ.getCommonType(thenPart, elsePart);
			// TODO: Do this better because this generates a lot of false errors...
			/*
			Type recovered = errors.signalDifferentBranchTypes(thenPart, elsePart, self, new IRecoveryAction() {
				@Override
				public Type recover(ErrorModel m, LocalProblem p) {
					// TODO: Launch a greedy algorithm to decide the best option
					//       between thenPart and elsePart										
					return thenPart;
				}
			});
			*/
			
			attr.linkExprType( recovered );
		} else {			
			attr.linkExprType( thenPart );
		}
	}
	
	// 
	// Navigation
	//
	
	@Override
	public VisitingActions preIteratorExp(IteratorExp self) {
		return actions("source", "iterators", "body");
	}
	
	
	
	@Override
	public void inIterator(Iterator self) {
		if ( self.container_() instanceof LoopExp ) { // IteratorExp & IterateExp
			Type collType = attr.typeOf(self.container(LoopExp.class).getSource());
			if ( !(collType instanceof CollectionType) ) {
				errors.signalIteratorOverNoCollectionType(collType, self.container(LoopExp.class));
			}
	
			Type t = ((CollectionNamespace) collType.getMetamodelRef()).unwrap();
			attr.linkExprType( t );
		// } else if ( self.container_() instanceof IterateExp ) {
			
		} else if ( self.container_() instanceof ForEachOutPatternElement ){
			ForEachOutPatternElement e = self.container(ForEachOutPatternElement.class);
			Type t = attr.typeOf(e.getCollection());
			if ( ! (t instanceof CollectionType) ) {
				t = AnalyserContext.getErrorModel().signalExpectedCollectionInForEachOutputPattern(e);
			} else {
				t = ((CollectionType) t).getContainedType();
			}
			attr.linkExprType(self, t);
		} else {
			ForStat fs = self.container(ForStat.class);
			Type t = attr.typeOf(fs.getCollection());
			if ( ! (t instanceof CollectionType) ) {
				t = AnalyserContext.getErrorModel().signalExpectedCollectionInForStat(fs);
			} else {
				t = ((CollectionType) t).getContainedType();
			}
			attr.linkExprType(self, t);
			
		}
	}
	
	@Override
	public VisitingActions preIterateExp(IterateExp self) {
		return actions("source", "iterators" , "result", "type" , "body" );
	}
	
	@Override
	public VisitingActions preForEachOutPatternElement(ForEachOutPatternElement self) {
		return actions("type" , "initExpression" , "collection", "iterator", "bindings" ); 
	}
	
	@Override
	public VisitingActions preForStat(ForStat self) {
		return actions("collection" , "iterator" , "statements" ); 
	}
	
	
	@Override
	public void inIterateExp(IterateExp self) {
		attr.linkExprType( attr.typeOf( self.getResult() ) );
	}
	
	@Override
	public void inIteratorExp(IteratorExp self) {
		// Type collType = attr.typeOf(self.getSource());
		CollectionType srcType  = (CollectionType) attr.typeOf( self.getSource() );
		Type bodyType = attr.typeOf( self.getBody() ); 
		
		CollectionNamespace cspace = (CollectionNamespace) srcType.getMetamodelRef();
		attr.linkExprType( cspace.getIteratorType(self.getName(), bodyType, self) );
	}
	
	@Override
	public void inNavigationOrAttributeCallExp(NavigationOrAttributeCallExp self) {
		Type t = attr.typeOf( self.getSource() );
		
		// TODO: FIX: Warn about navigation of collection with "." (ATL just crash)
		ITypeNamespace tspace = (ITypeNamespace) t.getMetamodelRef();
		Type t2 = tspace.getFeatureType(self.getName(), self);
	
		attr.linkExprType(t2);
		/*
		// Get the navigated feature, cached by featureType
		navFeature[self] <- self.getLastNavigatedFeature
		*/
	}
	
	@Override
	public void inOperationCallExp(OperationCallExp self) {
		if ( self.getOperationName().equals("resolveTemp") ) {
			resolveResolveTemp(self);
			return;
		} else if ( self.getOperationName().equals("oclAsType") ) {
			// Special addition, not supported by ATL
			attr.linkExprType(attr.typeOf( self.getArguments().get(0) ));
			return;
		}
		
		Type t = attr.typeOf( self.getSource() );
		Type[] arguments  = new Type[self.getArguments().size()];
		for(int i = 0; i < self.getArguments().size(); i++) {
			arguments[i] = attr.typeOf(self.getArguments().get(i));
		}
	
		if ( t instanceof CollectionType && AnalyserContext.isOclStrict() ) {
			errors.signalOperationOverCollectionType(self);
		}
		
		ITypeNamespace tspace = (ITypeNamespace) t.getMetamodelRef();
		if ( self.getOperationName().equals("") ) {
			
		}
		attr.linkExprType( tspace.getOperationType(self.getOperationName(), arguments, self) );
	}
	
	private void resolveResolveTemp(OperationCallExp self) {
		if ( ! (root instanceof Module ) ) {
			errors.signalNoRecoverableError("resolveTemp only available in transformation modules", self);
		}
		
		if ( self.getArguments().size() != 2 ) {
			errors.signalNoRecoverableError("resolveTemp expects two arguments", self);
		}

		if ( ! (self.getArguments().get(1) instanceof StringExp ) ) {
			System.out.println("Cannot deal with resolveTemp with second argument not being string: " + self.getLocation());
			// attr.linkExprType(typ.newUnknownType());
			attr.linkExprType(typ.newTypeErrorType(null));
			return;
		}
		
		OclExpression resolvedObj = self.getArguments().get(0);
		String expectedVarName = ((StringExp) self.getArguments().get(1)).getStringSymbol();
		String compatibleRules  = "";
		String withSameVarRules = "";
		Type selectedType = null;
		
		Module m = (Module) root;
		for(ModuleElement e : m.getElements()) {
			if ( e instanceof MatchedRule ) {
				MatchedRule mr = (MatchedRule) e;
				if ( mr.getInPattern().getElements().size() == 1 ) {
					SimpleInPatternElement pe = (SimpleInPatternElement) mr.getInPattern().getElements().get(0);
					Type type_ = attr.typeOf(resolvedObj);
					Type supertype = attr.typeOf(pe.getType());
					
					// System.out.println(TypeUtils.typeToString(type_) + " - " + TypeUtils.typeToString(supertype));
					if ( typ.isCompatible(type_, supertype) ) {
						compatibleRules += mr.getName() + ", ";
						
						// This is the rule!
						OutPattern po = mr.getOutPattern();
						for(OutPatternElement ope : po.getElements()) {
							SimpleOutPatternElement sope = (SimpleOutPatternElement) ope;
							if ( sope.getVarName().equals(expectedVarName) ) {
								Type t = attr.typeOf(sope.getType());
								
								withSameVarRules += mr.getName() + ", ";
								if ( selectedType != null && ! typ.equalTypes(t, selectedType)) {
									errors.signalNoRecoverableError("Several rules may resolve the same resolveTemp with different target types: " + withSameVarRules, self);
								}
								
								selectedType = t;								
							}
						}				
					}
				}
			}
		}
		
		if ( selectedType != null ) {
			attr.linkExprType(selectedType);
			return;
		}
		
		errors.signalNoRecoverableError("No output pattern " + expectedVarName + " in rule(s): " + compatibleRules, self);
	}


	@Override
	public void inVariableExp(VariableExp self) {
		if ( self.getReferredVariable().getVarName().equals("self") ) {
			// Find the container that defines the self's type
			ATLModelBaseObject container = self.container_();
			while ( container != null ) {
				if ( container instanceof OclFeatureDefinition ) {
					OclContextDefinition ctx = ((OclFeatureDefinition) container).getContext_();	
					if ( ctx == null ) {
						attr.linkExprType( getThisModuleType() ); // self may refer to thisModule in a global helper...						
					} else {
						attr.linkExprType( attr.typeOf(ctx.getContext_() ));
					}
					break;
				}
				container = container.container_();
			}
			
			if ( container == null ) {
				throw new IllegalStateException("Could not find context for self " + self.getLocation());
			}
			
		} else if ( self.getReferredVariable().getVarName().equals("thisModule") ) {
			attr.linkExprType( getThisModuleType() );
		} else {
			attr.linkExprType( attr.typeOf(self.getReferredVariable()) );
		}
	}
	
	@Override
	public void inCollectionOperationCallExp(final CollectionOperationCallExp self) {
		final Type receptorType = attr.typeOf(self.getSource());
		final Type[] arguments  = new Type[self.getArguments().size()];
		for(int i = 0; i < self.getArguments().size(); i++) {
			arguments[i] = attr.typeOf(self.getArguments().get(i));
		}
		
		if ( ! ( receptorType instanceof CollectionType ) ) {
			final Type t;
			ITypeNamespace tspace = (ITypeNamespace) receptorType.getMetamodelRef();	
			if ( tspace.hasOperation(self.getOperationName(), arguments)) {
				t = tspace.getOperationType(self.getOperationName(), arguments, self);
			} else {
				t = null;
			}

			if ( AnalyserContext.isOclStrict() ) {
				errors.signalCollectionOperationOverNoCollectionType(receptorType, self, new IRecoveryAction() {				
					@Override
					public Type recover(ErrorModel m, LocalProblem p) {
						return t;
					}
				});

				attr.linkExprType( t );
			} else if ( t == null ) {
				Type error = errors.signalNoOperationFound(receptorType, self.getOperationName(), self, null);
				attr.linkExprType( error );
			} else {
				attr.linkExprType( t );
			}
			
		} else {
			CollectionNamespace namespace = (CollectionNamespace) receptorType.getMetamodelRef();
			String          operationName = self.getOperationName();
			
			Type t = namespace.getOperationType(operationName, arguments, self);
			attr.linkExprType(t);
		}
	}

	@Override
	public void inOperatorCallExp(OperatorCallExp self) {
		Type t = attr.typeOf(self.getSource());
		Type optional = null;
		if ( self.getArguments().size() > 0 )
			optional = attr.typeOf(self.getArguments().get(0));

		if ( optional instanceof TypeError ) {
			// propagate error
			attr.linkExprType(optional);
			return;
		}
		
		ITypeNamespace tspace = (ITypeNamespace) t.getMetamodelRef();
		attr.linkExprType(tspace.getOperatorType(self.getOperationName(), optional, self));
	}
	// 
	// Literal values
	// 
	
	@Override
	public void inEnumLiteralExp(EnumLiteralExp self) {
		for(MetamodelNamespace ns : mm.getMetamodels()) {
			EnumType enum_ = ns.findEnumLiteral(self.getName());
			if ( enum_ != null ) {
				attr.linkExprType( enum_ );
				return;
			}
		}
		
		errors.signalNoEnumLiteral(self.getName(), self);
	}
	
	@Override
	public void inStringExp(StringExp obj) {
		attr.linkExprType(typ.newStringType());
	}

	@Override
	public void inIntegerExp(IntegerExp obj) {
		attr.linkExprType(typ.newIntegerType());
	}

	@Override
	public void inRealExp(RealExp obj) {
		attr.linkExprType(typ.newFloatType());
	}

	@Override
	public void inBooleanExp(BooleanExp self) {
		attr.linkExprType(typ.newBooleanType());
	}
	
	@Override
	public void inOclUndefinedExp(OclUndefinedExp obj) {
		attr.linkExprType(typ.newOclUndefinedType());		
	};

	@Override
	public void inSequenceExp(SequenceExp self) {
		// Three cases:
		//   - Non empty inicialization -> types is the union of all the expressions (elements reference)
		//   - Empty inicialization within VarDcl -> type of the VarDcl (may create circular dep if done naively!)
		//   - Unknown

		if ( self.getElements().isEmpty() ) {
			/*
			self._refContainer.kind_of(atl!VariableDeclaration).if_else({
				type[self] <- type[self._refContainer.type]
			}, {
				t = typ!EmptyCollection.new
						t.multivalued = true
						type[self] <- t
			})
			*/
			attr.linkExprType( typ.newSequenceType( typ.newEmptyCollectionType() ) );
		} else {
			// TODO: Generalize computing the union of all expression elements
			// For the moment just taking the first
			OclExpression representative = self.getElements().get(0);
			attr.linkExprType( typ.newSequenceType( attr.typeOf(representative) ) );
		}		
	}
		
	/* Same as SequenceExp */
	@Override
	public void inSetExp(SetExp self) {
		if ( self.getElements().isEmpty() ) {
			attr.linkExprType( typ.newSetType( typ.newUnknownType() ) );
		} else {
			OclExpression representative = self.getElements().get(0);
			attr.linkExprType( typ.newSetType( attr.typeOf(representative) ) );
		}		
	}
	

	/* Same as Copied from ordered set, using SET as OrderedSet! */
	@Override
	public void inOrderedSetExp(OrderedSetExp self) {
		if ( self.getElements().isEmpty() ) {
			attr.linkExprType( typ.newSetType( typ.newUnknownType() ) );
		} else {
			OclExpression representative = self.getElements().get(0);
			attr.linkExprType( typ.newSetType( attr.typeOf(representative) ) );
		}		
	}

	@Override
	public void inMapExp(MapExp self) {
		if ( self.getElements().size() != 0 ) {
			// throw new UnsupportedOperationException("TODO: Implement map initialization with elements" + self.getLocation());
			List<Type> keys   = new ArrayList<Type>();
			List<Type> values = new ArrayList<Type>();
			for(int i = 0; i < self.getElements().size(); i++) {
				keys.add(attr.typeOf(self.getElements().get(i).getKey()));
				values.add(attr.typeOf(self.getElements().get(i).getValue()));
			}
			
			attr.linkExprType( typ.newMapType( typ.getCommonType(keys), typ.getCommonType(values)) );
		} else {
			attr.linkExprType( typ.newMapType( typ.newUnknownType(), typ.newUnknownType()) );
		}
	}
	
	@Override
	public void inTupleExp(TupleExp self) {
		Type[] attTypes   = new Type[self.getTuplePart().size()];
		String[] attNames = new String[self.getTuplePart().size()];
		
		int i = 0;
		for(TuplePart tp : self.getTuplePart()) {
			// TODO: As with var. declarations, check if type and initializer are compatible...
			if ( tp.getType() != null ) {
				attTypes[i] = attr.typeOf(tp.getType());
			} else {
				attTypes[i] = attr.typeOf(tp.getInitExpression());				
			}
			attNames[i] = tp.getVarName();
			i++;
		}
		attr.linkExprType( typ.newTupleTuple(attNames, attTypes) );
		}
}
