package generic.demo;

import java.util.function.Predicate;

import generic.common.CustomList;
import generic.common.JavaList;
import generic.common.JavaLists;

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
		
		System.out.println("\n===============================\n");
		
		sequences.forEach(seq -> System.out.print(seq + " "));
		sequences.add(0, "A111");
		sequences.add(2, "Z999");
		sequences.add(4, "V2105");
		
		sequences.addIfAbsent("Z999");

		System.out.println("\n===============================\n");
		sequences.forEach(seq -> System.out.print(seq + " "));
		
		int countStartWithA = JavaLists.countIf(sequences, seq -> seq.startsWith("A"));
		System.out.println("\ncountStartWithA --> " + countStartWithA);
		
		
		
		
		
		
		/* only for index 
		for (int i = 0; i < sequences.size(); i++) {
			System.out.println("i " + i + " --> " + sequences.get(i));
		}
		*/
		
		// for-each (sau khi đã thêm vào JavaList và Custom list)
		//sequences.forEach(System.out::println);
	}
}