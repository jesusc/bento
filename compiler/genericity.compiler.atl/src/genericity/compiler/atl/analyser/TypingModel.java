package genericity.compiler.atl.analyser;

import java.util.ArrayList;
import java.util.ListIterator;

import genericity.compiler.atl.analyser.namespaces.ClassNamespace;
import genericity.compiler.atl.analyser.namespaces.CollectionNamespace;
import genericity.compiler.atl.analyser.namespaces.IMetamodelNamespace;
import genericity.compiler.atl.analyser.namespaces.OclTypeNamespace;
import genericity.compiler.atl.analyser.namespaces.PrimitiveGlobalNamespace;
import genericity.compiler.atl.analyser.namespaces.UnionTypeNamespace;
import genericity.typing.atl_types.BooleanType;
import genericity.typing.atl_types.CollectionType;
import genericity.typing.atl_types.EnumType;
import genericity.typing.atl_types.FloatType;
import genericity.typing.atl_types.IntegerType;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.OclUndefinedType;
import genericity.typing.atl_types.PrimitiveType;
import genericity.typing.atl_types.ReflectiveClass;
import genericity.typing.atl_types.SequenceType;
import genericity.typing.atl_types.SetType;
import genericity.typing.atl_types.StringType;
import genericity.typing.atl_types.ThisModuleType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.UnionType;
import genericity.typing.atl_types.Unknown;
import genericity.typing.atl_types.annotations.BindingAnnotation;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;

import atl.metamodel.ATL.Binding;

public class TypingModel {
	private BasicEMFModel	impl;

	private PrimitiveGlobalNamespace primitiveNamespace = new PrimitiveGlobalNamespace(this);
	private OclTypeNamespace oclTypeNamespace = new OclTypeNamespace(this);
	
	public TypingModel(BasicEMFModel impl) {
		this.impl = impl;
	}

	public StringType newStringType() {
		return (StringType) createPType(StringType.class.getSimpleName(), PrimitiveGlobalNamespace.STRING_TYPE);		
	}

	private Type createPType(String className, String pTypeName) {
		Type t = (Type) impl.createObject(className);
		t.setMetamodelRef(primitiveNamespace.getClassifier(pTypeName));
		return t;
	}

	public IntegerType newIntegerType() {
		return (IntegerType) createPType(IntegerType.class.getSimpleName(), PrimitiveGlobalNamespace.INTEGER_TYPE);	
	}
	
	public FloatType newFloatType() {
		return (FloatType) createPType(FloatType.class.getSimpleName(), PrimitiveGlobalNamespace.FLOAT_TYPE);	
	}

	public BooleanType newBooleanType() {
		return (BooleanType) createPType(BooleanType.class.getSimpleName(), PrimitiveGlobalNamespace.BOOLEAN_TYPE);	
	}

	public ExpressionAnnotation createExpressionAnnotation() {
		return (ExpressionAnnotation) impl.createObject(ExpressionAnnotation.class.getSimpleName());				
	}

	public OclUndefinedType newOclUndefinedType() {
		return (OclUndefinedType) impl.createObject(OclUndefinedType.class.getSimpleName());				
	}

	public Metaclass newMetaclassType(EClass c, boolean isExplicitOcurrence, ClassNamespace cspace) {
		Metaclass metaclass = (Metaclass) impl.createObject(Metaclass.class.getSimpleName());
		metaclass.setKlass(c);
		metaclass.setName(c.getName());
		metaclass.setMultivalued(false);
		metaclass.setMetamodelRef(cspace);
		return metaclass;
	}

	public Unknown newUnknownType() {
		Unknown u = (Unknown) impl.createObject(Unknown.class.getSimpleName());
		// TODO: Set meta-model ref
		return u;
	}

	public EnumType createEEnum(EEnum c) {
		EnumType enumT = (EnumType) impl.createObject(EnumType.class.getSimpleName());
		enumT.setEenum(c);
		enumT.setName(c.getName());
		return enumT;
	}
	

	public SequenceType newSequenceType(Type nested) {
		SequenceType seq = (SequenceType) impl.createObject(SequenceType.class.getSimpleName());
		seq.setContainedType(nested);
		seq.setMultivalued(true);
		seq.setMetamodelRef(primitiveNamespace.getClassifier(PrimitiveGlobalNamespace.SEQUENCE_TYPE, nested));
		return seq;
	}

