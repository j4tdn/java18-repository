package generic.demo;

import generic.common.CustomList;
import generic.common.JavaList;
import generic.common.JavaLists;

public class Ex02GenericClass {
	public static void main(String[] args) {
		JavaList<String> sequences = new CustomList<>();
		sequences.add("a");
		sequences.add("b");
		sequences.add("c");
		sequences.add("d"); // size = 4 -->
		sequences.add("e"); // es[4] = e

		System.out.println("size --> " + sequences.size());
		System.out.println("capacity --> " + sequences.capacity());

		sequences.add(2, "index");
		sequences.addIfAbsent("f");

		// for-index
//		for (int i = 0; i < sequences.size(); i++) {
//			System.out.println("i " + i + " --> " + sequences.get(i));
//		}

		// for-each: array, iterable
//		sequences.forEach(sequence -> {
//			System.out.println("each " + sequence);
//		});
		sequences.forEach(System.out::println);
		int countStartWithA = JavaLists.counIf(sequences, seq -> seq.startsWith("a"));
		System.out.println("countStartWithA --> " + countStartWithA);
		// ? --> wildcard
	}
}
