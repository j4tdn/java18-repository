package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawTypeIdea {
	public static void main(String[] args) {
		// Before JDK 1.4
		// Raw type: KDL thô vì chưa khai báo KDL của phần tử bên trong List
		// Tương tự với danh sách đối tượng --> Object
		// Có thể chứa bất kỳ KDL gì
		
		// VD: lưu trữ danh sách số nguyên
		List list = new ArrayList();
		list.add(1);
		list.add(22);
		// list.add("a");
		
		// In ra giá trị nhân đôi của các số
		// Hạn chế:
		// Không bắt lỗi tại compile, mà bắt lỗi tại runtime
		// Tốt: xử lý và phát hiện tại compile
		for (Object o: list) {
			System.out.println(Integer.parseInt(o.toString())  * 2);
		}

		// After JDK 1.5 --> new ArrayList<Integer>
		//           1.7 --> new ArrayList<>
		List<Integer> numbers = new ArrayList<>();
		numbers.add(25);
		numbers.add(38);
		// numbers.add("2a");
		
		// Hỗ trợ bắt lỗi tại compile
		for (Integer number: numbers) {
			System.out.println(number  * 2);
		}
	}
}
