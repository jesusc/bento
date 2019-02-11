package bento.adapter.atl.visitors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.types.Metaclass;
import anatlyzer.atl.types.Type;
import anatlyzer.atlext.ATL.ATLFactory;
import anatlyzer.atlext.ATL.Binding;
import anatlyzer.atlext.ATL.CalledRule;
import anatlyzer.atlext.ATL.Helper;
import anatlyzer.atlext.ATL.InPatternElement;
import anatlyzer.atlext.ATL.LazyRule;
import anatlyzer.atlext.ATL.MatchedRule;
import anatlyzer.atlext.ATL.ModuleElement;
import anatlyzer.atlext.ATL.RuleVariableDeclaration;
import anatlyzer.atlext.ATL.StaticHelper;
import anatlyzer.atlext.OCL.Attribute;
import anatlyzer.atlext.OCL.CollectionOperationCallExp;
import anatlyzer.atlext.OCL.IfExp;
import anatlyzer.atlext.OCL.Iterator;
import anatlyzer.atlext.OCL.IteratorExp;
import anatlyzer.atlext.OCL.NavigationOrAttributeCallExp;
import anatlyzer.atlext.OCL.OCLFactory;
import anatlyzer.atlext.OCL.OclAnyType;
import anatlyzer.atlext.OCL.OclExpression;
import anatlyzer.atlext.OCL.OclFeatureDefinition;
import anatlyzer.atlext.OCL.OclModelElement;
import anatlyzer.atlext.OCL.OclType;
import anatlyzer.atlext.OCL.Operation;
import anatlyzer.atlext.OCL.OperationCallExp;
import anatlyzer.atlext.OCL.OperatorCallExp;
import anatlyzer.atlext.OCL.Parameter;
import anatlyzer.atlext.OCL.PropertyCallExp;
import anatlyzer.atlext.OCL.SequenceExp;
import anatlyzer.atlext.OCL.StringExp;
import anatlyzer.atlext.OCL.TupleType;
import anatlyzer.atlext.OCL.TupleTypeAttribute;
import anatlyzer.atlext.OCL.VariableDeclaration;
import anatlyzer.atlext.OCL.VariableExp;
import bento.binding.utils.BindingModel;
import bento.common.adapter.IComponentInfoForBinding;
import gbind.dsl.HelperParameter;
import gbind.dsl.LocalHelper;
import gbind.dsl.OclFeatureBinding;
import gbind.dsl.RenamingFeatureBinding;
import gbind.dsl.VirtualAttribute;
import gbind.dsl.VirtualClassBinding;
import gbind.dsl.VirtualMetaclass;
import gbind.dsl.VirtualReference;


/**
 * Injects code to handle virtual classes and adapts the code
 * to deal with the injected code.
 * 
 * For each virtual class:
 * <ul>
 * <li>Create a helper to retrieve "allInstances" of the class as specified in the "init" expression 
 *     virtual class definition. </li>
 * <li>Replace matched rules whose source type is bound to a virtual class for a (unique) lazy rule</li> 
 * <li>If the original matched rule had a filter, create a helper</li>
 * 
 * <li>Create an endpoint rule to force the execution of the new lazy rules</li>
 * 
 * <li>Replace calls to allInstances with calls to the "AllInstances" helper</li>
 * </ul>
 * 
 * 
 * TODO: Create createVirtualInstances_Access 
 * 
 * @author jesus
 *
 */
public class AdaptVirtualClasses extends BaseAdapterVisitor {
	
	public AdaptVirtualClasses(ATLModel atlModel, BindingModel bindingModel, IComponentInfoForBinding info, AdaptationContext ctx) {
		super(atlModel, bindingModel, info, ctx);
	}
	
