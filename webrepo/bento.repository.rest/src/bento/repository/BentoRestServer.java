package bento.repository;

import static spark.Spark.*;
import bento.repository.actions.ComponentALL;
import bento.repository.actions.ComponentGET;
import bento.repository.actions.ComponentPUT;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 * Describes a REST server for the repository, with the following API.
 * 
 * <pre>
 * 		PUT /component/:name 
 *         requires uploading a zip file
 * 		GET /component/:name
 *         return the component as a zip file
 * 		GET /component/all 
 *      GET /component/all&tag=tag1...
 *      GET /component/all&name=someName
 * </pre>
 * 
 * 
 * @author jesus
 *
 */
public class BentoRestServer {

        public static void main(String[] args) {
        	if ( args.length < 1 ) {
        		System.out.println("./server database_folder");
        		return;
        	}
        	
        	Database.configure(args[0]);
        	        	
            //put("/component", (req, res) -> "Hello World");
        	put("/component/:name", new ComponentPUT());
         
        	get("/component/all", new ComponentALL(), new JsonTransformer());
        	get("/component/:name", new ComponentGET());
        	
        }
  
}
