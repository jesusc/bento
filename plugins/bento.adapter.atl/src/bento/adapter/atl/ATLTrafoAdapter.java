package bento.adapter.atl;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.runtime.CoreException;

import anatlyzer.atl.editor.builder.AnalyserExecutor;
import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.util.ATLUtils;
import anatlyzer.atl.util.AnalyserUtils.CannotLoadMetamodel;
import anatlyzer.atl.util.AnalyserUtils.PreconditionParseError;
import bento.adapter.atl.visitors.AdaptCode;
import bento.adapter.atl.visitors.AdaptModelDeclarations;
import bento.adapter.atl.visitors.AdaptModelElements;
import bento.adapter.atl.visitors.AdaptModuleElements;
import bento.adapter.atl.visitors.AdaptTargetElements;
import bento.adapter.atl.visitors.AdaptVirtualClasses;
import bento.adapter.atl.visitors.AdaptWhenClause;
import bento.adapter.atl.visitors.AdaptationContext;
import bento.adapter.atl.visitors.CopyHelpers;
import bento.adapter.atl.visitors.CreateAdapters;
import bento.binding.utils.BindingModel;
import bento.common.adapter.IComponentInfoForBinding;
import bento.common.adapter.IComponentInfoForBinding.IBoundMetamodelInfo;


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
		if ( bindModel.isSourceBinding() ) {	
			adaptSourceBinding();
		} else {
			adaptTargetBinding();
		}
		
		
		List<IBoundMetamodelInfo> metamodels = info.getBoundMetamodels();
		IBoundMetamodelInfo mm = metamodels.get(0);
		
		// Change the metamodel paths
		ATLUtils.modifyOclModelPathTag(atlModel, 
				info.getConceptMetamodelName(), 
				mm.getBoundMetamodelName(),
				mm.getBoundMetamodelURI());
		
		for(int i = 1; i < metamodels.size(); i++) {
			mm = metamodels.get(i);

			int idx;
			for (idx = 0; idx < atlModel.getRoot().getCommentsBefore().size(); idx++) {
				String string = atlModel.getRoot().getCommentsBefore().get(idx);
				
				if ( string.contains("@path") || string.contains("@nsURI") ) {
					break;
				}
			}
			
			String start = mm.getBoundMetamodelURI().startsWith("/") ? "@path" : "@nsURI";
			
			String dcl = start + " " + mm.getBoundMetamodelName() + "=" + mm.getBoundMetamodelURI(); 			
			atlModel.getRoot().getCommentsBefore().add(idx, dcl);
		}
		
	}

	private void adaptTargetBinding() {
		typeCheck();
		
		AdaptationContext ctx = new AdaptationContext(bindModel);
		
		System.out.println("Adapting target elements");
		new AdaptModelDeclarations(atlModel, bindModel, info, ctx).perform();
		new AdaptTargetElements(atlModel, bindModel, info, ctx).perform();	
	}
	
	private void adaptSourceBinding() {
		AdaptationContext ctx = new AdaptationContext(bindModel);
			
		if ( bindModel.hasVirtualClasses() ) {
			typeCheck();
		}

		// adapt the code of all rules and helpers, e.g., oclIsKindOf...
		System.out.println("Adapting OCL constructs");
		new AdaptCode(atlModel, bindModel, info, ctx).perform();

		// adapt when clause (must be before rule copy and duplication, to ensure the original model elements has not
		// been changed, and then it is seamlessly propagated)
		new AdaptWhenClause(atlModel, bindModel, info, ctx).perform();

		// adapt rules/helpers, copy rules/helpers for cardinality N	
		System.out.println("Adapting module elements");
		new AdaptModuleElements(atlModel, bindModel, info, ctx).perform();
		
		// create adapters (this has to be after adapt rules becuase the adapter helpers must not be replicated)
		System.out.println("Creating adapters");
		new CreateAdapters(atlModel, bindModel, info, ctx).perform();
		

		System.out.println("Copying helpers");
		new CopyHelpers(atlModel, bindModel, info).perform();

		if ( bindModel.hasVirtualClasses() ) {
			System.out.println("Creating virtual classes and adapting");
			new AdaptVirtualClasses(atlModel, bindModel, info, ctx).perform();
		}

		// Adapt the rest of ocl model elements
		// This needs to be the last step because all the other adaptations work assuming
		// that the metamodel is still the concept (i.e., comparison with the currentMetamodel)
		System.out.println("Adapting model elements");		
		new AdaptModelElements(atlModel, bindModel, info, ctx).perform();
		
	}

	private void typeCheck() {
		// TODO: Create a utility class outside analyser.editor
		//       Remove dependency from org.eclipse.resources
		try {
			System.out.println("Type checking");
			new AnalyserExecutor().exec(null, this.atlModel, false);
			
			// new AdaptVirtualClasses(atlModel, bindModel, currentMetamodel);
		} catch (IOException | CoreException | CannotLoadMetamodel | PreconditionParseError e) {
			throw new RuntimeException(e);
		}
	}
	
	

}
