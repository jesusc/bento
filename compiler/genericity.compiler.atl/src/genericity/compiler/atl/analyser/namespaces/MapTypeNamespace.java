package genericity.compiler.atl.analyser.namespaces;

import genericity.compiler.atl.analyser.AnalyserContext;
import genericity.compiler.atl.analyser.TypingModel;
import genericity.typing.atl_types.MapType;
import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.OclFeature;
import atl.metamodel.OCL.Operation;

public class MapTypeNamespace implements ITypeNamespace {

	private MapType	type;

	public MapTypeNamespace(MapType map) {
		this.type = map;
	}

	@Override
	public Type getFeatureType(String featureName, LocatedElement node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		TypingModel model = AnalyserContext.getTypingModel();
		
		if ( operationName.equals("including") ) {
			Type keyType   = arguments[0];
			Type valueType = arguments[1];
			
			// TODO: Avoid creating unnecessary MapTypes if the returned type is the "same"
			return model.newMapType(
					model.getCommonType(keyType, type.getKeyType()),
					model.getCommonType(valueType, type.getValueType() ) );			
		} else if ( operationName.equals("get") ) {
			if ( ! model.equalTypes(type.getKeyType(), arguments[0]) ) {
				AnalyserContext.getErrorModel().signalWarningInvalidMapKeyType(node);
			}
			
			return type.getValueType();
		}
		
		throw new UnsupportedOperationException(operationName);
	}

	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean hasOperation(String operationName, Type[] arguments) {
		if ( operationName.equals("including") ) return true;
		if ( operationName.equals("get") ) return true;
		
		throw new UnsupportedOperationException(operationName);
	}

	public Operation getAttachedOperation(String operationName) {
		throw new UnsupportedOperationException();
	}

	public boolean hasAttachedOperation(String operationName) {
		throw new UnsupportedOperationException();
	}

	
	@Override
	public boolean hasFeature(String featureName) {
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
