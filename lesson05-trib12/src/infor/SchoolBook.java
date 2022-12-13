package infor;

public class SchoolBook extends Book {
	private String Status;
	
	public SchoolBook() {
		// TODO Auto-generated constructor stub
	}

	public SchoolBook(String idBook, Double salesPrice, String publisher, String status) {
		super(idBook, salesPrice, publisher);
		Status = status;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "ReferenceBook [Status=" + Status + ", toString()=" + super.toString() + "]";
	}


	
	

}
