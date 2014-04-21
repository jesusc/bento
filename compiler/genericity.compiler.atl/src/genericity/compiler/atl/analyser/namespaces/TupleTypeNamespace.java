package genericity.compiler.atl.analyser.namespaces;

import genericity.compiler.atl.analyser.AnalyserContext;
import genericity.typing.atl_types.TupleAttribute;
import genericity.typing.atl_types.TupleType;
import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.OclFeature;
import atl.metamodel.OCL.Operation;

public class TupleTypeNamespace implements ITypeNamespace {

	private TupleType	tuple;

	public TupleTypeNamespace(TupleType tuple) {
		this.tuple = tuple;
	}
	
	@Override
	public Type getFeatureType(String featureName, LocatedElement node) {
		for(TupleAttribute attr : tuple.getAttributes()) {
			if ( attr.getName().equals(featureName) ) 
				return attr.getType();
		}
		return AnalyserContext.getErrorModel().signalNoTupleFeature(tuple, featureName, node);
	}

	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		return AnalyserContext.getErrorModel().signalNoOperationFound(tuple, operationName, node, null);
	}

	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		return AnalyserContext.getErrorModel().signalNoOperationFound(tuple, operatorSymbol, node, null);
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
		for(TupleAttribute attr : tuple.getAttributes()) {
			if ( attr.getName().equals(featureName) ) 
				return true;
		}
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

	@Override
	public OclFeature getAttachedOclFeature(String attributeOrOperationName) {
		throw new UnsupportedOperationException();
	}

}
