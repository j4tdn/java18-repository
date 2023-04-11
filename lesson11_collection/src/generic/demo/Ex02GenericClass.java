package generic.demo;

import generic.common.CustomList;
import generic.common.JavaList;
import generic.common.JavaLists;

public class Ex02GenericClass {
	public static void main(String[] args) {
		JavaList<String> arrays = new CustomList<>();
		arrays.add(0, "dit");
		arrays.add("abc");
		arrays.add("abc");
		arrays.add(0, "ditme");
		arrays.addIfAbsent("abc");
		System.out.println(arrays.size());
		System.out.println("capacity --> "+arrays.capacity());
		
		//for index
		for(int i = 0; i< arrays.size();i++) {
			System.out.println(i +" --> "+arrays.get(i));
		}
		//forEach
		System.out.println("=============useforEach function=============");
		arrays.forEach(array -> {
			System.out.print(array + " ");
		});
		//countIf
		System.out.println("CountStartWithA --> "+ JavaLists.countIf(arrays, seq -> seq.startsWith("a")));
		
		
		//? --> wildcard
	}
}
