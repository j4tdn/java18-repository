package lesson03.ex03;

public class Car {
	private String type;
	private int capacity;
	private double price;
	
	public Car(String type, int capacity, double price) {
		this.type = type;
		this.capacity = capacity;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
		return "Car [type=" + type + ", capacity=" + capacity + ", price=" + price + "]";
	}
}
