package bento.repository.actions;

import java.util.List;

import bento.repository.ComponentMetadata;
import spark.Request;
import spark.Response;

public class ComponentALL extends AbstractAction {

	@Override
	public Object handle(Request request, Response response) throws Exception {
		String name = request.queryParams("name");
		String tag  = request.queryParams("tag");
		
		if ( name != null || tag != null ) {
			String[] names = name != null ? name.split(",") : null;
			String[] tags  = tag  != null ? tag.split(",") : null;
			
			List<ComponentMetadata> components = db().findComponents(names, tags);
			return components;						
		} else {
			List<ComponentMetadata> components = db().allComponents();
			return components;			
		}
	}

}
