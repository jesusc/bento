package genericity.compiler.atl.analyser.namespaces;

import java.util.HashMap;

import genericity.compiler.atl.analyser.ErrorModel;
import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.CalledRule;
import atl.metamodel.ATL.LazyMatchedRule;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.Operation;

public class TransformationNamespace implements ITypeNamespace {

	private HashMap<String, VirtualFeature<TransformationNamespace, Operation>> operations = new HashMap<String, VirtualFeature<TransformationNamespace, Operation>>();
	private HashMap<String, VirtualFeature<TransformationNamespace, Attribute>> features   = new HashMap<String, VirtualFeature<TransformationNamespace, Attribute>>();
	private HashMap<String, VirtualFeature<TransformationNamespace, CalledRule>> calledRules  = new HashMap<String, VirtualFeature<TransformationNamespace, CalledRule>>();

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
		VirtualFeature<TransformationNamespace, ?> op = operations.get(operationName);
		if ( op == null ) {
			op = calledRules.get(operationName);
			if ( op == null )
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

	public void extendType(String ruleName, Type returnType, Rule r) {
		if ( r instanceof CalledRule ) {
			calledRules.put(ruleName, new VirtualFeature<TransformationNamespace, CalledRule>(this, ruleName, returnType, (CalledRule) r));
		} else if ( r instanceof LazyMatchedRule ) {
			throw new UnsupportedOperationException("TODO: Deal with lazy rules");
		} else {
			throw new IllegalArgumentException("Only called rulres and lazy rules can be attached to thisModule");
		}
	}
	
	@Override
	public boolean hasOperation(String operationName, Type[] arguments) {
		return operations.containsKey(operationName) ||
			   calledRules.containsKey(operationName);
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
