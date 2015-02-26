package bento.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DatabaseIndex {
	private HashSet<ComponentMetadata> allComponents = new HashSet<ComponentMetadata>();
	private HashMap<String, Set<ComponentMetadata>> tags = new HashMap<String, Set<ComponentMetadata>>();
	
	public void add(ComponentMetadata metadata) {
		metadata.getTags().forEach(str -> {
			tags.putIfAbsent(str, new HashSet<ComponentMetadata>());
			tags.get(str).add(metadata);
		});
		
		allComponents.add(metadata);
	}

	public Set<ComponentMetadata> findByTag(String... tagsToLook) {
		HashSet<ComponentMetadata> result = new HashSet<ComponentMetadata>();
		
		for(int i = 0; i < tagsToLook.length; i++) {
			final String tag = tagsToLook[i];
			tags.forEach((str, comps) -> {
				if ( str.equals(tag) ) {
					result.addAll(comps);
				}
			});
		}
		return result;
	}

	public Collection<? extends ComponentMetadata> findByName(String[] names) {
		HashSet<ComponentMetadata> result = new HashSet<ComponentMetadata>();
		for (String string : names) {
			allComponents.forEach(c -> {
				if ( c.getName().contains(string) ) {
					result.add(c);
				}
			});
		}
		
		return result;
	}

	public Set<ComponentMetadata> findAll() {
		return allComponents;
	}
	
}
