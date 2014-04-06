package genericity.compiler.atl.analyser.namespaces;

import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.Operation;

public interface ITypeNamespace {

	Type getFeatureType(String featureName, LocatedElement node);
	Type getOperationType(String operationName, Type[] arguments, LocatedElement node);
	Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node);
	
	boolean hasOperation(String operationName, Type[] arguments);
	boolean hasFeature(String featureName);
	
	void extendType(String featureName, Type returnType, Attribute attrDefinition);
	void extendType(String operationName, Type returnType, Operation opDefinition);
	void extendType(String ruleName, Type returnType, Rule rule);
	
	boolean   hasAttachedOperation(String operationName);
	Operation getAttachedOperation(String operationName);
	
	Type createType(boolean explicitOcurrence);

}
