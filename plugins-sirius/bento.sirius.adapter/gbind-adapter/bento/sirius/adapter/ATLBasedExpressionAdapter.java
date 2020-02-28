package bento.sirius.adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.Nullable;

import anatlyzer.atl.analyser.AnalysisResult;
import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.tests.api.AnalysisLoader;
import anatlyzer.atl.util.ATLCopier;
import anatlyzer.atl.util.ATLSerializer;
import anatlyzer.atl.util.ATLUtils;
import anatlyzer.atl.util.AnalyserUtils;
import anatlyzer.atl.util.Pair;
import anatlyzer.atlext.ATL.Helper;
import anatlyzer.atlext.ATL.Module;
import anatlyzer.atlext.OCL.CollectionOperationCallExp;
import anatlyzer.atlext.OCL.NavigationOrAttributeCallExp;
import anatlyzer.atlext.OCL.OCLFactory;
import anatlyzer.atlext.OCL.OclExpression;
import anatlyzer.atlext.OCL.OclModelElement;
import anatlyzer.atlext.OCL.VariableExp;
import anatlyzer.atlext.OCL2.SelectByKind;
import anatlyzer.atlext.processing.AbstractVisitor;
import bento.adapter.atl.visitors.AdaptCode;
import bento.adapter.atl.visitors.AdaptationError;
import bento.adapter.atl.visitors.GbindToATL;
import bento.binding.utils.BindingModel;
import bento.common.adapter.IComponentInfoForBinding;
import efinder.aql.AQL2ATL;
import gbind.dsl.BaseFeatureBinding;
import gbind.dsl.ClassBinding;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.OclFeatureBinding;
import gbind.dsl.RenamingFeatureBinding;

/**
 * Given an AQL expression it uses AnATLyzer as an intermediate
 * representation to adapt using the binding. 
 * 
 * This is needed because we need precise type information to
 * perform the adaptation.
 * 
 * 
 * @author jesus
 */
public class ATLBasedExpressionAdapter {

	private BindingModel bindingSpec;
	private String result;
	private SiriusComponentInfo mmInfo;
	private @Nullable String boundClass;

	public ATLBasedExpressionAdapter(EClass contextClass, String expression, @Nullable String boundClass, BindingModel bindingSpec, SiriusComponentInfo mmInfo) {
		this.bindingSpec = bindingSpec;
		this.mmInfo = mmInfo;
		this.boundClass = boundClass;
		
		AQL2ATL converter = new AQL2ATL();
		converter.addMetamodels(mmInfo.getSiriusPackages().values());
		
		OclExpression atl = converter.toExpression(expression);
		
		List<String> names = new ArrayList<>();
		List<Resource> resources = new ArrayList<>();
		
		HashMap<String, Resource> namesToResources = new HashMap<String, Resource>();
		
		mmInfo.getSiriusPackages().forEach((k, v) -> {
			namesToResources.put(k, v.eResource());
		
			names.add(k);
			resources.add(v.eResource());
		});
		
		
		// construct a transformation with all the elements to be analysed
		Module analysableTrafo = AnalyserUtils.constructTransformation(
				Collections.singletonList(new Pair<EClass, OclExpression>(contextClass, atl)), 
				Collections.emptyList(),
				namesToResources);
		
		
		ATLModel model = new ATLModel(analysableTrafo);
		AnalysisLoader analysis = AnalysisLoader.fromATLModel(model, resources.toArray(), names.toArray(new String[names.size()]));
		AnalysisResult r = analysis.analyse();
		
		// TODO: Check there are no type errors!
		
		adapt(r.getATLModel(), bindingSpec);
	
		List<Helper> helpers = ATLUtils.getAllHelpers(r.getATLModel(), (h) -> ! AnalyserUtils.isAddedEOperation(h));
		if ( helpers.size() != 1 )
			throw new IllegalStateException("No helper found");
		

		Helper h = helpers.get(0);
		OclExpression adaptedExpression = ATLUtils.getHelperBody(h);
		
		this.result = AQLSerializer.serialize(adaptedExpression);
		System.out.println("  Original: " + expression );
		System.out.println("Adapted to: " + this.result);
	}

