/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

public class BentoTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public bento.language.bentocomp.resource.bento.IBentoTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("->".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x40}, null, true, false, false, false);
		}
		if ("transformation".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("component".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("source".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("target".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("variants".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("definition".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("version".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("contributos".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("tags".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("concept".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("model".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("xor".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("execution".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("uses".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("composite".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("binding".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("compose".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("when".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("apply".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("seq".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("atl".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("with".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("java".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
