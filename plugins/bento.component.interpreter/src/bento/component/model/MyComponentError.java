package bento.component.model;

public class MyComponentError extends Exception {
	private static final long serialVersionUID = 3744363546868831720L;

	public MyComponentError(String msg, Throwable cause) {
		super(msg, cause);
	}

	public MyComponentError(String msg) {
		super(msg);
	}

}

