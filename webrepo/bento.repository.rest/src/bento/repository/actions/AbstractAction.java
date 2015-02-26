package bento.repository.actions;

import bento.repository.Database;
import spark.Response;
import spark.Route;

public abstract class AbstractAction implements Route {
	public final Database db() {
		return Database.INSTANCE;
	}
	
	protected Object requestInvalid(Response response, String string) {
		response.status(400);
		return string;
	}
	
	protected Object requestOk(Response response, String string) {
		response.status(200);
		return string;
	}
}
