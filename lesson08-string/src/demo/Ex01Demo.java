package demo;

public class Ex01Demo {
	public static void main(String[] args) {
		String s = "hello  from     da nang";
		System.out.println("Chieu dai: " + s.length());
		String s1 = " 2023";
		s = s + s1; // s = s.concat(s1)
		System.out.println("Noi chuoi: " + s);
		
		s.charAt(3);
		int counter = 0;
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'o') {
				counter++;
			}
		}
		System.out.println("Dem so luong: " + counter);
		counter = 1;
		s = s.strip();
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
				counter++;
			}
		}
		System.out.println(s);
		System.out.println("So tu: " + counter);
		
	}

}
