package exercises;

import java.util.Arrays;

/**
 * 1. Tính chiều dài của chuỗi s
 * 2. Nối chuỗi s1 vào chuỗi s 
 * 3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
 * 4. Đếm số lượng ký tự 'o' trong chuỗi s 
 * 5. Duyệt/in ra/đếm số lượng các phần tử trong chuỗi 
	 (biết rằng các phần tử cách nhau bởi khoảng trắng)
 * 6. Tìm vị trí xuất hiện đầu tiên, cuối cùng của ký tự(a) trong chuỗi s
 */

public class Ex01Demo {
	public static void main(String[] args) {
		String s = "hello   from   Da   Nang";
		
		// 1. Tính chiều dài của chuỗi s
		System.out.println("length: " + s.length());
		
		// 2. Nối chuỗi s1 vào chuỗi s 
		String s1 = " 2023";
		s = s.concat(s1); // s = s + s1;
		System.out.println("s concat: " + s);
		
		// 3. Lấy một ký tự tại vị trí index(3) trong chuỗi s
		System.out.println("Value at index 3 --> " + s.charAt(3));
		
		// char -> byte
		char letter = 'A';
		System.out.println("letter: " + (byte)letter); // A = 65
		
		// 4. Đếm số lượng ký tự 'o' trong chuỗi s
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'o') {
				counter++;
			}
		}
		System.out.println("Đếm số lượng: " + counter);
	
		// 5. Duyệt/in ra/đếm số lượng các phần tử trong chuỗi 
		// (biết rằng các phần tử cách nhau bởi khoảng trắng)
		
		/*
		 * Cách 1:
		 * Cắt khoảng trắng đầu và cuối => chắc chắn chuỗi sẽ bắt đầu bằng ký tự
		 * "hello   from   Da   Nang  2023";
		 * counter = 1 (xét khoảng trắng)
		 * Nếu là space 
		 * + Nếu phần tử tiếp theo là ký tự thì counter++
		 * + Nếu phần tử tiếp theo vẫn là space thì ko thay đổi counter
		 * 
		 * --> Problem: 
		 * + sử dụng charAt(i+1) có thể bị tràn mảng 
		 * => nên if i < length - 1 thì mới được tăng i 
		 * + Kết quả in ra số lượng, mà ko biết cụ thể là những từ nào 
		 */
		counter = 1;
		s = s.strip();

		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (temp == ' ') {
				if (s.charAt(i + 1) != ' ') {
					counter++;
				}
			}
		}
		System.out.println("Số lượng từ: " + counter);
		
		/*
		 * Cách 2: 
		 * Tạo mảng để lưu words (ko lưu space)
		 * counter --> đếm số lượng words
		 * StringBuilder --> append --> cộng chuỗi (từng character)
		 * Duyệt từng phần tử 
		 * + Nếu ko phải space --> append vào (lưu bằng biến sb)
		 * + Nếu là space --> word (vì các words cách nhau bởi space)
		 * Reset sb và tiếp tục duyệt lần lượt 
		 * 
		 * --> Problem 1:
		 * Nếu có nhiều space ở giữa các chữ --> sẽ lưu giá trị null vào mảng (VD: hello, , , from)
		 * --> Solution: tạo biến (prev) để lưu lại mỗi lần i đi qua)
		 * Nếu trước đó là space (tức prev == ' ') thì bỏ qua (continue)
		 * Duyệt đến khi prev = element (s.charAt(i)) 
		 * 
		 * --> Problem 2: Các phần tử words in ra sẽ có nhiều null vì độ dài đang là s.length()
		 * (VD: hello, from, Da, Nang, null, null, null,...)
		 * --> Solution: copy những phần tử khác null đưa ra mảng mới
		 */
		String[] words = new String[s.length()];
		counter = 0;
		StringBuilder sb = new StringBuilder(); // vì cộng chuỗi nên dùng
		char prev = ' '; // biến lưu lại mỗi lần duyệt i
		for (int i = 0; i < s.length(); i++) {
			char element = s.charAt(i);
			if (element != ' ') {
				sb.append(element); // cộng chuỗi
			} else { // vào đây thì chắc chắn là word, vì các words cách nhau bởi space
				if (prev == ' ') { // phía trước là space mà ko phải word thì bỏ qua
					continue;
				}
				words[counter++] = sb.toString();
				sb.delete(0, sb.length()); // reset sb
			}
			prev = element;
		}
		words = Arrays.copyOfRange(words, 0, counter);
		System.out.println("In mảng: " + Arrays.toString(words));
		
		/*
		 * Cách 3:
		 * split --> cắt chuỗi theo pattern nào đó (VD cắt chuỗi theo space)
		 * replace ≠ replaceAll
		 * + replace chuỗi gì đó thành chuỗi gì đó (chỉ có 1 công thức, vd replace 3 spaces thành 5 spaces)
		 * + replaceAll có thể truyền regex gì đó (có thể truyền bộ cú pháp, vd thay thế 1 or n space thành 1 space)
		 * 
		 */
		s = s.strip();
		// s = s.replaceAll("\\s+", " ");
		words = s.split("\\s+");
		
		// System.out.println("s replaceAll --> " + s);
		System.out.println("words (split) --> " + Arrays.toString(words));
		
		// 6. Tìm vị trí xuất hiện đầu tiên, cuối cùng của ký tự(a) trong chuỗi s
		// public int indexOf(int ch) => yêu cầu truyền vào int, nhưng vẫn truyền char ('a') được
		// Lý do: vì int chứa luôn cha(giống như trong OOP, có biến cha thì vẫn truyền con được)
		
		System.out.println("Vị trí bắt đầu của 'a' --> " + s.indexOf('a'));
		System.out.println("Vị trí kết thúc của 'a' --> " + s.lastIndexOf('a'));

	}

}
