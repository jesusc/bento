package bento.sirius.adapter.bindingmodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.diagram.description.ConditionalNodeStyleDescription;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;

import anatlyzer.atlext.OCL.OclExpression;
import bento.sirius.adapter.EMFMetamodel;
import bento.sirius.adapter.SiriusModel;
import bento.sirius.adapter.SiriusUtils;
import efinder.aql.AQL2ATL;
import gbind.dsl.BaseFeatureBinding;

/**
 * Represents a binding between one or more example models
 * conforming to a "lifted" format and a concrete meta-model
 * 
 * This model provides additional about the Sirius model. This information
 * can be added manually by the "reuse-developer" or inferred automatically.
 * In particular:
 * 
 * <li>
 * <ul>An explicit correspondence from each tool element to the element mapping that visualizes the element.</ul>
 * </li>
 * 
 * @author jesus
 *
 */
public class SiriusBindingModel {
	
	private final @NonNull SiriusModel sirius;
	private final @NonNull EMFMetamodel concrete;
	private final @NonNull EMFMetamodel concept;

	// This can't be a Map<NodeMapping, ClassBinding> because we have to take into account styles
	// and we would need Map<(NodeMapping, styleIdx), ClassBinding>
	// So, to keep things simple we make a list.	 
	private final @NonNull List<ClassBinding> classBindings = new ArrayList<>();
	private final @NonNull List<NoneBinding> noneBindings = new ArrayList<>();
	private final @NonNull List<AbstractFeatureBinding> featureBindings = new ArrayList<>();
	private @NonNull RootBinding rootBinding;
	
