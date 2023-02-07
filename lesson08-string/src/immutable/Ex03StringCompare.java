package immutable;

import bean.A;

public class Ex03StringCompare {
	public static void main(String[] args) {
		// NOTE: 100% using string literal in string immutable
		// == --> so sánh ở STACK (nguyên thủy (giá trị), đối tượng (địa chỉ)
		// equals: Hàm mặc định ở class Object
		//       : --> so sánh địa chi chỉ dùng toán tử ==
		//       : so sasnh bieens KDL đối tượng
		
		// A extends Object
		// + ko override --> sử dụng hàm equals mặc định --> so sánh địa chỉ 
		
		// String extends Object
		// + override hàm equals --> so sánh 
		
		A a1 = new A(12);
		A a2 = new A(12);
		System.out.println("a1.equals(a2) --> " + (a1.equals(a2)));

		String s1 = "hello";
		String s2 = "hello";
		String s3 = "cheers from home";
		System.out.println("s1==s2 --> " + (s1 == s2));
		System.out.println("s1.equals(s2) --> " + (s1.equals(s2)));

		String o1 = new String("welcome");
		String o2 = new String("welcome");
		System.out.println("o1==o2 --> " + (o1 == o2));
		System.out.println("o1.equals(o2) --> " + (o1.equals(o2)));
		
		// So sánh > < --> compareTo
		// String implements Comparable<String>
		// String override compareTo từ interface Comparable 
		System.out.println("s3.compareTo(o1) --> " + s3.compareTo(o1));

	}

}
