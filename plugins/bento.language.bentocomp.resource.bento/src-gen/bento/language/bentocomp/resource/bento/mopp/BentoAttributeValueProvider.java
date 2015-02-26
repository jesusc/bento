/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

/**
 * This class provides sets of values for attributes. It is used by the code
 * completion processor.
 */
public class BentoAttributeValueProvider {
	
	public Object[] getDefaultValues(org.eclipse.emf.ecore.EAttribute attribute) {
		String typeName = attribute.getEType().getName();
		if ("EString".equals(typeName)) {
			return new Object[] {"some" + bento.language.bentocomp.resource.bento.util.BentoStringUtil.capitalize(attribute.getName())};
		}
		if ("EBoolean".equals(typeName)) {
			return new Object[] {Boolean.TRUE, Boolean.FALSE};
		}
		return new Object[] {attribute.getDefaultValue()};
	}
	
}
