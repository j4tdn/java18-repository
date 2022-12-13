package exercise05;

public class BookB {
	private int idB;
	private double priceB;
	private String publishingCompany;
	
	public BookB(int idB, double priceB, String publishingCompany) {
		this.idB = idB;
		this.priceB = priceB;
		this.publishingCompany = publishingCompany;
	}

	public BookB() {
	}

	public int getIdB() {
		return idB;
	}

	public void setIdB(int idB) {
		this.idB = idB;
	}

	public double getPriceB() {
		return priceB;
	}

	public void setPriceB(double priceB) {
		this.priceB = priceB;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	@Override
	public String toString() {
		return "Book [idB=" + idB + ", priceB=" + priceB + ", publishingCompany=" + publishingCompany + "]";
	}

}
