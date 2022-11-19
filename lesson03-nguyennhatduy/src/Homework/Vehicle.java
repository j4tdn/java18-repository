package Homework;

public class Vehicle {
	private String name;
	private String model;
	private int capacity;
	private double price;

	public Vehicle() {

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

	public Vehicle(String name, String model, int capacity, double price) {
		super();
		this.name = name;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}
    public double tinhThue(){
        double thue;
        if(capacity<100) thue=price*0.01;
        else if (capacity >= 100 && capacity<=200) thue = price * 0.03;
        else thue = price * 0.05;
        return thue;
    }
 
    @Override
    public String toString() {
        return "-"+name + "-"+capacity + "-"+price + "-"+model;
}
 
    public void inThue(){
        System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f ",name,capacity,price,model,tinhThue());
    }
}
