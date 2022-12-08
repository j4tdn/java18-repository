package inherritan;

public class ClassicalBook extends Book{
	private boolean isNew;
	public ClassicalBook() {
		// TODO Auto-generated constructor stub
	}
	public ClassicalBook(String id, String name, double salesPrice, boolean isNew) {
		super(id, name, salesPrice);
		this.isNew = isNew;
	}
	public boolean isIsNew() {
		return isNew;
	}
	public void setIsNew(boolean isNew) {
		this.isNew = isNew;
	}
	@Override
	public String toString() {
		return "ClassicalBook [sach=" + isNew + ", toString()=" + super.toString() + "]";
	}
	
}
