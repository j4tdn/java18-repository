package bean;

public class Vehicle {
	private String ownerName;
	private String brandName;
	private int capacity;
	private double price;
	
	public Vehicle() {
	}

	public Vehicle(String ownerName, String brandName, int capacity, double price) {
		this.ownerName = ownerName;
		this.brandName = brandName;
		this.capacity = capacity;
		this.price = price;
	}
	
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [ownerName=" + ownerName + ", brandName=" + brandName + ", capacity=" + capacity + ", price="
				+ price + "]";
	}

	// Function - pay tax
	public double payTax() {
		if (capacity < 100) {
			return price * 0.01;
		} else if (capacity < 200) {
			return price * 0.03;
		}
		return price * 0.05;
	}

}
