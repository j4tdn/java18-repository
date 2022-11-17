package bean;

public class Itemm {
	private int id;
	private String name;
	private String origin;
	private double salesPrice;

	public Itemm() {
	}

	public Itemm(int id, String name, String origin, double salesPrice) {
		this.id = id;
		this.name = name;
		this.origin = origin;
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

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	@Override
	public String toString() {
		return "Itemm [id=" + id + ", name=" + name + ", origin=" + origin + ", salesPrice=" + salesPrice + "]";
	}

}
