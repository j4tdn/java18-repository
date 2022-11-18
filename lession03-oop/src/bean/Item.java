package bean;

public class Item {
	private int id;
	private String name;
	private double salesPrice;
	private String origin;
	
	
	public Item() {
	}
	
	public Item(int id, String name, double salesPrice, String origin) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.origin = origin;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSalsePrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	public double getSalesPrice() {
		return this.salesPrice;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getOrigin() {
		return this.origin;
	}

	public double plusSalesPrice(Item another) {
		return this.getSalesPrice() + another.getSalesPrice();
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", origin=" + origin + "]";
	}
	

	
	
}
