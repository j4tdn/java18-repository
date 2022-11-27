package polymorphism.method.override;

import bean.Item;

public class MethodOverrideDemo {
	public static void main(String[] args) {
		//---------- parent --> child
		PmoChild pc1 = new PmoChild();
		System.out.println("pc1 a --> " + pc1.a);
		System.out.println("pc1 S --> " + pc1.S);
		pc1.log();
		
		System.out.println("\n\n\n");
		
		//------------toString
		Item itemA = new Item(1, "ItemA", 12);
		Item itemB = new Item(2, "ItemB", 24);
		// default --> toString --> bean.Item@
		System.out.println("itemA --> " + itemA);
		System.out.println("itemB --> " + itemB);
	}

}
