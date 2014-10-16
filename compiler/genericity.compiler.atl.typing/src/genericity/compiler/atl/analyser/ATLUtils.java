package genericity.compiler.atl.analyser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import atl.metamodel.ATL.Helper;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.OutPatternElement;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OclType;
import atl.metamodel.OCL.Operation;

public class ATLUtils {

	public static OclExpression getBody(Helper self) {
		if ( self.getDefinition().getFeature() instanceof Attribute ) {
			return ((Attribute) self.getDefinition().getFeature()).getInitExpression();
		} else {
			return ((Operation) self.getDefinition().getFeature()).getBody();
		}
	}

	public static String getHelperName(Helper self) {
		if ( self.getDefinition().getFeature() instanceof Attribute ) {
			return ((Attribute) self.getDefinition().getFeature()).getName();
		} else {
			return ((Operation) self.getDefinition().getFeature()).getName();
		}
	}

	public static boolean isContextHelper(Helper self) {
		return self.getDefinition().getContext_() != null ;
	}

	public static OclType getHelperType(Helper self) {
		return self.getDefinition().getContext_().getContext_();
	}

	public static List<OutPatternElement> getAllOutputPatternElement(MatchedRule r) {
		ArrayList<OutPatternElement> result = new ArrayList<OutPatternElement>();
		Stack<MatchedRule> rules = new Stack<MatchedRule>();
		rules.add(r);

		while ( ! rules.isEmpty() ) {
			r = rules.pop();
			if ( r.getSuperRule() != null )
				rules.push(r.getSuperRule());
		
			for(OutPatternElement ope : r.getOutPattern().getElements()) {
				boolean alreadyDeclared = false;
				for(OutPatternElement existing : result) {
					if ( ope.getVarName().equals(existing.getVarName()) ) {
						alreadyDeclared= true;
						break;
					}
				}
				
				if ( ! alreadyDeclared ) {
					result.add(ope);
				}
			}
		}
		
		return result;
	}

}
