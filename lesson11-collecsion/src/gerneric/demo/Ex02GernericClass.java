package gerneric.demo;

import java.util.function.Consumer;

import gerneric.common.CustomList;
import gerneric.common.JavaList;

public class Ex02GernericClass {
	public static void main(String[] args) {
		JavaList<String> sequences = new CustomList<>();
		sequences.add("A124");
		sequences.add("B123");
		sequences.add("C123");
		sequences.add("D123");
		sequences.add("E123");
		System.out.println("size -> " + sequences.size());
//		for(int i=0;i<sequences.size();i++) {
//			System.out.println("i" + i + " --> " + sequences.get(i));
//		}
		sequences.add(3, "F1234");
		sequences.forEach(new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
	}
}
