import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Kiểm tra tính hợp lệ của mật khẩu đăng ký tài khoản.
 * - At least 8 characters
 * - At most 256 characters
 * - At least 1 lowercase alphabetic character
 * - At least 1 uppercase alphabetic character
 * - At least 1 number
 * - At least 1 special character
 */

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = null;
		
		do {
			
			System.out.println("Enter your password below: ");
			password = sc.nextLine();
			try {
				if (isValidPassword(password)) {
					System.out.println("Your password --> " + password);
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		} while (true);
		
	}
	private static boolean isValidPassword(String password) throws Exception{
		
		if (password.length() < 8) {
			throw new Exception("Password must contain at least 8 characters");
		}
		if (password.length() > 256) {
			throw new Exception("Password must contain at most 256 characters");
		}
		if (!Pattern.matches(".*[A-Z].*", password)) {
			throw new Exception("Password must contain at least 1 uppercase character");
		}
		if (!Pattern.matches(".*[a-a].*", password)) {
			throw new Exception("Password must contain at least 1 lowercase character");
		}
		if (!Pattern.matches(".*[0-9].*", password)) {
			throw new Exception("Password must contain at least 1 digit");
		}
		return true;
	}

}
