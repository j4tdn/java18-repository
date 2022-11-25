package exercise03;

public class Vehicle {
	private String vehicleOwnName;
	private String type;
	private double capacity;
	private double cost;
	
	public Vehicle() {
	}

	public Vehicle(String vehicleOwnName, String type, double capacity, double cost) {
		this.vehicleOwnName = vehicleOwnName;
		this.type = type;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getVehicleOwnName() {
		return vehicleOwnName;
	}

	public void setVehicleOwnName(String vehicleOwnName) {
		this.vehicleOwnName = vehicleOwnName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
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
		return "Vehicle [vehicleOwnName=" + vehicleOwnName + ", type=" + type + ", capacity=" + capacity + ", cost="
				+ cost + "]";
	}
}
