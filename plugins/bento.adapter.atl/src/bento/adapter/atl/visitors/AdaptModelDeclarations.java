package bento.adapter.atl.visitors;

import org.eclipse.emf.common.util.EList;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atlext.OCL.OCLFactory;
import anatlyzer.atlext.OCL.OclModel;
import bento.adapter.atl.IComponentInfoForBinding;
import bento.adapter.atl.IComponentInfoForBinding.IBoundMetamodelInfo;
import bento.binding.utils.BindingModel;

public class AdaptModelDeclarations extends BaseAdapterVisitor {
	
	public AdaptModelDeclarations(ATLModel atlModel, BindingModel bindingModel, IComponentInfoForBinding info, AdaptationContext ctx) {
		super(atlModel, bindingModel, info, ctx);
	}

	public void perform() {
		String prefix = null;
		EList<OclModel> modelList = null;
		if ( bindingModel.isSourceBinding() ) {
			prefix = "IN_";
			modelList = atlModel.getModule().getInModels();
		} else {
			prefix = "OUT_";
			modelList = atlModel.getModule().getOutModels();
		}
		
		IBoundMetamodelInfo bm = info.getBoundMetamodels().get(0);		
		modelList.stream().
			filter(m -> m.getMetamodel().getName().equals(bindingModel.getRoot().getBoundConcept().getName())).
			forEach(m -> {
				m.getMetamodel().setName(bm.getBoundMetamodelName());
				
				ctx.addMetamodelMapping(bm, m);				
			});
		
		for (int i = 1; i < info.getBoundMetamodels().size(); i++) {
			IBoundMetamodelInfo minfo = info.getBoundMetamodels().get(i);
			OclModel m = OCLFactory.eINSTANCE.createOclModel();
			m.setName(prefix + minfo.getBoundMetamodelName());
			OclModel mm = OCLFactory.eINSTANCE.createOclModel();
			mm.setName(minfo.getBoundMetamodelName());
			m.setMetamodel(mm);
			modelList.add(m);
			
			ctx.addMetamodelMapping(minfo, m);
		}
		
	}

}
