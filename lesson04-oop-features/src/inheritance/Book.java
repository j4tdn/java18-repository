package inheritance;

public class Book {
	private String id;
	private String name;
	private double salsPrice;

	public Book() {

	}

	public Book(String id, String name, double salsPrice) {
		super();
		this.id = id;
		this.name = name;
		this.salsPrice = salsPrice;
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

	public double getSalsPrice() {
		return salsPrice;
	}

	public void setSalsPrice(double salsPrice) {
		this.salsPrice = salsPrice;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", salsPrice=" + salsPrice + "]";
	}

}