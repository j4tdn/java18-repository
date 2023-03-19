package collections.list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Item;

public class Ex03ArrayListFunction {

	// String --> .length();

	public static void main(String[] args) {
		// list, arrayLisst --> danh sách
		// add-addAll,remove-removeAll-removeIf,get,set
		// contains
		// sorting
		List<Item> stores = new ArrayList<>();
		stores.add(new Item(1, "s1", LocalDate.of(2020, 8, 10), 101));
		stores.add(new Item(2, "s2", LocalDate.of(2020, 8, 11), 102));
		stores.add(new Item(3, "s3", LocalDate.of(2020, 8, 12), 103));
		stores.add(new Item(4, "s4", LocalDate.of(2020, 8, 12), 105));
		stores.add(new Item(5, "s5", LocalDate.of(2020, 8, 13), 104));
		stores.add(new Item(6, "s6", LocalDate.of(2020, 8, 13), 104));
		stores.add(new Item(7, "s7", LocalDate.of(2020, 8, 12), 105));

		stores.forEach(store -> System.out.println(store));
		/*
		 * Viết ngắn gọn hơn (Item item)->item.getSalePrice() => item::getSalePrice
		 * stores.forEach(System.out::println);x
		 */

		// REMOVE
		System.out.println("After Remove ===================================================");
		stores.remove(4);
		stores.forEach(store -> System.out.println(store));
		System.out.println("After Remove Object 3 ==========================================");
		stores.remove(new Item(2, "s2", LocalDate.of(2020, 8, 11), 102));
		stores.forEach(store -> System.out.println(store));
		/*
		 * list.remove(Object o)
		 * 
		 * Duyệt từng phần tử trong biến list
		 * 
		 * Nếu phần tử nào equals(mặc định so sánh địa chỉ có thể overri hàm equal để so
		 * sánh với thuộc tính nào đó) với phần tử cần xoá(o) thì xoá phần tử đầu tiên
		 * ra khỏi list
		 */
		/*
		 * - Thực tế: Khi muốn xoá --> nhập phần tử theo id --> Muốn xoá --> duyệt -->
		 * kiểm tra phần tử có id bằng id cần xoá --> Lấy dối tượng --> gọi hàm remove
		 * đối tượng đó --> bad performance - Mong muốn : Khi truyền vào phần tử cần
		 * xoá, nếu phần tử nào trong list cùng id với phần tử cần xoá --> xoá --> Cần
		 * phải overide hàm equals trong class Store theo thuộc tính id
		 */
		/*
		 * Root Cause
		 */
//			Iterator<Store> storeIterator = stores.iterator();
//			while(storeIterator.hasNext()) {
//				Store currentStore = storeIterator.next();
//				if(currentStore.getDate().isAfter(LocalDate.of(201, 3, 2))) {
//					storeIterator.remove();
//				}
//			}
		stores.removeIf(store -> store.getWarehouseId() == 103);
		System.out.println("After remove warehouse 103 ===================================");
		stores.forEach(store -> System.out.println(store));
		
		//sorting wh id desc
		//comparing(store::getWarehouseId)
		stores.sort(Comparator.comparing(store->store.getWarehouseId(),Comparator.reverseOrder())); 
		System.out.println("After sorting ================================================");
		stores.forEach(store -> System.out.println(store));
	}

}
