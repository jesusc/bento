/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

/**
 * A GcomponentContainedFeature represents a path element of a
 * genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentContainment
 * Trace
 */
public class GcomponentContainedFeature {
	
	/**
	 * The class to which the feature points.
	 */
	private org.eclipse.emf.ecore.EClass containerClass;
	
	/**
	 * The feature that points to the container class.
	 */
	private org.eclipse.emf.ecore.EStructuralFeature feature;
	
	public GcomponentContainedFeature(org.eclipse.emf.ecore.EClass containerClass, org.eclipse.emf.ecore.EStructuralFeature feature) {
		super();
		this.containerClass = containerClass;
		this.feature = feature;
	}
	
	public org.eclipse.emf.ecore.EClass getContainerClass() {
		return containerClass;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return feature;
	}
	
	public String toString() {
		return (feature == null ? "null" : feature.getName()) + "->" + (containerClass == null ? "null" : containerClass.getName());
	}
	
}
