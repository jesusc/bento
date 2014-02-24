package genericity.compiler.atl.analyser;

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
		
		return t.toString();
	}
}
