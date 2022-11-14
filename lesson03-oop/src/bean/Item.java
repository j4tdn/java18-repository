package bean;

public class Item {
	private int id;
	private double salePrice;
	private String origin;
	
	public Item() {
		
	}
	
	public Item(int id, double salePrice, String origin) {
		this.id = id;
		this.salePrice = salePrice;
		this.origin = origin;
	}
	
	@Override
	public String toString() {
		
		return "id: " + id + "salePrice: " + salePrice + "origin: " + origin;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
		
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public int getId() {
		return id;
	}
	
	public double getSalePrice() {
		return salePrice;
	}
	
	public String getOrigin() {
		return origin;
	}

}
