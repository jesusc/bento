package genericity.compiler.atl.analyser;

import genericity.compiler.atl.analyser.namespaces.CollectionNamespace;
import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import genericity.compiler.atl.analyser.namespaces.ITypeNamespace;
import genericity.typing.atl_types.CollectionType;
import genericity.typing.atl_types.ThisModuleType;
import genericity.typing.atl_types.Type;
import atl.metamodel.ATLModel;
import atl.metamodel.ATLModelBaseObject;
import atl.metamodel.ATL.Binding;
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
import atl.metamodel.ATLModelVisitor.VisitedReferences;
import atl.metamodel.OCL.BooleanExp;
import atl.metamodel.OCL.CollectionOperationCallExp;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IntegerExp;
import atl.metamodel.OCL.IterateExp;
import atl.metamodel.OCL.Iterator;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.LoopExp;
import atl.metamodel.OCL.NavigationOrAttributeCallExp;
import atl.metamodel.OCL.OclContextDefinition;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OclFeatureDefinition;
import atl.metamodel.OCL.OclUndefinedExp;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.OperatorCallExp;
import atl.metamodel.OCL.RealExp;
import atl.metamodel.OCL.SequenceExp;
import atl.metamodel.OCL.StringExp;
import atl.metamodel.OCL.VariableDeclaration;
import atl.metamodel.OCL.VariableExp;

public class BottomUpTraversal extends AbstractAnalyserVisitor {

	public BottomUpTraversal(ATLModel model, GlobalNamespace mm, Unit root, TypingModel typ, ErrorModel errors) {
		super(model, mm, root, typ, errors);
	
		attr = new ComputedAttributes(this);
		mm.setDependencies(new EcoreTypeConverter(typ), typ, errors);
	}
		
	
	public void perform() {
		// 1. Get meta-model elements for the explicitly named types
		ExplicitTypeTraversal explicit = new ExplicitTypeTraversal(model, mm, root, typ, errors);
		explicit.perform(attr);
		
		// 2. Process helpers and operations
		TopLevelTraversal helperOperations = new TopLevelTraversal(model, mm, root, typ, errors);
		helperOperations.perform(attr);
		
		startVisiting(root);
	}
	

	
	private ThisModuleType thisModuleType;

	private ThisModuleType getThisModuleType() {
		if ( thisModuleType == null ) {
			thisModuleType = typ.createThisModuleType();
			thisModuleType.setMetamodelRef(mm.getTransformationNamespace());
		}
		return thisModuleType;
	}

	
	@Override
	public void inRuleVariableDeclaration(RuleVariableDeclaration self) {
		Type t = attr.typeOf( self.getInitExpression() );
		if ( self.getType() != null ) {
			// Decide about the most concrete type
			// TODO: WARNING MAY ARISE IF THEY DO NO COINCIDE
		} else {
			attr.linkType(t);
		}
	}
	
	@Override
	public void inBinding(Binding self) {
		Type t = attr.typeOf(self.getValue());
		typ.createBindingAnnotation(self, t);
	}
	

	public VisitedReferences preLetExp(atl.metamodel.OCL.LetExp self) { return refs("type" , "variable" , "in_"); } 

	
	@Override
	public void inLetExp(LetExp self) {
		attr.linkType( attr.typeOf( self.getIn_() ) );
	}
	
	@Override
	public void inVariableDeclaration(VariableDeclaration self) {
		if ( self.getType() == null ) {
			Type exprType = attr.typeOf( self.getInitExpression() );
			attr.linkType(exprType);
		} else {
			// TODO: Check consistency
			System.out.println("BottomUpTraversal.inVariableDeclaration() : TODO: Check consistency");
		}
	}

	@Override
	public void inIfExp(IfExp self) {
		Type thenPart = attr.typeOf(self.getThenExpression());
		Type elsePart = attr.typeOf(self.getElseExpression());
		
		if ( thenPart != elsePart ) {
			System.out.println("TODO: Check if - else type conformance");
		}
		
		attr.linkType( thenPart );
		
	}
	
	// 
	// Navigation
	//
	
	@Override
	public VisitedReferences preIteratorExp(IteratorExp self) {
		return refs("source", "iterators", "body");
	}
	
	@Override
	public void inIterator(Iterator self) {
		if ( self.container_() instanceof LoopExp ) { // IteratorExp & IterateExp
			Type collType = attr.typeOf(self.container(LoopExp.class).getSource());
			if ( !(collType instanceof CollectionType) ) {
				errors.signalIteratorOverNoCollectionType(collType, self.container(LoopExp.class));
			}
	
			Type t = ((CollectionNamespace) collType.getMetamodelRef()).unwrap();
			attr.linkType( t );
		// } else if ( self.container_() instanceof IterateExp ) {
			
		} else {
			// ForEachOutPatternElement 
			System.out.println("BottomUpTraversal.inIterator() - ForEachOutPatternElement ");
		}
	}
	
