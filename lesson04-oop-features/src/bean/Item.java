package bean;

public class Item {
	private int id;
	private String name;
	private double salesPrice;
	
	public Item() {
	}

	public Item(int id, String name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}

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
	
	// itemA.toString
	// itemB.toString
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + salesPrice;
	}
}
