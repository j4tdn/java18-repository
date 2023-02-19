package immutable;

public class Ex01StringImmutablle_Literal_ObjectDemo {
	public static void main(String[] args) {
		// giá trị của biến string literal sẽ đc lưu ở HEAP

		String s1 = "welcome";
		String s2 = "welcome";
		String s3 = "welcome";
		String s4 = "welcome";
		String s5 = "hello";
		
		s3 = "hello";
		
		hashAndValue("s1", s1);
		hashAndValue("s2", s2);
		hashAndValue("s3", s3);
		hashAndValue("s4", s4);
		hashAndValue("s5", s5);
		
		String o1 = new String ("xin chào");
		String o2 = new String ("xin chào");
		String o3 = new String ("tạm biệt");
		String o4 = new String ("tạm biệt");
		
		hashAndValue("o1", o1);
		hashAndValue("o2", o2);
		hashAndValue("o3", o3);
		hashAndValue("o4", o4);
		
		
		
	}
	private static final void hashAndValue(String varName, String var) {
		System.out.println( varName + ": " + System.identityHashCode(var) + System.identityHashCode(varName)+ "-->" + var);
	}
}
