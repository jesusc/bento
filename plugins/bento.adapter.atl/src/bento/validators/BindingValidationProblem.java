package bento.validators;


public abstract class BindingValidationProblem {
	private String message;

	public BindingValidationProblem(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
