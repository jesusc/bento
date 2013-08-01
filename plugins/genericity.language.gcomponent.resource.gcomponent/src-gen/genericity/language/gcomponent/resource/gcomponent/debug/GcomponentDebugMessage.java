/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class GcomponentDebugMessage {
	
	private static final char DELIMITER = ':';
	private genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes messageType;
	private String[] arguments;
	
	public GcomponentDebugMessage(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public GcomponentDebugMessage(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes getMessageType() {
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
		return genericity.language.gcomponent.resource.gcomponent.util.GcomponentStringUtil.encode(DELIMITER, parts);
	}
	
	public static GcomponentDebugMessage deserialize(String response) {
		java.util.List<String> parts = genericity.language.gcomponent.resource.gcomponent.util.GcomponentStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes type = genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes.valueOf(messageType);
		GcomponentDebugMessage message = new GcomponentDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + genericity.language.gcomponent.resource.gcomponent.util.GcomponentStringUtil.explode(arguments, ", ") + "]";
	}
	
}
