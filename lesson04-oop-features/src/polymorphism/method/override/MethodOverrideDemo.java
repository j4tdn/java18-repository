package polymorphism.method.override;

import bean.Item;

public class MethodOverrideDemo {
	public static void main(String[] args) {
		// ---------------Parent & child
		PmoChild pc1 = new PmoChild();
		System.out.println(pc1.a);
		System.out.println(pc1.s);
		pc1.log();
		
		System.out.println("\n\n\n");
		
		//-------------------toString
		Item item1 = new Item(1, "Item A", 12);
		System.out.println(item1.toString());
	}
}
