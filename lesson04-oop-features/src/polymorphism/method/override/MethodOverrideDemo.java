package polymorphism.method.override;

import bean.Item;

public class MethodOverrideDemo {
	public static void main(String[] args) {
		// --------------- Parent --> Child
				PmoChild pc1 = new PmoChild();
				System.out.println("pc1 a --> " + pc1.a);
				System.out.println("pc1 s --> " + pc1.s);
				pc1.log();
				
				System.out.println("\n\n\n");
				
				// --------------- toString
				Item itemA = new Item(1, "Item A", 12);
				Item itemB = new Item(2, "Item B", 24);

				// default --> toString --> bean.Item@5e91993f --> should override
				System.out.println("Item A --> " + itemA);
				System.out.println("Item B --> " + itemB);
			}
}
