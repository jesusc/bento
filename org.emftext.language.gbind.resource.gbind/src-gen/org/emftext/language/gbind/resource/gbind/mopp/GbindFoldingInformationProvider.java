/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.mopp;

public class GbindFoldingInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.eclipse.emf.ecore.EClass[] {
			be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclFeatureDefinition(),
		};
	}
	
}
