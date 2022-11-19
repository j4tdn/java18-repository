package ex03vehicle;

public class Vehicle {
	private String nameOwner;
	private String model;
	private int capacity;
	private double price;
	private double tax;
	
	public Vehicle() {
	}
	
	public Vehicle(String name, String model, int capacity, double price, double tax) {
		this.nameOwner = name;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
		this.tax = tax;
	}
	
	
	public String getNameOwner() {
		return nameOwner;
	}

	public void setNameOwner(String name) {
		this.nameOwner = name;
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

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public void findTax() {
		if(this.getCapacity() < 100) {
			this.setTax(this.getPrice()*0.01);
		} else if(this.getCapacity() < 200) {
			this.setTax(this.getPrice()*0.03);
		} else {
			this.setTax(this.getPrice()*0.05);
		}
	}

	public void show() {
		System.out.printf("%-20s%-20s%-20s%-20s%s\n", this.getNameOwner(), this.getModel(),
				this.getCapacity(), this.getPrice(), this.getTax());
	}

}
