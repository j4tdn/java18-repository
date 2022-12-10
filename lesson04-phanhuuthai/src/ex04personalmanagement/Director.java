package ex04personalmanagement;

public class Director extends Personal{
	private double jobCoefficient;
	
	public Director() {
	}

	public Director(String name, String dob, double cofficientsSalary, double jobCoefficient) {
		super(name, dob, cofficientsSalary);
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
		return "Director [jobCoefficient=" + jobCoefficient + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calSalary() {
		return (this.jobCoefficient + this.getCofficientsSalary())*3000000;
	}
	
}
