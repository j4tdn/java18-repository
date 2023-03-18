package collections.list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Store;

public class Ex03ArrayListFunctions {
	public static void main(String[] args) {
		//list, arrayList --> danh sách
		//add-addAll, remove-removwAll-remove-If, get, set
		//contains
		//sorting
		Store s3 = new Store(3, "S3", LocalDate.of(2017, 5, 17), 102);
		
		//ADD
		List<Store>  stores = new ArrayList<Store>();
		stores.add(new Store(1, "S1", LocalDate.of(2017, 3, 17), 101));
		stores.add(new Store(2, "S2", LocalDate.of(2017, 9, 22), 101));
		stores.add(s3);
		stores.add(new Store(4, "S4", LocalDate.of(2017, 8, 4), 102));
		stores.add(new Store(5, "S5", LocalDate.of(2017, 12, 17), 102));
		stores.add(new Store(6, "S6", LocalDate.of(2017, 3, 15), 103));
		
		System.out.println("size --> " + stores.size());
		stores.forEach(System.out::println);
		
		//REMOVE
		System.out.println("=========remove at index 4=============");
		stores.remove(4);
		stores.forEach(System.out::println);
		
		System.out.println("=========remove object s2==============");
		stores.remove(new Store(2, "S2", LocalDate.of(2017, 9, 22), 101));
		stores.forEach(System.out::println);
		
		// list.remove(Object o)
		// Duyệt từng phần tử trong biến list
		// Nếu phần tử nào equals(măc định so sánh địa chỉ) với phần tử cần xoá(o) thì xoá phần tử đó khỏi list
		
		// Thực tế
		// VD: CSDL lưu trữ 10 phần tử nằm ở 10 ô nhớ khác nhau
		// 	 : Khi người dùng muốn xoá --> nhập phần tử muốn xoá theo id
		//
		// Muốn xoá được --> tìm ra id của đối tượng nào bằng với id của đối tượng cần xoá  --> lấy đối tượng đó ra 
		//rồi gọi hàm remove đối tượng đó --> bad performance
		
		
		// Mong muốn
		// Khi truyền phần tử vào, nếu phần tử nào trong list cùng với id của phần tử cần xoá --> xoá
		// Override hàm equals trong class Store theo thuộc tính id
		
		// Duyệt từng phần tử trong biến list
		// Nếu phần tử nào equals(măc định so sánh địa chỉ) với phần tử cần xoá(o) thì xoá phần tử đó khỏi list
		
		stores.removeIf(store -> store.getWarehouseId() == 103);
		System.out.println("=========remove object s2==============");
		stores.forEach(System.out::println);
	}
}