	public SetType newSetType(Type nested) {
		SetType seq = (SetType) impl.createObject(SetType .class.getSimpleName());
		seq.setContainedType(nested);
		seq.setMultivalued(true);
		seq.setMetamodelRef(primitiveNamespace.getClassifier(PrimitiveGlobalNamespace.SET_TYPE, nested));
		return seq;
	}

	public void createBindingAnnotation(Binding b, Type t) {
		BindingAnnotation bt = (BindingAnnotation) impl.createObject(BindingAnnotation.class.getSimpleName());
		bt.setBinding(b.original_());
		bt.setSourceType(t);
		
	}

	public Type newOclType() {
		ReflectiveClass rc = (ReflectiveClass) impl.createObject(ReflectiveClass.class.getSimpleName());
		rc.setMetamodelRef(oclTypeNamespace);
		return rc;
	}
	
	public ThisModuleType createThisModuleType() {
		ThisModuleType tm = (ThisModuleType) impl.createObject(ThisModuleType.class.getSimpleName());
		return tm;
	}

	
	//
	// Type comparisons
	//
	
	public Type getCommonType(Type t1, Type t2) {
		if ( equalTypes(t1, t2) ) {
			return t1;
		}

		if ( (t1 instanceof UnionType) || (t1 instanceof UnionType) ) {
			ArrayList<Type> types = new ArrayList<Type>();
			if ( t1 instanceof UnionType ) {
				addUniqueTypes(types, ((UnionType) t1).getPossibleTypes());
			} else {
				addUniqueType(types, t1);
			}
			
			if ( t2 instanceof UnionType ) {
				addUniqueTypes(types, ((UnionType) t2).getPossibleTypes());
			} else {
				addUniqueType(types, t2);
			}
			
			Type[] unionTypes = new Type[types.size()];
			return createUnionType(types.toArray(unionTypes));
		} else {
			return createUnionType(t1, t2);
		}
		
		// throw new UnsupportedOperationException("CommonTypes: " + t1 + " - " + t2);
	}

	
	private void addUniqueTypes(ArrayList<Type> existingTypes, EList<Type> newTypes) {
		for (Type type : newTypes) {
			addUniqueType(existingTypes, type);
		}
	}

	private void addUniqueType(ArrayList<Type> existingTypes, Type type) {
		ListIterator<Type> it = existingTypes.listIterator();
		while ( it.hasNext() ) {
			Type existing = it.next();
			
			if ( equalTypes(existing, type) ) {
				return;
			} else if ( existing instanceof Metaclass && type instanceof Metaclass ) {
				Metaclass existingMetaclass = (Metaclass) existing;
				Metaclass typeMetaclass     = (Metaclass) type;
				if ( existingMetaclass.getKlass().isSuperTypeOf(typeMetaclass.getKlass()) ) {
					return; // No need
				} else if ( typeMetaclass.getKlass().isSuperTypeOf(existingMetaclass.getKlass()) ) {
					it.set(type);
					return;
				}
			}
		}
		existingTypes.add(type);
	}

	private Type createUnionType(Type... types) {
		UnionType ut = (UnionType) impl.createObject(UnionType.class.getSimpleName());
		for (Type type : types) {
			ut.getPossibleTypes().add(type);
		}
		ut.setMetamodelRef(new UnionTypeNamespace(ut));
		return ut;
	}

	public boolean equalTypes(Type t1, Type t2) {
		if ( t1.getClass() != t2.getClass() ) 
			return false;
		
		if ( t1 instanceof Metaclass ) {
			return ( ((Metaclass) t1).getKlass().equals(((Metaclass) t2).getKlass()));
		} else if ( t1 instanceof PrimitiveType ) {
			return true;
		} else if ( (t1 instanceof CollectionType) && (t2 instanceof CollectionType) ) {
			// TODO: Equal types for collection types, for the moment, considered the same even it internally they are not the same!! not sure a about this
			return true;
		} else if ( t1 instanceof EnumType && t2 instanceof EnumType ) {
			return ((EnumType) t1).getName().equals(((EnumType) t2).getName());
		}
		
		throw new UnsupportedOperationException("EqualTypes: " + t1 + " - " + t2);
	}

	public boolean isCompatible(Type type_, Type supertype) {
		if ( type_ instanceof Metaclass && supertype instanceof Metaclass ) {
			Metaclass m1 = (Metaclass) type_;
			Metaclass m2 = (Metaclass) supertype;
			if ( m1.getKlass() == m2.getKlass() || m2.getKlass().isSuperTypeOf(m1.getKlass()) )
				return true;
		}
		return false;
	}



	
}
