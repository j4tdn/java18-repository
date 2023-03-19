package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex05ListAddRemoveReatianAll {
	public static void main(String[] args) {
		// addAll
		// removeAll
		// retailAll

		// use dynamic size
		List<Integer> list1 = new ArrayList(List.of(1,2,3,4,5));
		List<Integer> list2 = new ArrayList(List.of(4,5,6,7,8));

		// Hợp
		List<Integer> addedAllList = new ArrayList<>(list1);
		addedAllList.addAll(list2);
		System.out.println(addedAllList);


		// Hiệu
		List<Integer> removeAllList = new ArrayList<>(list1);
		removeAllList.removeAll(list2);
		System.out.println(removeAllList);

		// Giao
		List<Integer> retainedAllList = new ArrayList<>(list1);
		retainedAllList.retainAll(list2);
		System.out.println(retainedAllList);

	}
}
