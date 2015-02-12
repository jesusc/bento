package bento.componetization.ui;

import java.util.List;

import anatlyzer.atl.errors.Problem;

public class TypingInfo {
	private List<Problem> messages;

	public TypingInfo(List<Problem> messages) {
		this.messages = messages;
	}

	public List<Problem> getMessages() {
		return messages;
	}

}
