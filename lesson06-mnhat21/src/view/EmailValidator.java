package view;

import java.util.regex.Pattern;

public class EmailValidator {

	private String email;

	public EmailValidator(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private int getIndex() {
		int n = 0;
		for (int i = 0; i < this.email.length(); i++) {
			if (this.email.charAt(i) == '@') {
				n = i;
				break;
			}
		}
		return n;
	}

	Pattern prefValidable = Pattern.compile("[^a-z0-9\\-\\_\\.]");

	void validate() {
		String prefix = this.email.substring(0, getIndex());
		if (prefValidable.matcher(prefix).find()) {
			throw new EmailException("Allowed characters: letters(a-z), numbers, underscore" + ", periods and dashes");
		}
		if (prefix.charAt(0) == '-' || prefix.charAt(0) == '.' || prefix.charAt(0) == '_') {
			throw new EmailException(
					"An underscore, periods and dashes must be followed by one or more letter of number");
		}
		if (prefix.charAt(prefix.length() - 1) == '-' || prefix.charAt(prefix.length() - 1) == '.'
				|| prefix.charAt(prefix.length() - 1) == '_') {
			throw new EmailException(
					"An underscore, periods and dashes must be followed by one or more letter of number");
		}
		for (int i = 0; i < prefix.length(); i++) {
			if (prefix.charAt(i) == '-' || prefix.charAt(i) == '.' || prefix.charAt(i) == '_') {
				Character c = prefix.charAt(i - 1);
				if ((c <= 'a' || c >= 'z') && (c <= '0' || c >= '9')) {
					throw new EmailException(
							"An underscore, periods and dashes must be followed by one or more letter of number");
				}
			}
		}
	}
}
