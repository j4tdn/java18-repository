package collections.list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Store;

public class Ex03ArrrayLisstFunctions {
	public static void main(String[] args) {
		
		Store s3 = new Store(4, "S4", LocalDate.of(2019, 3, 17), 102);
		Store s31 = s3;
		
		List<Store> store = new ArrayList<>();
		store.add(new Store(1, "S1", LocalDate.of(2017, 3, 17), 101));
		store.add(new Store(2, "S2", LocalDate.of(2018, 3, 17), 101));
		store.add(new Store(3, "S3", LocalDate.of(2015, 3, 17), 102));
		store.add(s31);
		store.add(new Store(5, "S5", LocalDate.of(2019, 3, 17), 102));
		store.add(new Store(6, "S6", LocalDate.of(2019, 3, 17), 102));
		store.add(new Store(7, "S7", LocalDate.of(2019, 3, 17), 102));
		
		//(Item item) -> item.getSalesPrice(); --> Item::getSalesPrice
		//(Store store) -> System.out.println(store); --> System.out::println
		System.out.println("size: " + store.size());
		store.forEach(System.out::println);
		
		
		//REMOVE
		store.remove(3);
		System.out.println("====== remove at index 3 ======\n");
		store.forEach(System.out::println);
		

		//REMOVE
		System.out.println("====== remove object s4 - s5======\n");
		store.remove(s31);
		store.forEach(System.out::println);
		
		
		//REMOVE
		System.out.println("====== remove object s2======\n");
		store.remove(new Store(2, "S2", LocalDate.of(2018, 3, 17), 101));
		store.forEach(System.out::println);
				
		//- list.remove(Object o) --> internal code
		//-Duyệt từng phần tử trong biến List
		//-Nếu phần tử nào euqals(Mặc định so sánh địa chỉ) với phần tử cần xóa(o)
		//thì xóa phần tử đó khỏi list
		
		//-Thực tế
		//-VD: CSDL lưu trữ 10 phần tử nằm ở 10 ô nhớ khác nhau
		//	 : Khi người dùng muốn xóa --> nhập phần tử muốn xóa theo id
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
	}
	
}
