package collection.list;

import java.time.LocalDate;

import java.util.ArrayList;
//import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bean.Store;

import static java.util.Comparator.*;

public class Ex03ArrayListFuntions {
	
	// string --> .length()
	// array --> .length
	// list --> .size()
	
	public static void main(String[] args) {
		//	list, araylist --> danh sách
		//	add - addAll, remove-removeAll-removeIf, get, set
		//	contains
		//	sorting
		
		List<Store> stores = new ArrayList<>();
		
		//ADD
		stores.add(new Store(1,"S1", LocalDate.of(2017,3,17),101));
		stores.add(new Store(2,"S2", LocalDate.of(2017,8,22),101));
		stores.add(new Store(3,"S3", LocalDate.of(2019,6,10),102));
		stores.add(new Store(4,"S4", LocalDate.of(2018,9,12),102));
		stores.add(new Store(5,"S5", LocalDate.of(2020,3,19),103));
		stores.add(new Store(6,"S6", LocalDate.of(2020,4,15),104));
		
		
		System.out.println("size --> " + stores.size());
		
		// (Item item) -> item.getSalesPrice(); --> Item::getSalesPrice
		
		stores.forEach(System.out::println);
		
		//REMOVE
		System.out.println("\n=========== remove at index 4 =========\n");
		stores.remove(4);
		stores.forEach(System.out::println);
		/*
		 * Funtion to copy to a new array (remove index)
		String[] a1 = {"a", "b", "c", "d", "e", "f"};
		//remove at index 2 ==> "a","b","d","e","f","f"
		String[] a2 = {"a", "b", "c", "d", "e", "f"};
		
		int index = 2;
		
		System.arraycopy(a1, index+1, a2, 2, (a1.length-1)-index); 
		System.out.println("a2 --> " + Arrays.toString(a2));
				*/
		
		
		System.out.println("\n=========== remove object s3 =========\n");
	//	stores.remove(new Store(3,"S3", LocalDate.of(2019,6,10),102));
		stores.forEach(System.out::println);
		
		//	list.remove(Object o); --> internal code
		// Duyệt từng phần tử trong biến list, nếu phần tử nào equals(mặc định so sánh địa chỉ)
		//với phần tử cần xoá (o) thì xoá ra khỏi list.
		
		//Thực tế
		//VD: trong CSDL lưu trữ 10 phần tử nằm ở ô nhớ khác nhau
		//	: Khi người dùng muốn xoá --> nhập phần tử muốn xoá theo id
		// Muốn xoá được --> thì phải duyệt từng phần tử trong list, kiểm tra
		// xem có phần tử nào có id trùng với id cần xáo --> lấy đối tượng đó ra 
		// rồi gọi hàm remove đối tượng đó --> bad performance
		
		//Mong muốn 
		// Khi truyền phần tử cần xoá vào, nếu phần tử nào trong list
		// cùng id với phần tử cần xoá --> xoá
		// Override hàm equals trong class Store theo thuộc tính id
		
		// Duyệt từng phần tử trong bieesn list
		// Nếu phần tử nào equals (cùng store id) với phần tử cần xoá (o)
		// thì xoá phần tửu đó khỏi list
		System.out.println("\n=========== remove object s2 =========\n");
		Store storeToBeRemoved = new Store();
		storeToBeRemoved.setId(2);
	//	stores.remove(storeToBeRemoved);
		stores.forEach(System.out::println);
		
		// REMOVEIF
		
		/*
		 * Tổng quát: Khi có 2 luồng thực thi cùng truy cập đến 1 phần tử 
		 * 
		 Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
	at collection.list.Ex03ArrayListFuntions.main(Ex03ArrayListFuntions.java:86)
			
		Root cause: Đang duyệt phần tử thứ i mà mình đã truy cập/xoá
		được phần tử thứ i + k.
		--> Sau khi xoá duyệt đến phần tử thứ i+k không còn nữa. 
		Solving
			Đang duyệt phần tử i là chỉ được phép truy cập giá trị tại giá tại i,
			không được truy cập, xoá phần tử khác
			--> duyệt tuần tự. 
			--> Interable
				+ iterator
		
		 */
		//- storeIterator
		// 1 -
		// 2 -
		// 3 -
		
		Predicate<Store> predicate = (Store store) -> {
			return store.getWarehouseId() == 102;
		};
		/*
		Iterator<Store> storeIterator = stores.iterator();
		while (storeIterator.hasNext()) {
			Store curentStore = storeIterator.next();
			
			if (curentStore.getStartDate().isAfter(LocalDate.of(2018,2,2))) {
				//Xoá phần tử mà  iterator đang đứng.
				storeIterator.remove();
			}
		} */
	//	stores.removeIf(store -> store.getWarehouseId() == 102);
		System.out.println("\n=========== remove if > 02.02.2018 =========\n");
		stores.forEach(System.out::println);
		
		// strategy --> boolean test(Store store);
		
		System.out.println("\n=========== Sorting warehouseid desc =========\n");
		stores.sort(comparing(Store::getWarehouseId, reverseOrder())
			.thenComparing(Store::getStartDate, reverseOrder()));
		stores.forEach(System.out::println);
	}

}
