package bento.repository.actions;

import javax.servlet.ServletOutputStream;

import spark.Request;
import spark.Response;
import spark.utils.IOUtils;

/**
 * Look up a component in the database, returning it...
 * 
 * @author jesus
 */
public class ComponentGET extends AbstractAction {

	@Override
	public Object handle(Request request, Response response) throws Exception {
		String name = request.params("name");
		if ( ! db().existsComponent(name) ) {
			return requestInvalid(response, "Component not exists");
		}
		
		db().retrieveComponent(name, (is) -> {
			response.type("application/binary");
			
			ServletOutputStream os;
			try {
				os = response.raw().getOutputStream();
				org.apache.commons.io.IOUtils.copy(is, os);
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			
			/*
			try {
				byte array[] = IOUtils.toByteArray(is);
				response.body(String.valueOf(array));
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			*/
			return true;
		});
		
		return requestOk(response, null);
	}

}
