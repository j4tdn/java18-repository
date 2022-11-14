package test2;

import test.Item;

public class Ex02ItemApp {
	public static void main(String[] args) {
		Item i1 = new Item();
		i1.setId(14);
		i1.setName("iphone 14pro");
		i1.setSalesPrice(999);
		i1.setOrigin("Kho DN");
		
		Item i2 = new Item();
		i2.setId(13);
		i2.setName("iphone 13pro");
		i2.setSalesPrice(699);
		i2.setOrigin("Kho DN");
		
		System.out.println("tong tien : "+ (int)(i1.getSalesPrice()+ i2.getSalesPrice()));
	}

}
