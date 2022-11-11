package control;

import java.util.Scanner;

public class Ex01IfElseDemo {

	public static void main(String[] args) {
		// 1. Nhập vào 1 số nguyên(n) --> kiểm tra 1 số
		// đó là chẵn hay lẽ
		// + nếu chẵn ==> 'this is even number'
		// + nếu lẻ ==> 'this is odd number'
		Scanner ip = new Scanner(System.in);

//		System.out.print("Nhap n = ");
//		int n = ip.nextInt();
//		
//		if(n%2==0)
//		{
//			System.out.println("this is even number");
//		}
//		else
//		{
//			System.out.println("this is odd number");
//		}

		// tìm học lực học viên: getLevel(float point): String
		// BAD(<5), MEDIUM[5,6.4], PRETTY_GOOD[6.5,7.9], GOOD(>=8)
		System.out.print("Nhap diem cua 1 hoc vien: ");
		float point = ip.nextFloat();
		String s = "";
		if (point >= 0 && point < 5f) {
			s = "BAD";
		} else if (point <= 6.4f) {
			s = "MEDIUM";
		} else if (point <= 7.9f) {
			s = "PRETTY_GOOD";
		} else if (point <= 10f) {
			s = "GOOD";
		} else {
			s = "Dữ liệu không hợp lệ!!!";
		}
		System.out.println("Hoc vien co diem loai: " + s);

		System.out.println("Hoc vien co diem loai: " + getLevel(point));
	}
	// số thực -> thêm f vào phía sau

	// nhớ cách code, dấu cách,xuống dòng...
	// trong hàm, khi gặp return thì kết thúc hàm và trả về luôn, nên ta không cần
	// dùng else

	private static String getLevel(float point) {
		if (point >= 0 && point < 5f) {
			return "BAD";
		}
		if (point <= 6.4f) {
			return "MEDIUM";
		}
		if (point <= 7.9f) {
			return "PRETTY_GOOD";
		}
		if (point <= 10f) {
			return "GOOD";
		}
		return "Dữ liệu không hợp lệ!!!";
	}
}
