package ex04personalmanagement;

public class Manager extends Personal{
	private int numberOfEmployee;
	
	public Manager() {
	}

	public Manager(String name, String dob, double cofficientsSalary, int numberOfEmployee) {
		super(name, dob, cofficientsSalary);
		this.numberOfEmployee = numberOfEmployee;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public String toString() {
		return "Manager [numberOfEmployee=" + numberOfEmployee + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public double calSalary() {
		return this.getCofficientsSalary()*2200000;
	}
}
