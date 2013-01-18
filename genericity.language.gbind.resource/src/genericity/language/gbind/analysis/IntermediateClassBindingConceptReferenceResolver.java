/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.analysis;

import gbind.dsl.BindingModel;
import gbind.dsl.ConceptMetaclass;
import gbind.dsl.DslFactory;

import org.eclipse.emf.ecore.util.EcoreUtil;

public class IntermediateClassBindingConceptReferenceResolver implements genericity.language.gbind.IGbindReferenceResolver<gbind.dsl.IntermediateClassBinding, gbind.dsl.ConceptMetaclass> {
	
	private genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.dsl.IntermediateClassBinding, gbind.dsl.ConceptMetaclass> delegate = new genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.dsl.IntermediateClassBinding, gbind.dsl.ConceptMetaclass>();
	
	public void resolve(String identifier, gbind.dsl.IntermediateClassBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gbind.IGbindReferenceResolveResult<gbind.dsl.ConceptMetaclass> result) {
		// Copied from ClassBindingConceptReferenceResolver
		
		BindingModel bindingModel = (BindingModel) EcoreUtil.getRootContainer(container);
        for (ConceptMetaclass m : bindingModel.getConceptMetaclasses()) {
                if ( m.getName().equals(identifier) ) {
                        result.addMapping(identifier, m);
                        return;
                }
        }
        
        ConceptMetaclass metaclass = DslFactory.eINSTANCE.eINSTANCE.createConceptMetaclass();
        metaclass.setName(identifier);
        bindingModel.getConceptMetaclasses().add(metaclass);
        result.addMapping(identifier, metaclass);
        
		// delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(gbind.dsl.ConceptMetaclass element, gbind.dsl.IntermediateClassBinding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
