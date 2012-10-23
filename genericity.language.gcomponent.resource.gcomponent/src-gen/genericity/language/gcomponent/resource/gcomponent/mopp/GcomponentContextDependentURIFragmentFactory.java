/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class GcomponentContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements genericity.language.gcomponent.resource.gcomponent.IGcomponentContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public GcomponentContextDependentURIFragmentFactory(genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
