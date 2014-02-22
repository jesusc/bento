package genericity.compiler.atl.analyser.namespaces;

import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;

public class FloatNamespace extends PrimitiveTypeNamespace {

	public FloatNamespace(PrimitiveGlobalNamespace nspace) {
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
			throw new UnsupportedOperationException(operatorSymbol + ". " + node.getLocation());
		}
		return t;
	}
	
	@Override
	public Type createType(boolean explicitOcurrence) {
		return typ.newFloatType();
	}
}
