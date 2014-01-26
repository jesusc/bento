package bento.componetization.ui;

import genericity.typecheck.atl.TypeCheckLauncher.ErrorMessage;

import java.util.List;

public class TypingInfo {
	private List<ErrorMessage> messages;

	public TypingInfo(List<ErrorMessage> messages) {
		this.messages = messages;
	}

	public List<ErrorMessage> getMessages() {
		return messages;
	}

}
