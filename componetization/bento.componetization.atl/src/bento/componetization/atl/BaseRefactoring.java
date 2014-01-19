package bento.componetization.atl;

import java.util.ArrayList;
import java.util.List;

import bento.componetization.atl.refactorings.IConceptRefactoring;
import bento.componetization.atl.refactorings.IMatch;

public abstract class BaseRefactoring implements IConceptRefactoring {

	protected IStaticAnalysisInfo analysis;
	protected IMetamodelInfo metamodel;
	
	protected List<? extends IMatch> storedMatches = null;

	public BaseRefactoring(IStaticAnalysisInfo analysis, IMetamodelInfo metamodel) {
		this.analysis = analysis;
		this.metamodel = metamodel;
	}
	
	protected boolean save(List<? extends IMatch> matches) {
		if ( matches.size() == 0 )
			return false;
		
		this.storedMatches  = matches;
		return true;
	}

	@Override
	public List<IMatch> getAllMatches() {
		return new ArrayList<IMatch>(storedMatches);
	}
	
	@Override
	public void apply() {
		if ( storedMatches == null ) throw new IllegalStateException();
		
		for (IMatch m : storedMatches) {
			m.apply();
		}
		
	}

}
