/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

public class GcomponentSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private GcomponentSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public GcomponentSyntaxElementDecorator(genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement decoratedElement, GcomponentSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public GcomponentSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
