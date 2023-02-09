package immutable;

import bean.A;

public class Ex03StringCompare {
	public static void main(String[] args) {
		// NOTE: 100% using string literal in string immutable
		// == --> so sanh o STACK (nguyen thuy(gia tri), doi tuong(dia chi))
		// equals: ham mac dinh o class object
		//			--> so sanh dia chi dung toan tu ==
		
		A a1 = new A(12);
		A a2 = new A(12);
		System.out.println("a1 == a2 --> " + (a1 ==a2) );
		System.out.println("a1.equals(a2) --> " + (a1.equals(a2)));
		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "cheers from home";
		System.out.println("s1 == s2" + (s1 == s2));
		System.out.println("s1.equals(s2) --> " + (s1.equals(s2)));
		
		
		String o1 = new String("hello");
		String o2 = new String("hello");
		
		System.out.println("o1 == o2" + (o1 == o2));
		System.out.println("o1.equals(o2) --> " + (o1.equals(o2)));
		
		// so sanh > < --> compareTo
		// String implements Compable<String>
		// String override compareTo tu interface Comparable
		System.out.println("s3.compareTo(o1)" + (s3.compareTo(o1)));
		
	}
	

}
