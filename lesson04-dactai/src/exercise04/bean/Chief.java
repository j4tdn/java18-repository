package exercise04.bean;

public class Chief extends Staff{
	private int numOfEmployee;
	
	public Chief() {
		// TODO Auto-generated constructor stub
	}

	public Chief(String name, String dob, float coefficientsSalary, int numOfEmployee) {
		super(name, dob, coefficientsSalary);
		this.numOfEmployee = numOfEmployee;
		// TODO Auto-generated constructor stub
	}

	public int getNumOfEmployee() {
		return numOfEmployee;
	}

	public void setNumOfEmployee(int numOfEmployee) {
		this.numOfEmployee = numOfEmployee;
	}

	@Override
	public String toString() {
		return super.toString() + " ,number of employee: " + numOfEmployee;
	}

	@Override
	public float calSalary() {
		return (float) (this.getCoefficientsSalary() * 3000000);
	}



}
