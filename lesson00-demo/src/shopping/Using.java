package shopping;

public class Using {
	public static void main(String[] args) {
		Customer c1 = new Customer("Quý","123" ,"Quảng Nam", 18);
		Customer c2 = new Customer("Thạch","234","Quảng Trị",18);
		Customer c3 = new Customer("Kiệt","345","Huế",18);
		Customer c4 = new Customer("Huy","456","Đà Nẵng",18);
		Customer c5 = new Customer("Nguyên","567","Hà Tĩnh",18);
		Item i1 = new Item("táo", "111", "Việt Nam", 15000);
		Item i2 = new Item("mận", "222", "Thái Lan", 35000);
		Item i3 = new Item("bưởi", "333", "Trung Quốc", 5000);
		Item i4 = new Item("nho", "444", "MỸ", 12000);
		Item i5 = new Item("xoài", "555", "Campuchia", 18000);
		OrderItem o1= new OrderItem(c1, new ArrayItem[] {
				new ArrayItem(i1,3),
				new ArrayItem(i2,3)
		}, i1);
		OrderItem o2= new OrderItem(c2, new ArrayItem[] {
				new ArrayItem(i2,4),
				new ArrayItem(i3,2)
		}, i2);
		OrderItem o3= new OrderItem(c3, new ArrayItem[] {
				new ArrayItem(i1,3),
				new ArrayItem(i2,3)
		}, i1);
		OrderItem[] Or = {o1,o2,o3};
		for(OrderItem a : Or) {
			Input.Input(a);
		}
	}
	
	
}
