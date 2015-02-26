/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

/**
 * A basic implementation of the
 * bento.language.bentocomp.resource.bento.IBentoElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class BentoElementMapping<ReferenceType> implements bento.language.bentocomp.resource.bento.IBentoElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public BentoElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
