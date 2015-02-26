/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

public class BentoSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(),
			bento.language.bentocomp.core.CorePackage.eINSTANCE.getTransformationComponent(),
			bento.language.bentocomp.core.CorePackage.eINSTANCE.getConcept(),
			bento.language.bentocomp.core.CorePackage.eINSTANCE.getParameterModel(),
			bento.language.bentocomp.core.CorePackage.eINSTANCE.getTag(),
			bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getSingleFeature(),
			bento.language.bentocomp.variants.VariantsPackage.eINSTANCE.getXorFeature(),
			bento.language.bentocomp.core.CorePackage.eINSTANCE.getCompositeComponent(),
			bento.language.bentocomp.core.CorePackage.eINSTANCE.getBindingDeclaration(),
			bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getComposition(),
			bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXor(),
			bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getXorCond(),
			bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApply(),
			bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getApplyParameter(),
			bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getSeq(),
			bento.language.bentocomp.flowcontrol.FlowcontrolPackage.eINSTANCE.getFeatureRef(),
			bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlTemplate(),
			bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getAtlParameter(),
			bento.language.bentocomp.technologies.TechnologiesPackage.eINSTANCE.getJavaTemplate(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(),
		};
	}
	
}
