package collections.list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Store;

public class Ex03ArrayListFunctions {
	public static void main(String[] args) {
		// list, arraylist -- danh sách
		// add-addAll, remove-removeAll-removeIf, get, set
		// contains
		// sorting
		
		//ADD
		
		List<Store> stores = new ArrayList<>();
		stores.add(new Store(1, "S1", LocalDate.of(2017, 3, 13), 101));
		stores.add(new Store(2, "S2", LocalDate.of(2017, 8, 22), 101));
		stores.add(new Store(3, "S3", LocalDate.of(2018, 2, 18), 102));
		stores.add(new Store(4, "S4", LocalDate.of(2019, 6, 26), 102));
		stores.add(new Store(5, "S5", LocalDate.of(2020, 4, 29), 102));
		stores.add(new Store(6, "S6", LocalDate.of(2020, 9, 15), 103));
		
		System.out.println("size --> " + stores.size());
		stores.forEach(System.out::println);
		
		// REMOVE
		stores.remove(4);
		System.out.println("=========== remove at index 4 ===========");
		stores.forEach(System.out::println);
		
		System.out.println("\n=========== remove object s2 ============\n");
		stores.remove(new Store(2, "S2", LocalDate.of(2017, 8, 22), 101));
		stores.forEach(System.out::println);
		
		// list.remove(Object o) --> internal code
		// Duyệt từng phần tử trong biến list
		// nếu phần tử nào equals(mặc định so sánh địa chỉ) với phần tử cần xóa(o).
		// thì xóa phần tử đó khỏi list
		
		// Thực tế
		// VD: CSDL lưu trữ 10 phần tử nằm ở 10 ô nhớ khác nhau
		//	 : khi người dùng muốn xóa --> nhập phần tử muốn xóa theo id
		// Muốn xóa được --> thì phải duyệt từng phần tử trong list, kiểm tra
		// xem phần tử nào có id bằng id cần xóa --> lấy đối tượng đó ra
		// rồi gọi hàm remove đối tượng đó --> bad performance
		
		// Mong muốn
		// Khi truyền phần tử cần xóa vào, nếu phần tử nào trong list
		// cùng id với phần tử cần xóa --> xóa
		// override hàm equals trong class Store theo thuộc tính id
		
		// Duyệt từng phần tử tring biến list
		// nếu phần tử nào equals(cùng store id) với phần tử cần xóa(o).
		// thì xóa phần tử đó khỏi list
		
		/*Root cause:
		 	Đang duyệt từ phần tử thứ i mà mình đã truy cập được/xóa phần tử thứ i + k
		 	sau khi xóa duyệt đến phần ử i + k không còn nữa
		 Solving:
		  	Đang duyệt phần tử i là chỉ được phép truy cập giá trị tại i
		  	Không được truy cập, xóa phần tử khác
		  	--> Duyệt tuần tự
		  	--> Interable
		*/
		stores.removeIf(store -> store.getWarehouseId() == 103);
		System.out.println("=========== remove at WarehouseId =103 ===========");
		stores.forEach(System.out::println);
		
	}
}
