package bento.sirius.adapter.bindingmodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.diagram.description.NodeMapping;

import bento.sirius.adapter.EMFMetamodel;
import bento.sirius.adapter.SiriusModel;

/**
 * Represents a binding between one or more example models
 * conforming to a "lifted" format and a concrete meta-model
 * 
 * @author jesus
 *
 */
public class SiriusBindingModel {
	
	private final @NonNull SiriusModel sirius;
	private final @NonNull EMFMetamodel concrete;

	// This can't be a Map<NodeMapping, ClassBinding> because we have to take into account styles
	// and we would need Map<(NodeMapping, styleIdx), ClassBinding>
	// So, to keep things simple we make a list.	 
	private final @NonNull List<ClassBinding> classBindings = new ArrayList<>();
	private final @NonNull List<NoneBinding> noneBindings = new ArrayList<>();
	
	public SiriusBindingModel(@NonNull SiriusModel sirius, @NonNull EMFMetamodel concrete) {
		this.sirius = sirius;
		this.concrete = concrete;
	}

	@NonNull
	public SiriusModel getSirius() {
		return sirius;
	}
	
	@NonNull
	public EMFMetamodel getConcrete() {
		return concrete;
	}

	@NonNull
	public Collection<? extends ClassBinding> getClassBindings() {
		return classBindings;
	}
	
	/** Methods for constructing the model */ 
	
	public void addClassBinding(@NonNull EClass klass, @NonNull NodeMapping nodeMapping) {
		classBindings.add(new ClassBinding(klass, nodeMapping));
	}

	public void addClassBinding(@NonNull EClass klass, @NonNull NodeMapping nodeMapping, int conditionalStyle) {
		classBindings.add(new ClassBinding(klass, nodeMapping, conditionalStyle));
	}

	public void addNoneBinding(@NonNull NodeMapping node, int conditionalStyle) {
		noneBindings.add(new NoneBinding(node, conditionalStyle));
	}

	public void addNoneBinding(@NonNull NodeMapping node) {
		noneBindings.add(new NoneBinding(node));		
	}
	
	public static abstract class BindingElement {
		
	}
	
	public static class ClassBinding extends BindingElement {
		private static final int NO_STYLE = -1;
		
		private final @NonNull EClass concrete;
		private final @NonNull NodeMapping nodeMapping;
		private final int conditionalStyle;

		public ClassBinding(@NonNull EClass klass, @NonNull NodeMapping nodeMapping) {
			this(klass, nodeMapping, NO_STYLE);
		}
		
		public ClassBinding(@NonNull EClass concrete, @NonNull NodeMapping nodeMapping, int conditionalStyle) {
			this.concrete = concrete;
			this.nodeMapping = nodeMapping;
			this.conditionalStyle = conditionalStyle;
		}
		
		@NonNull
		public EClass getConcrete() {
			return concrete;
		}
		
		@NonNull
		public NodeMapping getNodeMapping() {
			return nodeMapping;
		}
		
		public int getConditionalStyle() {
			return conditionalStyle;
		}

		public boolean hasConditionalStyle() {
			return conditionalStyle != NO_STYLE;
		}
		
	}

	public static class NoneBinding extends BindingElement {
		private static final int NO_STYLE = -1;

		private final @NonNull NodeMapping nodeMapping;
		private final int conditionalStyle;

		public NoneBinding(@NonNull NodeMapping nodeMapping) {
			this(nodeMapping, NO_STYLE);
		}
		
		public NoneBinding(@NonNull NodeMapping nodeMapping, int conditionalStyle) {
			this.nodeMapping = nodeMapping;
			this.conditionalStyle = conditionalStyle;
		}
		
	}

	public boolean containsBindingFor(@NonNull NodeMapping nodeMapping) {
		for (ClassBinding cb : classBindings) {
			if (cb.nodeMapping == nodeMapping)
				return true;
		}
		return false;
	}

}
