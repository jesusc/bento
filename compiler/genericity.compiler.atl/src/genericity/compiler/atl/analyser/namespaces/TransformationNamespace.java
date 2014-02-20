package genericity.compiler.atl.analyser.namespaces;

import java.util.HashMap;

import genericity.compiler.atl.analyser.ErrorModel;
import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.Operation;

public class TransformationNamespace implements ITypeNamespace {

	private HashMap<String, VirtualFeature<TransformationNamespace, Operation>> operations = new HashMap<String, VirtualFeature<TransformationNamespace, Operation>>();
	private HashMap<String, VirtualFeature<TransformationNamespace, Attribute>> features   = new HashMap<String, VirtualFeature<TransformationNamespace, Attribute>>();
	private ErrorModel	errors;
	
	@Override
	public Type getFeature(String featureName, LocatedElement node) {
		VirtualFeature<TransformationNamespace, Attribute> op = features.get(featureName);
		if ( op == null ) {
			errors.signalNoThisModuleFeature(featureName, node);
		}
		return op.returnType;
	}

	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		VirtualFeature<TransformationNamespace, Operation> op = operations.get(operationName);
		if ( op == null ) {
			errors.signalNoThisModuleOperation(operationName, node);
		}
		return op.returnType;
	}

	@Override
	public void extendType(String featureName, Type returnType, Attribute attrDefinition) {
		features.put(featureName, new VirtualFeature<TransformationNamespace, Attribute>(this, featureName, returnType, attrDefinition));
	}

	public void extendType(String operationName, Type returnType, Operation opDefinition) {
		operations.put(operationName, new VirtualFeature<TransformationNamespace, Operation>(this, operationName, returnType, opDefinition));
	}

	@Override
	public boolean hasOperation(String operationName, Type[] arguments) {
		return operations.containsKey(operationName);
	}

	@Override
	public Type createType(boolean explicitOcurrence) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		throw new UnsupportedOperationException("No symbol " + operatorSymbol + " supported");
	}

	public void setDependencies(ErrorModel errors) {
		this.errors = errors;
	}


}
