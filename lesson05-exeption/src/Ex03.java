import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 
 * Valid email address format
 * - the prefix appears to the left of the @ symbol
 * - the domain appeasrs to the right of the @ symbol
 * - Allowed character: letters, numbers, underscores, periods,and dashes
 * - An underscore, period, dashes must be followed by one or more letters or number
 * 
 * @author minht
 *
 */

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userEmail = null;
		do {
			System.out.println("Enter your email: ");
			userEmail = sc.nextLine();
			try {
				if (isValidEmail(userEmail)) {
					System.out.println("Your email --> " + userEmail);
					break; 
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}while(true);
	}
	private static boolean isValidEmail(String email) throws Exception {
		if (!email.contains("@")) {
			throw new Exception("Invalid given email");
		}
		String domain = email.substring(email.indexOf('@') + 1);
		String prefix = email.substring(0, email.indexOf('@'));
		
		
		if (domain.length() == 0) {
			throw new Exception("Domain must not be null");
		}
		if (prefix.length() == 0) {
			throw new Exception("Prefix must not be null");
		}
		if (!containAllowedCharacter(prefix)) {
			throw new Exception("Prefix contain unallowed character");
		}
		return true;
	}
	private static boolean containAllowedCharacter(String str) {
			
		for (char element: str.toCharArray()) {
			if (Character.isLetterOrDigit(element)) {
				continue;
			}
			if (!Pattern.matches(".*[.-/].*", Character.toString(element))) {
				return false;
			}
		}
		
		return true;
	}
}
