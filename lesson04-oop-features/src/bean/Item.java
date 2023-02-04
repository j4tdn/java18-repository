package bean;

public class Item {
	public static final int ID = 1;
	public static final int NAME = 2;
	public static final int SALES_PRICE = 3;
	
	private int id;
	private String name;
	private double salesPrice;
	
	public Item() {
	}

	public Item(int id, String name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	
	public Object get(int field) {
		switch (field) {
		case ID:
			return id;
		case NAME:
			return name;
		case SALES_PRICE:
			return salesPrice;
		}
		return null;
	}
	
	public void set(int field, Object value) {
		switch (field) {
		case ID:
			this.id = Integer.parseInt(value.toString());
			break;
		case NAME:
			this.name = value.toString();
			break;
		case SALES_PRICE:
			this.salesPrice = Double.parseDouble(value.toString());
		}
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
	
	// itemA.toString
	// itemB.toString
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + salesPrice;
	}
}
