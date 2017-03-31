package bento.adapter.atl.visitors;

public class AdaptationError extends RuntimeException {
	private static final long serialVersionUID = 6962772969517759468L;

	public AdaptationError(String msg) {
		super(msg);
	}
}
