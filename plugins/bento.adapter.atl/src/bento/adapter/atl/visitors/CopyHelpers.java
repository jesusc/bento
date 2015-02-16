package bento.adapter.atl.visitors;

import java.util.Optional;

import gbind.dsl.LocalHelper;
import gbind.dsl.Metaclass;
import gbind.dsl.VirtualClassBinding;
import gbind.simpleocl.OclExpression;

import org.eclipse.emf.ecore.EObject;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atlext.ATL.ContextHelper;
import anatlyzer.atlext.OCL.OclModel;
import bento.adapter.atl.BindingModel;
import bento.adapter.gbind.visitors.GBindVisitor;

public class CopyHelpers extends GBindVisitor {
	
	private BindingModel bindingModel;
	private ATLModel atlModel;
	private String currentMetamodel;

	public CopyHelpers(ATLModel atlModel, BindingModel bindingModel, String currentMetamodel) {
		this.atlModel = atlModel;
		this.bindingModel = bindingModel;
		this.currentMetamodel = currentMetamodel;
	}
	
	public void perform() {
		startVisiting(bindingModel.getRoot());
	}
	
	@Override
	public void inLocalHelper(LocalHelper self) {
		// Cross-cutting... weird to check this here! But this transformation has to be delayed until the
		// virtual classes phase
		Optional<VirtualClassBinding> opt = bindingModel.findVirtualClassBindingForConcept(self.getContext().getName());
		if ( opt.isPresent() )
			return;
		
		
		OclExpression oclExpr = self.getBody();		
		
		GbindToATL gbindToATL = new GbindToATL(atlModel, currentMetamodel);
		
		ContextHelper helper = null;

		if ( self.getParameters().size() > 0 ) {
			helper = (ContextHelper) gbindToATL.transform(self);			
		} else {
			anatlyzer.atlext.OCL.OclExpression body = gbindToATL.transform(oclExpr);
			
			OclModel metamodel  = AdaptationUtils.getMetamodel(atlModel, this.currentMetamodel);
			Metaclass metaclass = self.getContext();
			helper = AdaptationUtils.createContextAttributeHelper(metamodel, metaclass.getName(), self.getFeature(), body, this::addToResource);
		}

		atlModel.getModule().getElements().add(helper);		

		/*
		gbindToATL.transformContext(self.getParameters());
		
		// Creates the helper
		ContextHelper helper = null;

		if ( self.getParameters().size() > 0 ) {
			helper = AdaptationUtils.createContextOperationHelper(metamodel, metaclass.getName(), self.getFeature(), body, this::addToResource);
		} else {
			helper = AdaptationUtils.createContextAttributeHelper(metamodel, metaclass.getName(), self.getFeature(), body, this::addToResource);
		}
		atlModel.getModule().getElements().add(helper);		
		*/
	}

	// Copied from BaseAdapterVisitor
	@SuppressWarnings("unchecked")
	protected <T extends EObject> T addToResource(EObject obj) {
		atlModel.getResource().getContents().add(obj);
		return (T) obj;
	}


}
