package genericity.compiler.atl.analyser.namespaces;

import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.Operation;

public abstract class PrimitiveTypeNamespace extends AbstractTypeNamespace implements ITypeNamespace {

	private PrimitiveGlobalNamespace	nspace;

	public PrimitiveTypeNamespace(PrimitiveGlobalNamespace nspace) {
		this.nspace = nspace;
	}

	@Override
	public Type getFeature(String featureName, LocatedElement self) {
		throw new UnsupportedOperationException(featureName);
	}

	@Override
	public boolean hasOperation(String operationName, Type[] arguments) {
		if ( super.hasOperation(operationName, arguments) ) {
			return true;
		}
		return false;
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
	public void extendType(String featureName, Type returnType, Attribute attrDefinition) {
		throw new UnsupportedOperationException(featureName);		
	}

	@Override
	public void extendType(String operationName, Type returnType, Operation opDefinition) {
		throw new UnsupportedOperationException(operationName);				
	}

	/**
	 * Rules cannot be attached to primitive types
	 */
	@Override
	public void extendType(String operationName, Type returnType, Rule r) {
		throw new UnsupportedOperationException(operationName);				
	}


}
