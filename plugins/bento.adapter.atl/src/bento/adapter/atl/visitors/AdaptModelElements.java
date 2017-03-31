package bento.adapter.atl.visitors;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.util.ATLUtils;
import anatlyzer.atlext.ATL.Unit;
import anatlyzer.atlext.OCL.OCLFactory;
import anatlyzer.atlext.OCL.OclModel;
import anatlyzer.atlext.OCL.OclModelElement;
import bento.adapter.atl.IComponentInfoForBinding;
import bento.adapter.atl.IComponentInfoForBinding.IBoundMetamodelInfo;
import bento.binding.utils.BindingModel;
import gbind.dsl.MetamodelDeclaration;

public class AdaptModelElements extends BaseAdapterVisitor {
	
	public AdaptModelElements(ATLModel atlModel, BindingModel bindingModel, IComponentInfoForBinding info, AdaptationContext ctx) {
		super(atlModel, bindingModel, info, ctx);
	}

	public void perform() {
		// This is needed because OclModel elements are not contained in the root Module object
		atlModel.getResource().getContents().stream().
			filter(obj -> obj instanceof OclModel || obj instanceof Unit).
			forEach(obj -> startVisiting(obj));
		
		new AdaptModelDeclarations(atlModel, bindingModel, info, ctx).perform();
		
		// This put the proper name in all OclModel elements
		AdaptationUtils.finisModelElementAdaptation(atlModel, ctx);
		applyPending();		
	}

	@Override
	public void inOclModelElement(OclModelElement self) {
		System.out.println(self.getModel().getName());
		if ( belongsToCurrentMetamodel(self) ) {
			bindingModel.findClassBindingForConcept(self.getName()).
				ifPresent(cb -> {
					AdaptationUtils.adaptModelElement(self, cb.getConcrete().get(0), ctx);
				});			
		}
	}
	
//	@Override
//	public void inOclModel(OclModel self) {
//		if ( self.getName().equals(info.getConceptMetamodelName()) ) {
//			String concreteMM = bindingModel.getRoot().getBoundMetamodel().getName();
//			self.setName(concreteMM);
//		}
//	}
}
