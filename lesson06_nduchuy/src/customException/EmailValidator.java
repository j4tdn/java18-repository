package customException;

import java.util.Objects;

public class EmailValidator {
	private String email;

	public EmailValidator(String email) {
		this.email = email;
	}

	public void validate() {

		// symbol
		if (!email.contains("@")) {
			throw new EmailException("Email address must contain @ symbol");
		}
		// prefix and domain
		String prefix = email.substring(0, email.lastIndexOf("@") + 1);
		String domain = email.substring(email.lastIndexOf("@") + 1);

		Objects.requireNonNull(prefix, "Must have prefix part to create email!");
		Objects.requireNonNull(domain, "Must have domain part to create email");
	}
}
