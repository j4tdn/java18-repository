package bean;

public class Referencebooks extends Book{
	private int tax;
	
	public Referencebooks() {

	}

	public Referencebooks(String idBook, double price, String publishC, int tax) {
		super(idBook, price, publishC);
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Referencebooks [tax=" + tax + ", toString()=" + super.toString() + "]";
	}
	
}
