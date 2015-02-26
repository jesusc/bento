/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class BentoDebugMessage {
	
	private static final char DELIMITER = ':';
	private bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes messageType;
	private String[] arguments;
	
	public BentoDebugMessage(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public BentoDebugMessage(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes getMessageType() {
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
		return bento.language.bentocomp.resource.bento.util.BentoStringUtil.encode(DELIMITER, parts);
	}
	
	public static BentoDebugMessage deserialize(String response) {
		java.util.List<String> parts = bento.language.bentocomp.resource.bento.util.BentoStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes type = bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes.valueOf(messageType);
		BentoDebugMessage message = new BentoDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + bento.language.bentocomp.resource.bento.util.BentoStringUtil.explode(arguments, ", ") + "]";
	}
	
}
