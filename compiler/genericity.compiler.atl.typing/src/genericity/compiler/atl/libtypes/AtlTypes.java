package genericity.compiler.atl.libtypes;

public class AtlTypes {
	private static final StringTypeDef string_instance = new StringTypeDef();
	private static final FloatTypeDef float_instance = new FloatTypeDef();
	private static IntegerTypeDef integer_instance = new IntegerTypeDef();
	
	static {
		string_instance.init();
		float_instance.init();
		integer_instance.init();
	}
	
	public static StringTypeDef string() { return string_instance; }
	public static IntegerTypeDef integer() { return integer_instance; }
	public static FloatTypeDef float_() { return float_instance; }
	
}
