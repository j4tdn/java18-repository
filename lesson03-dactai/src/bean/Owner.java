package bean;

public class Owner {
	private String name;
	private Vehicle vehicle;
	
	public Owner() {
		// TODO Auto-generated constructor stub
	}

	public Owner(String name, Vehicle vehicle) {
		super();
		this.name = name;
		this.vehicle = vehicle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", vehicle=" + vehicle + "]";
	}
}
