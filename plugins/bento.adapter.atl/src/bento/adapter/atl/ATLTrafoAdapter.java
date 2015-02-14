package bento.adapter.atl;

import org.eclipse.emf.ecore.resource.Resource;

import bento.adapter.atl.visitors.AdaptCode;
import bento.adapter.atl.visitors.AdaptModelElements;
import bento.adapter.atl.visitors.AdaptModuleElements;
import bento.adapter.atl.visitors.AdaptWhenClause;
import bento.adapter.atl.visitors.CopyHelpers;
import bento.adapter.atl.visitors.CreateAdapters;
import anatlyzer.atl.model.ATLModel;


/**
 * Action class in charge of adapting an ATL transformation 
 * according to a given binding model.
 * 
 * @author jesus
 *
 */
public class ATLTrafoAdapter {

	private ATLModel atlModel;
	private BindingModel bindModel;
	private String currentMetamodel;

	public ATLTrafoAdapter(Resource atlResource, Resource bindingResource, String currentMetamodel) {
		atlModel = new ATLModel(atlResource);
		bindModel = new BindingModel(bindingResource);
		this.currentMetamodel = currentMetamodel;
	}

	public ATLModel getAdaptedATL() {
		return atlModel;
	}

	public void perform() {

		// adapt the code of all rules and helpers, e.g., oclIsKindOf...
		System.out.println("Adapting OCL constructs");
		new AdaptCode(atlModel, bindModel, currentMetamodel).perform();

//		// adapt when clause (must be before rule copy and duplication, to ensure the original model elements has not
//		// been changed, and then it is seamlessly propagated)
		new AdaptWhenClause(atlModel, bindModel, currentMetamodel).perform();

		//
//		// adapt rules/helpers, copy rules/helpers for cardinality N	
		System.out.println("Adapting module elements");
		new AdaptModuleElements(atlModel, bindModel, currentMetamodel).perform();
		
		// create adapters (this has to be after adapt rules becuase the adapter helpers must not be replicated)
		System.out.println("Creating adapters");
		new CreateAdapters(atlModel, bindModel, currentMetamodel).perform();
		

		System.out.println("Copying helpers");
		new CopyHelpers(atlModel, bindModel, currentMetamodel).perform();
		
		// adapt the rest of ocl model elements
		System.out.println("Adapting model elements");
		new AdaptModelElements(atlModel, bindModel, currentMetamodel).perform();
	}

}
