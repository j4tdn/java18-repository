package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex05ListAddRemoveRetainAll {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		List<Integer> list2 = new ArrayList<>(List.of(4, 5, 6, 7, 8));
		
		List<Integer> addedAllList = new ArrayList<>(list1);
		addedAllList.addAll(list2);
		
		addedAllList.forEach(System.out::print);
		System.out.println("\n========================");
		
		List<Integer> removedAllList = new ArrayList<>(list1);
		removedAllList.removeAll(list2);
		// Phép hiệu
		removedAllList.forEach(number -> System.out.print(number + " "));
		System.out.println("\n========================");
		
		List<Integer> containedAllList = new ArrayList<>(list1);
		containedAllList.retainAll(list2);
		// Phép giao
		containedAllList.forEach(number -> System.out.print(number + " "));
		System.out.println("\n========================");
	}
}
