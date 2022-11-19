package HomeWork;

public class Item {
	public int id;
	public String name, origin;
	public double salesPrice;

	public Item() {
	}

	public Item(int id, String name, String origin, double salesPrice) {
		this.id = id;
		this.name = name;
		this.origin = origin;
		this.salesPrice = salesPrice;

	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalesPrice() {
		return this.salesPrice;
	}

	public void setSalesPrice(double salePrice) {
		this.salesPrice = salePrice;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "id: " + this.id + "," + "Name: " + this.name + "," + "SalesPrice: " + this.salesPrice + "," + "Origin: "
				+ this.origin;
	}
}
