package generic.demo;

import generic.common.CustomList;
import generic.common.JavaList;
import generic.common.JavaLists;

public class Ex02GenericClass {
	public static void main(String[] args) {
		JavaList<String> sequenses = new CustomList<>();
		sequenses.add("A124");
		sequenses.add("B291");
		sequenses.add("C300");
		sequenses.add("D891");
		sequenses.add("F280");
		sequenses.add("G978");
		sequenses.add("G500");
		sequenses.add(3, "A999");
		sequenses.add(8, "665934");
		sequenses.addIfAbsent("665935");
		System.out.println("size --> " + sequenses.size());
		System.out.println("capacity --> " + sequenses.capacity());
		sequenses.forEach(System.out::println);
		
		int count = JavaLists.countIf(sequenses, seq -> seq.startsWith("A"));
		System.out.println("Start with A --> " + count);
		
		
	}
}
