package genericity.compiler.atl.analyser.namespaces;

import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.Operation;

public abstract class PrimitiveTypeNamespace extends AbstractTypeNamespace implements ITypeNamespace {

	private PrimitiveGlobalNamespace	nspace;

	public PrimitiveTypeNamespace(PrimitiveGlobalNamespace nspace) {
		super(nspace.typ);
		this.nspace = nspace;
	}

	@Override
	public Type getFeature(String featureName, LocatedElement self) {
		throw new UnsupportedOperationException(featureName);
	}

	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		Type t = super.getOperationType(operationName, arguments, node);
		if ( t == null ) {
			return null;
		}
		return t;
	}

	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		Type t = super.getOperatorType(operatorSymbol, optionalArgument, node);
		if ( t == null ) {
			if ( operatorSymbol.equals("+") || operatorSymbol.equals("-")) {
				// TODO: Check argument and current type are the same or compatible... (which are the compatibility rules of ATL?)
				System.out.println("PrimitiveTypeNamespace.getOperatorType() : TODO: Check type conformance");
				return optionalArgument;
			}
			
			return null;
			// throw new UnsupportedOperationException(operatorSymbol);
		}
		return t;
	}

	@Override
	public void extendType(String featureName, Type returnType, Attribute attrDefinition) {
		throw new UnsupportedOperationException(featureName);		
	}

	@Override
	public void extendType(String operationName, Type returnType, Operation opDefinition) {
		throw new UnsupportedOperationException(operationName);				
	}

	@Override
	public Type createType(boolean explicitOcurrence) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public boolean hasOperation(String operationName, Type[] arguments) {
		return false;
	}

}
