package bento.adapter.atl.visitors;

import java.util.HashMap;

import anatlyzer.atlext.OCL.OclModel;
import bento.binding.utils.BindingModel;
import bento.common.adapter.IComponentInfoForBinding.IBoundMetamodelInfo;

/**
 * This class gathers the temporary information computed as part of the 
 * adaptation process.
 * 
 * @author jesus
 *
 */
public class AdaptationContext {

	private BindingModel bindingModel;
	private HashMap<String, OclModel> boundMMtoDeclaredModel = new HashMap<String, OclModel>();
	
	
	public AdaptationContext(BindingModel bindingModel) {
		this.bindingModel = bindingModel;
	}
	
	public BindingModel getBindingModel() {
		return bindingModel;
	}

	public void addMetamodelMapping(IBoundMetamodelInfo bm, OclModel m) {
		boundMMtoDeclaredModel.put(bm.getBoundMetamodelName(), m);		
	}

	public OclModel getOclModelOf(String name) {
		return boundMMtoDeclaredModel.get(name).getMetamodel();		
	}
	
	
	
}
