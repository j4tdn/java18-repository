package Exercise1511;
/**
 * --> Tạo class tên là Item
	 + id : int
	 + name : String
	 + salePrice : double
	 + origin : String
 */
public class Iteam {
	private int id;
	private String name;
	private double salePrice;
	private String origin;
	
	public Iteam() {
		
	}
	
	public Iteam(int id, String name, double salePrice, String origin) {
		this.id = id;
		this.name = name;
		this.salePrice = salePrice;
		this.origin = origin;
	}
	
	@Override
	public String toString() {
		return "id: " + this.id + ", name: " + this.name 
			      + ", salePrice: " + this.salePrice + ", origin: " + this.origin;
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
	
	
}
