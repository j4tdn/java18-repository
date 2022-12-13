package bai4;

public class TextBook {
	private String status, publisher;
    private int id;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	@Override
	public String toString() {
		return "TextBook [status=" + status + ", publisher=" + publisher + ", id=" + id + ", sales=" + sales + "]";
	}
	public TextBook(String status, String publisher, int id, double sales) {
		super();
		this.status = status;
		this.publisher = publisher;
		this.id = id;
		this.sales = sales;
	}
	private double sales;
}
