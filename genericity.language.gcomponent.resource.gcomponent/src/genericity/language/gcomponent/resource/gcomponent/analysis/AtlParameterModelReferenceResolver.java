/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.analysis;

public class AtlParameterModelReferenceResolver implements genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<genericity.language.gcomponent.technologies.AtlParameter, genericity.language.gcomponent.core.Model> {
	
	private genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentDefaultResolverDelegate<genericity.language.gcomponent.technologies.AtlParameter, genericity.language.gcomponent.core.Model> delegate = new genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentDefaultResolverDelegate<genericity.language.gcomponent.technologies.AtlParameter, genericity.language.gcomponent.core.Model>();
	
	public void resolve(String identifier, genericity.language.gcomponent.technologies.AtlParameter container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolveResult<genericity.language.gcomponent.core.Model> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(genericity.language.gcomponent.core.Model element, genericity.language.gcomponent.technologies.AtlParameter container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
