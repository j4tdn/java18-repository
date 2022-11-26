package bean;

public class Vehicle {
	private String nameCarOwner;
	private String model;
	private int capacity;
	private double price;

	public Vehicle() {

	}

	public Vehicle(String nameCarOwner, String model, int capacity, double price) {
		this.nameCarOwner = nameCarOwner;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}

	public String getNameCarOwner() {
		return nameCarOwner;
	}

	public void setNameCarOwner(String nameCarOwner) {
		this.nameCarOwner = nameCarOwner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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
		return "Vehicle [name=" + nameCarOwner + ", model=" + model + ", capacity=" + capacity + ", price=" + price
				+ "]";
	}

}
