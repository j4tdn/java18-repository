package bean;

public class Item {
	public int id;
	public String name;
	public double salesPrice;
	
	public Item(int id, String name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	
	public Item() {
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + "," + this.name + "," + this.salesPrice;
	}
}