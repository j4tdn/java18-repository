package bean;

public class TextBook extends Book {
	private boolean isNew;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(String id, double salesPrice, String publisher, boolean isNew) {
		super(id, salesPrice, publisher);
		this.isNew = isNew;
	}
	
	public boolean isNew() {
		return isNew;
	}
	
	@Override
	public String toString() {
		return getId() + ", " + getSalesPrice() + ", " 
				+ getPublisher() + ", " + isNew();
	}
}
