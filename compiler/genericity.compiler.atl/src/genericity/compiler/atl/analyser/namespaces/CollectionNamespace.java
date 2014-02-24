package genericity.compiler.atl.analyser.namespaces;

import genericity.compiler.atl.analyser.TypingModel;
import genericity.typing.atl_types.CollectionType;
import genericity.typing.atl_types.IntegerType;
import genericity.typing.atl_types.Type;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.Rule;
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
	public boolean hasFeature(String featureName) {
		throw new UnsupportedOperationException(featureName);
	}
	
	@Override
	public void extendType(String featureName, Type returnType, Attribute attrDefinition) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void extendType(String featureName, Type returnType, Rule r) {
		throw new UnsupportedOperationException("Collection types cannot be atached to rules");
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
	public Type getOperationType(String operationName, Type[] arguments, LocatedElement node) {
		if ( operationName.equals("size")  ) return typ.newIntegerType();
		if ( operationName.equals("first") ) return nested;
		if ( operationName.equals("at") ) return nested; // TODO: Indicate somehow that at may return null
		
		if ( operationName.equals("sum") ) {
			if (! (nested instanceof IntegerType) ) {
				// TODO: Signal error!
			}
			return typ.newIntegerType();
		}
		
		if ( operationName.equals("subSequence") ) return typ.newSequenceType(nested);

		if ( operationName.equals("asSequence") ) return typ.newSequenceType(nested);
		if ( operationName.equals("asSet") ) return typ.newSetType(nested);
		
		if ( operationName.equals("isEmpty") ) return typ.newBooleanType();
		if ( operationName.equals("includes") ) return typ.newBooleanType();
		
		if ( operationName.equals("indexOf") ) {
			// TODO: indexOf may return a "bottom" value???
			return typ.newIntegerType();
		}
		
		if ( operationName.equals("append") || operationName.equals("including") ) {
			return newCollectionType(typ.getCommonType(this.nested, arguments[0]));
		}
		
		if ( operationName.equals("union") ) {
			// TODO: Signal error if argument is not a collection
			CollectionType ct = (CollectionType) arguments[0];
			return newCollectionType(typ.getCommonType(this.nested, ct.getContainedType()));
		}
		
		if ( operationName.equals("flatten") ) {
			if ( nested instanceof CollectionType ) {
				return nested;
			} else {
				System.out.println("CollectionNamespace.getOperationType(): TODO: Signal warning, flatten over non-nested collection.");
				return newCollectionType(nested); 
			}
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
