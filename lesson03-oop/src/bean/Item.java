package bean;

public class Item {
	private int id;
	private String name;
	private double salesPrice;
	private String origin;
	
	public Item() {	
	}
	public Item(int id,String name,double salesPrice,String origin) {
		this.id=id;
		this.name=name;
		this.salesPrice=salesPrice;
		this.origin=origin;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId(int id) {
		return this.id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName(String name) {
		return this.name;
	}
	
	public void setOrigin(String origin) {
		this.origin=origin;
	}
	public String getOrigin(String origin) {
		return this.origin;
	}
	
	public void setSalesPrice(double salesPrice) {
		this.salesPrice=salesPrice;
	}
	public double getSalesPrice(double salesPrice) {
		return this.salesPrice;
	}
	@Override
	public String toString() {
		return "i :" + id + "; o :" + origin + "; s :" + salesPrice + "; name :" + name;
	}
}
