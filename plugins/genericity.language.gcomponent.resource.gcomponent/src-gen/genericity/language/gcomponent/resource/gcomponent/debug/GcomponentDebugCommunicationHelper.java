/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.debug;

public class GcomponentDebugCommunicationHelper {
	
	public void sendEvent(genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage message, java.io.PrintStream stream) {
		synchronized (stream) {
			stream.println(message.serialize());
		}
	}
	
	/**
	 * Sends a message using the given stream and waits for an answer.
	 * 
	 * @param messageType the type of message to send
	 * @param stream the stream to send the message to
	 * @param reader the reader to obtain the answer from
	 * @param parameters additional parameter to send
	 * 
	 * @return the answer that is received
	 */
	public genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage sendAndReceive(genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage message, java.io.PrintStream stream, java.io.BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage response = receive(reader);
			return response;
		}
	}
	
	/**
	 * Receives a message from the given reader. This method block until a message has
	 * arrived.
	 * 
	 * @param reader the read to obtain the message from
	 * 
	 * @return the received message
	 */
	public genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage receive(java.io.BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage receivedMessage = genericity.language.gcomponent.resource.gcomponent.debug.GcomponentDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (java.io.IOException e) {
			return null;
		}
	}
	
}
