package Ex03Vehicle;

public class Vehicle {
	
	
	
	private String name;
	private String model;
	private int capacity;
	private double price;
	
	
	public Vehicle() {
	}


	public Vehicle(String name, String model, int capacity, double price) {
		super();
		this.name = name;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
		return "Vehicle [name=" + name + ", model=" + model + ", capacity=" + capacity + ", price=" + price + "]";
	}
	
	
	
}
