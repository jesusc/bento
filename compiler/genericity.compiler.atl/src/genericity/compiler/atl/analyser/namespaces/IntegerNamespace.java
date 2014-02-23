package genericity.compiler.atl.analyser.namespaces;

import genericity.typing.atl_types.FloatType;
import genericity.typing.atl_types.IntegerType;
import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;

public class IntegerNamespace extends PrimitiveTypeNamespace {

	public IntegerNamespace(PrimitiveGlobalNamespace nspace) {
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
		if ( operatorSymbol.equals("+") ) {
			if ( optionalArgument instanceof IntegerType ) {
				return typ.newIntegerType();
			} else if ( optionalArgument instanceof FloatType ) {
				return typ.newFloatType();
			}
			
			
			// || operatorSymbol.equals("*") || operatorSymbol.equals("/")) {
		}
		return null;
		/*	// TODO: Check argument and current type are the same or compatible... (which are the compatibility rules of ATL?)
			System.out.println("PrimitiveTypeNamespace.getOperatorType() : TODO: Check type conformance");
			return optionalArgument;
		} else if ( operatorSymbol.equals("-") ) {
			return createType(false); // This is separated because there are two cases: "a-b", "-a"
		}
		*/
	}
	
	@Override
	public Type createType(boolean explicitOcurrence) {
		return typ.newIntegerType();
	}
}
