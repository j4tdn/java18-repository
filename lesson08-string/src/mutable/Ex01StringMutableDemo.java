package mutable;

public class Ex01StringMutableDemo {
	public static void main(String[] args) {
		// Hầu hết các TH đều sử dụng String literal
		
		// Khi thực hiện các thao tác +- chuỗi
		// số lượng ô nhớ trung gian tạo ra quá nhiều
		// => SỬ DỤNG String Mutable
		
		
		// immutable
		// immutable object là object ở HEAP mà <<không thể>>
		// thay đổi được giá trị của biến trên trong
		
		
		// mutable --> StringBuilder, StringBufer
		// mutable object là object ở HEAP mà <<có thể>>
		// thay đổi/set được giá trị của biến trên trong
		
		// StringBuilder & StringBufer --> code theo dạng builder pattern
		// Giống nhau: mutable và các hàm sử dụng bên trong
		// Khác nhau: trường hợp đơn luồng, đa luồng
		
		// StringBuilder/Buffer là wrapper/container chứa thuộc tính
		// có KDL là String
		// charSequence là cha của String
		
		// StringBuilder
		// value (String)
		StringBuilder sb = new StringBuilder("Hello")
				.append(" from")
				.append(" Viet Nam"); 
		System.out.println("sb: " + System.identityHashCode(sb)+ "--> " + sb);
		
		// string dùng toán tử += được
		// StringBuilder += không được 
		
		// append: thêm
		// delete: xóa
		// setCharAt: cập nhật
		sb.append(" 2023");
		System.out.println("sb: " + System.identityHashCode(sb)+ "--> " + sb);
	}
}
