package exercise04.bean;

public class Director extends Staff{
	private float jobCoefficients;
	
	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(String name, String dob, float coefficientsSalary, float jobCoefficients) {
		super(name, dob, coefficientsSalary);
		this.jobCoefficients = jobCoefficients;
	}

	public double getJobCoefficients() {
		return jobCoefficients;
	}

	public void setJobCoefficients(float jobCoefficients) {
		this.jobCoefficients = jobCoefficients;
	}
	
	@Override
	public String toString() {
		return super.toString() + " ,job coeficients: " + jobCoefficients;
	}

	@Override
	public float calSalary() {
		// TODO Auto-generated method stub
		return (float) ((this.getCoefficientsSalary() * jobCoefficients) * 2200000);
	}

	
}
