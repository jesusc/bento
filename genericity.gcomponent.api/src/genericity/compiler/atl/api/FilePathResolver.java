package genericity.compiler.atl.api;

public interface FilePathResolver {

	public String getInitialPath();
	public String resolve(String file);
	public String createFileNameFromInitial(String relativePath);

}
