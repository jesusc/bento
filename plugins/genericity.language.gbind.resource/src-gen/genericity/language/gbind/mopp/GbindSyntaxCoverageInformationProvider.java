/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.mopp;

public class GbindSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getModule(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getImport(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclFeatureDefinition(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclContextDefinition(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclMetamodel(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclInstanceModel(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLocalVariable(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAttribute(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperation(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getParameter(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElementExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaCallExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getVariableExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSuperExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSelfExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEnvExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStringExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBooleanExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRealExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntegerExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTuplePart(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapElement(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEnumLiteralExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclUndefinedExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLetExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIfExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBraceExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperatorCallExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEqOpCallExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRelOpCallExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getAddOpCallExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntOpCallExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMulOpCallExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNotOpCallExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticPropertyCallExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticOperationCall(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStaticNavigationOrAttributeCall(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getPropertyCallExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOperationCall(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getNavigationOrAttributeCall(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterateExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIteratorExp(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIterator(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionOperationCall(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getCollectionType(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getStringType(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBooleanType(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getIntegerType(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getRealType(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getBagType(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOrderedSetType(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSequenceType(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getSetType(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclAnyType(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclType(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleType(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getTupleTypeAttribute(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElement(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getMapType(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getLambdaType(),
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getEnvType(),
			gbind.dsl.DslPackage.eINSTANCE.getBindingModel(),
			gbind.dsl.DslPackage.eINSTANCE.getBindingOptions(),
			gbind.dsl.DslPackage.eINSTANCE.getMetamodelDeclaration(),
			gbind.dsl.DslPackage.eINSTANCE.getClassBinding(),
			gbind.dsl.DslPackage.eINSTANCE.getIntermediateClassBinding(),
			gbind.dsl.DslPackage.eINSTANCE.getConcreteReferencDeclaringVar(),
			gbind.dsl.DslPackage.eINSTANCE.getVirtualMetaclass(),
			gbind.dsl.DslPackage.eINSTANCE.getVirtualTupleExp(),
			gbind.dsl.DslPackage.eINSTANCE.getVirtualReference(),
			gbind.dsl.DslPackage.eINSTANCE.getVirtualAttribute(),
			gbind.dsl.DslPackage.eINSTANCE.getVirtualClassBinding(),
			gbind.dsl.DslPackage.eINSTANCE.getConceptFeatureRef(),
			gbind.dsl.DslPackage.eINSTANCE.getOclFeatureBinding(),
			gbind.dsl.DslPackage.eINSTANCE.getRenamingFeatureBinding(),
			gbind.dsl.DslPackage.eINSTANCE.getConceptHelper(),
			gbind.dsl.DslPackage.eINSTANCE.getLocalHelper(),
			gbind.dsl.DslPackage.eINSTANCE.getHelperParameter(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			gbind.dsl.DslPackage.eINSTANCE.getBindingModel(),
		};
	}
	
}
