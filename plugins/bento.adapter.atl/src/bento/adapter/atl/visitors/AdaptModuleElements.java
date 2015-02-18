package bento.adapter.atl.visitors;

import gbind.dsl.ClassBinding;
import gbind.dsl.ConcreteMetaclass;

import java.util.Optional;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.util.ATLUtils;
import anatlyzer.atlext.ATL.ContextHelper;
import anatlyzer.atlext.ATL.Helper;
import anatlyzer.atlext.ATL.InPatternElement;
import anatlyzer.atlext.ATL.MatchedRule;
import anatlyzer.atlext.ATL.Module;
import anatlyzer.atlext.OCL.OclModelElement;
import anatlyzer.atlext.OCL.OclType;
import bento.adapter.atl.BindingModel;
import bento.adapter.atl.IComponentInfoForBinding;

public class AdaptModuleElements extends BaseAdapterVisitor {
	
	public AdaptModuleElements(ATLModel atlModel, BindingModel bindingModel, IComponentInfoForBinding info) {
		super(atlModel, bindingModel, info);
	}

	public void perform() {
		startVisiting(atlModel.getModule());
		applyPending();
	}
	
	
	@Override
	public void inMatchedRule(MatchedRule self) {
		// So far, only rules with one element 
		if ( ! ATLUtils.isOneOneRule(self) )
			return;
		
		InPatternElement inElem = self.getInPattern().getElements().get(0);
		OclModelElement me = (OclModelElement) inElem.getType();
		if ( belongsToCurrentMetamodel(me) ) {
			Optional<ClassBinding> opt = bindingModel.findClassBindingForConcept(me.getName());
			if ( opt.isPresent() ) {
				ClassBinding cb = opt.get();
				if ( bindingModel.isNoneBinding(cb) ) {
					adaptMatchedRuleNone(self, cb);
				} else if ( bindingModel.isMultiBinding(cb) ) {
					adaptMatchedRuleN(self, cb);
				} else {
					adaptMatchedRule1(self, cb, cb.getConcrete().get(0));
					// Normal binding
				}
			}
		}		
	}
	
	@Override
	public void inContextHelper(ContextHelper self) {	
		// Checks that the helper type is not a primitive type, a collection, a so forth...
		OclType oclType = self.getDefinition().getContext_().getContext_();
		if ( ! (oclType instanceof OclModelElement) )
			return; 
		
		OclModelElement me = (OclModelElement) oclType;		
		if ( belongsToCurrentMetamodel(me) ) {
			Optional<ClassBinding> opt = bindingModel.findClassBindingForConcept(me.getName());
			if ( opt.isPresent() ) {
				ClassBinding cb = opt.get();
				if ( bindingModel.isNoneBinding(cb) ) {
					adaptHelperNone(self, cb);
				} else if ( bindingModel.isMultiBinding(cb) ) {
					adaptHelperN(self, cb);
				} else {
					adaptHelper1(self, cb, cb.getConcrete().get(0));
				}
			}
		}	
	}
	
	//
	// Rule adaptations
	//
	
	/**
	 * Adapts a matched rule by renaming the source class.
	 * 
	 * @param r
	 * @param cb
	 * @param concreteMetaclass
	 */
	private void adaptMatchedRule1(MatchedRule r, ClassBinding cb, ConcreteMetaclass concreteMetaclass) {
		r.getInPattern().getElements().get(0).getType().setName(concreteMetaclass.getName());
	}

	private void adaptMatchedRuleN(MatchedRule self, ClassBinding cb) {
		// Adapts the first one normally
		adaptMatchedRule1(self, cb, cb.getConcrete().get(0));
		
		// Finds the position of the original rule
		Module module = atlModel.getModule();
		int idx = module.getElements().indexOf(self);
		
		cb.getConcrete().stream().skip(1).forEach(concrete -> {
			MyCopier copier = new MyCopier(self);
			MatchedRule newRule = (MatchedRule) copier.copy(self);			
			copier.copyReferences();
			
			newRule.setName(newRule.getName() + "_for_" + concrete.getName());
			adaptMatchedRule1(newRule, cb, concrete);
		
			delay(() -> module.getElements().add(idx + 1, newRule));		
		});
	}

	/**
	 * Adapts a matched rule by removing it.
	 * 
	 * @param self
	 * @param cb
	 */
	private void adaptMatchedRuleNone(MatchedRule self, ClassBinding cb) {
		delay(() -> deattach(self));
	}


	// 
	// Helper adaptations
	//
	
	private void adaptHelper1(Helper h, ClassBinding cb, ConcreteMetaclass concreteMetaclass) {
		OclType oclType = h.getDefinition().getContext_().getContext_();
		oclType.setName(concreteMetaclass.getName());
	}

	private void adaptHelperN(Helper self, ClassBinding cb) {
		// Adapts the first one normally
		adaptHelper1(self, cb, cb.getConcrete().get(0));
		
		// Finds the position of the original rule
		Module module = atlModel.getModule();
		int idx = module.getElements().indexOf(self);
		
		cb.getConcrete().stream().skip(1).forEach(concrete -> {
			MyCopier copier = new MyCopier(self);
			Helper newHelper = (Helper) copier.copy(self);			
			copier.copyReferences();
			
			adaptHelper1(newHelper, cb, concrete);
		
			delay(() -> module.getElements().add(idx + 1, newHelper));		
		});
		
	}

	private void adaptHelperNone(Helper self, ClassBinding cb) {
		delay(() -> deattach(self));
	}

}
