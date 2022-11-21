package demo;

import java.util.Arrays;

import bean.Item;

public class Ex09FilerObject {
	public static void main(String[] args) {
		Item itemA=new Item(123, "Item123", 720, "vietnam");
		Item itemB=new Item(234, "Item234", 260, "vietnam");
		Item itemC=new Item(345, "Item345", 120, "vietnam");
		Item[] items= {itemA,itemA,itemC};
		System.out.println(Arrays.toString(filter(items)));
		
	}
	private static Item[] filter(Item[] items) {
		Item[] result = new Item[items.length];
		int count = 0;
		for(Item item : items) {
			if(item.getSalesPrice(0)>200) {
				result[count]=item;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
