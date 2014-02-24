package genericity.compiler.atl.analyser.namespaces;

import genericity.compiler.atl.analyser.AnalyserContext;
import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;

public class BooleanNamespace extends PrimitiveTypeNamespace {

	public BooleanNamespace(PrimitiveGlobalNamespace nspace) {
		super(nspace);
	}

	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		Type t = super.getOperationType(operationName, arguments, node);
		if ( t == null ) {
	
			throw new UnsupportedOperationException(operationName + " - " + node.getLocation());
		}
		return t;
	}

	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		Type t = super.getOperatorType(operatorSymbol, optionalArgument, node);
		if ( t == null ) {
			if ( operatorSymbol.equals("not") || operatorSymbol.equals("and") || operatorSymbol.equals("or") )
				return AnalyserContext.getTypingModel().newBooleanType();
		}
		throw new UnsupportedOperationException(operatorSymbol);
	}

	@Override
	public Type createType(boolean explicitOcurrence) {
		return AnalyserContext.getTypingModel().newBooleanType();
	}
}
