package inheritance;

public class Book {
	private String id;
	private String name;
	private double salesPrice;

	public Book() {
	}

	public Book(String id, String name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
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

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}

}