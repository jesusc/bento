package genericity.compiler.atl.analyser.namespaces;

import bento.analysis.atl_analysis.atl_error.LocalProblem;
import genericity.compiler.atl.analyser.AnalyserContext;
import genericity.compiler.atl.analyser.ErrorModel;
import genericity.compiler.atl.analyser.recovery.IRecoveryAction;
import genericity.typing.atl_types.FloatType;
import genericity.typing.atl_types.IntegerType;
import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;

public class IntegerNamespace extends PrimitiveTypeNamespace {

	public IntegerNamespace() {
	}

	protected IntegerType getType() {
		return (IntegerType) createType(false);
	}
	
	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		Type t = super.getOperationType(operationName, arguments, node);
		if ( t == null ) {
			return AnalyserContext.getErrorModel().signalNoOperationFound(getType(), operationName, node, null);
		}
		return t;
	}

	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		Type t = super.getOperatorType(operatorSymbol, optionalArgument, node);
		if ( t != null )
			return t;
			
		if ( operatorSymbol.equals("+") || operatorSymbol.equals("*") || operatorSymbol.equals("/") ||
			(operatorSymbol.equals("-") && optionalArgument != null)) {
			
			if ( optionalArgument instanceof FloatType || 
				 ( optionalArgument instanceof IntegerType && (operatorSymbol.equals("/") || operatorSymbol.equals("*") )) ) {
				return AnalyserContext.getTypingModel().newFloatType();
			} else if ( optionalArgument instanceof IntegerType ) {
				return AnalyserContext.getTypingModel().newIntegerType();
			} else {
				return AnalyserContext.getErrorModel().signalInvalidOperand(operatorSymbol, node, new IRecoveryAction() {
					@Override
					public Type recover(ErrorModel m, LocalProblem p) {
						Type t = AnalyserContext.getTypingModel().newIntegerType();
						p.setRecovery( m.recoveryTentativeTypeAssigned(t) );
						return t;
					}
				});				
			}
			
			
			// || operatorSymbol.equals("*") || operatorSymbol.equals("/")) {
		} else if ( operatorSymbol.equals("-") ) {
			return createType(false); // This is separated because there are two cases: "a-b", "-a"
		}

		
		throw new UnsupportedOperationException(operatorSymbol + " - " + node.getLocation());
	}
	
	@Override
	public Type createType(boolean explicitOcurrence) {
		return AnalyserContext.getTypingModel().newIntegerType();
	}
}
