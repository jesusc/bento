package genericity.compiler.atl.analyser.namespaces;

import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.OclFeature;
import atl.metamodel.OCL.Operation;
import genericity.compiler.atl.analyser.TypingModel;
import genericity.typing.atl_types.Type;

public class OclTypeNamespace implements ITypeNamespace {

	private TypingModel	typ;

	public OclTypeNamespace(TypingModel typingModel) {
		this.typ = typingModel;
	}

	@Override
	public boolean hasFeature(String featureName) {
		return featureName.equals("name");
	}
	
	@Override
	public Type getFeatureType(String featureName, LocatedElement node) {
		if ( featureName.equals("name" ) ) 
			return typ.newStringType();
		
		throw new UnsupportedOperationException(featureName);
	}

	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean hasOperation(String operationName, Type[] arguments) {
		throw new UnsupportedOperationException();
	}

	public Operation getAttachedOperation(String operationName) {
		throw new UnsupportedOperationException();
	}
	
	public boolean hasAttachedOperation(String operationName) {
		throw new UnsupportedOperationException();
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
	public Type createType(boolean explicitOcurrence) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void extendType(String ruleName, Type returnType, Rule rule) {
		throw new UnsupportedOperationException();
	}

	@Override
	public OclFeature getAttachedOclFeature(String attributeOrOperationName) {
		throw new UnsupportedOperationException();
	}

	

}
