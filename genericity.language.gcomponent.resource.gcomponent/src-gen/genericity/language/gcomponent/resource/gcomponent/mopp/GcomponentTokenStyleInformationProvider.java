/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

public class GcomponentTokenStyleInformationProvider {
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("transformation".equals(tokenName)) {
			return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("component".equals(tokenName)) {
			return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("source".equals(tokenName)) {
			return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("target".equals(tokenName)) {
			return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("concept".equals(tokenName)) {
			return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("tags".equals(tokenName)) {
			return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		return null;
	}
	
}
