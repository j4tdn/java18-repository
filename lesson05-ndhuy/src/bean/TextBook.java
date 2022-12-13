package bean;

public class TextBook extends Book {
	private boolean isNew;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(String id, double price, String publishingCompany, boolean isNew) {
		super(id, price, publishingCompany);
		this.isNew = isNew;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "TextBooks [isNew=" + isNew + ", toString()=" + super.toString() + "]";
	}	
	
}
