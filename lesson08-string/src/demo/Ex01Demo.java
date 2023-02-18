package demo;

import java.util.Arrays;

public class Ex01Demo {
	public static void main(String[] args) {
		String s = new String("  hello   holla  from  Da    Nang   ");
		System.out.println(s);

		// Tìm vị trí(chỉ số) xuất hiện đầu tiên, cuối cùng của kí tự 'a' trong chuỗi s
		System.out.println("Vị trí bắt đầu của 'a' -> " + s.indexOf('a'));
		System.out.println("Vị trí bắt đầu của 'a' + " + s.lastIndexOf('a'));

		// Tính chiều dài của chuỗi s
		System.out.println("Chiều dài: " + s.length());

		// Nối chuỗi s1 vào chuỗi s
		String s1 = " 2023";
		s = s + s1; // s = s.concat(s1)
		System.out.println("Nối chuỗi: " + s);

		// Lấy một ký tự tại vị trí index(3) trong chuỗi s
		s.charAt(3);

		// Đếm số lượng ký tự 'o' trong chuỗi s
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'o') {
				counter++;
			}
		}
		System.out.println("Đếm số lượng: " + counter);

		// Duyệt /in ra/ đếm số lượng các phần tử trong chuỗi(biết rằng các phần tử
		// cách nhau bởi khoảng trắng) --> vng
		s = s.strip();
		System.out.println("s --> " + "||" + s + "||");
//		s = s.replaceAll("\\s+", " ");
		System.out.println("s replaceAll --> " + "||" + s + "||");
		String[] words = s.split("\\s+");
		System.out.println(Arrays.toString(words));
	}
}
