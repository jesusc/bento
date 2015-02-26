/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

public class BentoSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private bento.language.bentocomp.resource.bento.grammar.BentoSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private BentoSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public BentoSyntaxElementDecorator(bento.language.bentocomp.resource.bento.grammar.BentoSyntaxElement decoratedElement, BentoSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public bento.language.bentocomp.resource.bento.grammar.BentoSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public BentoSyntaxElementDecorator[] getChildDecorators() {
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
