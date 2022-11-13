package demorework;

import java.util.Scanner;

public class Ex01DemoIo {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("nhập fisrtname : ");
		String firstname = a.nextLine();

		System.out.println("nhập lastname : ");
		String lastname = a.nextLine();

		System.out.println("nhập age : ");
		int age = Integer.parseInt(a.nextLine());

		System.out.println("nhập gmail : ");
		String gmail = a.nextLine();

		System.out.println(firstname + " " + lastname);
		System.out.println(age);
		System.out.println(gmail);

	}
}
