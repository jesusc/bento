/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.mopp;

/**
 * A basic implementation of the
 * org.emftext.language.gbind.resource.gbind.IGbindElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class GbindElementMapping<ReferenceType> implements org.emftext.language.gbind.resource.gbind.IGbindElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public GbindElementMapping(String identifier, ReferenceType target, String warning) {
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