	public void perform() {
		
		createSequenceConverter();
		
		for(VirtualMetaclass v : bindingModel.getVirtualClasses()) {
			createAllInstancesHelper(v);
		}
		
		startVisiting(atlModel.getRoot());
	
		// This is not done in "inMatchedRule" because some matched rules
		// may be replaced by a lazy rule, and thus may not be properly accessible later.
		for(ModuleElement e : atlModel.getModule().getElements()) {
			if ( e instanceof MatchedRule ) {
				convertMatchedRuleIfNeeded((MatchedRule) e);
			}
		}		
		
		// Create adapters for virtual classes
		// Renaming helpers
		Stream<RenamingFeatureBinding> features = bindingModel.findAllRenamingFeatureBindings().
				filter(fb -> AdaptationUtils.isNormalFeatureBinding(fb) );
				
			features.forEach(fb -> {
				if ( fb.getQualifier() == null ) {
					bindingModel.findVirtualClassBindingForConcept(fb.getConceptClass().getName()).
						ifPresent(vcb -> createRenamingHelperForVirtualClass(fb, fb.getConceptClass(), vcb.getVirtual())); 
				} else {
					throw new UnsupportedOperationException(); // Virtual classes cannot be mapped to more than once... so far
					// createRenamingHelper(fb, fb.getQualifier());
				}
			});
		
		// Ocl feature bindings
		Stream<OclFeatureBinding> oclFeatureBindings = bindingModel.findAllOclFeatureBindings().
				filter(fb -> AdaptationUtils.isNormalFeatureBinding(fb) );
				
		oclFeatureBindings.forEach(fb -> {
				if ( fb.getQualifier() == null ) {
					bindingModel.findVirtualClassBindingForConcept(fb.getConceptClass().getName()).
						ifPresent(vcb -> createOclHelperForVirtualClass(fb, fb.getConceptClass(), vcb.getVirtual())); // TODO: In the original was: cb.concrete.first...
				} else {
					throw new UnsupportedOperationException(); // Virtual classes cannot be mapped to more than once... so far
					// createOclHelper(fb, fb.getQualifier());
				}
			});
		
		// Copy helpers
		bindingModel.getLocalHelpers().forEach(l -> 
			copyLocalHelperForVirtualClass(l)
		);

		applyPending();		
	}

	private void copyLocalHelperForVirtualClass(LocalHelper self) {
		Optional<VirtualClassBinding> opt = bindingModel.findVirtualClassBindingForConcept(self.getContext().getName());
		if ( ! opt.isPresent() )
			return;
		
		GbindToATL_For_VirtualClass gbindToATL = new GbindToATL_For_VirtualClass(atlModel, info);
		StaticHelper helper = (StaticHelper) gbindToATL.transform(self, opt.get().getVirtual());

		
		atlModel.getModule().getElements().add(helper);		

	}
	
	private class GbindToATL_For_VirtualClass extends GbindToATL {

		private VirtualMetaclass virtualClass;

		public GbindToATL_For_VirtualClass(ATLModel atlModel, IComponentInfoForBinding info) {
			super(atlModel, info);
		}
		
		public Helper transform(LocalHelper self, VirtualMetaclass virtualClass) {
			this.virtualClass = virtualClass;
			return transform(self);
		}
		
		@Override
		public void inLocalHelper(LocalHelper self) {
			gbind.dsl.Metaclass metaclass = self.getContext();
			Parameter[] params = new Parameter[self.getParameters().size()];
			int i = 0;
			for(HelperParameter p : self.getParameters()) {
				params[i++] = (Parameter) g(p);
			}
			
			OclExpression atlBody = (OclExpression) g(self.getBody());
			
			StaticHelper helper = createOclHelperForVirtualClassAux(self.getFeature(), metaclass, atlBody, virtualClass, params);
			link(self, helper);
		}

	}

	private void createRenamingHelperForVirtualClass(RenamingFeatureBinding fb, gbind.dsl.Metaclass metaclass, VirtualMetaclass vc) {
		// Init expression (copied from CreateAdapters)
		NavigationOrAttributeCallExp init = OCLFactory.eINSTANCE.createNavigationOrAttributeCallExp();
		init.setName(fb.getConcreteFeature());
		VariableExp varExp = OCLFactory.eINSTANCE.createVariableExp();
		VariableDeclaration self = addToResource(OCLFactory.eINSTANCE.createVariableDeclaration());
		self.setVarName("self");
		varExp.setReferredVariable(self);
		init.setSource(varExp);

		anatlyzer.atlext.OCL.OclExpression body = init;
		
		StaticHelper helper = createOclHelperForVirtualClassAux(fb.getConceptFeature(), metaclass, body, vc, new Parameter[] { });
		atlModel.getModule().getElements().add(helper);		
		
	}
	
