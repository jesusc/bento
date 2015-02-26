package bento.repository.actions;

import java.io.FileOutputStream;
import java.io.InputStream;

import javax.servlet.MultipartConfigElement;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

import spark.Request;
import spark.Response;

public class ComponentPUT extends AbstractAction {

	@Override
	public Object handle(Request request, Response response) throws Exception {
				
		String name = request.params("name");
		if ( db().existsComponent(name) ) {
			return requestInvalid(response, "Component already exists");
		}
		
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement("/tmp");
		request.raw().setAttribute("org.eclipse.multipartConfig", multipartConfigElement);
		
		Part p = request.raw().getPart("zipped");
		if ( p == null ) {
			return requestInvalid(response, "Expected multipart 'zipped' attribute");
		}
		
		Part mp = request.raw().getPart("metadata");

		String json = IOUtils.toString(mp.getInputStream());
		System.out.println(json);

		boolean ok = db().installComponent(name, json, (f) -> {
			try {
				InputStream is = p.getInputStream();
				FileOutputStream os = new FileOutputStream(f);
				org.apache.commons.io.IOUtils.copy(is, os);
			} catch (Exception e) {
				return false;
			}
			
			return true;
		});
		
		
		p.delete();
		
		if ( ok )
			return requestOk(response, "Component installed");
		else 
			return requestInvalid(response, "Cannot install component");
	}

}
