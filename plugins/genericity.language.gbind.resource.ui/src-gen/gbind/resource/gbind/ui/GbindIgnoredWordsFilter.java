/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package gbind.resource.gbind.ui;

/**
 * The IgnoredWordsFilter can be customized to add additional words that must not
 * be marked as misspelled. To customize this class, set option
 * 'overrideIgnoredWordsFilter' to <code>false</code>.
 */
public class GbindIgnoredWordsFilter {
	
	/**
	 * Checks whether the given word must be ignored even it is misspelled.
	 */
	public boolean ignoreWord(String word) {
		// By default we ignore all keywords that are defined in the syntax
		return genericity.language.gbind.grammar.GbindGrammarInformationProvider.INSTANCE.getKeywords().contains(word);
	}
	
}
