package bento.componetization.ui;

import java.util.List;

import bento.analysis.atl_analysis.Problem;

public class TypingInfo {
	private List<Problem> messages;

	public TypingInfo(List<Problem> messages) {
		this.messages = messages;
	}

	public List<Problem> getMessages() {
		return messages;
	}

}
