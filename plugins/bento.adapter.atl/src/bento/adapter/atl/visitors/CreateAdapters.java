package bento.adapter.atl.visitors;

import gbind.dsl.Metaclass;
import gbind.dsl.OclFeatureBinding;
import gbind.dsl.RenamingFeatureBinding;
import gbind.simpleocl.OclExpression;

import java.util.stream.Stream;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atlext.ATL.ATLFactory;
import anatlyzer.atlext.ATL.ContextHelper;
import anatlyzer.atlext.OCL.Attribute;
import anatlyzer.atlext.OCL.NavigationOrAttributeCallExp;
import anatlyzer.atlext.OCL.OCLFactory;
import anatlyzer.atlext.OCL.OclAnyType;
import anatlyzer.atlext.OCL.OclContextDefinition;
import anatlyzer.atlext.OCL.OclFeatureDefinition;
import anatlyzer.atlext.OCL.OclModel;
import anatlyzer.atlext.OCL.OclModelElement;
import anatlyzer.atlext.OCL.VariableDeclaration;
import anatlyzer.atlext.OCL.VariableExp;
import bento.adapter.atl.BindingModel;
import bento.adapter.atl.IComponentInfoForBinding;

public class CreateAdapters extends BaseAdapterVisitor {
	
	public CreateAdapters(ATLModel atlModel, BindingModel bindingModel, IComponentInfoForBinding info) {
		super(atlModel, bindingModel, info);
	}

	public void perform() {
		// Feature renamings
		Stream<RenamingFeatureBinding> features = bindingModel.findAllRenamingFeatureBindings().
			filter(fb -> ! fb.getConceptFeature().equals(fb.getConcreteFeature()) 
					     && AdaptationUtils.isNormalFeatureBinding(fb) );
			
		features.forEach(fb -> {
			if ( fb.getQualifier() == null ) {
				bindingModel.findClassBindingForConcept(fb.getConceptClass().getName()).
					ifPresent(cb -> createRenamingHelper(fb, fb.getConceptClass())); // TODO: In the original was: cb.concrete.first...
			} else {
				createRenamingHelper(fb, fb.getQualifier());
			}
		});
		
		// Ocl feature bindings
		Stream<OclFeatureBinding> oclFeatureBindings = bindingModel.findAllOclFeatureBindings().
				filter(fb -> AdaptationUtils.isNormalFeatureBinding(fb) );
				
		oclFeatureBindings.forEach(fb -> {
				if ( fb.getQualifier() == null ) {
					bindingModel.findClassBindingForConcept(fb.getConceptClass().getName()).
						ifPresent(cb -> createOclHelper(fb, fb.getConceptClass())); // TODO: In the original was: cb.concrete.first...
				} else {
					createOclHelper(fb, fb.getQualifier());
				}
			});
		
		applyPending();
	}


	/**
	 * Creates the following helper (using the original Eclectic transformation a reference)
	 * <pre>
	 * template createRenamingHelper(fb : gbind!RenamingFeatureBinding, concreteMetaclass : gbind!ConcreteMetaclass, atl_model : atl!OclModel) 
	 *  atl!Helper {
     * 		definition = atl!OclFeatureDefinition {
	 *   		feature = atl!Attribute {
	 *  			name = fb.conceptFeature
	 *  			initExpression = atl!NavigationOrAttributeCallExp {
	 *  				name = fb.concreteFeature
     * 					source = atl!VariableExp {
     *						referredVariable = atl!VariableDeclaration { varName = "self" }
	 *					}
	 *				}
	 *				type = atl!OclAnyType { }
	 *			}
	 *			context_ = atl!OclContextDefinition {
	 *				context_ = atl!OclModelElement { 
	 *					name  = concreteMetaclass.name
	 *					model = atl_model 
	 *				}
	 *			}		
	 *		}
	 * }
	 * </pre>
	 * @param fb
	 * @param metaclass
	 * @return
	 */
	private void createRenamingHelper(RenamingFeatureBinding fb, Metaclass metaclass) {
		OclModel metamodel = AdaptationUtils.getMetamodel(atlModel, info.getConceptMetamodelName());
		
		ContextHelper helper = ATLFactory.eINSTANCE.createContextHelper();
		{
			OclFeatureDefinition definition = OCLFactory.eINSTANCE.createOclFeatureDefinition();
			helper.setDefinition(definition);
			{
				Attribute attribute = OCLFactory.eINSTANCE.createAttribute();
				attribute.setName(fb.getConceptFeature());
				definition.setFeature(attribute);

				// Init expression
				NavigationOrAttributeCallExp init = OCLFactory.eINSTANCE.createNavigationOrAttributeCallExp();
				init.setName(fb.getConcreteFeature());
				VariableExp varExp = OCLFactory.eINSTANCE.createVariableExp();
				VariableDeclaration self = addToResource(OCLFactory.eINSTANCE.createVariableDeclaration());
				self.setVarName("self");
				varExp.setReferredVariable(self);
				init.setSource(varExp);
				
				attribute.setInitExpression(init);
				
				// Type 
				// TODO: Compute the type properly!
				OclAnyType oclAny = addToResource(OCLFactory.eINSTANCE.createOclAnyType());
				attribute.setType(oclAny);
			}

			OclContextDefinition context_ = OCLFactory.eINSTANCE.createOclContextDefinition();
			OclModelElement contextType = OCLFactory.eINSTANCE.createOclModelElement();
			contextType.setName( metaclass.getName() );
			contextType.setModel( metamodel );
			context_.setContext_(contextType);
			
			definition.setContext_(context_);
		}

		atlModel.getModule().getElements().add(0, helper);		
	}

	private void createOclHelper(OclFeatureBinding fb, Metaclass metaclass) {
		OclModel metamodel = AdaptationUtils.getMetamodel(atlModel, info.getConceptMetamodelName());
		OclExpression oclExpr = fb.getConcrete();

		anatlyzer.atlext.OCL.OclExpression body = new GbindToATL(atlModel, info).transform(oclExpr);
		
		// Creates the helper
		ContextHelper helper = AdaptationUtils.createContextAttributeHelper(metamodel, metaclass.getName(), fb.getConceptFeature(), body, this::addToResource);
				
		atlModel.getModule().getElements().add(0, helper);		
	}
	



}
