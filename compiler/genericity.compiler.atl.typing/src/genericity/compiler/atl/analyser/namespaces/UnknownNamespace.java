package genericity.compiler.atl.analyser.namespaces;

import genericity.compiler.atl.analyser.AnalyserContext;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.Unknown;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.OclFeature;
import atl.metamodel.OCL.Operation;

public class UnknownNamespace extends AbstractTypeNamespace {

	private Type selfType;
	
	public UnknownNamespace(Type u) {
		selfType = u;
	}

	@Override
	public Type getFeatureType(String featureName, LocatedElement node) {
		return AnalyserContext.getErrorModel().signalNoFeatureInOclAny(featureName, node);
	}

	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		Type t = super.getOperationType(operationName, arguments, node);
		if ( t == null ) {
			return AnalyserContext.getErrorModel().signalNoOperationFound(selfType, operationName, node, null);
		}
		return t;
	}

	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		if ( operatorSymbol.equals("=") ) return AnalyserContext.getTypingModel().newBooleanType();
		
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + " not support " + operatorSymbol + " in line" + node.getLocation());
	}

	@Override
	public boolean hasOperation(String operationName, Type[] arguments) {
		return false;
	}

	public Operation getAttachedOperation(String operationName) {
		throw new UnsupportedOperationException();
	}
	
	public boolean hasAttachedOperation(String operationName) {
		throw new UnsupportedOperationException();
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
		System.err.println("WARNING! Extending OclAny!" + operationName + " at " + opDefinition.getLocation());
		// throw new UnsupportedOperationException(operationName + " " + opDefinition.getLocation());		
	}

	@Override
	public void attachRule(String ruleName, Type returnType, Rule rule) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type createType(boolean explicitOcurrence) {
		throw new UnsupportedOperationException();
	}

	@Override
	public OclFeature getAttachedOclFeature(String attributeOrOperationName) {
		throw new UnsupportedOperationException();
	}

}
