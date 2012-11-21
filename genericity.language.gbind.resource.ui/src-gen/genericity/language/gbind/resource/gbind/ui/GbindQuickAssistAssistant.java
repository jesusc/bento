/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.resource.gbind.ui;

public class GbindQuickAssistAssistant extends org.eclipse.jface.text.quickassist.QuickAssistAssistant implements org.eclipse.jface.text.quickassist.IQuickAssistAssistant {
	
	public GbindQuickAssistAssistant(genericity.language.gbind.IGbindResourceProvider resourceProvider, genericity.language.gbind.resource.gbind.ui.IGbindAnnotationModelProvider annotationModelProvider) {
		setQuickAssistProcessor(new genericity.language.gbind.resource.gbind.ui.GbindQuickAssistProcessor(resourceProvider, annotationModelProvider));
		setInformationControlCreator(new org.eclipse.jface.text.AbstractReusableInformationControlCreator() {
			public org.eclipse.jface.text.IInformationControl doCreateInformationControl(org.eclipse.swt.widgets.Shell parent) {
				return new org.eclipse.jface.text.DefaultInformationControl(parent, (org.eclipse.jface.text.DefaultInformationControl.IInformationPresenter) null);
			}
		});
	}
	
	public boolean canAssist(org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext invocationContext) {
		return false;
	}
	
	public boolean canFix(org.eclipse.jface.text.source.Annotation annotation) {
		return true;
	}
	
}
