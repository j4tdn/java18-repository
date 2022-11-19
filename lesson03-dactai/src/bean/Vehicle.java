package bean;

public class Vehicle {
	private String name;
	private int volume;
	private double cost;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name, int volume, double cost) {
		super();
		this.name = name;
		this.volume = volume;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", volume=" + volume + ", cost=" + cost + "]";
	}
	

}
