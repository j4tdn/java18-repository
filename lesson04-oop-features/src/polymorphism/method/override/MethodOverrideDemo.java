package polymorphism.method.override;

import bean.Item;

public class MethodOverrideDemo {
	public static void main(String[] args) {
		//--------------parent --> child
		Pmochild pc1 = new Pmochild();
		System.out.println("pc1: "+pc1.a);
		System.out.println("pc1: "+pc1.s);
		pc1.log();
		
		//-----------------toString
		Item itemA = new Item(1,"Item A",12);
		
		
		//default --> toString -->bean.Item@...
		
		//override --> id , name , salesPrice
		System.out.println("itemA--> "+itemA);
	}
	
}
