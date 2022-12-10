package homework4;

public class Manager extends CompanyA{
	private double jobCoefficient;
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(String name, String dateOfBirth, double coefficientsSalary, double jobCoefficient) {
		super(name, dateOfBirth, coefficientsSalary);
		this.jobCoefficient = jobCoefficient;
	}
	public double getJobCoefficient() {
		return jobCoefficient;
	}
	public void setJobCoefficient(double jobCoefficient) {
		this.jobCoefficient = jobCoefficient;
	}
	@Override
	public String toString() {
		return super.toString() + "Manager " + jobCoefficient;
	}
	
}
