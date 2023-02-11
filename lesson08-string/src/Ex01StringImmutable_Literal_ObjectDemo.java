
public class Ex01StringImmutable_Literal_ObjectDemo {
	public static void main(String[] args) {
		//giá trị của biến string literal sẽ được lưu trữ ở vùng nhớ HEAP
		
		//Tiết kiệm vùng nhớ tạo ra ở HEAP -> String, Integer, Double
		//Luu trữ ở HEAP --> constant pool
		//String literal --> Đẩm bảo giá trị của immutable object không thể thay thế --> truyền qua method để xử lý
		String s1 ="welcome";
		String s2 ="welcome";
		String s3 ="welcome";
		String s4 ="welcome";
		String s5 ="hello";
		
		s3 = "regard";
		
		hashAndValue("s1", s1);
		hashAndValue("s2", s2);
		hashAndValue("s3", s3);
		hashAndValue("s4", s4);
		hashAndValue("s5", s5);
		System.out.println("=============================================================================");
		//String object: giá trị của đối tượng thuộc tính string object sẽ được khởi tạo thông qua từ khoá new
		//dù giá trị ở HEAP có trung nhau hay khác nhau --> đều luôn tạo ô nhớ mới
		String o1 = new String("Xin chao");
		String o2 = new String("Xin chao");
		String o3 = new String("Tam biet");
		String o4 = new String("Tam biet");
		
		hashAndValue("o1", o1);
		hashAndValue("o2", o2);
		hashAndValue("o3", o3);
		hashAndValue("o4", o4);
	}
	private static final void hashAndValue(String varName, String var) {
		System.out.println(varName + ": "+ System.identityHashCode(var)+" --> "+var);
	}
}
