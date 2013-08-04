/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.analysis;

public class IntermediateClassBindingConcreteClassReferenceResolver implements genericity.language.gbind.IGbindReferenceResolver<gbind.dsl.IntermediateClassBinding, gbind.dsl.ConcreteMetaclass> {
	
	private genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.dsl.IntermediateClassBinding, gbind.dsl.ConcreteMetaclass> delegate = new genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.dsl.IntermediateClassBinding, gbind.dsl.ConcreteMetaclass>();
	
	public void resolve(String identifier, gbind.dsl.IntermediateClassBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gbind.IGbindReferenceResolveResult<gbind.dsl.ConcreteMetaclass> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(gbind.dsl.ConcreteMetaclass element, gbind.dsl.IntermediateClassBinding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
