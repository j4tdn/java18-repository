package polymorphism.method.override;

import bean.Item;

public class MethodOverrideDemo {
	public static void main(String[] args) {
		// --------- parent --> child
		PmOChild pc1 = new PmOChild();
		System.out.println("pc1 a --> " + pc1.a);
		System.out.println("pc1 s --> " + pc1.s);
		
		pc1.log();
		
		
		Item itemA = new Item(1,"Item A",12);
		Item itemB = new Item(2,"Item B",24);
		
		
		// default : tostring --> bean.Item@3d012ddd
		
		// override --> id,name,salesPrice
		
		System.out.println("iteamA -->" +itemA);
		System.out.println("iteamB -->" +itemB);
		
	}
}
