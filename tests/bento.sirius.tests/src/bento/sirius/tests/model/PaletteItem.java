package bento.sirius.tests.model;

public class PaletteItem {

	public static enum ItemKind {
		NODE,
		CONTAINER,
		EDGE
	}
	
	private ItemKind kind;
	private String name;
	
	public void setNode(String name) {
		this.name = name;
		this.kind = ItemKind.NODE;
	}

	public void setContainer(String name) {
		this.name = name;
		this.kind = ItemKind.NODE;
	}

	public void setEdge(String name) {
		this.name = name;
		this.kind = ItemKind.EDGE;
	}

	public ItemKind getKind() {
		return kind;
	}
	
	public String getName() {
		return name;
	}
	
}
