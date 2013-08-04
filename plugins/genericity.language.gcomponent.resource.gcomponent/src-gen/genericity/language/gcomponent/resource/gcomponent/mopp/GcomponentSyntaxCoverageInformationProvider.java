/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

public class GcomponentSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			genericity.language.gcomponent.dsl.DslPackage.eINSTANCE.getDefinitionRoot(),
			genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTransformationComponent(),
			genericity.language.gcomponent.core.CorePackage.eINSTANCE.getConcept(),
			genericity.language.gcomponent.core.CorePackage.eINSTANCE.getParameterModel(),
			genericity.language.gcomponent.core.CorePackage.eINSTANCE.getTag(),
			genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getSingleFeature(),
			genericity.language.gcomponent.variants.VariantsPackage.eINSTANCE.getXorFeature(),
			genericity.language.gcomponent.core.CorePackage.eINSTANCE.getCompositeComponent(),
			genericity.language.gcomponent.core.CorePackage.eINSTANCE.getBindingDeclaration(),
			genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(),
			genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(),
			genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(),
			genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(),
			genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(),
			genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(),
			genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.eINSTANCE.getFeatureRef(),
			genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(),
			genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter(),
			genericity.language.gcomponent.technologies.TechnologiesPackage.eINSTANCE.getJavaTemplate(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			genericity.language.gcomponent.dsl.DslPackage.eINSTANCE.getDefinitionRoot(),
		};
	}
	
}
