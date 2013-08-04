/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind;

/**
 * A simple interface to access information about matching brackets.
 */
public interface IGbindBracketPair {
	
	/**
	 * Returns the opening bracket.
	 */
	public String getOpeningBracket();
	
	/**
	 * Returns the closing bracket.
	 */
	public String getClosingBracket();
	
	/**
	 * Returns whether other bracket pairs shall be automatically closed, when used
	 * inside of this bracket pair.
	 */
	public boolean isClosingEnabledInside();
}
