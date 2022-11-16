package bean;

public class Item {
	private int id;
	private String name;
	private double salesPrice;
	private String origin;
	
	
	
	public Item() {
		
	}

	public Item(int id, String name, double salePrices, String origin) {
		this.id = id;
		this.name = name;
		this.salesPrice = salePrices;
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

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalePrices(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salePrices=" + salesPrice + ", origin=" + origin + "]";
	}
	
	public double subItemSalesPrice(Item item) {
		return this.getSalesPrice() + item.getSalesPrice();
	}

//	@Override
//	public String toString() {
//		return "ID : " + this.id + ", Name : " + this.name
//				+ ", salePrice : " + this.salePrices + ", origin : " + this.origin; 
//	}
}
