package bean;

public class Item {
	private int id;
	private String name;
	private double salesPrice;
	private String origin;

	public Item() {

	}

	public Item(int id, String name, double salesPrice, String origin) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.origin = origin;
	}

	// setter
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	// getter
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getsalesPrice() {
		return salesPrice;
	}

	public String getOrigin() {
		return origin;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", origin=" + origin + "]";
	}

}
