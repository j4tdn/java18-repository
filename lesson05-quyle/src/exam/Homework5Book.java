package exam;

public class Homework5Book {
	private String codeBook;
	private int unitPrice;
	private String publishingCompany;
	public Homework5Book() {
		// TODO Auto-generated constructor stub
	}
	public Homework5Book(String codeBook, int unitPrice, String publishingCompany) {
		this.codeBook = codeBook;
		this.unitPrice = unitPrice;
		this.publishingCompany = publishingCompany;
	}
	public String getCodeBook() {
		return codeBook;
	}
	public void setCodeBook(String codeBook) {
		this.codeBook = codeBook;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getPublishingCompany() {
		return publishingCompany;
	}
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	@Override
	public String toString() {
		return  codeBook + " " + unitPrice + " " +
				 publishingCompany + " " ;
	}
	

}
