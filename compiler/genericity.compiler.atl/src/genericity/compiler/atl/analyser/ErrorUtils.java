package genericity.compiler.atl.analyser;

import bento.analysis.atl_analysis.Problem;
import bento.analysis.atl_analysis.atl_error.LocalProblem;

public class ErrorUtils {

	public static String getErrorMessage(Problem p) {
		return p.getClass().getName();
	}
	
	public static String getShortError(LocalProblem p) {
		return p.getClass().getSimpleName().replace("Impl", "") + " - "+ p.getLocation();
	}
	
}
