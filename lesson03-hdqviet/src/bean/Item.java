package bean;

public class Item {
	public int ItemId;
	public String name;
	public double price;
	
	public Item() {
	}

	public Item(int itemId, String name, double price) {
		ItemId = itemId;
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return "Item [ItemId=" + ItemId + ", name=" + name + ", price=" + price + "]";
	}	
	
}
