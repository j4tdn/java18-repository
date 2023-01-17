package bean;

import java.sql.Date;

public class President extends Person {
	private double coefficientJob;
	
	public President() {
		// TODO Auto-generated constructor stub
	}	

	public President(String fullName, Date birthDay, Double coefficientSalary, double coefficientJob) {
		super(fullName, birthDay, coefficientSalary);
		this.coefficientJob = coefficientJob;
	}

	public double getCoefficientJob() {
		return coefficientJob;
	}

	public void setCoefficientJob(double coefficientJob) {
		this.coefficientJob = coefficientJob;
	}

	@Override
	public String toString() {
		return "President [" + super.toString()+"coefficientJob=" + coefficientJob+"]";
	}
}
