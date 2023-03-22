package immutable;

public class Ex01String_Immutable_Literal_Demo_Object_Demo {
	public static void main(String[] args) {
		// immutable object (bất biến)
		// Giá trị của biến string literal
		// được lưu trữ ở HEAP (String Constant pool)
		
		// + string constant pool --> Tiết kiệm vùng nhớ
		// được tạo ra ở HEAP --> String, Integer, Double,...
		// + immutable --> Đảm bảo giá trị của immutable object 
		// không thể thay đổi khi mình truyền qua method, class để xử lý
		
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "Welcome";
		String s4 = "Welcome";
		String s5 = "Hello";
		
		s3 = "Hello";
		
		hashAndValue("s1",s1);
		hashAndValue("s2",s2);	
		hashAndValue("s3",s3);
		hashAndValue("s4",s4);
		hashAndValue("s5",s5);
		
		String o1 = new String("Xin chao");
		String o2 = new String("Xin chao");
		String o3 = new String("Tam biet");
		String o4 = new String("Tam biet");
		
		hashAndValue("o1: ", o1);
		hashAndValue("o2: ", o2);
		hashAndValue("o3: ", o3);
		hashAndValue("o4: ", o4);
		
		
		//String object: giá trị của đối tượng thuộc string object
		//sẽ được khởi tạo thông qua từ khoá new
		//dù giá trị ở heap có trùng hay khác nhau --> luôn tạo ra ô nhớ mới
		
		
	}
	private static final void hashAndValue(String varName, String var) {
		System.out.println(varName + ": " + System.identityHashCode(var) + "--> " + var);
	}
}
