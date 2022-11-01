package data.object;

import bean.Item;

public class Ex02ItemDemo {
	public static void main(String[] args) {
		
		/*
		 Class : KDL đối tượng
		 Class : có thể chưua nhiều thông tin
		 Class : Giá trị của class là đối tượng (ô nhớ ở Heap)
		 Mỗi dối tượng sẽ có giá trị của các tt khác nhau
		 */
		
		//Item: id,itemName,cost
		
		//int : KDL ==> int a = 5
		//Item :KDL
		
		Item i3 = new Item(234,"Item B234",20d);
		Item i4 = new Item(1000,"Item A1000",50d);
		
		/*
		 * System.out.println(i3.id); System.out.println(i3.itemName);
		 * System.out.println(i3.cost);
		 * 
		 * System.out.println(i4.id); System.out.println(i4.itemName);
		 * System.out.println(i4.cost);
		 */
		
		System.out.println(i4.toString());
	}
}
