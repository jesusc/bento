package bento.sirius.adapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import anatlyzer.atl.analyser.AnalysisResult;
import anatlyzer.atl.model.ATLModel;
import anatlyzer.atl.tests.api.AnalysisLoader;
import anatlyzer.atl.util.ATLCopier;
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
import bento.sirius.adapter.bindingmodel.SiriusBindingModel;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel.AbstractFeatureBinding;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel.ClassBinding;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel.OclDerivedFeatureBinding;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel.RenameFeatureBinding;
import efinder.aql.AQL2ATL;

/**
 * Given an AQL expression it uses AnATLyzer as an intermediate
 * representation to adapt using the binding. 
 * 
 * This is needed because we need precise type information to
 * perform the adaptation.
 * 
 * This is a copy/modify of ATLBasedExpressionAdapter with the new version
 * of the binding model. 
 * 
 * @author jesus
 */
public class ATLBasedAQLAdapter {

	private SiriusBindingModel bindingModel;
	private String result;
	private @Nullable EClass boundClass;

	public ATLBasedAQLAdapter(EClass contextClass, String expression, @Nullable EClass boundClass, @NonNull SiriusBindingModel bindingModel) {
		this.bindingModel = bindingModel;
		this.boundClass = boundClass;
		
		AQL2ATL converter = new AQL2ATL();
		converter.addMetamodels(bindingModel.getConcept().getPackages());
		
		OclExpression atl = converter.toExpression(expression);
		
		List<String> names = new ArrayList<>();
		List<Resource> resources = new ArrayList<>();
		
		HashMap<String, Resource> namesToResources = new HashMap<String, Resource>();
		
		bindingModel.getConcept().getPackages().forEach(p -> {
			namesToResources.put(p.getName(), p.eResource());
		
			names.add(p.getName());
			resources.add(p.eResource());
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
		
		adapt(r.getATLModel());
	
		List<Helper> helpers = ATLUtils.getAllHelpers(r.getATLModel(), (h) -> ! AnalyserUtils.isAddedEOperation(h));
		if ( helpers.size() != 1 )
			throw new IllegalStateException("No helper found");
		

		Helper h = helpers.get(0);
		OclExpression adaptedExpression = ATLUtils.getHelperBody(h);
		
		this.result = AQLSerializer.serialize(adaptedExpression);
		System.out.println("  Original: " + expression );
		System.out.println("Adapted to: " + this.result);
	}

	private void adapt(ATLModel atlModel) {
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
			

			AbstractFeatureBinding b;
			if (boundClass == null) {
				throw new UnsupportedOperationException();
				// b = bindingModel.getFeatureBinding(f);
			} else {
 				b = bindingModel.getFeatureBinding(f, boundClass);
				// b = bindingSpec.findFeatureFinding(f.getEContainingClass().getName(), f.getName(), boundClass).get();
			}
			
			if (b == null) {
				throw new IllegalStateException("No binding for feature " + f);
			}
			
			if ( b instanceof RenameFeatureBinding ) {
				RenameFeatureBinding renaming = (RenameFeatureBinding) b;
				self.setName(renaming.getConcreteFeature().getName());
			} else {
				OclDerivedFeatureBinding ocl = (OclDerivedFeatureBinding) b;
				OclExpression atl = ocl.getOclExpression();
				
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
			
			EClass klass = bindingModel.getConcept().findEClassInPackageOrNull(me.getModel().getName(), me.getName());
			ClassBinding cb = bindingModel.getClassBinding(klass);
			
			
			// List<ConcreteMetaclass> concretes = cb.getConcrete();
			List<EClass> concretes = new ArrayList<EClass>();
			// TODO: Find out how to add more concrete classes to a class binding
			// For the moment this only handles one concrete
			concretes.add(cb.getConcrete()); 
			
			// Change the original using the first one
			me.setName(concretes.get(0).getName());
			me.getModel().setName(getBoundMetamodelName(concretes.get(0)));
			
			List<OclExpression> expressions = new ArrayList<OclExpression>();
			
			for(int i = 1; i < concretes.size(); i++) {
				String name = concretes.get(i).getName();
				SelectByKind selectCopy = (SelectByKind) ATLCopier.copySingleElement(self);
				OclModelElement meCopy = (OclModelElement) self.getArguments().get(0);
				meCopy.setName(name);
				meCopy.getModel().setName(getBoundMetamodelName(concretes.get(i)));
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
//		private String getBoundMetamodelName() {
//			String dcl = mmInfo.getBoundMetamodels().get(0).getBoundMetamodelName();
//			EPackage metamodel = mmInfo.getTargetMetamodelPackage(dcl);
//			return metamodel.getName();
//		}
//		
		// TODO: Same for OCL is kind of
		
	}

	@NonNull
	private String getBoundMetamodelName(@NonNull EClass eClass) {
		return eClass.getEPackage().getName();
	}
	
	
}
