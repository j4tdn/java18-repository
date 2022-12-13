package kf.bai4;

public class ReferBook  extends Book{
	private double tax;
	public ReferBook() {
		// TODO Auto-generated constructor stub
	}
	public ReferBook(String id, double salePrice, String publisher,double tax) {
		super(id, salePrice, publisher);
		this.tax= tax;
		
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public double GetTotal() {
		// TODO Auto-generated method stub
		return this.getSalePrice()*(1+tax/100);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" ,tax"+this.tax;
	}
	
}
