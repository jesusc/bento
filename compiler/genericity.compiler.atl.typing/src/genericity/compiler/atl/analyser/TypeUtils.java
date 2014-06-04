package genericity.compiler.atl.analyser;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EStructuralFeature;

import atl.metamodel.OCL.EnumLiteralExp;
import atl.metamodel.OCL.OclExpression;
import genericity.typing.atl_types.BooleanType;
import genericity.typing.atl_types.CollectionType;
import genericity.typing.atl_types.EmptyCollectionType;
import genericity.typing.atl_types.EnumType;
import genericity.typing.atl_types.FloatType;
import genericity.typing.atl_types.IntegerType;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.OclUndefinedType;
import genericity.typing.atl_types.PrimitiveType;
import genericity.typing.atl_types.SequenceType;
import genericity.typing.atl_types.SetType;
import genericity.typing.atl_types.StringType;
import genericity.typing.atl_types.TupleAttribute;
import genericity.typing.atl_types.TupleType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.UnionType;
import genericity.typing.atl_types.Unknown;
import genericity.typing.atl_types.annotations.GenericExprAnn;

public class TypeUtils {
	public static String typeToString(Type t) {
		if ( t instanceof Metaclass ) return ((Metaclass) t).getName();
		if ( t instanceof Unknown ) return "OclAny";
 		
		if ( t instanceof UnionType ) {
			String result = null;
			for(Type inner : ((UnionType) t).getPossibleTypes()) {
				if ( result == null ) result = typeToString(inner);
				else result = result +  ", " + typeToString(inner);
			}
			return "Union {" +  result + "}";
		}
		
		if ( t instanceof TupleType ) {
			String result = null;
			for(TupleAttribute attr : ((TupleType) t).getAttributes() ) {
				if ( result == null ) result = attr.getName() + ":" + typeToString(attr.getType());
				else result = result +  ", " + attr.getName() + ":" + typeToString(attr.getType());
			}
			return "Tuple {" +  result + "}";
		}
		
		if ( t instanceof CollectionType ) {
			String name = t.getClass().getInterfaces()[0].getSimpleName().replace("Type", "");
			return name + "(" + typeToString( ((CollectionType) t).getContainedType() ) + ")";
		}
		
		if ( t instanceof PrimitiveType ) 
			return t.getClass().getSimpleName();
		
		if ( t instanceof EmptyCollectionType )
			return "-";
		
		return t.toString();
	}

	/**
	 * Checks whether the rightType is assignable to the leftType, that is, if
	 * <pre>
	 * 	leftType = rightType 
	 * </pre>
	 * 
	 * is legal. Both types are the same, or the rightType is a subtype of leftType.
	 * 
	 * @param rightType
	 * @param leftType
	 * @return
	 */
	public static boolean isClassAssignableTo(EClass rightType, EClass leftType) {
		return rightType.equals(leftType) || rightType.getEAllSuperTypes().contains(leftType);
	}

	public static boolean isReference(Type type) {
		return type instanceof Metaclass;
	}

	public static boolean isCollection(Type type) {
		return type instanceof CollectionType;
	}

	public static boolean isUnionWithReferences(Type type) {
		if ( type instanceof UnionType ) {
			UnionType u = (UnionType) type;
			for (Type t : u.getPossibleTypes()) {
				if ( ! isReference(t) && !(t instanceof OclUndefinedType )) 
					return false;
			}
			return true;
		}
		return false;
	}
	
	public static String getTypeName(Type t) {
		if ( t instanceof Metaclass ) {
			return ((Metaclass) t).getName();
		} else if ( t instanceof StringType ) {
			return "String";
		} else if ( t instanceof BooleanType ) {
			return "Boolean";
		} else if ( t instanceof IntegerType ) {
			return "Integer";
		} else if ( t instanceof FloatType ) {
			return "Float";
		} else if ( t instanceof Unknown ) {
			return "OclAny";
		} else if ( t instanceof CollectionType ) {
			String typeName = null;
			if ( t instanceof SequenceType ) typeName = "Sequence";
			if ( t instanceof SetType ) typeName = "Set";
			
			return typeName + "(" + getTypeName(((CollectionType) t).getContainedType()) +")";
		}
		throw new UnsupportedOperationException(t.getClass().getName());
	}

	public static boolean isFeatureMustBeInitialized(EStructuralFeature f) {
		return f.getLowerBound() != 0 && f.getDefaultValue() == null;
	}

	public static EEnumLiteral getLiteralOf(OclExpression expr, TypingModel typ) {
		GenericExprAnn ann = (GenericExprAnn) typ.getAnnotation(expr.original_());
		EnumType t = (EnumType) ann.getType();
		EEnum eenum = (EEnum) t.getEenum();
		EEnumLiteral literal = eenum.getEEnumLiteral(((EnumLiteralExp) expr).getName());		
		return literal;
	}

	
}
