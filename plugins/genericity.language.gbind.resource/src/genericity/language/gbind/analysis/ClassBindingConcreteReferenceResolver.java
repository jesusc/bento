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
import gbind.dsl.BindingModel;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.DslFactory;
import genericity.language.gbind.mopp.GbindResource;
import genericity.language.gbind.mopp.GbindResourcePostProcessor;

public class ClassBindingConcreteReferenceResolver implements genericity.language.gbind.IGbindReferenceResolver<gbind.dsl.ClassBinding, gbind.dsl.ConcreteMetaclass> {
	
	private genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.dsl.ClassBinding, gbind.dsl.ConcreteMetaclass> delegate = new genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.dsl.ClassBinding, gbind.dsl.ConcreteMetaclass>();
	
	public void resolve(String identifier, gbind.dsl.ClassBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gbind.IGbindReferenceResolveResult<gbind.dsl.ConcreteMetaclass> result) {
        BindingModel bindingModel = (BindingModel) EcoreUtil.getRootContainer(container);
        
        /*
        if ( resolveFuzzy ) {
        	for (EClass eClass : BindingUtils.getAvailableConcreteClasses(bindingModel)) {
                ConcreteMetaclass metaclass = DslFactory.eINSTANCE.createConcreteMetaclass();
                metaclass.setName(eClass.getName());                
        		result.addMapping(eClass.getName(), metaclass);
			}        	

        	// delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
        	return;
        }
        */
        
        for (ConcreteMetaclass m : bindingModel.getConcreteMetaclasses()) {
                if ( m.getName().equals(identifier) ) {
                        result.addMapping(identifier, m);       
                        return;
                }
        }
        
        ConcreteMetaclass metaclass = DslFactory.eINSTANCE.createConcreteMetaclass();
        metaclass.setName(identifier);
        bindingModel.getConcreteMetaclasses().add(metaclass);
        result.addMapping(identifier, metaclass);

		// delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);

        // This is needed because it seems that the resource post processor is (oddly) evaluated
        // before calling the reference resolution
        GbindResourcePostProcessor.validateObject((GbindResource) container.eResource(), bindingModel, metaclass, container);
	}
	
	public String deResolve(gbind.dsl.ConcreteMetaclass element, gbind.dsl.ClassBinding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
