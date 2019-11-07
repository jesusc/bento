package bento.sirius.adapter2;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.description.NodeMapping;

import bento.sirius.adapter.EMFMetamodel;
import bento.sirius.adapter.SiriusModel;
import bento.sirius.adapter.Trace;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel;
import bento.sirius.adapter.bindingmodel.SiriusInformationModel;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel.ClassBinding;

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
	private final SiriusInformationModel infoModel;

	@NonNull 
	private final SiriusModel sirius;
	@NonNull 
	private final EMFMetamodel concrete;

	@NonNull 
	private final Trace<DiagramElementMapping, DiagramElementMapping> trace = new Trace<>();
	
	public SiriusAdapter2(@NonNull SiriusBindingModel model, @NonNull SiriusInformationModel info) {
		this.bindingModel = model;
		this.infoModel = info;
		
		this.sirius = model.getSirius();
		this.concrete = model.getConcrete();		
	}
	
	public void execute() {
		Collection<? extends ClassBinding> classBindings = bindingModel.getClassBindings();
		for (ClassBinding cb : classBindings) {	
			rewriteNodeMapping(cb);
		}
		
		new SiriusToolAdapter2(this).perform();
	}

	private void rewriteNodeMapping(@NonNull ClassBinding cb) {
		NodeMapping nodeMapping = cb.getNodeMapping();
		Layer layer = (Layer) nodeMapping.eContainer();
		
		if (cb.hasConditionalStyle()) {
			ConditionalNodeStyleDescription condStyle = nodeMapping.getConditionnalStyles().get(cb.getConditionalStyle());

			NodeMapping copy = copyNode(nodeMapping, cb.getConcrete().getName());
			copy.getConditionnalStyles().clear();
			copy.setStyle(condStyle.getStyle());

			addTrace(nodeMapping, copy);
			nodeMapping = copy;
			
			layer.getNodeMappings().add(nodeMapping);
		} else {
			addTrace(nodeMapping, nodeMapping);
		}
		
		nodeMapping.setDomainClass(toSiriusClassName(cb.getConcrete()));
	}

	@NonNull
	private NodeMapping copyNode(@NonNull NodeMapping nodeMapping, @NonNull String name) {
		NodeMapping m = EcoreUtil.copy(nodeMapping);
		m.setName(name);
		return m;
	}

	@NonNull
	protected String toSiriusClassName(@NonNull EClass klass) {
		return klass.getEPackage().getName() + "::" + klass.getName();
	}
	
	private void addTrace(@NonNull DiagramElementMapping source, @NonNull DiagramElementMapping target) {
		trace.add(source, target);
	}
	
	@NonNull
	public SiriusInformationModel getInformationModel() {
		return infoModel;
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
	/* pp */ Trace<DiagramElementMapping, DiagramElementMapping> getTrace() {
		return trace;
	}
}
