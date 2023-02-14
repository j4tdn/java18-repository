package bean;

public class Item {
	// attributes
	private int id;
	private String name;
	private double salesPrice;
	private String origin;
	
	// default constructor
	public Item() {
	}
	
	// Constructor with parameters
	public Item(int id, String name, double salesPrice, String origin) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.origin = origin;
	}
	
	// getter, setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	// toString
	@Override
	public String toString() {
		return "id: " + this.id + ", " + "name: " + this.name + ", " + 
	           "sales price: " + this.salesPrice + ", " + "origin: " + this.origin;
	}

}
