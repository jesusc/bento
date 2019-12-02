package bento.sirius.adapter2;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.MappingBasedToolDescription;

import bento.sirius.adapter.EMFMetamodel;
import bento.sirius.adapter.SiriusModel;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel;

/**
 * Checks whether a given binding contains all the necessary information
 * to perform the binding.
 * 
 * @author jesus
 *
 */
public class SiriusBindingValidator {

	@NonNull
	private SiriusBindingModel bindingModel;
	@NonNull 
	private final SiriusModel sirius;
	@NonNull 
	private final EMFMetamodel concrete;

	public SiriusBindingValidator(@NonNull SiriusBindingModel model) {
		this.bindingModel = model;
		
		this.sirius = model.getSirius();
		this.concrete = model.getConcrete();		
	}

	public ValidationReport validate() {
		ValidationReport report = new ValidationReport();
		
		// FIXME: Possibly extend to DiagramElementMapping
		List<NodeMapping> mappings = sirius.allInstancesOf(NodeMapping.class);
		for (NodeMapping mapping : mappings) {
			if (! bindingModel.containsBindingFor(mapping)) {
				report.add(new DefaultValidationError("No binding for mapping: " + mapping.getName()));
			}
		}
		
		List<MappingBasedToolDescription> operations = sirius.allInstancesOf(MappingBasedToolDescription.class);
		for (MappingBasedToolDescription tool : operations) {
			if (!bindingModel.containsToolMapping(tool)) {
				report.add(new DefaultValidationError("No binding for tool mapping: " + tool.getName()));				
			}
			
		}
		
		return report;
	}

	public static class ValidationReport {
		@NonNull
		private List<ValidationError> errors = new ArrayList<>();
		
		public List<? extends ValidationError> getErrors() {
			return errors;
		}

		public void add(@NonNull ValidationError error) {
			errors.add(error);
		}
	}
	
	public static interface ValidationError {
		
	}
	
	private static class DefaultValidationError implements ValidationError {

		@NonNull
		private String desc;

		public DefaultValidationError(@NonNull String desc) {
			this.desc = desc;
		}
	
		@Override
		public String toString() {
			return desc;
		}
		
	}
	
}
