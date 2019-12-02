package bento.sirius.adapter2;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.viewpoint.description.tool.ChangeContext;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.InitialNodeCreationOperation;
import org.eclipse.sirius.viewpoint.description.tool.MappingBasedToolDescription;
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation;

import bento.sirius.adapter.SiriusModel;
import bento.sirius.adapter.SiriusPaletteAdapter.Context;
import bento.sirius.adapter.SiriusUtils;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel.ClassBinding;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel.ToolBinding;

/**
 * Adapts the tool section of a Sirius diagram.
 * 
 * @author jesus
 *
 */
public class SiriusToolAdapter2 {

	@NonNull
	private final SiriusAdapter2 root;
	@NonNull
	private SiriusBindingModel bindingModel;
	@NonNull
	private SiriusModel siriusModel;

	public SiriusToolAdapter2(@NonNull SiriusAdapter2 root) {
		this.root = root;
		this.siriusModel = root.getSiriusModel();
		this.bindingModel = root.getBindingModel();
	}
	
	public void perform() {
		List<? extends NodeCreationDescription> nodeTools = siriusModel.allInstancesOf(NodeCreationDescription.class);
		nodeTools.forEach(this::applyTo);

//		List<? extends ContainerCreationDescription> containerTools = siriusModel.allInstancesOf(ContainerCreationDescription.class);
//		containerTools.forEach(desc -> new SiriusPaletteAdapter(bindingSpec, info, result, this).applyTo(desc));
//
//		List<? extends EdgeCreationDescription> edgeTools = siriusModel.allInstancesOf(EdgeCreationDescription.class);
//		edgeTools.forEach(desc -> new SiriusPaletteAdapter(bindingSpec, info, result, this).applyTo(desc));
	}
	
	private void applyTo(@NonNull NodeCreationDescription desc) {
		InitialNodeCreationOperation operation = desc.getInitialOperation();
		if (!bindingModel.containsToolMapping(desc))
			return;
		
		for (NodeMapping nodeMapping : desc.getNodeMappings()) {
			// With this we allow the user to get a result even if the binding model is not complete
			if (!bindingModel.containsBindingFor(nodeMapping)) {
				return;
			}
			
		}
		
		ClassBinding cb = bindingModel.getClassBinding(desc);
		
		// We really don't care about what was the original contents of the nodeMappings, but
		// we assume the binding model is correct
		desc.getNodeMappings().clear();
		desc.getNodeMappings().add((NodeMapping) root.getTrace().getSingleTarget(cb));
		
		List<CreateInstance> instances = SiriusUtils.findChildren(operation, (o) -> o instanceof CreateInstance);
		if ( instances.size() == 0 ) {
			// ok, we do nothing but this is probably wrong
		} else if ( instances.size() == 1 ) {
			// CreateInstance instance = instances.get(0);
			Context ctx = new Context();
			ctx.setToolElement(desc);
			dispatch(operation.getFirstModelOperations(), ctx);
		} else {
			throw new UnsupportedOperationException("No support for this yet");
		}
	}
	
	private void dispatch(ModelOperation op, Context context) {
		if (op instanceof ChangeContext) {
			handleChangeContext((ChangeContext) op, context);
		} else if (op instanceof CreateInstance) {
			handleCreateInstance((CreateInstance) op, context);			
		}
	}

	private void handleCreateInstance(CreateInstance instance_, Context context) {
		MappingBasedToolDescription tool = context.getToolElement();
		if (!bindingModel.containsToolMapping(tool))
			return;
		
		
		ToolBinding toolBinding = bindingModel.getToolBinding(tool);
		String typeName = SiriusUtils.getRawClassName(instance_.getTypeName());
		
		EClass c = bindingModel.getConcreteClass(typeName, toolBinding);
		
		instance_.setTypeName(SiriusUtils.toSiriusClassName(c));
		
		// TODO: Process the setters in an intelligent way
	}
	
	private void handleChangeContext(ChangeContext op, Context context) {
		String contextType;
		String newContext = op.getBrowseExpression();
		if (newContext.equals("var:container")) {
			// Generalize this adding this variable to the context above
			contextType = SiriusUtils.getRawClassName(SiriusUtils.getClosestContainerClass(op));
		} else if (newContext.startsWith("var:") ) {
			String varname = newContext.replace("var:", "");
			contextType = context.getVariableType(varname).getName();
		} else if (newContext.startsWith("aql:")) {
			String expr = newContext.replace("aql:", "");
			// This requires a compiler... we can map to ATL as we do for adapters or we can use the default Sirius checker?
			// Meanwhile:
			Pattern pat = Pattern.compile("(.+)\\.eContainer\\(\\)");
			Matcher matcher = pat.matcher(expr);			
			if ( matcher.matches() ) {
				throw new UnsupportedOperationException("TODO: Implement as in SiriusPalleteAdapter");
//				String featureName = matcher.group(1);
//				EClass eclass = context.getVariableType(featureName);
//				// AnATLyzer is able to do this analysis... but let's do it in poor's man way
//				
//				contextType = null;
//				
//				CHECK_ALL:
//				for(EClass c : siriusModel.getMetamodel().getAllClasses()) {
//					for (EReference eReference : c.getEAllReferences()) {
//						if (eReference.isContainment() && 
//								AdapterTypeUtils.isAssignable(eReference.getEReferenceType(), eclass) ) {
//							// This is suboptimal because we don't check further...
//							contextType = eReference.getEContainingClass().getName();
//							break CHECK_ALL;
//						}
//					}
//				}	
//
//				if (contextType == null)
//					throw new IllegalStateException("No container found for: " + newContext);

				// contextType = container;
			} else {
				throw new UnsupportedOperationException("Browse operation not supported: " + newContext);
			}
		} else {
			throw new UnsupportedOperationException("Browse operation not supported: " + newContext);
		}
		
		context.setContextType(contextType);
		
		for (ModelOperation modelOperation : op.getSubModelOperations()) {
			dispatch(modelOperation, context);
		}		
	}
	
}
