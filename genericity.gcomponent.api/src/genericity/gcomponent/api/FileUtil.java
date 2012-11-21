package genericity.gcomponent.api;

import java.io.File;

/**
 * Facilities to access the filesystem.
 * 
 * @author jesus
 */
public class FileUtil {

	/**
	 * Returns the default installation directory, which is
	 * typically a hidden directory (.gcomponent) in the home directory.
	 * @return
	 */
	public static File defaultInstallationDirectory() {
		return new File( System.getenv().get("HOME") + File.separator + ".gcomponent" );
	}
	

}
