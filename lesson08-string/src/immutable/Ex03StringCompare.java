package immutable;

import bean.A;

public class Ex03StringCompare {
	public static void main(String[] args) {
		// Note: 100% using string literal in string immutable
		// == --> so sánh ở STACK (nguyên thủy (giá trị), đối tượng (địa chỉ)
		// và ở Stack trỏ đến địa chỉ ở HEAP để so sánh
		// equals: hàm 'mặc định' ở class Object
		//       :   --> so sánh 'địa chỉ' dùng toán tử ==
		//       : chủ dùng so sánh cho  biến KDL đối tượng
		// hai đối tượng equals với nhau khi có giá trị bằng nhau
		// Bằng cách override
		 
		A a1 = new A(12);
		A a2 = new A(12);
		System.out.println("a1 == a2 --> " + (a1 == a2));
		System.out.println("a1.equals(a2) --> " + (a1.equals(a2)));
		
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1.equals(s2) --> " + (s1.equals(s2)));
		
		String o1 = new String("Welcome");
		String o2 = new String("Welcome");
		System.out.println("o1 == o2: " + (o1 == o2));
		System.out.println("o1.equals(o2) --> " + (o1.equals(o2)));
	
		System.out.println("s1.compare(o1) " + (s1.compareTo(o2)));
		// Nếu s1 lớn hơn o1 thì trả về dương
		// Nếu s1 bé hơn o1 thì trả về âm
		// Nếu s1 bằng o1 thì trả về không
	}
	
	 
	
}
