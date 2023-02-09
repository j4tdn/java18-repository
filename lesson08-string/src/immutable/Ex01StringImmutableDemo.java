package immutable;

public class Ex01StringImmutableDemo {
	public static void main(String[] args) {
		// immutable object (bất biến)
		// Giá trị được lưu trữ ở HEAP -> constant pool
		
		// String literal --> tiết kiệm vùng nhớ ở HEAP
		
		// Immutable --> Đảm bảo giá trị của immutable Object không thể thay đổi khi
		// truyền qua method / class để xử lí
		String s1 = "welcome";
		String s2 = "welcome";
		String s3 = "welcome";
		String s4 = "welcome";
		String s5 = "hello";
		
		s3 = "regard";
		
		hashAndValue("s1", s1);
		hashAndValue("s2", s2);
		hashAndValue("s3", s3);
		hashAndValue("s4", s4);
		
		// string object : giá trị của đối tượng string object
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
	
	private static void hashAndValue(String varName, String var) {
		System.out.println(varName + " : " + System.identityHashCode(var) + " ---> " + var);
	}
}
