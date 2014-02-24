package genericity.compiler.atl.analyser.namespaces;

import atl.metamodel.ATL.LocatedElement;
import genericity.compiler.atl.analyser.AnalyserContext;
import genericity.compiler.atl.analyser.TypingModel;
import genericity.typing.atl_types.Type;

public abstract class AbstractTypeNamespace implements ITypeNamespace {

	@Override
	public boolean hasOperation(String operationName, Type[] arguments) {
		return operationName.equals("oclIsUndefined") || operationName.equals("toString");
	}
	
	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		if ( operationName.equals("oclIsUndefined") ) {
			return AnalyserContext.getTypingModel().newBooleanType();
		} else if ( operationName.equals("toString") ) {
			return AnalyserContext.getTypingModel().newStringType();
		}

		return null;
	}
	
	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		if ( operatorSymbol.equals("=") ||
			 operatorSymbol.equals(">") ||
			 operatorSymbol.equals(">=") ||
			 operatorSymbol.equals("<=") ||
			 operatorSymbol.equals("<") ) {

			return AnalyserContext.getTypingModel().newBooleanType();
		}
		return null;
	}

}
