package homework4;

public class Generalinchief extends CompanyA {
	private int nOMStaff;

	public Generalinchief() {
		// TODO Auto-generated constructor stub
	}

	public Generalinchief(String name, String dateOfBirth, double coefficientsSalary, int nOMStaff) {
		super(name, dateOfBirth, coefficientsSalary);
		this.nOMStaff = nOMStaff;
	}

	public int getnOMStaff() {
		return nOMStaff;
	}

	public void setnOMStaff(int nOMStaff) {
		this.nOMStaff = nOMStaff;
	}

	@Override
	public String toString() {
		return super.toString() + "Generalinchief " + nOMStaff ;
	}

}
