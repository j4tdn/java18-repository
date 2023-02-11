package immutable;

public class Ex01StringImmutable_Literal_ObjectDemo {
	public static void main(String[] args) {
		// immutable object --> bất biến (không thể thay đổi giá trị (ở HEAP) của biến)
		// Gía trị của biến string literal sẽ được lưu trữ
		// ở HEAP --> có 1 vùng nhớ tên là Constant pool
		// ô nhớ ở STACK không thể thay đổi được khi có final 
		
		// Mục đích: 
		// + Nhờ String literal mà: -> Tiết kiệm vùng nhớ tạo ra ở HEAP --> string, Double, Interger
		// + Nhờ immutable -> Đảm bảo giá trị của immutable object không thể thay đổi khi
		// truyền qua method, class để xử lý
		
		
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Welcome";
		String s4 = "Welcome";
		String s5 = "hello";
		
		s3 = "hello";
		
		hashAndValue("s1", s1);
		hashAndValue("s2", s2);
		hashAndValue("s3", s3);
		hashAndValue("s4", s4);
		hashAndValue("s5", s5);
		 System.out.println("==========================");
		// string object: giá trị của đối tượng thuộc string object
		// sẽ được khởi tạo thông qua từ khóa new
		// dù giá trị ở HEAP có trùng/ khác nhau --> đều luôn tạo ô nhớ mới
		String o1 = new String ("Xinchao");
		String o2 = new String ("Xinchao");
		String o3 = new String ("Tambiet");
		String o4 = new String ("Tambiet");
		
		hashAndValue("o1", o1);
		hashAndValue("o2", o2);
		hashAndValue("o3", o3);
		hashAndValue("o4", o4);
		
	}
	private static final void hashAndValue(String varName,String var) {
		System.out.println(varName + ": " + System.identityHashCode(var) + "-->" + var );
	}
	
}