	private void createOclHelperForVirtualClass(OclFeatureBinding fb, gbind.dsl.Metaclass metaclass, VirtualMetaclass vc) {
		gbind.simpleocl.OclExpression oclExpr = fb.getConcrete();

		anatlyzer.atlext.OCL.OclExpression body = new GbindToATL(atlModel, info).transform(oclExpr);
		
		StaticHelper helper = createOclHelperForVirtualClassAux(fb.getConceptFeature(), metaclass, body, vc, new Parameter[] { });
		atlModel.getModule().getElements().add(helper);		
	}
	
	private StaticHelper createOclHelperForVirtualClassAux(String featureName, gbind.dsl.Metaclass metaclass, OclExpression atlBody, VirtualMetaclass vc, Parameter[] params) {	
		
		// Creates the helper
		Parameter p = OCLFactory.eINSTANCE.createParameter();
		p.setVarName("self_");
		p.setType(createTupleTypeForVirtualClass(vc));
		OclAnyType returnType = OCLFactory.eINSTANCE.createOclAnyType();
		
		Parameter[] newParams = new Parameter[params.length + 1];
		for(int i = 0; i < params.length; i++)
			newParams[i + 1] = params[i];
		newParams[0] = p;
		
		StaticHelper helper = AdaptationUtils.createStaticOperationHelper(getVirtualClassHelperName(featureName, metaclass), atlBody, returnType, newParams);
				
		// Replace every reference to self, to a reference to the parameter
		TreeIterator<EObject> it = helper.eAllContents();
		while ( it.hasNext() ) {
			EObject obj = it.next();
			if ( obj instanceof VariableExp && ((VariableExp) obj).getReferredVariable().getVarName().equals("self")) {
				((VariableExp) obj).setReferredVariable(p);
			}
		}
		
		return helper;
	}
	
	private String getVirtualClassHelperName(String featureName, gbind.dsl.Metaclass metaclass) {
		return metaclass.getName() + "_" + featureName;
	}

	private OclType createTupleTypeForVirtualClass(VirtualMetaclass vc) {
		TupleType t = OCLFactory.eINSTANCE.createTupleType();
		for (VirtualReference ref : vc.getReferences()) {
			// TODO: Set proper type, including sequences...
			TupleTypeAttribute att = OCLFactory.eINSTANCE.createTupleTypeAttribute();
			att.setName(ref.getName());
			att.setType(OCLFactory.eINSTANCE.createOclAnyType());
			t.getAttributes().add(att);
		}
		
		for (VirtualAttribute va : vc.getAttributes()) {
			TupleTypeAttribute att = OCLFactory.eINSTANCE.createTupleTypeAttribute();
			att.setName(va.getName());
			att.setType(OCLFactory.eINSTANCE.createOclAnyType());
			t.getAttributes().add(att);
		}
		
		
		return t;
	}

