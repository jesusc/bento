package bento.sirius.adapter2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.description.NodeMapping;

import bento.sirius.adapter.ATLBasedExpressionAdapter;
import bento.sirius.adapter.AdapterError;
import bento.sirius.adapter.EMFMetamodel;
import bento.sirius.adapter.SiriusModel;
import bento.sirius.adapter.SiriusUtils;
import bento.sirius.adapter.Trace;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel.ClassBinding;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel.NoneBinding;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel.NoneToolBinding;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel.RootBinding;
import gbind.dsl.BaseFeatureBinding;
import gbind.dsl.RenamingFeatureBinding;

/**
 * A rewriter for Sirius based on a model-level binding,
 * as provided by the graphical binding editor.
 * 
 * @author jesus
 *
 */
public class SiriusAdapter2 {

	@NonNull 
	private final SiriusBindingModel bindingModel;

	@NonNull 
	private final SiriusModel sirius;
	@NonNull 
	private final EMFMetamodel concrete;
	@NonNull
	private final EMFMetamodel concept;

	// TODO: Generalize to ElementBinding
	@NonNull 
	private final Trace<ClassBinding, DiagramElementMapping> trace = new Trace<>();
	
	@NonNull
	private final List<Runnable> delayedActions = new ArrayList<>();
	
	public SiriusAdapter2(@NonNull SiriusBindingModel model) {
		this.bindingModel = model;
		
		this.sirius = model.getSirius();
		this.concrete = model.getConcrete();
		this.concept = model.getConcept();
	}
	
	public void execute() {		
		// Adapt node mappings
		Collection<? extends ClassBinding> classBindings = bindingModel.getClassBindings();
		for (ClassBinding cb : classBindings) {	
			rewriteNodeMapping(cb);
		}
		
		for (NoneBinding noneBinding : bindingModel.getNoneBindings()) {
			delay(() -> remove(noneBinding.getRemovedElement()));
			// TODO. Not sure if the node mapping has to be removed only if all the conditional styles are empty
			delay(() -> remove(noneBinding.getNodeMapping()));
		}
		
		for (NoneToolBinding noneBinding : bindingModel.getNoneToolBindings()) {
			delay(() -> remove(noneBinding.getTool()));
		}
		
		new SiriusToolAdapter2(this).perform();
		
		// Adapt the root
		// We do this at the end to be able to refer to the original root mapping
		RootBinding rootBinding = bindingModel.getRootBinding();
		DiagramDescription diagram = rootBinding.getDescription();
		delay(() -> {
			diagram.setDomainClass(SiriusUtils.toSiriusClassName(rootBinding.getConcrete()));
			diagram.getMetamodel().clear();
			diagram.getMetamodel().addAll(concrete.getPackages());
		});

		
		delayedActions.forEach(Runnable::run);
	}

	private void rewriteNodeMapping(@NonNull ClassBinding cb) {
		final NodeMapping nodeMapping = cb.getNodeMapping();
		Layer layer = (Layer) nodeMapping.eContainer();
		
		if (cb.hasConditionalStyle()) {
			ConditionalNodeStyleDescription condStyle = cb.getConditionalStyle();

			NodeMapping copy = copyNode(nodeMapping, cb.getConcrete().getName());
			copy.getConditionnalStyles().clear();
			copy.setStyle(condStyle.getStyle());
			adaptNodeExpressions(nodeMapping, copy, cb);
			
			addTrace(cb, copy);
			copy.setDomainClass(SiriusUtils.toSiriusClassName(cb.getConcrete()));
			
			layer.getNodeMappings().add(copy);
			
			delay(() -> remove(condStyle));
			delay(() -> {
				if (cb.getNodeMapping().getConditionnalStyles().isEmpty()) {
					remove(cb.getNodeMapping());
				}				
			});
		} else {
			NodeMapping copy = copyNode(nodeMapping, cb.getConcrete().getName());
			addTrace(cb, copy);
			
			delay(() -> {
				adaptNodeExpressions(nodeMapping, copy, cb);				
				copy.setDomainClass(SiriusUtils.toSiriusClassName(cb.getConcrete()));
				layer.getNodeMappings().add(copy);
				remove(nodeMapping);
				// EcoreUtil.replace(nodeMapping, copy);
			});
		}
		
	}

