package io;

import java.util.Scanner;

// jar: java runtime --> standalone running
// java.base(project) -> jar
//     ..java.until(package)
//		 ..Scanner(class)

public class Ex01BasicIoDemo {

	public static void main(String[] args) {
		// Enter firstName,lastName,email;
		Scanner ip = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String firstName = ip.nextLine();

		System.out.print("Enter last name: ");
		String lastName = ip.nextLine();

		// khi nhập 1 kiểu khác String trước 1 kiểu string
		// thì kí tự enter cuối cùng sẽ tự động được gán cho
		// biến phía dưới => gọi là trôi lệnh

		System.out.print("Enter age: ");
		// int age = ip.nextInt();
		// ip.nextLine();
		int age = Integer.parseInt(ip.nextLine());

		System.out.print("Enter email: ");
		String email = ip.nextLine();

		System.out.println("Infor ==> " + firstName + " " + lastName + ", " + email);
		System.out.println("Age: " + age);

		// nextLine()[String] -> input nothing --enter --value="" (rỗng)
		// !nextLine() -> require input value => finish statement
	}

}
