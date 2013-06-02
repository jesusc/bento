/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.analysis;

public class VirtualReferenceType_ReferenceResolver implements genericity.language.gbind.IGbindReferenceResolver<gbind.dsl.VirtualReference, gbind.dsl.ConcreteMetaclass> {
	
	private genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.dsl.VirtualReference, gbind.dsl.ConcreteMetaclass> delegate = new genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.dsl.VirtualReference, gbind.dsl.ConcreteMetaclass>();
	
	public void resolve(String identifier, gbind.dsl.VirtualReference container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gbind.IGbindReferenceResolveResult<gbind.dsl.ConcreteMetaclass> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(gbind.dsl.ConcreteMetaclass element, gbind.dsl.VirtualReference container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
