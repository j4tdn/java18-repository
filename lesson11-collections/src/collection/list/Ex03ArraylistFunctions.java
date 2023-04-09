package collection.list;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Store;


public class Ex03ArraylistFunctions {

	// string --> .length()
	// array --> .length
	// list --> .size()

	public static void main(String[] args) {
		// list, arraylist --> danh sách
		// add-addAll, remove-removeAll-removeIf, get, set
		// contains
		// sorting

		// ADD
		List<Store> stores = new ArrayList<>();

		stores.add(new Store(1, "S1", LocalDate.of(2017, 1, 2), 101));
		stores.add(new Store(2, "S2", LocalDate.of(2018, 2, 3), 102));
		stores.add(new Store(3, "S3", LocalDate.of(2019, 3, 4), 103));
		stores.add(new Store(4, "S4", LocalDate.of(2020, 4, 5), 104));
		stores.add(new Store(5, "S5", LocalDate.of(2021, 5, 6), 105));
		stores.add(new Store(6, "S6", LocalDate.of(2022, 6, 7), 104));

		// (Item item) --> item.getSalesPrice(); --> Item::getSalesPrice
		// (Store store) --> System.out.print(store); --> System.out::println
		System.out.println("size --> " + stores.size());
		stores.forEach(System.out::println);

		// REMOVE
		System.out.println("\n============ remove at index 4 - s5 ==========\n");
		stores.remove(4);
		stores.forEach(System.out::println);

		System.out.println("\n============ remove object s2 ==========\n");
		stores.remove(new Store(2, "S2", LocalDate.of(2018, 2, 3), 102));
		stores.forEach(System.out::println);

		// list.remove(Object o) --> internal code
		// Duyệt từng phần tử trong biến list
		// Nếu phần tử nào equals(mặc định so sánh địa chỉ) với phần tử cần xóa(o)
		// thì xóa phần tử đó ra khỏi list

		// Thực tế
		// VD: CSDL lưu trữ 10 phần tử nằm ở 10 ô nhớ khác nhau
		// : Khi người dùng muốn xóa --> nhập phần tử muốn xóa theo id
		// Muốn xóa được --> thì phải duyệt từng phần tử trong list, kiểm tra
		// xem phần tử nào có id bằng id cần xóa --> lấy đối tượng đó ra
		// rồi gọi hàm remove đối tượng đó --> bad performance

		// Mong muốn
		// Khi truyền phần tử cần xóa vào, nếu phần tử nào trong list
		// cùng id với phần tử cần xóa --> xóa
		// override hàm equals trong class Store theo thuộc tính id

		// Duyệt từng phần tử trong biến list
		// Nếu phần tử nào equals(cùng store id) với phần tử cần xóa
		// thì xóa phần tử đó ra khỏi list

//		return store.getStartedDate().isAfter(LocalDate.of(2020, 1, 1));
//		for (Store store: stores) {
//			stores.remove(new Store(6, "S6", LocalDate.of(2022, 6, 7), 106));
//		}
		/**
		Khi một phần tử chưa duyệt đến đã bị xóa
		Tổng quát: có 2 luồng thực thi cùng truy cập đến 1 phần tử
		
		Exception in thread "main" java.util.ConcurrentModificationException
		at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
		at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
		at collections.list.Ex03ArraylistFunctions.main(Ex03ArraylistFunctions.java:69)
		
		Root cause: Đang duyệt phần tử thứ i mà mình đã truy cập được/xóa phần tử i + k
		Sau khi xóa duyệt đến phần tử i + k không còn nửa
		
		Solving:
			Đang duyệt phần tử i là chỉ được phép truy cập giá trị tại i
			không được truy cập, xóa phần tử khác
			--> duyệt tuần tự
			--> Interable
				+ iterator
		 */
		// strategy --> boolean test(Store store)
		stores.removeIf(store -> store.getWarehouseId() == 103);
//		System.out.println("\n============ remove if > 01.01.2020 ==========\n");
		System.out.println("\n============ remove whId = 103 ==========\n");
		stores.forEach(System.out::println);
		
		// sorting wh id desc, startedDate desc
		stores.sort(comparing(Store::getWarehouseId, reverseOrder()).thenComparing(Store::getStartedDate, reverseOrder()));
		System.out.println("\n============ sorting whId desc ==========\n");
		stores.forEach(System.out::println);
	}

}
