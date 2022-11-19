package bean;

public class Item {
	public int id;
	public String name;
	public double salesPrice;
	
	public Item() {
		
	}

	
	public Item(int id, String name,double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}
}
