package genericity.compiler.atl.analyser.namespaces;

import genericity.compiler.atl.analyser.TypingModel;
import genericity.typing.atl_types.CollectionType;
import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.Operation;

public abstract class CollectionNamespace implements ITypeNamespace {

	protected TypingModel	typ;
	protected Type	nested;

	public CollectionNamespace(TypingModel typ, Type nested) {
		this.typ = typ;
		this.nested = nested;
	}

	@Override
	public Type getFeature(String featureName, LocatedElement self) {
		throw new UnsupportedOperationException(featureName + " " + self.getLocation());
	}

	@Override
	public void extendType(String featureName, Type returnType, Attribute attrDefinition) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void extendType(String operationName, Type returnType, Operation opDefinition) {
		
	}
	
	@Override
	public Type createType(boolean explicitOcurrence) {
		throw new UnsupportedOperationException();
	}


	@Override
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		if ( operationName.equals("size")  ) return typ.newIntegerType();
		if ( operationName.equals("first") ) return nested;
		if ( operationName.equals("asSequence") ) return typ.newSequenceType(nested);

		if ( operationName.equals("isEmpty") ) return typ.newBooleanType();
		if ( operationName.equals("includes") ) return typ.newBooleanType();
		
		
		if ( operationName.equals("append") || operationName.equals("including") ) {
			return newCollectionType(typ.getCommonType(this.nested, arguments[0]));
		}
		
		throw new UnsupportedOperationException("Collection operation " + operationName + " not supported. " + node.getLocation());
	}

	@Override
	public boolean hasOperation(String operationName, Type[] arguments) {
		return false;
	}

	protected abstract CollectionType newCollectionType(Type nested);
	
	public Type unwrap() {
		return nested;
	}

	public Type getIteratorType(String name, Type bodyType) {
		if ( name.equals("select") ) {
			return this.newCollectionType(nested); 
		} else if ( name.equals("collect") ) {
			return this.newCollectionType(bodyType);
		} else if ( name.equals("sortedBy") ) {
			return this.newCollectionType(nested);
		}
		throw new UnsupportedOperationException("Collection operation " + name + " not supported.");
	}
	
	@Override
	public Type getOperatorType(String operatorSymbol, Type optionalArgument, LocatedElement node) {
		throw new UnsupportedOperationException("No symbol " + operatorSymbol + " supported");
	}


}
