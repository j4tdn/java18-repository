package demo;

public class Ex01Demo {
	public static void main(String[] args) {
		String s = "  hello from Da Nang  ";
		System.out.println("Chiều dài: " + s.length());
		String s1 = " 2023   ";
		s = s + s1; // s = s.concat(s1)
		System.out.println("Nối chuỗi: " + s);
		
		// lấy một ký tự tại vị trí index(3)
		s.charAt(3);
		
		// Đếm số lượng ký tự 'o' trong chuỗi s
		int count = 0;
		for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i) == 'o') {
				count++;
			}
		}
		System.out.println("đếm số lượng: " + count);
		
		// Duyệt từng phần tử trong chuỗi (biết rằng các phần tử cách nhau 1 khoảng trắng)
		System.out.println("||" + s.trim() + "||"); // <java11
		System.out.println("||" + s.strip() + "||"); // >java11
		s = s.strip();
		count = 0;
		for(int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if(temp != ' ') {
				if(s.charAt(i+1) != ' ') {
					count++;
				}
			}
		}
		System.out.println("Số lượng từ: " + count);
		
		
		String[] words = new String[s.length()];
		count = 0;
		StringBuilder sb = new StringBuilder();
		char prev = ' ';
		for(int i = 0; i< s.length(); i++) {
			char element = s.charAt(i);
			if(element != ' ') {
				sb.append(element);
			} else {
				words[count++] = sb.toString();
				sb.delete(0, sb.length());
			}
			prev = element;
		}
		System.out.println("");
	
		// split
		System.out.println("s --> " + s);
		s = s.strip();
		// s = s.replaceAll("\\s+", " ");
		System.out.println("s replace all --> " + s);
	
		words = s.split("\\s+");
		
		
		s.indexOf('a');
		
		System.out.println("Vị trí bắt đầu của 'a': " + s.indexOf('a'));
		System.out.println("Vị trí kết thúc của 'a': " + s.lastIndexOf('a'));
	
	}
}
