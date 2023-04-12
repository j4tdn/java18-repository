package collection.list;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Store;

public class Ex03ArrayListFunctions {
	
	
	// System.arraycopy(a1, i + 1, a2, i, (a1.length-1) - i);
	// string --> .length()
	// array --> .length
	// list --> .size()

	public static void main(String[] args) {
		// list, arraylist --> danh sách
		// add-addAll, remove-removeAll-removeIf, get, set
		// contains
		// sorting

		List<Store> stores = new ArrayList<>();
		
		// ADD
		stores.add(new Store(1, "S1", LocalDate.of(2017, 3, 17), 101));
		stores.add(new Store(2, "S2", LocalDate.of(2017, 8, 22), 101));
		stores.add(new Store(3, "S3", LocalDate.of(2018, 2, 18), 102));
		stores.add(new Store(4, "S4", LocalDate.of(2019, 6, 26), 102));
		stores.add(new Store(5, "S5", LocalDate.of(2020, 4, 29), 102)); // --
		stores.add(new Store(6, "S6", LocalDate.of(2020, 9, 15), 103));

		// (Item item) -> item.getSalesPrice(); --> Item::getSalesPrice
		// (Store store) -> System.out.println(store); --> System.out::println
		System.out.println("size --> " + stores.size());
		stores.forEach(System.out::println);
		
		// REMOVE
		System.out.println("\n========= remove at index 4 - s5 ========\n");
		stores.remove(4);
		stores.forEach(System.out::println);
		
		System.out.println("\n========= remove object s2 ========\n");
		
		stores.remove(new Store(2, "S2", LocalDate.of(2017, 8, 22), 101));
		stores.forEach(System.out::println);
		
		
		// list.remove(Object o) --> internal code
		// Duyệt từng phần tử trong biến list
		// Nếu phần tử nào equals(mặc định so sánh địa chỉ) với phần tử cần xóa(o) 
		// thì xóa phần tử đó kh�?i list
		
		// Thực tế
		// VD: CSDL lưu trữ 10 phần tử nằm ở 10 ô nhớ khác nhau
		//   : Khi ngư�?i dùng muốn xóa --> nhập phần tử muốn xóa theo id
		// Muốn xóa được --> thì phải duyệt từng phần tử trong list, kiểm tra
		// xem phần tử nào có id bằng id cần xóa --> lấy đối tượng đó ra
		// rồi g�?i hàm remove đối tượng đó --> bad performance
		
		// Mong muốn
		// Khi truy�?n phần tử cần xóa vào, nếu phần tử nào trong list
		// cùng id với phần tử cần xóa --> xóa
		// Override hàm equals trong class Store theo thuộc tính id
		
		// Duyệt từng phần tử trong biến list
		// Nếu phần tử nào equals(cùng store id) với phần tử cần xóa(o) 
		// thì xóa phần tử đó kh�?i list
//		int count = 0;
//		
//		for (Store store: stores) {
//			
//			// tư�?ng minh
//			stores.remove(new Store(6, "S6", LocalDate.now(), 101));
//			
//			count++;
//			System.out.print("\ncount: " + count + ",  " + store);
//			// removeIf
//			if (store.getStartedDate().isAfter(LocalDate.of(2018, 2, 2))) {
//				System.out.print(" is removed\n");
//				stores.remove(store);
//			}
//		}
		
		/*
		 Khi 1 phần tử chưa duyệt đến đã bị xóa
		 Tổng quát: có 2 luồng thực thi cùng truy cập đến 1 phần tử
		 Exception in thread "main" java.util.ConcurrentModificationException
		 at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1042)
		 at java.base/java.util.ArrayList$Itr.next(ArrayList.java:996)
		 at collections.list.Ex03ArrayListFunctions.main(Ex03ArrayListFunctions.java:72)
		 
		 Root cause: 
		 	�?ang duyệt phần tử thứ i mà mình đã truy cập được/xóa phần thứ i + k
		 	Sau khi xóa duyệt đến phần tử i + k không còn nữa
		 Solving:
		 	�?ang duyệt phần tử i là chỉ được phép truy cập giá trị tại i
		 	không được truy cập, xóa phần tử khác
		 	--> Duyệt tuần tự
		 	--> Interable
		 	      + iterator
		 */
		// - storeIterator 
		// 1 -
		// 2 -
		// 3
		
		// strategy --> boolean test(Store store);
		stores.removeIf(store -> store.getWarehouseId() == 103);
		
		System.out.println("\n========= remove if whId = 103 ========\n");
		stores.forEach(System.out::println);
		
		// sorting wh id desc, startedDate desc
		stores.sort(comparing(Store::getWarehouseId, reverseOrder())
				.thenComparing(Store::getStartedDate, reverseOrder()));
	
		System.out.println("\n========= sorting whId desc ========\n");
		stores.forEach(System.out::println);
	}
}
