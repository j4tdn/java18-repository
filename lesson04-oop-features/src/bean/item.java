package bean;

public class item {
	private int id;
	private String name;
	private double salesPrice;
	
	public item() {
		// TODO Auto-generated constructor stub
		
	}

	public item(int id, String name, double salesPrice) {
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
		return "item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}
	
	

}
