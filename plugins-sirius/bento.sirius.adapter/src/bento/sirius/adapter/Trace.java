package bento.sirius.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.sirius.diagram.description.DiagramElementMapping;

public class Trace<I, O> {

	private Map<I, List<O>> impl = new HashMap<>();
	
	public void add(I original, O target) {		
		if (! impl.containsKey(original) ) {
			impl.put(original, new ArrayList<O>());
		}
		
		impl.get(original).add(target);
	}
	
	public List<? extends O> getTargets(I original) {
		List<O> r = impl.get(original);
		if (r == null)
			throw new IllegalStateException("Can't find: " + original);
		return r;
	}
	
	public O getSingleTarget(I original) {
		List<? extends O> r = getTargets(original);
		if (r.size() != 1)
			throw new IllegalStateException();
		return r.get(0);
	}

	public List<O> getTargets(List<? extends I> originals) {
		List<O> result = new ArrayList<O>();
		for (I i : originals) {
			result.addAll(getTargets(i));
		}
		
		return result;
	}
	
}