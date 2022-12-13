package book;

public class ReferenceBooks extends Book {
	private double tax, sales;
	private String publisher,id;
	
	public ReferenceBooks() {
		super();
	}

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

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void Book() {
        super.Book();
        System.out.print("Nhập thuế: ");
        tax = scanner.nextDouble();
    }

	@Override
	public String toString() {
		return "ReferenceBooks [tax=" + tax + ", sales=" + sales + ", publisher=" + publisher + ", id=" + id + "]";
	}

}
