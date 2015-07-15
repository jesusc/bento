/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.mopp;

import gbind.dsl.BindingModel;
import gbind.dsl.MetamodelDeclaration;
import genericity.language.gbind.GbindEProblemSeverity;
import genericity.language.gbind.GbindEProblemType;

import org.eclipse.emf.ecore.EObject;

import bento.repository.common.BentoURIResolver;
import bento.utils.BindingUtils;
import bento.validators.BindingMetamodelConformanceValidator;
import bento.validators.BindingMetamodelConformanceValidator.ValidationProblem;

public class GbindResourcePostProcessor implements genericity.language.gbind.IGbindResourcePostProcessor {
	
	public void process(genericity.language.gbind.mopp.GbindResource resource) {
		BindingModel root = (BindingModel) resource.getContents().get(0);		
		boolean metamodelsOk = true;
		
		if ( root.getBoundMetamodel() != null ) {
			MetamodelDeclaration m = root.getBoundMetamodel();
			if ( ! canBeLoaded(m, resource) ) {
				GbindProblem p = new GbindProblem("Cannot resolve " + m.getMetamodelURI(), 
						GbindEProblemType.ANALYSIS_PROBLEM, 
						GbindEProblemSeverity.ERROR);
						// new ResolveBentoQuickfix("Resolve component", null, m, m.getMetamodelUri()));
				
				resource.addProblem(p, m);
				metamodelsOk = metamodelsOk && false;
			}
		}

		if ( root.getBoundConcept() != null ) {
			MetamodelDeclaration m = root.getBoundConcept();
			if ( ! canBeLoaded(m, resource) ) {
				GbindProblem p = new GbindProblem("Cannot resolve " + m.getMetamodelURI(), 
						GbindEProblemType.ANALYSIS_PROBLEM, 
						GbindEProblemSeverity.ERROR);
						// new ResolveBentoQuickfix("Resolve component", null, m, m.getMetamodelUri()));
				
				resource.addProblem(p, m);
				metamodelsOk = metamodelsOk && false;
			}
		}

		// Check meta-classes
		if ( metamodelsOk ) {
			checkClasses(resource, root);
		}
	}
	
	private void checkClasses(GbindResource resource, BindingModel root) {
		BindingMetamodelConformanceValidator validator = new BindingMetamodelConformanceValidator(root);
		validator.perform();
		for (ValidationProblem validationProblem : validator.getProblems()) {
			GbindProblem p = new GbindProblem(validationProblem.getMessage(), 
					GbindEProblemType.ANALYSIS_PROBLEM, 
					GbindEProblemSeverity.ERROR);
			
			resource.addProblem(p, validationProblem.getElement());
		}
	}
	
	public static void validateObject(GbindResource resource, BindingModel root, EObject obj, EObject toBlame) {
		BindingUtils.loadMetamodels(root); // in case it is not loaded
		BindingMetamodelConformanceValidator validator = new BindingMetamodelConformanceValidator(root);
		validator.perform(obj);
		for (ValidationProblem validationProblem : validator.getProblems()) {
			GbindProblem p = new GbindProblem(validationProblem.getMessage(), 
					GbindEProblemType.ANALYSIS_PROBLEM, 
					GbindEProblemSeverity.ERROR);
			
			resource.addProblem(p, toBlame != null ? toBlame : obj);
		}
		
	}

	private boolean canBeLoaded(MetamodelDeclaration md, GbindResource resource) {		
		if ( md.getResource() == null ) {
			String metamodelURI = md.getMetamodelURI();
			String identifier = BentoURIResolver.tryResolveMetamodel(metamodelURI, resource);
			org.eclipse.emf.ecore.resource.Resource r = BentoURIResolver.loadMetamodel(identifier);		
			md.setResource(r);
			return r != null;
		} else {
			return true;
		}		
	}

	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}
