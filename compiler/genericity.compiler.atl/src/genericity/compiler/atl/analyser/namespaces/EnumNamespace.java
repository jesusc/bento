package genericity.compiler.atl.analyser.namespaces;

import genericity.compiler.atl.analyser.AnalyserContext;
import genericity.typing.atl_types.EnumType;
import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.Operation;

public class EnumNamespace implements ITypeNamespace {

	private EnumType	enumType;

	public EnumNamespace(EnumType enumT) {
		this.enumType = enumT;
	}

	@Override
	public Type getFeatureType(String featureName, LocatedElement node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		throw new UnsupportedOperationException();
	}

	public Operation getAttachedOperation(String operationName) {
		throw new UnsupportedOperationException();
	}

	public boolean hasAttachedOperation(String operationName) {
		throw new UnsupportedOperationException();
	}
	
	
	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		if ( operatorSymbol.equals("=") ) {
			return AnalyserContext.getTypingModel().newBooleanType();
		}
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean hasOperation(String operationName, Type[] arguments) {
		return false;
	}

	@Override
	public boolean hasFeature(String featureName) {
		return false;
	}

	@Override
	public void extendType(String featureName, Type returnType, Attribute attrDefinition) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void extendType(String operationName, Type returnType, Operation opDefinition) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void extendType(String ruleName, Type returnType, Rule rule) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type createType(boolean explicitOcurrence) {
		throw new UnsupportedOperationException();
	}

}
