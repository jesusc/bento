package bento.sirius.tests.model;

import java.util.ArrayList;
import java.util.List;

public class PaletteSpec {

	private String name;
	private boolean isStrict;
	private List<PaletteItem> items = new ArrayList<>();
	
	public boolean isStrict() {
		return isStrict;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setStrict(boolean isStrict) {
		this.isStrict = isStrict;
	}
	
	public void setItems(List<PaletteItem> items) {
		this.items = items;
	}
	
	public List<PaletteItem> getItems() {
		return items;
	}

	
}
