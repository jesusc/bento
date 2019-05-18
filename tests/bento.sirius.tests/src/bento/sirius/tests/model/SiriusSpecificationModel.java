package bento.sirius.tests.model;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import javax.tools.ToolProvider;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.diagram.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.tool.CreateInstance;
import org.eclipse.sirius.viewpoint.description.tool.ToolPackage;
import bento.sirius.adapter.SiriusModel;
import bento.sirius.adapter.SiriusUtils;

public class SiriusSpecificationModel {
	private List<AllowCreate> create = new ArrayList<AllowCreate>();
	
	public List<? extends AllowCreate> getCreate() {
		return create;
	}

	public void setCreate(List<AllowCreate> create) {
		this.create = create;
	}
	
	// TODO: find | grep Query.java$ to check for useful classes
	public void assertExpectations(Resource r) {
		SiriusModel helper = new SiriusModel(r);
		
		checkCreateExpectations(helper);
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
