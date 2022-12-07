package polymorphism.method.override;

import bean.Item;

public class MethodOverrideDemo {
	public static void main(String[] args) {
		// ------------ parent --> child
		PmoChild pc1 = new PmoChild();
		System.out.println("pc1 a --> " + pc1.a);
		System.out.println("pc1 s --> " + pc1.s);
		pc1.log();
		
		System.out.println("\n\n\n");
		
		
		// ------------ toString
		Item itemA = new Item(1, "Item A", 12);
		Item itemB = new Item(2, "Item B", 24);
		
		// default --> toString --> bean.Item@8ce67c1d
		
		// override --> id, name, salesPrice
		System.out.println("itemA --> " + itemA);
		System.out.println("itemB --> " + itemB);
	}
	/*
	public String toString () {
		return this.getClass().getName() + '@' + Integer.toHexString(this.hashCode());
	}
	*/
}