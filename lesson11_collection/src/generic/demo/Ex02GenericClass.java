
package generic.demo;


import generic.common.CustomList;
import generic.common.JavaList;
import generic.common.JavaLists;

public class Ex02GenericClass {
	public static void main(String[] args) {
		JavaList<String> sequences = new CustomList<>();
		sequences.add("A124");
		sequences.add("C29");
		sequences.add("B561");
		sequences.add("D888"); // size = 4 -->
		sequences.add("Z123"); // es[4] = Z123;
		
		System.out.println("size     --> " + sequences.size());
		System.out.println("capacity --> " + sequences.capacity());
		
		// for-each: array, iterable
		System.out.println("\n===================\n");
		sequences.forEach(seq -> System.out.print(seq + " "));
		
		sequences.add(0, "A111");
		sequences.add(2, "Z999");
		sequences.add(4, "W888");
		
		sequences.addIfAbsent("Z999");
		
		System.out.println("\n===================\n");
		sequences.forEach(seq -> System.out.print(seq + " "));
		
		int countStartWithA = JavaLists.countIf(sequences, seq -> seq.startsWith("A"));
		System.out.println("countStartWithA --> " + countStartWithA);
		
		// ? --> wildcard
	}
}