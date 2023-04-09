package generic.demo;

import generic.common.CustomList;
import generic.common.JavaList;

public class Ex02GenericClass {
	public static void main(String[] args) {
		JavaList<String> sequences = new CustomList<>();
		sequences.add("A124");
		sequences.add("C29");
		sequences.add("B156");
		sequences.add("D888");
		sequences.add("Z123");
	
		System.out.println("sequences size ---> "+ sequences.size());
		System.out.println("sequences capacity ---> "+ sequences.capacity());
		
		
		//for-each:array,iterable
		System.out.println("\n==========================\n");
		sequences.forEach(sequence->{
			System.out.print(sequence+" ");
		});
		sequences.add(0,"A111");
		sequences.add(2,"Z999");
		sequences.add(4,"W888");
		sequences.add(sequences.size(),"Size789");
		
		System.out.println("\n==========================\n");
		sequences.forEach(sequence->{
			System.out.print(sequence+" ");
		});
	}
}
