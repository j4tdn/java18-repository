package vehicle.tax;

public class Vehicle {
	private String name;
	private String id;
	private int capacity;
	private double price;

	public Vehicle() {
	}

	public Vehicle(String name, String id, int capacity, double price) {
		super();
		this.name = name;
		this.id = id;
		this.capacity = capacity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		return "Vehicle [name=" + name + ", id=" + id + ", capacity=" + capacity + ", price=" + price + "]";
	}

	public double getTaxToPay() {
		if (this.getCapacity() < 100) {
			return this.getPrice() * 0.01;
		} else if (this.getPrice() < 200) {
			return this.getPrice() * 0.03;
		} else {
			return this.getPrice() * 0.05;
		}
	}
}
