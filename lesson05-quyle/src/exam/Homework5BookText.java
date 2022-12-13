package exam;

public class Homework5BookText extends Homework5Book {
	private boolean isNew;
	public Homework5BookText() {
		// TODO Auto-generated constructor stub
	}
	public Homework5BookText(String codeBook, int unitPrice, String publishingCompany, boolean isNew) {
		super(codeBook, unitPrice, publishingCompany);
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
		return  isNew  + " "+ super.toString() +" " ;
	}
	
	

}
