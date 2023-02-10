package immutable;

public class Ex01StringLiteralDemo {
	public static void main(String[] args) {
		// immutable object(bất biến - ko thể thay đổi giá trị(ở heap) của biến)
		// immutable --> đảm bảo giá trị của immutable object ko thể thay đổi khi 
		//               truyền qua method, class để xử lý
		
		// string literal giá trị của biến sẽ được 
		// lưu trữ ở HEAP -> constant pool
		
		// string literal --> tiết kiệm vùng nhớ tạo ra ở HEAP --> String, Integer, Double ...
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Welcome";
		String s4 = "Hello";
		
		s3 = "regard";
		
		hash("s1", s1);
		hash("s2", s2);
		hash("s3", s3);
		hash("s4", s4);
		
		// string object: giá trị của đối tượng thuộc string object
		// sẽ được khởi tạo thông qua từ khóa new
		// dù giá trị ở heap có trùng/khác nhau --> đều luôn tạo ô nhớ mới
		
		String o1 = new String("XinChao");
		String o2 = new String("XinChao");
		String o3 = new String("TamBiet");
		String o4 = new String("XinChao");
		
		hash("o1", o1);
		hash("o2", o2);
		hash("o3", o3);
		hash("o4", o4);
	}
	
	private static final void hash(String varName, String var) {
		System.out.println(varName + ": " + System.identityHashCode(var) + " --> " + var);
	}
}
