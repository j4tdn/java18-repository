package demo;

import java.util.Arrays;

public class Ex01Demo {
	public static void main(String[] args) {
		// for index-each
		String s = new String("  hello   holla  from  Da    Nang   ");
		// Tính chiều dài của chuỗi s
		System.out.println("Chiều dài: " + s.length());
		
		// Nối chuỗi s1 vào chuỗi s
		String s1 = " 2023";
		s = s + s1; // s = s.concat(s1)
		System.out.println("Nối chuỗi: " + s);
		
		// Lấy một ký tự tại vị trí index(3) trong chuỗi s
		s.charAt(3);
		
		// Đếm số lượng ký tự 'o' trong chuỗi s
		char letter = 'A';
		System.out.println("letter: " + (byte)letter);
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'o') {
				counter++;
			}
		}
		System.out.println("Đếm số lượng: " + counter);
		
		// Duyệt /in ra/ đếm số lượng các phần tử trong chuỗi(biết rằng các phần tử
		// cách nhau bởi khoảng trắng) --> vng
		// |  hello  from  Da    Nang   |
		// |hello  from  Da    Nang|
		// String[] r = new String[s.length]; hello, from, Da, Nang, 2023, null null 
		counter = 1;
		System.out.println("||" + s.trim() + "||"); // < JAVA11
		System.out.println("||" + s.strip() + "||");
		s = s.strip();
		for(int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (temp == ' ') {
				if (s.charAt(i+1) != ' ') {
					counter++;
 				}
			}
		}
		System.out.println("Số   lượng từ: " + counter);
		
		String[] words = new String[s.length()]; // ["Số", null, null, null, null ..args.]
		counter = 0; // 1
		StringBuilder sb = new StringBuilder(); // Số
		char prev = ' ';
		for (int i = 0; i < s.length(); i++) {
			char element = s.charAt(i);
			if (element != ' ') {
				sb.append(element);
			} else {
				if (prev == ' ') {
					continue;
				}
				words[counter++] = sb.toString();
				sb.delete(0, sb.length()); // H1[]
			}
			prev = element;
		}
		words = Arrays.copyOfRange(words, 0, counter);
		System.out.println("In mảng: " + Arrays.toString(words));
		
		// hello   holla  from  Da    Nang    2023
		System.out.println("s --> " + s);
		s = s.strip();
		// s = s.replaceAll("\\s+", " ");
		System.out.println("s replaceAll --> " + s);
		
		words = s.split("\\s+");
		System.out.println("In mảng split --> " + Arrays.toString(words));
		
		// hello   holla  from  Da    Nang    2023
		// Tìm vị trí(chỉ số) xuất hiện đầu tiên, cuối cùng của kí tự 'a' trong chuỗi s
		System.out.println("Vị trí bắt đầu của 'a' + " + s.indexOf('a'));
		System.out.println("Vị trí kết thức của 'a' + " + s.lastIndexOf('a'));
	}
}
