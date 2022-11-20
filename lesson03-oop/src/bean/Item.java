package bean;

public class Item {

	// thuộc tính trong class

	private int id;
	private String name;
	private double salesPrice;
	private String origin;

	// constructor -- hàm khởi tạo rỗng
	public Item() {

	}

	// hàm khởi tạo đầy đủ tham số
	public Item(int pid, String pname, double psalesPrice, String porigin) {
		this.id = pid;
		this.name = pname;
		this.salesPrice = psalesPrice;
		this.origin = porigin;
	}
	// setter, getter, toString

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

	@Override
	public String toString() {
		return "id" + this.id + ", " + "n" + this.name + ", " + "sP" + this.salesPrice + ", " + "or" + this.origin;

	}
}
