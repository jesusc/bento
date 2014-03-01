package genericity.compiler.atl.analyser;

import org.eclipse.emf.ecore.EClass;

import genericity.typing.atl_types.CollectionType;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.UnionType;

public class TypeUtils {
	public static String typeToString(Type t) {
		if ( t instanceof Metaclass ) return ((Metaclass) t).getName();
		
		if ( t instanceof UnionType ) {
			String result = null;
			for(Type inner : ((UnionType) t).getPossibleTypes()) {
				if ( result == null ) result = typeToString(inner);
				else result = result +  ", " + typeToString(inner);
			}
			return "{" +  result + "}";
		}
		
		if ( t instanceof CollectionType ) {
			String name = t.getClass().getInterfaces()[0].getSimpleName();
			return name + "(" + typeToString( ((CollectionType) t).getContainedType() ) + ")";
		}
		
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
}
