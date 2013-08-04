/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class GcomponentDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugTarget debugTarget;
	
	private genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugCommunicationHelper communicationHelper = new genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugCommunicationHelper();
	
	public GcomponentDebugProxy(genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes.EXIT);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage getStack() {
		return sendCommandAndRead(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage message = new genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage message = new genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage response = sendCommandAndRead(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage response = sendCommandAndRead(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugVariable[] variables  = new genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = genericity.language.gcomponent.resource.gcomponent.util.GcomponentStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugVariable variable = new genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes command, String... parameters) {
		genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage message = new genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage sendCommandAndRead(genericity.language.gcomponent.resource.gcomponent.debug.EGcomponentDebugMessageTypes command, String... parameters) {
		genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage message = new genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
