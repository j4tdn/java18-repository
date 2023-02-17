package demo;

import java.util.Arrays;

public class Ex01Demo {
	public static void main(String[] args) {
		String s = new String("  hello   holla  from  Da    Nang   ");

		// Duyệt /in ra/ đếm số lượng các phần tử trong chuỗi(biết rằng các phần tử
		// cách nhau bởi khoảng trắng) --> vng
		s = s.strip();
		System.out.println("s --> " + "||" + s + "||");
		s = s.replaceAll("\\s+", " ");
		System.out.println("s replaceAll --> " + "||" + s + "||");
		String[] words  = s.split("\\s+");
		System.out.println(Arrays.toString(words));
		
		// Tìm vị trí(chỉ số) xuất hiện đầu tiên, cuối cùng của kí tự 'a' trong chuỗi s
		System.out.println("Vị trí bắt đầu của 'a' -> " + s.indexOf('a'));
		System.out.println("Vị trí bắt đầu của 'a' + " + s.lastIndexOf('a'));
		
	}
}
