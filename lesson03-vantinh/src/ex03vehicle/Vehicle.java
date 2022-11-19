package ex03vehicle;

public class Vehicle {
	private String name;
	private String model;
	private int cc;
	private int price;
	
	public Vehicle() {
		 
	}

	public Vehicle(String name, String model, int cc, int price) {
		super();
		this.name = name;
		this.model = model;
		this.cc = cc;
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

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", model=" + model + ", cc=" + cc + ", price=" + price + "]";
	}

	

}
