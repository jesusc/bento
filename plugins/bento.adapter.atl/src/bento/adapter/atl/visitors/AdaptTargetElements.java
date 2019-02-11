package bento.adapter.atl.visitors;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atlext.ATL.Binding;
import anatlyzer.atlext.ATL.CalledRule;
import anatlyzer.atlext.ATL.ContextHelper;
import anatlyzer.atlext.ATL.MatchedRule;
import anatlyzer.atlext.ATL.OutPatternElement;
import anatlyzer.atlext.ATL.Rule;
import anatlyzer.atlext.OCL.OclModelElement;
import anatlyzer.atlext.OCL.Parameter;
import bento.binding.utils.BindingModel;
import bento.common.adapter.IComponentInfoForBinding;
import gbind.dsl.BaseFeatureBinding;
import gbind.dsl.ClassBinding;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.RenamingFeatureBinding;

public class AdaptTargetElements extends BaseAdapterVisitor {
	
	public AdaptTargetElements(ATLModel atlModel, BindingModel bindingModel, IComponentInfoForBinding info, AdaptationContext ctx) {
		super(atlModel, bindingModel, info, ctx);
	}

	public void perform() {
		startVisiting(atlModel.getModule());
		applyPending();
	}
	
	
	@Override
	public void inMatchedRule(MatchedRule self) {
		processRule(self);
	}
	
	@Override
	public void inCalledRule(CalledRule self) {
		processRule(self);
		for (Parameter parameter : self.getParameters()) {
			if ( parameter.getType() instanceof OclModelElement ) {
				OclModelElement me = (OclModelElement) parameter.getType();
				if ( belongsToCurrentMetamodel(me) ) {
					Optional<ClassBinding> opt = bindingModel.findClassBindingForConcept(me.getName());
					ClassBinding cb = opt.get();
					if ( bindingModel.isNoneBinding(cb) ) {
						// adaptMatchedRuleNone(self, cb);
						throw new UnsupportedOperationException();
					} else if ( bindingModel.isMultiBinding(cb) ) {
						throw new UnsupportedOperationException();
					} else {
						me.setName(cb.getConcrete().get(0).getName());
					}
				}
			}
			
		}
		// TODO: Adapt parameters
	}
	
	private void processRule(Rule self) {
		for (OutPatternElement outElem : self.getOutPattern().getElements()) {
			OclModelElement me = (OclModelElement) outElem.getType();
			if ( belongsToCurrentMetamodel(me) ) {
				Optional<ClassBinding> opt = bindingModel.findClassBindingForConcept(me.getName());
				if ( opt.isPresent() ) {
					ClassBinding cb = opt.get();
					if ( bindingModel.isNoneBinding(cb) ) {
						// adaptMatchedRuleNone(self, cb);
						throw new UnsupportedOperationException();
					} else if ( bindingModel.isMultiBinding(cb) ) {
						// adaptMatchedRuleN(self, cb);
						throw new UnsupportedOperationException();
					} else {
						adaptMatchedRule1(outElem, cb, cb.getConcrete().get(0));
						// Normal binding
					}
				}
			}
		}		
	}
	 
	@Override
	public void inContextHelper(ContextHelper self) {	
		// This cannot happen in the target		
	}
	
	//
	// Rule adaptations
	//
	
	/**
	 * Adapts a matched rule by renaming the source class.
	 * 
	 * @param outElem
	 * @param cb
	 * @param concreteMetaclass
	 */
	private void adaptMatchedRule1(OutPatternElement outElem, ClassBinding cb, ConcreteMetaclass concreteMetaclass) {
		outElem.getType().setName(concreteMetaclass.getName());
		
		for (BaseFeatureBinding fb : bindingModel.findFeatureBindingsFor(cb)) {
			if ( fb instanceof RenamingFeatureBinding ) {
				RenamingFeatureBinding rfb = (RenamingFeatureBinding) fb;
				List<Binding> bindings = outElem.getBindings().stream().filter(b -> b.getPropertyName().equals(rfb.getConceptFeature())).collect(Collectors.toList());
				if ( bindings.isEmpty() ) {
					throw new AdaptationError("No ATL binding for feature: " + fb.getConceptFeature() );
				}
				
				for (Binding binding : bindings) {
					binding.setPropertyName(rfb.getConcreteFeature());
				}				
			} else {
				throw new UnsupportedOperationException();
			}
		}
	}

//	private void adaptMatchedRuleN(MatchedRule self, ClassBinding cb) {
//		// Adapts the first one normally
//		adaptMatchedRule1(self, cb, cb.getConcrete().get(0));
//		
//		// Finds the position of the original rule
//		Module module = atlModel.getModule();
//		int idx = module.getElements().indexOf(self);
//		
//		cb.getConcrete().stream().skip(1).forEach(concrete -> {
//			MyCopier copier = new MyCopier(self);
//			MatchedRule newRule = (MatchedRule) copier.copy(self);			
//			copier.copyReferences();
//			
//			newRule.setName(newRule.getName() + "_for_" + concrete.getName());
//			adaptMatchedRule1(newRule, cb, concrete);
//		
//			delay(() -> module.getElements().add(idx + 1, newRule));		
//		});
//	}

//	private void adaptMatchedRuleNone(MatchedRule self, ClassBinding cb) {
//		delay(() -> deattach(self));
//	}



}
