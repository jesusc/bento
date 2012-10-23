/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class GbindDebugMessage {
	
	private static final char DELIMITER = ':';
	private genericity.language.gbind.debug.EGbindDebugMessageTypes messageType;
	private String[] arguments;
	
	public GbindDebugMessage(genericity.language.gbind.debug.EGbindDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public GbindDebugMessage(genericity.language.gbind.debug.EGbindDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public genericity.language.gbind.debug.EGbindDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return genericity.language.gbind.util.GbindStringUtil.encode(DELIMITER, parts);
	}
	
	public static GbindDebugMessage deserialize(String response) {
		java.util.List<String> parts = genericity.language.gbind.util.GbindStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		genericity.language.gbind.debug.EGbindDebugMessageTypes type = genericity.language.gbind.debug.EGbindDebugMessageTypes.valueOf(messageType);
		GbindDebugMessage message = new GbindDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(genericity.language.gbind.debug.EGbindDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + genericity.language.gbind.util.GbindStringUtil.explode(arguments, ", ") + "]";
	}
	
}
