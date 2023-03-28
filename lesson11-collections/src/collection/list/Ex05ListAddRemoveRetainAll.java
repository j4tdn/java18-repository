package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex05ListAddRemoveRetainAll {
	public static void main(String[] args) {
		// addAll 
		// removeAll 
		// retainAll
		
		// use dynamic-size 
		List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		List<Integer> list2 = new ArrayList<>(List.of(4, 5, 6, 7, 8));
		
		// Phép Hợp
		List<Integer> addedAllList = new ArrayList<>(list1); // copy list1 qua list mới, lấy list đó để chứa phần tử add vào
		addedAllList.addAll(list2);
		addedAllList.forEach(number -> System.out.print(number + " "));
		
		System.out.println("\n========================\n");
		
		// Phép Hiệu
		List<Integer> removedAllList = new ArrayList<>(list1); // chứa trong A nhưng ko chứa trong B
		removedAllList.removeAll(list2);
		removedAllList.forEach(number -> System.out.print(number + " "));
		
		System.out.println("\n========================\n");
		
		// Phép Hiệu
		List<Integer> retainedAllList = new ArrayList<>(list1); // phần chung
		retainedAllList.retainAll(list2);
		retainedAllList.forEach(number -> System.out.print(number + " "));

		System.out.println("\n========================\n");
	}
}