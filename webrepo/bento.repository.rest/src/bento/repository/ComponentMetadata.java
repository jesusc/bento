package bento.repository;

import java.util.List;

public class ComponentMetadata {
	private String name;
	private String version;
	private List<String> tags;
	
	public String getName() {
		return name;
	}
	
	public String getVersion() {
		return version;
	}
	
	public List<String> getTags() {
		return tags;
	}
}
