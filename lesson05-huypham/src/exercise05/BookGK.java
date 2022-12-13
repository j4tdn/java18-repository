package exercise05;

public class BookGK extends BookB{
	private String status;

	public BookGK(int idB, double priceB, String publishingCompany, String status) {
		super(idB, priceB, publishingCompany);
		this.status = status;
	}
	

	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "BookGK [status=" + status + ", toString()=" + super.toString() + "]";
	}
	
}
