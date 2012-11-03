/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent;

/**
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * 
 * @see genericity.language.gcomponent.resource.gcomponent.IGcomponentOptions
 */
public interface IGcomponentDelegatingReferenceResolver<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> extends genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
