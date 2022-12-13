package kf.bai4;

public class TextBook extends Book {
	private String status;
	public TextBook() {
		// TODO Auto-generated constructor stub
	}
	public TextBook(String id, double salePrice, String publisher,String status) {
		super(id, salePrice, publisher);
		this.status = status;
		// TODO Auto-generated constructor stub
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public double GetTotal() {
		double result =0;
		if(this.status=="Moi") {
			result= this.getSalePrice();
		}
		else if(this.status=="Cu") {
			result= this.getSalePrice()*30/100;
		}
		return result;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" ,Status = "+this.status;
	}
	
}
