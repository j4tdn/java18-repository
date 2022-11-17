package bean;

public class Vehicle {
	private String nameCarOwner;
	private String model;
	private String capacity; // dung tích
	private double price;
	private Double tax;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String nameCarOwner, String model, String capacity, double price, Double tax) {
		this.nameCarOwner = nameCarOwner;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
		this.tax = tax;
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

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public String toString() {
		return "Vehicle [nameCarOwner=" + nameCarOwner + ", model=" + model + ", capacity=" + capacity + ", price="
				+ price + ", tax=" + tax + "]";
	}

}
