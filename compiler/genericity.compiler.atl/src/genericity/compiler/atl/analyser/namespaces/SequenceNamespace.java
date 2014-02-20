package genericity.compiler.atl.analyser.namespaces;

import atl.metamodel.OCL.Operation;
import genericity.compiler.atl.analyser.TypingModel;
import genericity.typing.atl_types.CollectionType;
import genericity.typing.atl_types.Type;


public class SequenceNamespace extends CollectionNamespace {

	public SequenceNamespace(TypingModel typ, Type nested) {
		super(typ, nested);
	}

	@Override
	protected CollectionType newCollectionType(Type nested) {
		return typ.newSequenceType(nested);
	}

}

