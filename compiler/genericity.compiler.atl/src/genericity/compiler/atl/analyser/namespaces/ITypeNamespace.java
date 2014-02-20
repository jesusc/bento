package genericity.compiler.atl.analyser.namespaces;

import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.Operation;

public interface ITypeNamespace {

	Type getFeature(String featureName, LocatedElement node);
	Type getOperationType(String operationName, Type[] arguments, LocatedElement node);
	Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node);
	boolean hasOperation(String operationName, Type[] arguments);
	
	void extendType( String featureName, Type returnType, Attribute attrDefinition);
	void extendType(String operationName, Type returnType, Operation opDefinition);
	
	Type createType(boolean explicitOcurrence);

}