package genericity.compiler.atl.analyser.recovery;

import genericity.compiler.atl.analyser.AnalyserContext;
import genericity.compiler.atl.analyser.ErrorModel;
import genericity.compiler.atl.analyser.namespaces.ClassNamespace;
import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.Binding;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.OCL.OperationCallExp;
import bento.analysis.atl_analysis.atl_error.LocalProblem;

public class RecoverOperationNotFound implements IRecoveryAction {

	private LocatedElement	node;

	public RecoverOperationNotFound(ClassNamespace classNamespace, String operationName, LocatedElement node) {
		this.node = node;
	}

	@Override
	public Type recover(ErrorModel m, LocalProblem p) {
		if ( ! ( node instanceof OperationCallExp ))
			return null;
		
		// TODO: Pass the actual identified error to the error type
		return AnalyserContext.getTypingModel().newTypeErrorType(p);
		
		/*
		OperationCallExp opcall = (OperationCallExp) node;
		
		if ( opcall.container_() instanceof Binding ) {
			
		}
		
		// TODO Auto-generated method stub
		return null;
		*/
	}

}
