package genericity.compiler.atl.analyser.namespaces;

import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;

public class StringNamespace extends PrimitiveTypeNamespace {

	public StringNamespace(PrimitiveGlobalNamespace nspace) {
		super(nspace);
	}

	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		Type t = super.getOperationType(operationName, arguments, node);
		if ( t == null ) {
			if ( operationName.equals("size")     ) return typ.newIntegerType();
			if ( operationName.equals("substring")) return typ.newStringType();
			if ( operationName.equals("firstToLower")) return typ.newStringType();
			if ( operationName.equals("toInteger")) return typ.newIntegerType();
			throw new UnsupportedOperationException(operationName + " - " + node.getLocation());
		}
		return t;
	}

	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		Type t = super.getOperatorType(operatorSymbol, optionalArgument, node);
		if ( t == null ) {
			throw new UnsupportedOperationException(operatorSymbol + " - " + node.getLocation());
		}
		return t;
	}
	
	@Override
	public Type createType(boolean explicitOcurrence) {
		return typ.newStringType();
	}
}
