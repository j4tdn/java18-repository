package bean;

public class Item {
	private int id;
	private String name;
	private double salesPrice;
	
	
	public Item() {
	}
	
	public Item(int id, String name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
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
	

	public double plusSalesPrice(Item another) {
		return this.getSalesPrice() + another.getSalesPrice();
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", origin=";
	}
	

	
	
}