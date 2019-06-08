package bento.sirius.tests.model;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.tools.ToolProvider;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.diagram.description.DescriptionPackage;
import org.eclipse.sirius.diagram.description.tool.ContainerCreationDescription;
import org.eclipse.sirius.diagram.description.tool.EdgeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.NodeCreationDescription;
import org.eclipse.sirius.diagram.description.tool.ToolSection;
import org.eclipse.sirius.viewpoint.ToolInstance;
import org.eclipse.sirius.viewpoint.ToolSectionInstance;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.eclipse.sirius.viewpoint.description.tool.ToolPackage;
import bento.sirius.adapter.SiriusModel;
import bento.sirius.adapter.SiriusUtils;
import bento.sirius.tests.model.PaletteItem.ItemKind;

public class SiriusSpecificationModel {
	private List<AllowCreate> create = new ArrayList<>();
	private List<PaletteSpec> palettes = new ArrayList<>();
	
	public List<? extends AllowCreate> getCreate() {
		return create;
	}

	public void setCreate(List<AllowCreate> create) {
		this.create = create;
	}
	
	public void setPalettes(List<PaletteSpec> palette) {
		this.palettes = palette;
	}
	
	public List<PaletteSpec> getPalettes() {
		return palettes;
	}
	
	// TODO: find | grep Query.java$ to check for useful classes
	public void assertExpectations(Resource r) {
		SiriusModel helper = new SiriusModel(r);
		
		checkCreateExpectations(helper);
		checkPaletteExceptions(helper);
	}


	private void checkPaletteExceptions(SiriusModel helper) {
		if (palettes.isEmpty())
			return;
		
		if (palettes.size() != 1) 
			throw new UnsupportedOperationException("Only one palette supported at the moment");
		
		PaletteSpec spec = palettes.get(0);
		List<ToolEntry> entries = new ArrayList<>();
				
		// TODO: Possibly try to match the palettes when we allow many and 
		// then check the item matches with the spec
		List<ToolSection> tools = helper.allInstancesOf(ToolSection.class);
		for (ToolSection toolSection : tools) {
			for (ToolEntry entry : toolSection.getOwnedTools()) {
				entries.add(entry);				
			}
		}
		
		Set<PaletteItem> nonMatchedItems = new HashSet<>(spec.getItems());
		Set<ToolEntry> nonMatchedTools = new HashSet<>(entries);
		
		TOOLS:
		for (ToolEntry entry : entries) {
			for(PaletteItem item : spec.getItems()) {
				if (matches(entry, item)) {
					nonMatchedItems.remove(item);
					nonMatchedTools.remove(entry);
					continue TOOLS;
				}
			}
		}

		if (spec.isStrict()) {			
			boolean ok = nonMatchedItems.isEmpty() && nonMatchedTools.isEmpty();
			if (! ok) {
				System.out.println(nonMatchedItems);
				System.out.println(nonMatchedTools);
			}
			assertTrue(ok);
		} else {
			assertTrue(nonMatchedItems.isEmpty());
		}
		
	}

	private boolean matches(ToolEntry entry, PaletteItem item) {
		if (entry instanceof NodeCreationDescription) {
			NodeCreationDescription n = (NodeCreationDescription) entry;
			return item.getKind() == ItemKind.NODE &&
					item.getName().equals(n.getLabel());
		} else if (entry instanceof ContainerCreationDescription) {
			ContainerCreationDescription c = (ContainerCreationDescription) entry;
			return item.getKind() == ItemKind.CONTAINER &&
					item.getName().equals(c.getLabel());
		} else if (entry instanceof EdgeCreationDescription) {
			EdgeCreationDescription e = (EdgeCreationDescription) entry;
			return item.getKind() == ItemKind.EDGE &&
					item.getName().equals(e.getLabel());
		}
		return false;
	}

	private void checkCreateExpectations(SiriusModel helper) {
		List<CreateInstance> instances = helper.allInstancesOf(CreateInstance.class);
		
		for (AllowCreate allowCreate : create) {
			boolean found = false;
			for(CreateInstance i : instances) {
				String className = allowCreate.getClassName();
				String siriusName = SiriusUtils.getRawClassName(i.getTypeName());
				
				if (className.contentEquals(siriusName)) {
					found = true;
					break;
				}
			}
			
			assertTrue("No createInstance for " + allowCreate.getClassName(), found);
		}
	}
	
	
}
