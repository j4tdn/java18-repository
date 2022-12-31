package view;

import java.util.regex.Pattern;

public class PasswordValidator {
	
	private String password;
	
	public PasswordValidator(String password) {
		// TODO Auto-generated constructor stub
		this.password = password;
	}
	
	Pattern upperCase = Pattern.compile("[A-Z]");
	Pattern number = Pattern.compile("[0-9]");
	Pattern specialChar = Pattern.compile("[^a-z0-9A-Z]");
	
	void validate() {
		if(password.length() < 8) {
			throw new PasswordException("Password must have MIN 8 characters");
		}
		if(password.length() > 256) {
			throw new PasswordException("Password must have MAX 256 characters");
		}
		if(!upperCase.matcher(password).find()) {
			throw new PasswordException("Password must have at least 1 uppercase character");
		}
		if(!number.matcher(password).find()) {
			throw new PasswordException("Password must have at least 1 number");
		}
		if(!specialChar.matcher(password).find()) {
			throw new PasswordException("Password must have at least 1 special character");
		}
	}
	
	
}
