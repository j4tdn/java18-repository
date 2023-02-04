package vehicle;

public class Vehicle {
	private String branch;
	private int volume;
	private Double cost;
	
	public Vehicle() {
		
	}

	public Vehicle(String branch, int volume, Double cost) {
		
		this.branch = branch;
		this.volume = volume;
		this.cost = cost;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vehicle [branch=" + branch + ", volume=" + volume + ", cost=" + cost + "]";
	}
	
	
	

}
