package bento.adapter.atl.visitors;

import gbind.simpleocl.Operation;

import java.util.function.Consumer;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atlext.ATL.ATLFactory;
import anatlyzer.atlext.ATL.ContextHelper;
import anatlyzer.atlext.OCL.Attribute;
import anatlyzer.atlext.OCL.OCLFactory;
import anatlyzer.atlext.OCL.OclAnyType;
import anatlyzer.atlext.OCL.OclContextDefinition;
import anatlyzer.atlext.OCL.OclExpression;
import anatlyzer.atlext.OCL.OclFeatureDefinition;
import anatlyzer.atlext.OCL.OclModel;
import anatlyzer.atlext.OCL.OclModelElement;

public class AdaptationUtils {

	public static OclModel getMetamodel(ATLModel atlModel, String mmName) {
		Predicate<OclModel> check = (m) -> m.getMetamodel().getName().equals(mmName);
		
		return atlModel.getModule().getInModels().stream()
				.filter(check)
				.map(m -> m.getMetamodel())
				.findFirst()
				.orElseGet(
						() -> atlModel.getModule().getOutModels().stream()
								.filter(check).map(m -> m.getMetamodel())
								.findFirst()
								.orElseThrow(() -> new RuntimeException()));
	}

	public static ContextHelper createContextOperationHelper(OclModel metamodel, String metaclassName, String featureName, OclExpression body, Consumer<EObject> addToResource) {
		ContextHelper helper = ATLFactory.eINSTANCE.createContextHelper();
		{
			OclFeatureDefinition definition = OCLFactory.eINSTANCE.createOclFeatureDefinition();
			helper.setDefinition(definition);
			{
				anatlyzer.atlext.OCL.Operation operation = OCLFactory.eINSTANCE.createOperation();
				operation.setName(featureName);
				definition.setFeature(operation);

				
				OclAnyType oclAny = OCLFactory.eINSTANCE.createOclAnyType();
				addToResource.accept(oclAny);
				operation.setReturnType(oclAny);
				operation.setBody(body);
			}
		
			OclContextDefinition context_ = OCLFactory.eINSTANCE.createOclContextDefinition();
			OclModelElement contextType = OCLFactory.eINSTANCE.createOclModelElement();
			contextType.setName( metaclassName );
			contextType.setModel( metamodel );
			context_.setContext_(contextType);
			
			definition.setContext_(context_);
		}
		return helper;
	}

	public static ContextHelper createContextAttributeHelper(OclModel metamodel, String metaclassName, String featureName, OclExpression body, Consumer<EObject> addToResource) {
		ContextHelper helper = ATLFactory.eINSTANCE.createContextHelper();
		{
			OclFeatureDefinition definition = OCLFactory.eINSTANCE.createOclFeatureDefinition();
			helper.setDefinition(definition);
			{
				Attribute attribute = OCLFactory.eINSTANCE.createAttribute();
				attribute.setName(featureName);
				definition.setFeature(attribute);

				
				OclAnyType oclAny = OCLFactory.eINSTANCE.createOclAnyType();
				addToResource.accept(oclAny);
				attribute.setType(oclAny);
				attribute.setInitExpression(body);
			}
		
			OclContextDefinition context_ = OCLFactory.eINSTANCE.createOclContextDefinition();
			OclModelElement contextType = OCLFactory.eINSTANCE.createOclModelElement();
			contextType.setName( metaclassName );
			contextType.setModel( metamodel );
			context_.setContext_(contextType);
			
			definition.setContext_(context_);
		}
		return helper;
	}

}