	private void createSequenceConverter() {
		StaticHelper helper = ATLFactory.eINSTANCE.createStaticHelper();
		
		Parameter parameter = OCLFactory.eINSTANCE.createParameter();
		parameter.setVarName("obj");
		parameter.setType(OCLFactory.eINSTANCE.createOclAnyType());
				
		OclFeatureDefinition definition = OCLFactory.eINSTANCE.createOclFeatureDefinition();
		helper.setDefinition(definition);
		Operation feature = OCLFactory.eINSTANCE.createOperation();
		definition.setFeature(feature);
		feature.setName("__convertToSequence__");
		feature.getParameters().add(parameter);
		feature.setReturnType(OCLFactory.eINSTANCE.createOclAnyType());
		
		// IfExp ifExp = OCLFactory.eINSTANCE.createIfExp();
		// ifExp.setThenExpression(addToResource(OCLFactory.eINSTANCE.createSequenceExp()));
		
		SequenceExp seq = OCLFactory.eINSTANCE.createSequenceExp();
		VariableExp refToParam = OCLFactory.eINSTANCE.createVariableExp();
		refToParam.setReferredVariable(parameter);
		seq.getElements().add(refToParam);
		
		CollectionOperationCallExp flatten = OCLFactory.eINSTANCE.createCollectionOperationCallExp();
		flatten.setSource(seq);
		flatten.setOperationName("flatten");
		
		feature.setBody(flatten);
		
		atlModel.getModule().getElements().add(helper);
		
		// Different from the original
		
		/*
		template createSequenceConverter(module : atl!Module, p : atl!Parameter)
		atl!Helper {
			module = module
			definition = atl!OclFeatureDefinition {
				feature = atl!Operation {
					name = "__convertToSequence__"
					parameters = p
					returnType = atl!OclAnyType { }
					body = atl!IfExp {
						thenExpression = atl!SequenceExp { }
						condition = atl!OperatorCallExp {
							operationName = "="
							source = atl!VariableExp { 
								referredVariable = p
							}
							arguments = atl!OclUndefinedExp { }
						}
						elseExpression = atl!CollectionOperationCallExp {
							operationName = "flatten"
							source = atl!SequenceExp {
								elements = atl!VariableExp { 
									referredVariable = p							
								}
							}
						}
					}
				}
			}
		}
		end*/
	}

	private void convertMatchedRuleIfNeeded(MatchedRule self) {
		InPatternElement inPatternElement = self.getInPattern().getElements().get(0);
		OclModelElement oclModelElement = (OclModelElement) inPatternElement.getType();
		OclExpression filter = self.getInPattern().getFilter();
		
		if ( belongsToCurrentMetamodel(oclModelElement) ) {
			// TODO: What would happen with more than one??
			bindingModel.findVirtualClassBindingsForConcept(oclModelElement.getName()).forEach(vcb -> {
				
				// Creates the end point rule to force the execution of the matched rule
				CalledRule calledRule = createEntryPointInit(self, getAllInstancesHelperName(vcb.getVirtual()));
				delay(() -> atlModel.getModule().getElements().add(calledRule) );

				// Convert the matched rule to a lazy rule
				LazyRule lazyRule = ATLFactory.eINSTANCE.createLazyRule();
				lazyRule.setName( self.getName() );
				lazyRule.getVariables().addAll( self.getVariables() );
				lazyRule.setIsUnique(true);
				
				lazyRule.getCommentsBefore().addAll( self.getCommentsBefore() );
				lazyRule.getCommentsAfter().addAll( self.getCommentsAfter() );

				lazyRule.setInPattern( self.getInPattern() );
				lazyRule.setOutPattern( self.getOutPattern() );
				lazyRule.setActionBlock( self.getActionBlock() );
				
				// Sets the input type to OclAny
				lazyRule.getInPattern().getElements().get(0).setType(OCLFactory.eINSTANCE.createOclAnyType());
				
				delay(() -> replace(self, lazyRule) );	
				
				// Convert the filter into a helper, so that it is used to filter the lazy rule
				// execution in the appropriate places, e.g., in bindings
				if ( filter != null ) {
					// This works by chance, because the parameter has the same name as the
					// replaced varDeclaration, but the elements in the AST does not point
					// to the new parameter (but to the old rule vars). However, the ATL serializer does not matter because
					// it just looks at the varName			
					Parameter p = OCLFactory.eINSTANCE.createParameter();
					p.setVarName(inPatternElement.getVarName());
					p.setType( OCLFactory.eINSTANCE.createOclAnyType() );

					StaticHelper helper = ATLFactory.eINSTANCE.createStaticHelper();
					OclFeatureDefinition definition = OCLFactory.eINSTANCE.createOclFeatureDefinition();
					helper.setDefinition(definition);
					Operation op = OCLFactory.eINSTANCE.createOperation();
					definition.setFeature(op);
					op.setName( getHelperFilterName(self) );
					op.getParameters().add(p);
					op.setBody(filter);
					op.setReturnType( OCLFactory.eINSTANCE.createBooleanType() );
					
					atlModel.getModule().getElements().add(helper);
				}
				
				// The old type does not exist in the concept, but now it is a tuple, but 
				// this cannot be put as type of a lazy rule
				oclModelElement.setName("OclAny");
			});
		}

	}
	
