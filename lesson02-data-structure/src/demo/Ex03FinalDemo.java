package demo;

import bean.Item;

// ctrl shift f
public class Ex03FinalDemo {
	public static void main(String[] args) {
		// --- giá trị ---
		// final --> final at STACK
		// primitive --> STACK
		final int digit = 12;
		// digit = 20 (đã bỏ final thì không thay đổi được giá trị)

		// Object --> HEAP
		final Item i1 = new Item(1, "Item 1", 123); // H1
		Item i2 = new Item(2, "Item 2", 234); // H2

		// i1 = i2; (final i1 nên in ra vẫn giữ giá trị i1, nếu có thay đổi thì
		// chỉ thay đổi giá trị chứ không thay đổi được địa chỉ i1 thành i2)
		i1.name = "Item Xyz";
		System.out.println("i1 ==> " + i1);
	}
}
