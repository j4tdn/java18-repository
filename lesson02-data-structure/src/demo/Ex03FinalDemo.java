package demo;

import bean.Item;

public class Ex03FinalDemo {
	public static void main(String[] args) {
		//-- giá trị --//
		//final --> final at STACK
		//primitive --> STACK
		final int digit = 12;
		//
		
		//object --> Heap
		Item i1 = new Item(1, "Item 1", 10d);
		Item i2= new Item(2, "Item 2", 20d);
		
		//i1=i2;
		i1.name = "Item xyz";
		System.out.println("i1 ==> " + i1);
	}	
}
