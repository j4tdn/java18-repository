package generic.demo;

import generic.common.CustomList;
import generic.common.JavaList;

public class Ex02GenericClass {
	public static void main(String[] args) {
		JavaList<String> sequences = new CustomList<>();
		sequences.add("A123");
		sequences.add("C22");
		sequences.add("C23");
		sequences.add("C24");
		sequences.add("C25");
		
		System.out.println("size --> " + sequences.size());
		System.out.println("size --> " + sequences.capacity());
		
		sequences.add(1, "b22");
		// for-index
		for(int i = 0; i < sequences.size(); i++) {
			System.out.println("i" + i + "-->" + sequences.get(i));
		}
		
		// for-each: array, iterable
		sequences.forEach(System.out::println);
	}
	
	
}