	private void adaptNodeExpressions(@NonNull NodeMapping original, @NonNull NodeMapping target, @NonNull ClassBinding cb) {
		String preconditions = original.getPreconditionExpression();
		String semanticCandidates = original.getSemanticCandidatesExpression();
		
		EClass nodeClass = getDomainClassAsEClass(original.getDomainClass());
		EClass containerClass = getDomainClassAsEClass(SiriusUtils.getClosestContainerClass(original));
		
		target.setPreconditionExpression(adaptExpression(nodeClass, preconditions, cb.getConcrete()));
		
		target.setSemanticCandidatesExpression(adaptExpression(containerClass, semanticCandidates, cb.getConcrete()));

	}

	@NonNull
	private NodeMapping copyNode(@NonNull NodeMapping nodeMapping, @NonNull String name) {
		NodeMapping m = EcoreUtil.copy(nodeMapping);
		m.setName(name);
		return m;
	}
	
	private void addTrace(@NonNull ClassBinding source, @NonNull DiagramElementMapping target) {
		trace.add(source, target);
	}
	
	@NonNull
	public SiriusBindingModel getBindingModel() {
		return bindingModel;
	}

	@NonNull
	public SiriusModel getSiriusModel() {
		return sirius;
	}
	
	@NonNull
	public EMFMetamodel getConcreteMetamodel() {
		return concrete;
	}
	
	@NonNull
	/* pp */ Trace<ClassBinding, DiagramElementMapping> getTrace() {
		return trace;
	}
	
	private void delay(@NonNull Runnable action) {
		delayedActions.add(action);
	}

	private void remove(@NonNull EObject object) {
		EcoreUtil.delete(object);
	}

	protected String adaptExpression(@NonNull EClass contextClass, @NonNull String expression, @Nullable EClass boundClass) {
		if ( expression == null || expression.trim().isEmpty() )
			return expression;
					
		if ( expression.startsWith("aql:") ) {
			String aql = expression.replaceFirst("aql:", "");
			ATLBasedAQLAdapter adapter = new ATLBasedAQLAdapter(contextClass, expression, boundClass, bindingModel);
			String s = adapter.getResult();
			
			if ( s != null )
				return "aql: " + s;

			throw new UnsupportedOperationException("Check this! why this is happenning?");
//			if ( aql.matches("^self\\.\\w+$") ) {
//				aql = aql.replaceAll("self.", "");
//			}
//			
//			BaseFeatureBinding feature = getFeature(contextClass, aql);
//			if ( feature instanceof RenamingFeatureBinding ) {
//				return "aql:self." + ((RenamingFeatureBinding) feature).getConcreteFeature();
//			} else {
//				throw new UnsupportedOperationException("Don't know yet how to handle adapter expressions: " + aql);
//			}
		} else if ( expression.startsWith("feature:") ) {
			String featureName = expression.replaceFirst("feature:", "");
			// Try to adapt with the expression adapter
			ATLBasedAQLAdapter adapter = new ATLBasedAQLAdapter(contextClass, "self." + SiriusUtils.toAQLIdentifier(featureName), boundClass, bindingModel);			
			String s = adapter.getResult();
			if ( s != null )
				return "aql: " + s;
			
			throw new UnsupportedOperationException("Check this! why this is happenning?");
//			
//			BaseFeatureBinding feature = getFeature(contextClass, featureName);
//			if ( feature == null ) {
//				throw new AdapterError("Feature " + featureName + " not found.");
//			}
//			
//			if ( feature instanceof RenamingFeatureBinding ) {
//				return "feature:" + ((RenamingFeatureBinding) feature).getConcreteFeature();
//			} else {
//				throw new UnsupportedOperationException("Don't know yet how to handle adapter expressions: " + expression);
//			}
		} else if ( expression.startsWith("var:") ) {
			return expression;
		} else {
			throw new UnsupportedOperationException("Can't handle " + expression);			
		}
	}

	@NonNull
	protected EClass getDomainClassAsEClass(String domainClassName) {
		String[] parts = domainClassName.split("::");
		String mm = parts[0].trim();
		String className = parts[1].trim();
		
		EClass c = concept.findEClassInPackageOrNull(mm, className);
		if ( c == null ) {
			throw new AdapterError("Can't find class " + domainClassName);
		}
		
		return c;
	}
}
