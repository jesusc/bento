package bento.common.adapter;

import org.eclipse.emf.ecore.EClass;

public class AdapterTypeUtils {

	// Check if a variable (or a slot) with type left can be assigned an object of type right
	public static boolean isAssignable(EClass left, EClass right) {
		return left.equals(right) || left.isSuperTypeOf(right);		
	}
	
}
