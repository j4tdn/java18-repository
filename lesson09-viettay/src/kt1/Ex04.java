package kt1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 Bài 4: Viết chương trình thực hiện chức năng đăng ký tài khoản
		B1. Nhập tên tài khoản ví dụ byztkhx256
		B2. Nhập mật khẩu admin123
		Yêu cầu mật khẩu như sau:
		1. Độ dài mật khẩu: >= 8
		2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)
		3. Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]
		Sau khi đã thỏa mãn yêu cầu thông báo đăng ký tài khoản thành công
 */

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập tên tài khoản: ");
		String username = ip.nextLine();
		String password = "";
		do {
			try {
				System.out.print("Nhập mật khẩu: ");
				password = ip.nextLine();
				if (isValid(username, password)) {
					System.out.println("Đăng ký tài khoản thành công!!!");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);

	}

	private static boolean isValid(String username, String password) throws Exception {
		if (password.length() < 8) {
			throw new Exception("==> Độ dài mật khẩu phải: >= 8");
		}
		if (!password.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%^&+=]).*$")) {
			throw new Exception("==> Phải có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)");
		}
		if (check(username, password) > 3) {
			throw new Exception("==> Không được trùng quá 3 ký tự với tên tài khoản");
		}
		return true;
	}

	private static int check(String username, String password) {
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();
		for (int i = 0; i < username.length(); i++) {
			set1.add(username.charAt(i));
		}
		for (int i = 0; i < password.length(); i++) {
			if (set1.contains(password.charAt(i))) {
				set2.add(password.charAt(i));
			}
		}
		return set2.size();
	}
}