package exercise04_book;

public class TextBook extends Book{
	private boolean status;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public TextBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TextBook(String id, float salesPrice, String publisher, boolean status) {
		super("SGK" + id, salesPrice, publisher);
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [id=" + this.getId() + ", salesPrice=" + this.getSalesPrice() + ", publisher=" + this.getPublisher() + ", status=" + status + "]";
	}
	
	
	

}