	/**
	 * Adapts calls to allInstances
	 */
	@Override
	public void inOperationCallExp(OperationCallExp self) {
		// Transform allInstances
		if ( self.getOperationName().equals("allInstances") ) {		
			OclModelElement oclModelElement = (OclModelElement) self.getSource();
			
			if ( belongsToCurrentMetamodel(oclModelElement) ) {
				Optional<VirtualClassBinding> opt = bindingModel.findVirtualClassBindingsForConcept(oclModelElement.getName()).findAny();
				if ( opt.isPresent() ) {
					NavigationOrAttributeCallExp attCall = OCLFactory.eINSTANCE.createNavigationOrAttributeCallExp();
					attCall.setName( this.getAllInstancesHelperName( opt.get().getVirtual() ) );
					
					VariableDeclaration thisModule = OCLFactory.eINSTANCE.createVariableDeclaration();
					thisModule.setVarName("thisModule");
					VariableExp receptor = OCLFactory.eINSTANCE.createVariableExp();
					receptor.setReferredVariable(thisModule);
					
					attCall.setSource(receptor);
					
					replace(self, attCall);
				}
			}	 
			
		// Transform calls to adapters/helper attached to classes mapped to virtual classes
		} else {
			replacePropertyCallIfNeeded(self, self.getOperationName(), self.getArguments());
		}
	}

	@Override
	public void inNavigationOrAttributeCallExp(NavigationOrAttributeCallExp self) {
		replacePropertyCallIfNeeded(self, self.getName(), null);
	}