	private void adapt(ATLModel atlModel, BindingModel bindingSpec) {
		new ATLAdapter().startVisiting(atlModel.getRoot());
	
		// Try to use this for oclIsKindOf
		// new AdaptCode(atlModel, bindModel, info, ctx).perform()
	}
	
	public String getResult() {
		return result;
	}
	
	/**
	 * This visits a Sirius expressions and make queries to the binding model to do replacements
	 */
	public class ATLAdapter extends AbstractVisitor {
		
		// Example #1:
		// Original expression: self.prop.name
		//             Binding: feature CTXa.prop = self.prop1.prop2
		//                      feature CTXb.name = self.customName + 'xy'
		//
		//    Result: self.<binding-of-'prop'>.customName + 'xy'
		//        =>  self.prop1.prop2.customName + 'xy'
		//
		// Example #2:
		// Original expression: self.isInitial
		//             Binding: feature Task.isInitial = true
		//
		//    Result: true
		@Override
		public void beforeNavigationOrAttributeCallExp(NavigationOrAttributeCallExp self) {
			EStructuralFeature f = (EStructuralFeature) self.getUsedFeature();
			

			BaseFeatureBinding b;
			if (boundClass == null) {
				b = bindingSpec.findFeatureFinding(f.getEContainingClass().getName(), f.getName()).get();
			} else {
				b = bindingSpec.findFeatureFinding(f.getEContainingClass().getName(), f.getName(), boundClass).get();
			}
			
			if ( b instanceof RenamingFeatureBinding ) {
				RenamingFeatureBinding renaming = (RenamingFeatureBinding) b;
				self.setName(renaming.getConcreteFeature());
			} else {
				OclFeatureBinding ocl = (OclFeatureBinding) b;
				GbindToATL gbindToATL = new GbindToATL(null, null); // not sure if this valid
				
				OclExpression atl = gbindToATL.transform(ocl.getConcrete());
				
				List<VariableExp> selfVars = ATLUtils.findAllVarExp(atl).stream().filter(v -> v.getReferredVariable().getVarName().equals("self")).collect(Collectors.toList());
				for (VariableExp variableExp : selfVars) {
					EObject src = ATLCopier.copySingleElement(self.getSource());
					EcoreUtil.replace(variableExp, src);
				}
				
				// In the end, we replace the whole original expression with the adapted one in the binding
				EcoreUtil.replace(self, atl);
			}
		}
		
		@Override
		public void inSelectByKind(SelectByKind self) {
			OclModelElement me = (OclModelElement) self.getArguments().get(0);
			
			Optional<ClassBinding> cb = bindingSpec.findClassBindingForConcept(me.getName());
			if ( ! cb.isPresent() ) {
				throw new AdaptationError("Cannot adapt '" + AQLSerializer.serialize(self) + "' - No binding");
			}
			
			List<ConcreteMetaclass> concretes = cb.get().getConcrete();
			
			// Change the original using the first one
			me.setName(concretes.get(0).getName());
			me.getModel().setName(getBoundMetamodelName());
			
			List<OclExpression> expressions = new ArrayList<OclExpression>();
			
			for(int i = 1; i < concretes.size(); i++) {
				String name = concretes.get(i).getName();
				SelectByKind selectCopy = (SelectByKind) ATLCopier.copySingleElement(self);
				OclModelElement meCopy = (OclModelElement) self.getArguments().get(0);
				meCopy.setName(name);
				meCopy.getModel().setName(getBoundMetamodelName());
				expressions.add(selectCopy);
			}
			
			OclExpression result_ = expressions.stream().reduce((SelectByKind) ATLCopier.copySingleElement(self), (t, u) -> {
				CollectionOperationCallExp union = OCLFactory.eINSTANCE.createCollectionOperationCallExp();
				union.setOperationName("union");
				union.setSource(t);
				union.getArguments().add(u);
				return union;
			});
			
			EcoreUtil.replace(self, result_);
		}

		// This is duplicated form SiriusAdapter - Find a better way
		private String getBoundMetamodelName() {
			String dcl = mmInfo.getBoundMetamodels().get(0).getBoundMetamodelName();
			EPackage metamodel = mmInfo.getTargetMetamodelPackage(dcl);
			return metamodel.getName();
		}
		
		// TODO: Same for OCL is kind of
		
	}

	
	
}
