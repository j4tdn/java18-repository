package exercise3;

public class Vehicle {
	private String type;
	private int capacity;
	private double cost;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String type, int capacity, double cost) {
		this.type = type;
		this.capacity = capacity;
		this.cost = cost;
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", capacity=" + capacity + ", cost=" + cost + "]";
	}
	
	
}
