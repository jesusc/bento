/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class BentoContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements bento.language.bentocomp.resource.bento.IBentoContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final bento.language.bentocomp.resource.bento.IBentoReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public BentoContextDependentURIFragmentFactory(bento.language.bentocomp.resource.bento.IBentoReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public bento.language.bentocomp.resource.bento.IBentoContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new bento.language.bentocomp.resource.bento.mopp.BentoContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public bento.language.bentocomp.resource.bento.IBentoReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
