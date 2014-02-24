package genericity.compiler.atl.analyser.namespaces;

import genericity.compiler.atl.analyser.TypingModel;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.UnionType;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.Operation;

public class UnionTypeNamespace extends AbstractTypeNamespace implements ITypeNamespace {

	private UnionType	type;

	public UnionTypeNamespace(UnionType type) {
		this.type = type;
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
			throw new UnsupportedOperationException(operatorSymbol);
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
	public void extendType(String operationName, Type returnType, Rule r) {
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
