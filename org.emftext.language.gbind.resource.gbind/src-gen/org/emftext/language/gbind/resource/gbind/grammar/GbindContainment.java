/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.grammar;

public class GbindContainment extends org.emftext.language.gbind.resource.gbind.grammar.GbindTerminal {
	
	public GbindContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.emftext.language.gbind.resource.gbind.grammar.GbindCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
