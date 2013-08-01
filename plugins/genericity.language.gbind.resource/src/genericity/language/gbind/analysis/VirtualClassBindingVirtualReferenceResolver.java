/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.analysis;

public class VirtualClassBindingVirtualReferenceResolver implements genericity.language.gbind.IGbindReferenceResolver<gbind.dsl.VirtualClassBinding, gbind.dsl.VirtualMetaclass> {
	
	private genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.dsl.VirtualClassBinding, gbind.dsl.VirtualMetaclass> delegate = new genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.dsl.VirtualClassBinding, gbind.dsl.VirtualMetaclass>();
	
	public void resolve(String identifier, gbind.dsl.VirtualClassBinding container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gbind.IGbindReferenceResolveResult<gbind.dsl.VirtualMetaclass> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(gbind.dsl.VirtualMetaclass element, gbind.dsl.VirtualClassBinding container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
