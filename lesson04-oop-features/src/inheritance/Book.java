package inheritance;

public class Book {
	private String id;
	private String name;
	private double salePrice;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String id, String name, double salePrice) {
		this.id = id;
		this.name = name;
		this.salePrice = salePrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", salePrice=" + salePrice + "]";
	}
}
