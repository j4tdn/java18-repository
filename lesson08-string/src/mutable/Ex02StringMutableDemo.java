package mutable;

public class Ex02StringMutableDemo {
	public static void main(String[] args) {
		//Hầu hết các trường hợp đều sử dụng String Literal
		
		//Khi thực hiện các thao tác +- chuỗi số lượng ô nhớ trung gian
		//tạo ra quá nhiều ==>  Sử dụng String Mutable
		
		//TODO: đơn luồng, đa luồng
		
		// immutable
		// immutable object là object ở HEAP mà ko thể
		// thay đổi/set được giá trị biến(s) bên trong

		// mutable --> StringBuilder, StringBuffer
		// mutable object là object ở HEAP mà có thể
		// thay đổi/set được giá trị biến(s) bên trong

		// StringBuilder, StringBuffer
		// TODO: giống nhau --> mutable, hàm sử dụng
		// TODO: khác nhau --> đơn luồng, đa luồng

		// StringBuilder/Bufer là một wrapper/container chứa
		// thuộc tính có KDL là String

		// StringBuilder
		// value(String)
		StringBuilder sb = new StringBuilder("hello")
				.append(" from")
				.append(" Viet Nam");
		System.out.println("sb --> " + System.identityHashCode(sb) + "--> " + sb);
		
		//append, delete, setCharAt

		sb.append(" 2023");
		System.out.println("sb --> " + System.identityHashCode(sb) + "--> " + sb);

		// string +=
		StringBuilder sequence = new StringBuilder();
		for (int i = 1; i <= 1000; i++) {
			sequence.append(i);
		}
		System.out.println("sequence --> " + System.identityHashCode(sb) + "--> " + sb);

	}
}
