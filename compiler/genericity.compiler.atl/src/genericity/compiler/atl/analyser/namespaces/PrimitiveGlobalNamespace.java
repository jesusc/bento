package genericity.compiler.atl.analyser.namespaces;

import genericity.compiler.atl.analyser.TypingModel;
import genericity.typing.atl_types.Type;

public class PrimitiveGlobalNamespace implements IMetamodelNamespace {

	public static final String	SEQUENCE_TYPE	= "Sequence";
	public static final String	STRING_TYPE	= "String";
	public static final String	INTEGER_TYPE	= "Integer";
	public static final String	FLOAT_TYPE	= "Float";
	public static final String	BOOLEAN_TYPE	= "Boolean";

	protected StringNamespace  stringNamespace;
	protected IntegerNamespace integerNamespace;
	protected BooleanNamespace booleanNamespace;
	protected TypingModel	typ;
	
	public PrimitiveGlobalNamespace(TypingModel typ) {
		this.typ = typ;
		this.stringNamespace = new StringNamespace(this);
		this.integerNamespace = new IntegerNamespace(this);
		this.booleanNamespace = new BooleanNamespace(this);
	}

	@Override
	public ITypeNamespace getClassifier(String name) {
		if ( name.equals(STRING_TYPE) ) {
			return stringNamespace;
		} else if ( name.equals("Integer") ) {
			return integerNamespace;
		} else if ( name.equals("Boolean") ) {
			return booleanNamespace;
		}
		throw new UnsupportedOperationException(name);
	}

	public Object getClassifier(String name, Type nested) {
		if ( name.equals(SEQUENCE_TYPE) ) {
			return new SequenceNamespace(typ, nested);
		}
		return null;
	}

}
