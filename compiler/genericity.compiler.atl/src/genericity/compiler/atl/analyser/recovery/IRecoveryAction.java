package genericity.compiler.atl.analyser.recovery;

import bento.analysis.atl_analysis.atl_error.LocalProblem;
import genericity.compiler.atl.analyser.ErrorModel;
import genericity.typing.atl_types.Type;

public interface IRecoveryAction {
	Type recover(ErrorModel m, LocalProblem p);
}
