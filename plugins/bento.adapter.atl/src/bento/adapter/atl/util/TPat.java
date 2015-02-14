package bento.adapter.atl.util;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Class with static transformation pattern methods.
 * 
 * @author jesus
 *
 */
public class TPat {

	public static <T, U extends V, V> V listToTree(List<T> sourceList, 
			Function<T, U> mapFunction,
			BiFunction<V, V, V> joinFunction) {
	
		T e1 = sourceList.get(0);
		U u1 = mapFunction.apply(e1);
			
		V result = u1;
		
		for(int i = 1; i < sourceList.size(); i++) {
			T tn = sourceList.get(i);
			U un = mapFunction.apply(tn);
			
			result = joinFunction.apply(result, un);			
		}	
		
		return result;
	}

}
