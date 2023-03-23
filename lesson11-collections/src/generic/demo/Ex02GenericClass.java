package generic.demo;

import generic.common.CustomList;
import generic.common.JavaList;

/**
 * Custom list 
 * 
 * Để for-each --> phải là con của array, iterable
 *
 */

public class Ex02GenericClass {
	public static void main(String[] args) {
		JavaList<String> sequences = new CustomList<>();
		sequences.add("A124");
		sequences.add("C19");
		sequences.add("B21");
		sequences.add("D97");
		sequences.add("Z123");
		
		System.out.println("size --> " + sequences.size());
		System.out.println("capacity --> " + sequences.capacity());
		
		
		/* only for index 
		for (int i = 0; i < sequences.size(); i++) {
			System.out.println("i " + i + " --> " + sequences.get(i));
		}
		*/
		
		// for-each (sau khi đã thêm vào JavaList và Custom list)
		sequences.forEach(System.out::println);
	}
}