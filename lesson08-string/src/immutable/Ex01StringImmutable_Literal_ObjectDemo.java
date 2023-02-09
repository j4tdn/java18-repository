package immutable;

public class Ex01StringImmutable_Literal_ObjectDemo {
	public static void main(String[] args) {
		// immutable object(bất biến - ko thể thay đổi giá trị(ở heap) của biến)
		// immutable --> đảm bảo giá trị của immutable object ko thể thay đổi khi 
		//               truyền qua method, class để xử lý
		
		// string literal giá trị của biến sẽ được 
		// lưu trữ ở HEAP -> constant pool
		
		// string literal --> tiết kiệm vùng nhớ tạo ra ở HEAP --> String, Integer, Double ...
		
		
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
		
		System.out.println("\n=========================\n");
		
		// string object: giá trị của đối tượng thuộc string object
		// sẽ được khởi tạo thông qua từ khóa new
		// dù giá trị ở heap có trùng/khác nhau --> đều luôn tạo ô nhớ mới
		
		String o1 = new String("xin chao");
		String o2 = new String("xin chao");
		String o3 = new String("tam biet");
		String o4 = new String("tam biet");
		
		hashAndValue("o1", o1);
		hashAndValue("o2", o2);
		hashAndValue("o3", o3);
		hashAndValue("o4", o4);
	}
	
	private static final void hashAndValue(String varName, String var) {
		System.out.println(varName + ": " + System.identityHashCode(var) + " --> " + var);
	}
}