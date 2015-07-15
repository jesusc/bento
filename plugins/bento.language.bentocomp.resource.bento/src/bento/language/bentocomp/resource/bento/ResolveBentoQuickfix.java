package bento.language.bentocomp.resource.bento;

import org.eclipse.emf.ecore.EObject;

import bento.language.bentocomp.resource.bento.mopp.BentoQuickFix;
import bento.repository.rest.RemoteRepositoryAccess;

public class ResolveBentoQuickfix extends BentoQuickFix {

	private String specifiedURI;

	public ResolveBentoQuickfix(String displayString, String imageKey, EObject contextObject, String specifiedURI) {
		super(displayString, imageKey, contextObject);
		this.specifiedURI = specifiedURI;
	}

	@Override
	public String apply(String currentText) {
		String url = bento.repository.ui.Activator.getDefaultRepo();
		String name = specifiedURI.replaceFirst("bento:/", "") ; // Only works with bento uris, but specifiedURI may be anything... 
		
		if ( ! RemoteRepositoryAccess.downloadAndInstall(url, name) ) {
			System.out.println("Could not resolve!");
			System.out.println("Applying changes! " + specifiedURI + " " + this.getContextObjects());
		} else {
			getResource().setModified(true);
		}
		
		return null;
	}
	
	@Override
	public void applyChanges() {
		// do nothing
	}
}
