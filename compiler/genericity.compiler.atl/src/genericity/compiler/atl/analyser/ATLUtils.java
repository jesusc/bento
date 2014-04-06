package genericity.compiler.atl.analyser;

import atl.metamodel.ATL.Helper;
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


}
