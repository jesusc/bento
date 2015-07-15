/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.analysis;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;

import bento.utils.BindingUtils;
import bento.validators.BindingMetamodelConformanceValidator;
import bento.validators.BindingMetamodelConformanceValidator.ValidationProblem;
import gbind.dsl.BindingModel;
import gbind.dsl.ConceptMetaclass;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.DslFactory;
import genericity.language.gbind.GbindEProblemSeverity;
import genericity.language.gbind.GbindEProblemType;
import genericity.language.gbind.mopp.GbindProblem;
import genericity.language.gbind.mopp.GbindResource;
import genericity.language.gbind.mopp.GbindResourcePostProcessor;

public class ClassBindingConceptReferenceResolver implements genericity.language.gbind.IGbindReferenceResolver<gbind.dsl.ClassBinding, gbind.dsl.ConceptMetaclass> {
	
	private genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.dsl.ClassBinding, gbind.dsl.ConceptMetaclass> delegate = new genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.dsl.ClassBinding, gbind.dsl.ConceptMetaclass>();
	
	public void resolve(String identifier, gbind.dsl.ClassBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gbind.IGbindReferenceResolveResult<gbind.dsl.ConceptMetaclass> result) {
        BindingModel bindingModel = (BindingModel) EcoreUtil.getRootContainer(container);
        
        /*
        if ( resolveFuzzy ) {
        	for (EClass eClass : BindingUtils.getAvailableConceptClasses(bindingModel)) {
                ConceptMetaclass metaclass = DslFactory.eINSTANCE.createConceptMetaclass();
                metaclass.setName(eClass.getName());                
        		result.addMapping(eClass.getName(), metaclass);
			}        	

        	// delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
        	return;
        }
        */
        
        for (ConceptMetaclass m : bindingModel.getConceptMetaclasses()) {
                if ( m.getName().equals(identifier) ) {
                        result.addMapping(identifier, m);
                        return;
                }
        }
        
        ConceptMetaclass metaclass = DslFactory.eINSTANCE.createConceptMetaclass();
        metaclass.setName(identifier);
        bindingModel.getConceptMetaclasses().add(metaclass);
        result.addMapping(identifier, metaclass);
        
		// Uncommented to see if autocompletion works...
        // delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);

        // This is needed because it seems that the resource post processor is (oddly) evaluated
        // before calling the reference resolution
        GbindResourcePostProcessor.validateObject((GbindResource) container.eResource(), bindingModel, metaclass, container);
	}
	
	public String deResolve(gbind.dsl.ConceptMetaclass element, gbind.dsl.ClassBinding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
