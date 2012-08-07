package atl.parser;

import java.io.File;

public class Util {
	public static String normalizePath(String path) {
		File f = new File(path);
		if ( f.isAbsolute() && ! f.getAbsolutePath().startsWith("/") ) {
			return '/' + path;
		}
		return path;
	}
}
