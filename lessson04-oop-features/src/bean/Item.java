package bean;

public class Item {
	private int id;
	private String name;
	private double salesPrice;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, double salesPrice) {
		super();
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

	@Override
	public String toString() {
		return id + "," + name + "," + salesPrice;
	}

}
