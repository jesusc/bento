package genericity.compiler.atl.analyser.namespaces;

import java.util.HashMap;

import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.Operation;

public abstract class PrimitiveTypeNamespace extends AbstractTypeNamespace implements ITypeNamespace {

	private HashMap<String, VirtualFeature<PrimitiveTypeNamespace, Attribute>> features = 
			new HashMap<String, VirtualFeature<PrimitiveTypeNamespace, Attribute>>();
	private HashMap<String, VirtualFeature<PrimitiveTypeNamespace, Operation>> operations = 
			new HashMap<String, VirtualFeature<PrimitiveTypeNamespace, Operation>>();

	private PrimitiveGlobalNamespace	nspace;

	public PrimitiveTypeNamespace(PrimitiveGlobalNamespace nspace) {
		this.nspace = nspace;
	}

	@Override
	public Type getFeatureType(String featureName, LocatedElement node) {
		Type t = features.containsKey(featureName) ? features.get(featureName).returnType : null;
		if ( t != null )
			return t;
		throw new UnsupportedOperationException(featureName + " - " + node.getLocation());
	}
	
	@Override
	public boolean hasFeature(String featureName) {
		return features.containsKey(featureName);
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
		if ( t == null && operations.containsKey(operationName) ) {
			t = operations.get(operationName).returnType;
		}
		
		if ( t == null ) {
			return null;
		}
		return t;
	}


	@Override
	public void extendType(String featureName, Type returnType, Attribute attrDefinition) {
		features.put(featureName, new VirtualFeature<PrimitiveTypeNamespace, Attribute>(this, featureName, returnType, attrDefinition));
	}

	@Override
	public void extendType(String operationName, Type returnType, Operation opDefinition) {
		operations.put(operationName, new VirtualFeature<PrimitiveTypeNamespace, Operation>(this, operationName, returnType, opDefinition));
	}

	/**
	 * Rules cannot be attached to primitive types
	 */
	@Override
	public void extendType(String operationName, Type returnType, Rule r) {
		throw new UnsupportedOperationException(operationName);				
	}


}
