package bento.adapter.atl.visitors;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atlext.ATL.Unit;
import anatlyzer.atlext.OCL.OclModel;
import anatlyzer.atlext.OCL.OclModelElement;
import bento.adapter.atl.IComponentInfoForBinding;
import bento.binding.utils.BindingModel;

public class AdaptModelElements extends BaseAdapterVisitor {
	
	public AdaptModelElements(ATLModel atlModel, BindingModel bindingModel, IComponentInfoForBinding info) {
		super(atlModel, bindingModel, info);
	}

	public void perform() {
		// This is needed because OclModel elements are not contained in the root Module object
		atlModel.getResource().getContents().stream().
			filter(obj -> obj instanceof OclModel || obj instanceof Unit).
			forEach(obj -> startVisiting(obj));
		applyPending();		
	}

	@Override
	public void inOclModelElement(OclModelElement self) {
		if ( belongsToCurrentMetamodel(self) ) {
			bindingModel.findClassBindingForConcept(self.getName()).
				ifPresent(cb -> 
            		self.setName(cb.getConcrete().get(0).getName() )
            	);			
		}
	}
	
	@Override
	public void inOclModel(OclModel self) {
		if ( self.getName().equals(info.getConceptMetamodelName()) ) {
			String concreteMM = bindingModel.getRoot().getBoundMetamodel().getName();
			self.setName(concreteMM);
		}
	}
}
