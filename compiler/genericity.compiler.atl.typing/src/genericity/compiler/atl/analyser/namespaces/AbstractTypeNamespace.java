package genericity.compiler.atl.analyser.namespaces;

import atl.metamodel.ATL.LocatedElement;
import genericity.compiler.atl.analyser.AnalyserContext;
import genericity.compiler.atl.analyser.TypingModel;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;

public abstract class AbstractTypeNamespace implements ITypeNamespace {

	@Override
	public boolean hasOperation(String operationName, Type[] arguments) {
		return operationName.equals("oclIsUndefined") || operationName.equals("toString") ||
				operationName.equals("oclIsKindOf") || operationName.equals("oclIsTypeOf");
	}
	
	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		if ( operationName.equals("oclIsUndefined") ) {
			return AnalyserContext.getTypingModel().newBooleanType();
		} else if ( operationName.equals("toString") ) {
			return AnalyserContext.getTypingModel().newStringType();
		} else if ( operationName.equals("oclIsKindOf") || operationName.equals("oclIsTypeOf")) {
			if ( ! (arguments[0] instanceof Metaclass) ) {
				return AnalyserContext.getErrorModel().signalInvalidArgument(operationName, node);
			}
			// TODO: Mark the boolean type so that it carries the "isKindOf" information
			return AnalyserContext.getTypingModel().newBooleanType((Metaclass) arguments[0]);
		} else if ( operationName.equals("debug") ) {
			return this.getType();
		}
		return null;
	}

	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		if ( operatorSymbol.equals("=") ||
			 operatorSymbol.equals("<>") ||
 			 operatorSymbol.equals(">") ||
			 operatorSymbol.equals(">=") ||
			 operatorSymbol.equals("<=") ||
			 operatorSymbol.equals("<") ) {

			return AnalyserContext.getTypingModel().newBooleanType();
		}
		return null;
	}

	private Type getType() {
		// This should be change for a "type" reference in the hierarchy, instead of
		// creating a type each type, then createType() replace for cloneType in case this is actually needed
		return createType(false);
	}
}