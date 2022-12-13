package polymorphism.method.override;

import bean.item;

public class MethodOverrideDemo {
	public static void main(String[] args) {
		item itemA =new item(1, "Item a", 12);
		item itemB =new item(10, "Item b", 11);
		System.out.println(itemA);
		System.out.println(itemB);
		
		PmoChild pc1 = new PmoChild();
		System.out.println(pc1.a);
		System.out.println(pc1.S);
		pc1.log();
	}
	
	
	

}
