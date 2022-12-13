package bean;

public class Item {
	private int id;
	private String name;
	private double salesSprice;
	
	public Item() {
	}

	public Item(int id, String name, double salesSprice) {
		this.id = id;
		this.name = name;
		this.salesSprice = salesSprice;
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

	public double getSalesSprice() {
		return salesSprice;
	}

	public void setSalesSprice(double salesSprice) {
		this.salesSprice = salesSprice;
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", ";
	}
}
