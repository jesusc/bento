/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.grammar;

public class GcomponentContainment extends genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentTerminal {
	
	public GcomponentContainment(org.eclipse.emf.ecore.EStructuralFeature feature, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