	@Override
	public VisitedReferences preIterateExp(IterateExp self) {
		return refs("source", "iterators" , "result", "type" , "body" );
	}
	
	@Override
	public void inIterateExp(IterateExp self) {
		attr.linkType( attr.typeOf( self.getResult() ) );
	}
	
	@Override
	public void inIteratorExp(IteratorExp self) {
		// Type collType = attr.typeOf(self.getSource());
		CollectionType srcType  = (CollectionType) attr.typeOf( self.getSource() );
		Type bodyType = attr.typeOf( self.getBody() ); 
		
		CollectionNamespace cspace = (CollectionNamespace) srcType.getMetamodelRef();
		attr.linkType( cspace.getIteratorType(self.getName(), bodyType) );
	}
	
	@Override
	public void inNavigationOrAttributeCallExp(NavigationOrAttributeCallExp self) {
		Type t = attr.typeOf( self.getSource() );
		
		// TODO: FIX: Warn about navigation of collection with "." (ATL just crash)
		
		ITypeNamespace tspace = (ITypeNamespace) t.getMetamodelRef();
		Type t2 = tspace.getFeature(self.getName(), self);
		
		attr.linkType(t2);
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
		}
		
		Type t = attr.typeOf( self.getSource() );
		Type[] arguments  = new Type[self.getArguments().size()];
		for(int i = 0; i < self.getArguments().size(); i++) {
			arguments[i] = attr.typeOf(self.getArguments().get(i));
		}
	
		ITypeNamespace tspace = (ITypeNamespace) t.getMetamodelRef();
		
		attr.linkType( tspace.getOperationType(self.getOperationName(), arguments, self) );
	}
	
	private void resolveResolveTemp(OperationCallExp self) {
		if ( ! (root instanceof Module ) ) {
			errors.signalNoRecoverableError("resolveTemp only available in transformation modules", self);
		}
		
		if ( self.getArguments().size() != 2 ) {
			errors.signalNoRecoverableError("resolveTemp expects two arguments", self);
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
			attr.linkType(selectedType);
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
					attr.linkType( attr.typeOf(ctx.getContext_() ));
					break;
				}
				container = container.container_();
			}
			
			if ( container == null ) {
				throw new IllegalStateException("Could not find context for self " + self.getLocation());
			}
			
		} else if ( self.getReferredVariable().getVarName().equals("thisModule") ) {
			attr.linkType( getThisModuleType() );
		} else {
			attr.linkType( attr.typeOf(self.getReferredVariable()) );
		}
	}
	
	@Override
	public void inCollectionOperationCallExp(CollectionOperationCallExp self) {
		Type receptorType = attr.typeOf(self.getSource());
		Type[] arguments  = new Type[self.getArguments().size()];
		for(int i = 0; i < self.getArguments().size(); i++) {
			arguments[i] = attr.typeOf(self.getArguments().get(i));
		}
		
		if ( ! ( receptorType instanceof CollectionType ) ) {
			errors.signalCollectionOperationOverNoCollectionType(receptorType, self);
		} else {
			CollectionNamespace namespace = (CollectionNamespace) receptorType.getMetamodelRef();
			String          operationName = self.getOperationName();
			
			Type t = namespace.getOperationType(operationName, arguments, self);
			attr.linkType(t);
		}
	}

	@Override
	public void inOperatorCallExp(OperatorCallExp self) {
		Type t = attr.typeOf(self.getSource());
		Type optional = null;
		if ( self.getArguments().size() > 0 )
			optional = attr.typeOf(self.getArguments().get(0));

		ITypeNamespace tspace = (ITypeNamespace) t.getMetamodelRef();
		attr.linkType(tspace.getOperatorType(self.getOperationName(), optional, self));
	}
	// 
	// Literal values
	// 
	
	@Override
	public void inStringExp(StringExp obj) {
		attr.linkType(typ.newStringType());
	}

	@Override
	public void inIntegerExp(IntegerExp obj) {
		attr.linkType(typ.newIntegerType());
	}

	@Override
	public void inRealExp(RealExp obj) {
		attr.linkType(typ.newFloatType());
	}

	@Override
	public void inBooleanExp(BooleanExp self) {
		attr.linkType(typ.newBooleanType());
	}
	
	@Override
	public void inOclUndefinedExp(OclUndefinedExp obj) {
		attr.linkType(typ.newOclUndefinedType());		
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
			attr.linkType( typ.newSequenceType( typ.newUnknownType() ) );
		} else {
			// TODO: Generalize computing the union of all expression elements
			// For the moment just taking the first
			OclExpression representative = self.getElements().get(0);
			attr.linkType( attr.typeOf(representative) );
		}
		
	}
		
	
}
