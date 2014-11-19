package bento.analyser.util;

import java.util.ArrayList;
import java.util.List;

import atl.metamodel.ATL.MatchedRule;

public class ATLUtil {
	public static List<MatchedRule> allSuperRules(MatchedRule r) {
		List<MatchedRule> result = new ArrayList<MatchedRule>();
		do {
			r = r.getSuperRule();
			if ( r == null ) 
				return result;
			result.add(r);
		} while ( true );
	}
}
