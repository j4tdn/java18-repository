package bean;

public class Item {
	public int itemId;
	public String name;
	public double price;
	
	
	
	public Item() {
		super();
	}



	public Item(int itemId, String name, double price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}



	@Override
	public String toString() {
		return this.itemId + " , " + this.name + " , " + this.price;
	}
	
	
	
}
