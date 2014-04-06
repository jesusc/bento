package bento.analysis.atl_analysis;

public class ErrorMessages {

	public static String getMessage(Problem p) {
		return p.getClass().getSimpleName();
	}
	
}
