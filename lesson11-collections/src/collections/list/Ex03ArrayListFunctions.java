package collections.list;

/**
 * String --> .length()
 * array  --> .length
 * List   --> .size()
 * 
 * list.remove(Object o) --> internal code
 * Duyệt từng phần tử trong biến list 
 * Nếu phần tử nào equals (mặc định so sánh địa chỉ) với phần tử cần xóa (o) thì xóa phần đó khỏi List
 * 
 * Thực tế 
 * VD: CSDL lưu trữ 10 phần tử nằm ở 10 ô nhớ khác nhau 
 *   : Khi người dùng muốn xóa --> nhập phần tử muốn xóa theo id 
 * ↓
 * Muốn xóa được --> thì phải duyệt từng phần tử trong list,
 * kiểm tra xem phần tử nào có id bằng id cần xóa --> lấy đối tượng đó ra 
 * rồi mới gọi hàm remove đối tượng đó --> BAD PERFORMANCE
 * 
 * MONG MUỐN
 * Khi truyền phần tử cần xóa vào
 * Nếu phần tử nào trong list, cùng id với phần tử cần xóa => XÓA
 * + Override hàm equals trong class Store theo thuộc tính id (P/s: chọn thuộc tính phân biệt giữa 2 phần tử)
 * + Duyệt từng phần tử trong biến list 
 * + Nếu phần tử nào equals (cùng storeId) với phần tử cần xóa (o) thì xóa phần đó khỏi List
 * 
 * ========================
 * ConcurrentModificationException
 * Khi phần tử chưa duyệt đến đã bị xóa
 * Tổng quát: có 2 luồng thực thi cùng truy cập đến 1 phần tử
 * ↓
 * Root cause (nguyên nhân chính)
 * Đang duyệt phần tử thứ i mà mình đã có thể truy cập đến phần tử thứ i + k
 * VD: Đang duyệt phần tử i, mà đã xóa phần tử thứ i + k ==> đến khi duyệt đến i + k, ko còn để mà xóa 
 * ↓
 * Solving:
 * Đang duyệt phần tử i là chỉ được phép truy cập giá trị i 
 * không được truy cập, xóa phần tử khác
 * --> Duyệt tuần tự
 * --> Iterable --> dùng Iterator
 * 
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import bean.Store;

public class Ex03ArrayListFunctions {
	public static void main(String[] args) {
		// list, arrayList --> danh sách 
		// add-addAll, remove-removeAll-removeIf, get, set
		// contains
		// sorting
		
		List<Store> stores = new ArrayList<>();
		stores.add(new Store(1, "S1", LocalDate.of(2017, 3, 17), 101));
		stores.add(new Store(2, "S2", LocalDate.of(2017, 8, 22), 101));
		stores.add(new Store(3, "S3", LocalDate.of(2018, 2, 18), 102));
		stores.add(new Store(4, "S4", LocalDate.of(2019, 6, 26), 102));
		stores.add(new Store(5, "S5", LocalDate.of(2020, 4, 29), 102)); //
		stores.add(new Store(6, "S6", LocalDate.of(2020, 9, 15), 103));
		
		System.out.println("size --> " + stores.size());
		// (Item item) -> item.getSalesPrice(); --> Item::getSalesPrice();
		// (Store store) -> System.out.println(store); --> System.out::println;
		stores.forEach(System.out::println);
		
		// REMOVE
		System.out.println("\n ===== remove at index 4 =====\n");
		stores.remove(4);
		stores.forEach(System.out::println);
		
		System.out.println("\n ===== remove object s2 =====\n");
		stores.remove(new Store(2, "S2", LocalDate.of(2017, 8, 22), 101));
		stores.forEach(System.out::println);
		
		// strategy --> boolean test(Store store)
		/*
		Predicate<Store> predicate = store -> store.getStartedDate().isAfter(LocalDate.of(2018, 2, 2));
		stores.removeIf(predicate);
		*/
		stores.removeIf(store -> store.getStartedDate().isAfter(LocalDate.of(2018, 2, 2)));
		
		// Iterator
		/*
		Iterator<Store> storeIterator = stores.iterator();
		while (storeIterator.hasNext()) {
			Store currentStore = storeIterator.next();
			if (predicate.test(currentStore)) {
				// xóa phần tử hiện tại mà iterator đang đứng
				// không xóa i + k như vòng for thông thường
				storeIterator.remove();
			}
		}
		*/	
		System.out.println("\n ===== remove if > 02.02.2018 =====\n");
		stores.forEach(System.out::println);
	}
}