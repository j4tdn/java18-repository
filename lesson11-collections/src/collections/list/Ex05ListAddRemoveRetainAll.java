package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex05ListAddRemoveRetainAll {
	public static void main(String[] args) {
		//addAll
		//remoteAll
		//retailAll
		
		//use dynamic-size
		List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
		List<Integer> list2 = new ArrayList<>(List.of(4,5,6,7,8));
		
		List<Integer> addedAllList = new ArrayList<>(list1);
		addedAllList.addAll(list2);
		
		addedAllList.forEach(number -> System.out.println(number + " "));
		System.out.println("\n===================\n");
		
		//Phép hiệu
		List<Integer> removedAllList = new ArrayList<>(list1);
		removedAllList.removeAll(list2);
		
		removedAllList.forEach(number -> System.out.println(number + " "));
		System.out.println("\n===================\n");
		
		//Phép giao
		List<Integer> retainedAllList = new ArrayList<>(list1);
		retainedAllList.retainAll(list2);
				
		retainedAllList.forEach(number -> System.out.println(number + " "));
		System.out.println("\n===================\n");
	}
}
