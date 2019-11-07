package bento.sirius.adapter.bindingmodel;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;

/**
 * This provides additional about the Sirius model. This information
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
public class SiriusInformationModel {

	@NonNull 
	private Map<ToolEntry, DiagramElementMapping> mappings = new HashMap<>();
	
	public void addToolMapping(@NonNull ToolEntry tool, @NonNull DiagramElementMapping mapping) {
		this.mappings.put(tool, mapping);
	}
	
	@NonNull 
	public DiagramElementMapping getToolMapping(@NonNull ToolEntry tool) {
		DiagramElementMapping m = this.mappings.get(tool);
		if (m == null)
			throw new IllegalArgumentException();
		return m;
	}
	
	@NonNull 
	public boolean containsToolMapping(@NonNull ToolEntry tool) {
		return this.mappings.containsKey(tool);
	}
	
}
