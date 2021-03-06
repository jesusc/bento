package bento.adapter.atl;

import org.eclipse.emf.ecore.resource.Resource;

import bento.adapter.atl.visitors.AdaptCode;
import bento.adapter.atl.visitors.AdaptModelDeclarations;
import bento.adapter.atl.visitors.AdaptModelElements;
import bento.adapter.atl.visitors.AdaptModuleElements;
import bento.adapter.atl.visitors.AdaptationContext;
import bento.adapter.atl.visitors.CreateAdapters;
import bento.binding.utils.BindingModel;
import bento.common.adapter.IComponentInfoForBinding;
import anatlyzer.atl.model.ATLModel;


/**
 * Action class in charge of adapting a "refining" ATL transformation,
 * that is, an in-place transformation written in ATL.
 * 
 * @author jesus
 *
 */
public class ATLInPlaceAdapter {

	private ATLModel atlModel;
	private BindingModel bindModel;
	private IComponentInfoForBinding info;

	public ATLInPlaceAdapter(Resource atlResource, Resource bindingResource, IComponentInfoForBinding info) {
		atlModel = new ATLModel(atlResource);
		bindModel = new BindingModel(bindingResource);
		this.info = info;
	}

	public ATLModel getAdaptedATL() {
		return atlModel;
	}

	public void perform() {
		// For the moment only renamings
		AdaptationContext ctx = new AdaptationContext(bindModel);

		System.out.println("Adapting model elements");
		new AdaptModelDeclarations(atlModel, bindModel, info, ctx).perform();
		new AdaptModelElements(atlModel, bindModel, info, ctx).perform();

	}

}
