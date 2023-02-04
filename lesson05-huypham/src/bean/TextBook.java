package bean;

public class TextBook extends Book{
	private boolean isNew;
	
	public TextBook() {
		
	}
	
	public boolean getNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public TextBook(int id, double salePrice, String publisher, boolean isNew) {
		super(id, salePrice, publisher);
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "Book [id=" + super.getId() + ", salePrice=" + super.getSalePrice() + ", publisher=" + super.getPublisher() + "TextBook [isNew=" + isNew + "]";
	}

	
	
	
	
	
	
}
