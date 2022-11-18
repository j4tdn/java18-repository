package Ex02Shopping;

public class Item {
	private String id;
	private String operatingSystem;
	private String color;
	private double price;
	public Item() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", operatingSystem=" + operatingSystem + ", color=" + color + ", price=" + price
				+ "]";
	}
	public Item(String id, String operatingSystem, String color, double price) {
		this.id = id;
		this.operatingSystem = operatingSystem;
		this.color = color;
		this.price = price;
	}
	
}
