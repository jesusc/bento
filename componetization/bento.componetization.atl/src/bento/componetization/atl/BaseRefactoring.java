package bento.componetization.atl;

import java.util.List;

public abstract class BaseRefactoring implements IConceptRefactoring {

	protected IStaticAnalysisInfo analysis;
	protected IPruningInfo prunner;

	protected List<? extends IMatch> storedMatches = null;

	public BaseRefactoring(IStaticAnalysisInfo analysis, IPruningInfo prunner) {
		this.analysis = analysis;
		this.prunner   = prunner;
	}
	
	protected boolean save(List<? extends IMatch> matches) {
		if ( matches.size() == 0 )
			return false;
		
		this.storedMatches  = matches;
		return true;
	}


	@Override
	public void apply() {
		if ( storedMatches == null ) throw new IllegalStateException();
		
		for (IMatch m : storedMatches) {
			m.apply();
		}
		
	}

}
