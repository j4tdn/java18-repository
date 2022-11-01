package data.object;

import bean.Item;

public class Ex03DataStorage {
	public static void main(String[] args) {
		Item i1 = new Item(1, "Item1", 11); //HA
		Item i2 = new Item(2, "Item2", 12); //HB
		
		System.out.println("i1 -> "+i1);
		System.out.println("i2 -> "+i2);
		
		i1 = i2; //i1(HB) i2(HB)
		i2 = i1; //i1(HB) i2(HB)
		
		System.out.println("i1 id:  "+i1.id); //2
		
		modify(i1);//  HB
		System.out.println("modified  i1 --> "+i1);
		
	}
	private static  void modify(Item item) {
		item.id = 99;
		item =  new Item(77,  "Item",  77d);
		item.id =  88;
		
	}

}
