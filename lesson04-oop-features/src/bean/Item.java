package bean;

public class Item {
	private int id;
	private String name;
	private double salePrice;
	
	public Item() {
	}

	public Item(int id, String name, double salePrice) {
		super();
		this.id = id;
		this.name = name;
		this.salePrice = salePrice;
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

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salePrice;
	}
}
