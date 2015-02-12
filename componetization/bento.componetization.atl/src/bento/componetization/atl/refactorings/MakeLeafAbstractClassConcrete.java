package bento.componetization.atl.refactorings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;

import bento.componetization.atl.BaseRefactoring;
import bento.componetization.atl.IMetamodelInfo;
import bento.componetization.atl.IStaticAnalysisInfo;

/**
 * This refactoring makes leaf abstract classes concrete, to
 * be consistente with our binding approach: 
 * we allow not to map abstract classes if all leaf
 * concrete classes are mapped.
 * 
 * @author jesus
 *
 */
public class MakeLeafAbstractClassConcrete extends BaseRefactoring {

	public MakeLeafAbstractClassConcrete(IStaticAnalysisInfo analysis, IMetamodelInfo metamodel) {
		super(analysis, metamodel);
	}

	@Override
	public boolean match() {
		List<IMatch> matches = new ArrayList<IMatch>();

		Set<EClass> classes = metamodel.getClasses();
		for (EClass eClass : classes) {
			if ( eClass.isAbstract() == false )
				continue;
			
			boolean hasSubclass = false;
			for (EClass possibleSubclass: classes) {
				if ( possibleSubclass.getESuperTypes().contains(eClass) ) {
					hasSubclass = true;
					break;
				}
			}
			
			if ( hasSubclass == false ) {
				matches.add(new MakeLeafAbstractClassConcrete_Match(eClass));
			}			
		}
		
		return save(matches);
	}

		
	public class MakeLeafAbstractClassConcrete_Match extends BaseMatch {
		private EClass eClass;


		public MakeLeafAbstractClassConcrete_Match(EClass eClass) {
			super(MakeLeafAbstractClassConcrete.this);
			this.eClass = eClass;
		}

		@Override
		public Collection<EClass> getAffectedClasses() {
			ArrayList<EClass> info = new ArrayList<EClass>();
			info.add(eClass);
			return info;
		}
		
		@Override
		public void apply() {
			System.out.println("REFACTORING: Make leaf abstract class concrete " + eClass.getName());
			
			eClass.setAbstract(false);
		}
		
		@Override
		public boolean coevolutionRequired() {
			return false;
		}

	}	
	
}
