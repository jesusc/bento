package genericity.gcomponent.api;

import genericity.language.gcomponent.core.TransformationComponent;

import java.io.File;

/**
 * This class is in charge of perform the installation of 
 * a component in a local filesystem.
 * 
 * @author jesus
 *
 */
public class LocalInstaller {
	private File gcomponentDir;

	public LocalInstaller(File gcomponentDir) {
		this.gcomponentDir = gcomponentDir;
	}
	
	public LocalInstaller() {
		this(FileUtil.defaultInstallationDirectory());
	}
	
	public void install(TransformationComponent c) {
		
	}
}
