package bean;

public class Item {
	private int id;
	private String name;
	private double salePrice;
	private String origin;
	
	public Item() {
		
	}

	public Item(int id, String name, double salePrice, String origin) {
		this.setId(id);
		this.name = name;
		this.salePrice = salePrice;
		this.origin = origin;
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

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salePrice=" + salePrice + ", origin=" + origin + "]";
	}
	

}
