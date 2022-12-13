package exam;

public class Homework5ReferenceBooks extends Homework5Book {
	private int vax;

	public Homework5ReferenceBooks() {
		// TODO Auto-generated constructor stub
	}

	public Homework5ReferenceBooks(String codeBook, int unitPrice, String publishingCompany, int vax) {
		super(codeBook, unitPrice, publishingCompany);
		this.vax = vax;
	}

	public int getVax() {
		return vax;
	}

	public void setVax(int vax) {
		this.vax = vax;
	}

	@Override
	public String toString() {
		return  vax +" " + super.toString()+ " " ;
	}
	

}
