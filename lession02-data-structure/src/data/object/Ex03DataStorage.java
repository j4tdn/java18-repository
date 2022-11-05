package data.object;

import bean.Item;

public class Ex03DataStorage {
	public static void main(String[] args) {
		Item i1 = new Item(1,"Item 1", 11);
		Item i2 = new Item(2,"Item 2", 12);//HB
		
		System.out.println("i1 -> " + i1);
		System.out.println("i2 -> " + i2);
		
		//toán tử = (gán) ==> gán ở stack
		i1=i2;
		i2=i1;
		System.out.println(i1.id);
		modify(i1);
		System.out.println(i1);
	}
	
	
	
	//Item item(HB) = i1(HB);
	private static void modify(Item item) {
		item.id = 99;//HB:99,Item 2, 12
		item = new Item(77,"Item 77", 77d);//HC
		//lúc này item nhảy qua địa chỉ HC chứ ko còn ở HB(i1)
		//nên thay đổi sẽ ko làm i1 thay đổi
		item.id = 88;
		System.out.println(item);
	}
}
