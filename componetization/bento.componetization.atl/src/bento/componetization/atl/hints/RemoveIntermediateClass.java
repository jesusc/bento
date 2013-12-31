package bento.componetization.atl.hints;

import java.util.ArrayList;
import java.util.List;

import bento.componetization.atl.BaseRefactoring;
import bento.componetization.atl.IPruningInfo;
import bento.componetization.atl.IStaticAnalysisInfo;
import bento.componetization.atl.refactorings.IMatch;

/**
 * This hints indicates the removal of a class that is between two classes
 * acting as an association. 
 * 
 * An intermediate a class typically includes a reference to navigate to the
 * associated class ("navigation reference"), and we assume that it is referenced
 * by a containment reference only once.
 * 
 * To apply the refactoring, the intermediate class must not be used explicitly
 * in the transformation, and no feature must be used except the "navigation reference".
 * 
 * The template must be rewritten to replace navigations through the intermediate
 * class. For example,
 * <pre>
 * 		aClass.generalizations->collect(g | g.general)
 * 		=>
 * 		aClass.superclasses
 * </pre>
 * 
 * @author jesus
 *
 */
public class RemoveIntermediateClass extends BaseRefactoring {

	public RemoveIntermediateClass(IStaticAnalysisInfo analysis, IPruningInfo prunner) {
		super(analysis, prunner);
	}

	@Override
	public boolean match() {
		List<IMatch> matches = new ArrayList<IMatch>();
		
		if ( true )
			throw new UnsupportedOperationException();
		
		return save(matches);
	}

}