	private void replacePropertyCallIfNeeded(PropertyCallExp self, String name, EList<OclExpression> arguments) {
		Type type_ = self.getSource().getInferredType();
		if ( type_ instanceof Metaclass ) {
			bindingModel.findVirtualClassBindingForConcept(((Metaclass) type_).getName()).ifPresent(vcb -> {
				
				// * self.getSource() is the object to be passed as a parameter
				// * self it will be transformed into an static operation call
				
				OperationCallExp op = OCLFactory.eINSTANCE.createOperationCallExp();
				op.setOperationName(getVirtualClassHelperName(name, vcb.getConcept()));
				
				op.getArguments().add(self.getSource());
				if ( arguments != null )
					op.getArguments().addAll(arguments);
				
				op.setSource(createThisModuleVarRef());
				
				replace(self, op);
				
			});
		}

	}

	
	@Override
	public void inOclModelElement(OclModelElement self) {
		if ( belongsToCurrentMetamodel(self) ) {
			bindingModel.findVirtualClassBindingForConcept(self.getName()).
				ifPresent(vcb -> { 
					OclType newType = this.createTupleTypeForVirtualClass(vcb.getVirtual());
					
					// Do at the end, to avoid conflicts with the helper conversions and so on...
					delay(() -> replace(self, newType));				
				});			
		}
	}

	
	@Override
	public void inBinding(Binding self) {
		/*
		List<Metaclass> metaclasses = TypingModel.getInvolvedMetaclassesOfType( self.getValue().getInferredType() );
		
		// TODO: Filter out metaclasses belonging to the target model, in case of name clashes
		metaclasses.stream().flatMap(m -> bindingModel.findVirtualClassBindingsForConcept(m.getName()).distinct().forEach(vcb -> {
			
			
		});
		*/
		
		
		List<VirtualClassBinding> relevantClassBindings = new ArrayList<VirtualClassBinding>();
		self.getResolvedBy().stream().map(ri -> ri.getRule()).forEach(r -> {
			InPatternElement inPatternElement = r.getInPattern().getElements().get(0);
			OclModelElement oclModelElement = (OclModelElement) inPatternElement.getType();
			
			Optional<VirtualClassBinding> opt = bindingModel.findVirtualClassBindingsForConcept(oclModelElement.getName()).findAny();
			if ( opt.isPresent() ) {
				relevantClassBindings.add(opt.get());
			}
		});
		
		if ( relevantClassBindings.size() > 1 ) {
			throw new UnsupportedOperationException("TODO: Look the original implementation in Eclectic that does handle this case");
		} else if ( relevantClassBindings.size() == 1 ) {
			OclExpression newBindingValue = createInvokerForLazyRule(relevantClassBindings.get(0), self.getValue());
			self.setValue(newBindingValue);
		}
		
	}
	
	
	// TODO: Make use of typing information to decide if it needs to be converted to a sequence or not
	private IteratorExp createInvokerForLazyRule(VirtualClassBinding virtualClassBinding, OclExpression originalBindingExpr) {
		IteratorExp collectForSequence = OCLFactory.eINSTANCE.createIteratorExp();
		collectForSequence.setName("collect");
		Iterator it = OCLFactory.eINSTANCE.createIterator();
		it.setVarName("it");
		collectForSequence.getIterators().add(it);
		
		OperationCallExp convertToSeqCall = OCLFactory.eINSTANCE.createOperationCallExp();
		convertToSeqCall.setOperationName("__convertToSequence__");
		collectForSequence.setSource(convertToSeqCall);
		convertToSeqCall.setSource(createThisModuleVarRef());
		convertToSeqCall.getArguments().add(originalBindingExpr);
		
		IfExp ifExp = OCLFactory.eINSTANCE.createIfExp();
		collectForSequence.setBody(ifExp);
		
		OperatorCallExp operator = OCLFactory.eINSTANCE.createOperatorCallExp();
		ifExp.setCondition(operator);
		operator.setOperationName("=");
		
		NavigationOrAttributeCallExp navName = OCLFactory.eINSTANCE.createNavigationOrAttributeCallExp();
		navName.setName("name");
		operator.setSource(navName);

		OperationCallExp oclTypeOp = OCLFactory.eINSTANCE.createOperationCallExp();
		oclTypeOp.setOperationName("oclType");
		navName.setSource(oclTypeOp);
		
		VariableExp varRefToIt = OCLFactory.eINSTANCE.createVariableExp();
		oclTypeOp.setSource(varRefToIt);
		varRefToIt.setReferredVariable(it);

		StringExp tupleString = OCLFactory.eINSTANCE.createStringExp();
		tupleString.setStringSymbol("Tuple");
		oclTypeOp.getArguments().add(tupleString);

		// Then part, includes a nested If
		IfExp nestedIf = OCLFactory.eINSTANCE.createIfExp();
		ifExp.setThenExpression(nestedIf);
		
		OperatorCallExp equalsToType_ = OCLFactory.eINSTANCE.createOperatorCallExp();
		equalsToType_.setOperationName("=");
		nestedIf.setCondition(equalsToType_);
		StringExp typeString = OCLFactory.eINSTANCE.createStringExp();
		typeString.setStringSymbol(virtualClassBinding.getVirtual().getName());
		equalsToType_.getArguments().add(tupleString);
		
		OperationCallExp getOp = OCLFactory.eINSTANCE.createOperationCallExp();
		getOp.setOperationName("get");
		equalsToType_.setSource(getOp);
		StringExp typeField = OCLFactory.eINSTANCE.createStringExp();
		typeField.setStringSymbol("type__");
		getOp.getArguments().add(tupleString);
		
		OperationCallExp asMap = OCLFactory.eINSTANCE.createOperationCallExp();
		getOp.setOperationName("asMap");
		getOp.setSource(asMap);
		
		VariableExp varRefToIt2 = OCLFactory.eINSTANCE.createVariableExp();
		asMap.setSource(varRefToIt2);
		varRefToIt2.setReferredVariable(it);

		VariableExp varRefToIt3 = OCLFactory.eINSTANCE.createVariableExp();
		ifExp.setElseExpression(varRefToIt3);
		varRefToIt3.setReferredVariable(it);

		VariableExp varRefToIt4 = OCLFactory.eINSTANCE.createVariableExp();
		nestedIf.setElseExpression(varRefToIt4);
		varRefToIt4.setReferredVariable(it);
		
		return collectForSequence;
	}
	
