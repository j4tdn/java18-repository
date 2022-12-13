package bai4;

public class ReferenceBooks {
	private double tax, sales;
	private String publisher;
	int id;
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ReferenceBooks [tax=" + tax + ", sales=" + sales + ", publisher=" + publisher + ", id=" + id + "]";
	}
	public ReferenceBooks(double tax, double sales, String publisher, int id) {
		super();
		this.tax = tax;
		this.sales = sales;
		this.publisher = publisher;
		this.id = id;
	}
}
