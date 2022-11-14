package test;

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
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
	public double getSalesPrice() {
		return salesPrice;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getOrigin() {
		return origin;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
