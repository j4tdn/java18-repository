package exam;

import java.util.regex.Pattern;

public class PasswordValidator {
	
	private String email;
	private String password;

	public PasswordValidator(String password, String email) {
		// TODO Auto-generated constructor stub
		this.password = password;
		this.email = email;
	}
	
	Pattern upperCase = Pattern.compile("[A-Z]");
	Pattern number = Pattern.compile("[0-9]");
	Pattern specialChar = Pattern.compile("[^a-z0-9A-Z]");
	
	void validate() {
		if(password.length() < 8) {
			throw new PasswordException("Password must have MIN 8 characters");
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
		if(sameAsEmail(email, password)) {
			throw new PasswordException("Password must not same as email at least 3 character");
		}
	}
	
	private static boolean sameAsEmail(String email, String password) {
		int count = 0;
		for(int i = 0; i < email.length(); i++) {
			for(int j = 0; j < password.length(); j++) {
				if(email.charAt(i) == password.charAt(j)) {
					count++;
					break;
				}
			}
		}
		return count >= 3;
	}
	
	
}