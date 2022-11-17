package bean;

public class Item {

	private int id;
	private String name;
	private double salesPrice;
	private String origin;

	/*
	 * public Item() {
	 * 
	 * }
	 * 
	 * public Item(int id, String name, double salesPrice, String origin) { this.id
	 * = id; this.name = name; this.origin = origin; this.salesPrice = salesPrice; }
	 * 
	 * public void setid(int id) { this.id = id; }
	 * 
	 * public int getid() { return this.id; }
	 * 
	 * public void setname( String name) { this.name = name; }
	 * 
	 * public String getname() { return this.name; }
	 * 
	 * public void setsalesPrice( double salesPrice) { this.salesPrice = salesPrice;
	 * }
	 * 
	 * public double getsalesPrice() { return this.salesPrice; }
	 * 
	 * public void setorigin( String origin) { this.origin = origin; }
	 * 
	 * public String getorigin() { return this.origin; }
	 * 
	 * 
	 * 
	 * public String toString() { return "id" + this.id + ", " + "name" + this.name
	 * + " ," + "Price  " + this.salesPrice + "," + "origin  " + this.origin ; }
	 */

	
	
	// constructor -p> (empty, full parameter)
	public Item() {

	}

	
	
	public Item(int id, String name, double salesPrice, String origin) {
		
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.origin = origin;
	}

	
	//getter, setter
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

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}


// toString
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", origin=" + origin + "]";
	}
	
	
	
	
	
	
}