	private String getHelperFilterName(MatchedRule self) {
		return self.getName() + "_" + "Filter";
	}

	/**
	 * Creates an end point rule that is in charge of launching the execution
	 * of a matched rule that is to be converted to a lazy rule.
	 * 
	 * <pre>
	 * endpoint rule x2y_ForceTransformation {
	 * 	  using {
	 * 		varToForceEvaluation : OclAny = thisModule.<<allInstancesHelperName>> -> 
	 * 			collect(it | thisModule.<<originalRuleName>>(it));
	 * 	  }
	 * }
	 * </pre>
	 * 
	 * @param originalRule
	 * @return 
	 */
	private CalledRule createEntryPointInit(MatchedRule originalRule, String allInstancesHelperName) {	
		CalledRule calledRule = ATLFactory.eINSTANCE.createCalledRule();
		calledRule.setName( originalRule.getName() + "_ForceTransformation" );
		calledRule.setIsEndpoint(true);
		
		RuleVariableDeclaration var = ATLFactory.eINSTANCE.createRuleVariableDeclaration();
		var.setVarName("varToForceEvaluation");
		var.setType( OCLFactory.eINSTANCE.createOclAnyType() );
		calledRule.getVariables().add(var);
		
		IteratorExp collect = OCLFactory.eINSTANCE.createIteratorExp();
		Iterator it = OCLFactory.eINSTANCE.createIterator();
		it.setVarName("it");
		collect.getIterators().add(it);
		collect.setName("collect");		
		var.setInitExpression(collect);
		
		NavigationOrAttributeCallExp nav = OCLFactory.eINSTANCE.createNavigationOrAttributeCallExp();
		nav.setName( allInstancesHelperName );
		collect.setSource(nav);
		
		VariableExp thisModuleVarRef1 = createThisModuleVarRef();
		nav.setSource(thisModuleVarRef1);
		
		OperationCallExp ruleCall = OCLFactory.eINSTANCE.createOperationCallExp();
		ruleCall.setOperationName(originalRule.getName());
		
		VariableExp thisModuleVarRef2 = createThisModuleVarRef();
		ruleCall.setSource(thisModuleVarRef2);
		
		VariableExp refToIt = OCLFactory.eINSTANCE.createVariableExp();
		refToIt.setReferredVariable(it);
		ruleCall.getArguments().add(refToIt);
		
		collect.setBody(ruleCall);
		
		return calledRule;
	}

	private VariableExp createThisModuleVarRef() {
		VariableExp thisModuleVarRef1 = OCLFactory.eINSTANCE.createVariableExp();
		VariableDeclaration thisModuleDcl1 = addToResource( OCLFactory.eINSTANCE.createVariableDeclaration() );
		thisModuleDcl1.setVarName("thisModule");
		thisModuleVarRef1.setReferredVariable(thisModuleDcl1);
		return thisModuleVarRef1;
	}

	/**
	 * Creates a module helper with returns the "allInstances" of the
	 * virtual classes.
	 * <pre>
	 * 		helper def: Ecore_Generalization_AllInstances : OclAny = <init-expr>
	 * </pre>
	 * @param v the virtual class.
	 */
	private void createAllInstancesHelper(VirtualMetaclass v) {
		gbind.simpleocl.OclExpression oclExpr = v.getInit();

		anatlyzer.atlext.OCL.OclExpression body = new GbindToATL(atlModel, info).transform(oclExpr);

		StaticHelper helper = ATLFactory.eINSTANCE.createStaticHelper();
		OclFeatureDefinition definition = OCLFactory.eINSTANCE.createOclFeatureDefinition();
		Attribute feature = OCLFactory.eINSTANCE.createAttribute();
		feature.setName(getAllInstancesHelperName(v));
		feature.setInitExpression(body);
		feature.setType(OCLFactory.eINSTANCE.createOclAnyType());
		definition.setFeature(feature);
		helper.setDefinition(definition);
		
		atlModel.getModule().getElements().add(helper);		
	}

	private String getAllInstancesHelperName(VirtualMetaclass v) {
		return v.getName() + "_AllInstances";
	}
	
	


}
