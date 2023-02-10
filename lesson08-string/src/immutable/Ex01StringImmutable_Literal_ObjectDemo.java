package immutable;

public class Ex01StringImmutable_Literal_ObjectDemo {
	public static void main(String[] args) {
		// immutable object( bất biến - không thể thay đổi giá trị ở HEAP của biến )
		// Giá trị của biến string literal sẽ được lưu trữ ở HEAP
		//--> constant pood --> constand pood
		
		// String litteral -->Tiết kiệm vùng nhớ tạo ra ở HEAP --> String, Int, Double ...
		// immutable --> đảm bảo giá trị của immutable object không thể thay đổi khi
		// truyền qua method, class xử lý
		String s1 = "welcom";
		String s2 = "welcom";
		String s3 = "welcom";
		String s4 = "Hello";
		
		//s2 = "Hello";
		hashAndValue("s1", s1);
		hashAndValue("s2", s2);
		hashAndValue("s3", s3);
		hashAndValue("s4", s4);
		
		//String object: giá trị của đối tiuongwj thuộc String object sẽ được khởi tạo thông qua từ khóa new]
		// Dù giá trị ở HEAP trùng hay khác nhau --> luôn tạo ra ô nhớ mới 
		
		String o1 = new String("Xin chao");
		String o2 = new String("Xin chao");
		String o3 = new String("Xin chao");
		String o4 = new String("Xin chao");
		
		hashAndValue("o1", o1);
		hashAndValue("o2", o2);
		hashAndValue("o3", o3);
		hashAndValue("o4", o4);
		
		
		
	}
	
	private static final void hashAndValue(String varName, String var) {
		System.out.println(varName + ":" +  System.identityHashCode(var) + "===> " + var);
	}
}
