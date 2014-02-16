package genericity.compiler.atl.analyser;

import genericity.typing.atl_types.FloatType;
import genericity.typing.atl_types.IntegerType;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.OclUndefinedType;
import genericity.typing.atl_types.StringType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclipse.emf.ecore.EClass;

public class TypingModel {
	private BasicEMFModel	impl;

	public TypingModel(BasicEMFModel impl) {
		this.impl = impl;
	}

	public StringType newStringType() {
		return (StringType) impl.createObject(StringType.class.getSimpleName());		
	}

	public IntegerType newIntegerType() {
		return (IntegerType) impl.createObject(IntegerType.class.getSimpleName());		
	}
	
	public FloatType newFloatType() {
		return (FloatType) impl.createObject(FloatType.class.getSimpleName());		
	}
	
	public ExpressionAnnotation createExpressionAnnotation() {
		return (ExpressionAnnotation) impl.createObject(ExpressionAnnotation.class.getSimpleName());				
	}

	public OclUndefinedType newOclUndefinedType() {
		return (OclUndefinedType) impl.createObject(OclUndefinedType.class.getSimpleName());				
	}

	public Metaclass newMetaclassType(EClass c, boolean isExplicitOcurrence) {
		Metaclass metaclass = (Metaclass) impl.createObject(Metaclass.class.getSimpleName());
		metaclass.setKlass(c);
		metaclass.setName(c.getName());
		metaclass.setMultivalued(false);
		return metaclass;
	}

	

}
