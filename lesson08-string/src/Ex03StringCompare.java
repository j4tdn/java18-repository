import bean.A;

public class Ex03StringCompare {
	public static void main(String[] args) {
		// Use 100% string literal in string immutable
		// == --> so sánh ở stack(nguyên thuỷ(giá trị)), dối tượng(địa chỉ)
		// equals: Là hàm mặc định ở class object --> so sánh địa chỉ dùng toán tử  ==
		//			:--> so sánh cho biến KDL đối tượng
		String s1 = "hello";
		String s2 = "hello";
		String s5 = "d";
		System.out.println("s1 == s2 --> "+(s1==s2));
		System.out.println("a1 == s2 --> "+(s1.equals(s2)));
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println("s3==s4 --> "+(s3==s4));
		System.out.println("s3 == s4 --> "+(s3.equals(s4)));
		A a1 = new A(12);
		A a2 = new A(12);
		System.out.println("a1 == a2 --> "+(a1==a2));
		System.out.println("a1 == a2 --> "+(a1.equals(a2)));
		//So sánh >< --> CompareTo
		//String implements Comparable<String>
		//String override compareTo từ interface Comparable
		System.out.println("s1.compare(o1): " + (s5.compareTo(s4)));
	}
}