	public SiriusBindingModel(@NonNull SiriusModel sirius, @NonNull EMFMetamodel concept, @NonNull EMFMetamodel concrete) {
		this.sirius = sirius;
		this.concept = concept;
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
	public EMFMetamodel getConcept() {
		return concept;
	}

	@NonNull
	public RootBinding getRootBinding() {
		if (rootBinding == null) throw new IllegalStateException("Binding model not properly initialized");
		return rootBinding;
	}

	
	@NonNull
	public Collection<? extends ClassBinding> getClassBindings() {
		return classBindings;
	}
	

	@NonNull 
	public List<? extends NoneBinding> getNoneBindings() {
		return noneBindings;
	}	
	
	/** Methods for constructing the model */ 

	public void setRootBinding(@NonNull EClass klass, @NonNull DiagramDescription desc) {
		rootBinding = new RootBinding(klass, desc);
	}
	
	public void addClassBinding(@NonNull EClass klass, @NonNull NodeMapping nodeMapping) {
		addClassBinding(klass, nodeMapping, BindingElement.NO_STYLE);
	}

	public void addClassBinding(@NonNull EClass klass, @NonNull NodeMapping nodeMapping, int conditionalStyle) {
		String domainClass = nodeMapping.getDomainClass();
		String packageName = SiriusUtils.getRawPackageName(domainClass);
		String className   = SiriusUtils.getRawClassName(domainClass);
		
		EClass conceptClass = concept.findEClassInPackageOrNull(packageName, className);		
		classBindings.add(new ClassBinding(conceptClass, klass, nodeMapping, conditionalStyle));
	}

	public void addNoneBinding(@NonNull NodeMapping node, int conditionalStyle) {
		noneBindings.add(new NoneBinding(node, conditionalStyle));
	}

	public void addNoneBinding(@NonNull NodeMapping node) {
		noneBindings.add(new NoneBinding(node));		
	}
	
	public void addFeatureBinding(@NonNull EStructuralFeature feature, @NonNull EClass concreteClassContext, @NonNull String oclExpression) {
		AQL2ATL converter = new AQL2ATL();
		converter.addMetamodels(getConcrete().getPackages());		
		OclExpression atl = converter.toExpression(oclExpression);

		featureBindings.add(new OclDerivedFeatureBinding(feature, concreteClassContext, atl));
	}

	
	public static abstract class BindingElement {
		public static final int NO_STYLE = -1;
		
	}
	
	public static class RootBinding extends BindingElement {

		private @NonNull EClass klass;
		private @NonNull DiagramDescription description;

		public RootBinding(@NonNull EClass klass, @NonNull DiagramDescription desc) {
			this.klass = klass;
			this.description = desc;
		}
		
		@NonNull
		public EClass getConcrete() {
			return klass;
		}
		
		@NonNull
		public DiagramDescription getDescription() {
			return description;
		}
		
	}
	
	public static class ClassBinding extends BindingElement {
		
		private final @NonNull EClass concrete;
		private final @NonNull EClass concept;
		private final @NonNull NodeMapping nodeMapping;
		private final ConditionalNodeStyleDescription conditionalStyle;

		public ClassBinding(@NonNull EClass concept, @NonNull EClass concrete, @NonNull NodeMapping nodeMapping) {
			this(concept, concrete, nodeMapping, NO_STYLE);
		}
		
		public ClassBinding(@NonNull EClass concept, @NonNull EClass concrete, @NonNull NodeMapping nodeMapping, int conditionalStyle) {
			this.concept = concept;
			this.concrete = concrete;			
			this.nodeMapping = nodeMapping;
			if (conditionalStyle != NO_STYLE)
				this.conditionalStyle = nodeMapping.getConditionnalStyles().get(conditionalStyle);
			else
				this.conditionalStyle = null;
		}
		@NonNull
		public EClass getConcept() {
			return concept;
		}
		
		@NonNull
		public EClass getConcrete() {
			return concrete;
		}
		
		@NonNull
		public NodeMapping getNodeMapping() {
			return nodeMapping;
		}
		
		@Nullable
		public ConditionalNodeStyleDescription getConditionalStyle() {
			return conditionalStyle;
		}

		public boolean hasConditionalStyle() {
			return conditionalStyle != null;
		}
		
	}

	public static class NoneBinding extends BindingElement {

		private final @NonNull NodeMapping nodeMapping;
		private final ConditionalNodeStyleDescription conditionalStyle;

		public NoneBinding(@NonNull NodeMapping nodeMapping) {
			this(nodeMapping, NO_STYLE);
		}
		
		public NoneBinding(@NonNull NodeMapping nodeMapping, int conditionalStyle) {
			this.nodeMapping = nodeMapping;
			if (conditionalStyle != NO_STYLE)
				this.conditionalStyle = nodeMapping.getConditionnalStyles().get(conditionalStyle);
			else
				this.conditionalStyle = null;
		}
		
		@NonNull
		public NodeMapping getNodeMapping() {
			return nodeMapping;
		}
		
		
		@NonNull
		public ConditionalNodeStyleDescription getConditionalStyle() {
			return conditionalStyle;
		}

		@NonNull
		public EObject getRemovedElement() {
			if (conditionalStyle == null)
				return nodeMapping;
			return getConditionalStyle();
		}
	}

	public static abstract class AbstractFeatureBinding extends BindingElement {

		private final @NonNull EStructuralFeature conceptFeature;
		private final @NonNull EClass concreteClassContext;

		public AbstractFeatureBinding(@NonNull EStructuralFeature conceptFeature, @NonNull EClass concreteClassContext) {
			this.conceptFeature = conceptFeature;
			this.concreteClassContext = concreteClassContext;
		}
		
		@NonNull
		public EStructuralFeature getConceptFeature() {
			return conceptFeature;
		}

		@NonNull
		public EClass getConcreteClassContext() {
			return concreteClassContext;
		}

	}
	
	public static class RenameFeatureBinding extends AbstractFeatureBinding {

		private @NonNull EStructuralFeature concreteFeature;

		public RenameFeatureBinding(@NonNull EStructuralFeature conceptFeature, @NonNull EClass concreteClassContext, @NonNull EStructuralFeature concreteFeature) {
			super(conceptFeature, concreteClassContext);
			this.concreteFeature = concreteFeature;
		}
		
		@NonNull
		public EStructuralFeature getConcreteFeature() {
			return concreteFeature;
		}
		
	}
	
	public static class OclDerivedFeatureBinding extends AbstractFeatureBinding {
		
		private final @NonNull OclExpression oclExpression;

		public OclDerivedFeatureBinding(@NonNull EStructuralFeature feature, @NonNull EClass concreteClassContext, @NonNull OclExpression oclExpression) {
			super(feature, concreteClassContext);
			this.oclExpression = oclExpression;
		}
		
		@NonNull
		public OclExpression getOclExpression() {
			return oclExpression;
		}
		
	}
	
	
	/*** Tool section ***/ 

	public static class ToolBinding extends BindingElement {
		private final @NonNull ToolEntry tool;
		private final ConditionalNodeStyleDescription conditionalStyle;
		private final @NonNull DiagramElementMapping mapping;

		public ToolBinding(@NonNull ToolEntry tool, @NonNull DiagramElementMapping mapping) {
			this(tool, mapping, null);
		}
		
		public ToolBinding(@NonNull ToolEntry tool, @NonNull DiagramElementMapping mapping, @Nullable ConditionalNodeStyleDescription conditionalStyle) {
			this.tool = tool;
			this.mapping = mapping;
			this.conditionalStyle = conditionalStyle;
		}
	}

	public static class NoneToolBinding extends BindingElement {
		private final @NonNull ToolEntry tool;

		public NoneToolBinding(@NonNull ToolEntry tool) {
			this.tool = tool;
		}

		@NonNull
		public ToolEntry getTool() {
			return tool;
		}
	}
	
	@NonNull 
	private List<ToolBinding> toolBindings = new ArrayList<>();
	@NonNull 
	private List<NoneToolBinding> noneToolBindings = new ArrayList<>();
	
	public void addToolBinding(@NonNull ToolEntry tool, @NonNull DiagramElementMapping mapping) {
		this.toolBindings.add(new ToolBinding(tool, mapping));
	}
	
	public void addToolBinding(@NonNull ToolEntry tool, @NonNull NodeMapping mapping, @Nullable int conditionalStyleIndex) {
		if (conditionalStyleIndex < 0) throw new IllegalArgumentException();
		
		ConditionalNodeStyleDescription style = mapping.getConditionnalStyles().get(conditionalStyleIndex);		
		this.toolBindings.add(new ToolBinding(tool, mapping, style));
	}
	
	public void addNoneToolBinding(@NonNull ToolEntry tool) {
		this.noneToolBindings.add(new NoneToolBinding(tool));
	}
	
	@NonNull 
	public ToolBinding getToolBinding(@NonNull ToolEntry tool) {
		for (ToolBinding toolBinding : this.toolBindings) {
			if (toolBinding.tool == tool)
				return toolBinding;
		}
		throw new IllegalArgumentException("No tool binding for " + tool);
	}
	
	@NonNull 
	public boolean containsToolMapping(@NonNull ToolEntry tool) {
		for (ToolBinding toolBinding : this.toolBindings) {
			if (toolBinding.tool == tool)
				return true;
		}
		return false;
	}

	public boolean containsBindingFor(@NonNull NodeMapping nodeMapping) {
		for (ClassBinding cb : classBindings) {
			if (cb.nodeMapping == nodeMapping)
				return true;
		}
		return false;
	}

	@NonNull
	public ClassBinding getClassBinding(@NonNull EClass conceptClass) {
		for (ClassBinding cb : classBindings) {
			if (cb.getConcept() == conceptClass) {
				return cb;
			}			
		}
		throw new IllegalArgumentException("No binding for " + conceptClass);
	}

	
	/**
	 * Returns the class binding that is associated to the mapping that the
	 * given tool entry will render.
	 */
	@NonNull
	public ClassBinding getClassBinding(@NonNull ToolEntry entry) {
		@NonNull ToolBinding tb = getToolBinding(entry);
		for (ClassBinding cb : getClassBindings()) {
			if (cb.nodeMapping == tb.mapping && cb.conditionalStyle == tb.conditionalStyle)
				return cb;
		}		
		throw new IllegalArgumentException("No class binding for entry: " + entry);
	}

	/**
	 * This is used to map the type names of CreateInstance and alike.
	 * 
	 * Given a type name for which an instance is going to be created, we make sure that
	 * take into account only those node mappings that are related to the Sirius tool that
	 * is doing the instantiation.
	 * @return 
	 */
	@NonNull
	public EClass getConcreteClass(@NonNull String typeName, @NonNull ToolBinding toolBinding) {
		ClassBinding cb = getClassBinding(toolBinding.tool);
		String original = SiriusUtils.getRawClassName(cb.getNodeMapping().getDomainClass());
		if (!original.equals(typeName)) 
			throw new UnsupportedOperationException("Can't handle different types in tool bindings: " + typeName + " - " + original);
		
		return cb.getConcrete();		
	}
	
	@Nullable
	public AbstractFeatureBinding getFeatureBinding(@NonNull EStructuralFeature f, @NonNull EClass concreteClassContext) {
		for (AbstractFeatureBinding fb : featureBindings) {
			if (fb.conceptFeature == f && fb.concreteClassContext == concreteClassContext) {
				return fb;
			}
		}
		
		return null;
	}
	
	@NonNull 
	public List<? extends NoneToolBinding> getNoneToolBindings() {
		return noneToolBindings;
	}

}
