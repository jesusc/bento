/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class BentoDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private bento.language.bentocomp.resource.bento.debug.BentoDebugTarget debugTarget;
	
	private bento.language.bentocomp.resource.bento.debug.BentoDebugCommunicationHelper communicationHelper = new bento.language.bentocomp.resource.bento.debug.BentoDebugCommunicationHelper();
	
	public BentoDebugProxy(bento.language.bentocomp.resource.bento.debug.BentoDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
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
		sendCommand(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes.EXIT);
	}
	
	public bento.language.bentocomp.resource.bento.debug.BentoDebugMessage getStack() {
		return sendCommandAndRead(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		bento.language.bentocomp.resource.bento.debug.BentoDebugMessage message = new bento.language.bentocomp.resource.bento.debug.BentoDebugMessage(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		bento.language.bentocomp.resource.bento.debug.BentoDebugMessage message = new bento.language.bentocomp.resource.bento.debug.BentoDebugMessage(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		bento.language.bentocomp.resource.bento.debug.BentoDebugMessage response = sendCommandAndRead(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		bento.language.bentocomp.resource.bento.debug.BentoDebugMessage response = sendCommandAndRead(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		bento.language.bentocomp.resource.bento.debug.BentoDebugVariable[] variables  = new bento.language.bentocomp.resource.bento.debug.BentoDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = bento.language.bentocomp.resource.bento.util.BentoStringUtil.convertFromString(varString);
			
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
			org.eclipse.debug.core.model.IValue value = new bento.language.bentocomp.resource.bento.debug.BentoDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			bento.language.bentocomp.resource.bento.debug.BentoDebugVariable variable = new bento.language.bentocomp.resource.bento.debug.BentoDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes command, String... parameters) {
		bento.language.bentocomp.resource.bento.debug.BentoDebugMessage message = new bento.language.bentocomp.resource.bento.debug.BentoDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private bento.language.bentocomp.resource.bento.debug.BentoDebugMessage sendCommandAndRead(bento.language.bentocomp.resource.bento.debug.EBentoDebugMessageTypes command, String... parameters) {
		bento.language.bentocomp.resource.bento.debug.BentoDebugMessage message = new bento.language.bentocomp.resource.bento.debug.BentoDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
