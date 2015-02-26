package bento.adapter.atl;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;

import bento.adapter.atl.visitors.AdaptCode;
import bento.adapter.atl.visitors.AdaptModelElements;
import bento.adapter.atl.visitors.AdaptModuleElements;
import bento.adapter.atl.visitors.AdaptVirtualClasses;
import bento.adapter.atl.visitors.AdaptWhenClause;
import bento.adapter.atl.visitors.CopyHelpers;
import bento.adapter.atl.visitors.CreateAdapters;
import bento.binding.utils.BindingModel;
import anatlyzer.atl.editor.builder.AnalyserExecutor;
import anatlyzer.atl.editor.builder.AnalyserExecutor.CannotLoadMetamodel;
import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.util.ATLUtils;


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
	private IComponentInfoForBinding info;

	public ATLTrafoAdapter(ATLModel atlModel, BindingModel bindModel, IComponentInfoForBinding info) {
		this.atlModel = atlModel; 
		this.bindModel = bindModel;
		this.info = info;
	}

	public ATLModel getAdaptedATL() {
		return atlModel;
	}

	public void perform() {
		if ( bindModel.hasVirtualClasses() ) {
			// TODO: Create a utility class outside analyser.editor
			//       Remove dependency from org.eclipse.resources
			try {
				System.out.println("Type checking");
				new AnalyserExecutor().exec(null, this.atlModel, false);
				
				// new AdaptVirtualClasses(atlModel, bindModel, currentMetamodel);
			} catch (IOException | CoreException | CannotLoadMetamodel e) {
				throw new RuntimeException(e);
			}
		}

		// adapt the code of all rules and helpers, e.g., oclIsKindOf...
		System.out.println("Adapting OCL constructs");
		new AdaptCode(atlModel, bindModel, info).perform();

		// adapt when clause (must be before rule copy and duplication, to ensure the original model elements has not
		// been changed, and then it is seamlessly propagated)
		new AdaptWhenClause(atlModel, bindModel, info).perform();

		// adapt rules/helpers, copy rules/helpers for cardinality N	
		System.out.println("Adapting module elements");
		new AdaptModuleElements(atlModel, bindModel, info).perform();
		
		// create adapters (this has to be after adapt rules becuase the adapter helpers must not be replicated)
		System.out.println("Creating adapters");
		new CreateAdapters(atlModel, bindModel, info).perform();
		

		System.out.println("Copying helpers");
		new CopyHelpers(atlModel, bindModel, info).perform();
	
		if ( bindModel.hasVirtualClasses() ) {
			System.out.println("Creating virtual classes and adapting");
			new AdaptVirtualClasses(atlModel, bindModel, info).perform();
		}
	
		// Adapt the rest of ocl model elements
		// This needs to be the last step because all the other adaptations work assuming
		// that the metamodel is still the concept (i.e., comparison with the currentMetamodel)
		System.out.println("Adapting model elements");
		new AdaptModelElements(atlModel, bindModel, info).perform();
	
		
		// Change the metamodel paths
		ATLUtils.replacePathTag(atlModel.getRoot(), 
				info.getConceptMetamodelName(), 
				info.getBoundMetamodelName(),
				info.getBoundMetamodelURI());
		
	}
	
	

}
