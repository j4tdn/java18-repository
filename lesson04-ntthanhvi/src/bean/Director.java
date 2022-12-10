package bean;

public class Director extends People {
	private double jobCoe;
	
	public Director() {
	}

	public Director(String name, int birthday, double salaryCoe, double jobCoe) {
		super(name, birthday, salaryCoe);
		this.jobCoe = jobCoe;
	}

	public double getJobCoe() {
		return jobCoe;
	}

	public void setJobCoe(double jobCoe) {
		this.jobCoe = jobCoe;
	}

	@Override
	public String toString() {
		return "Director [jobCoe=" + jobCoe + ", toString()=" + super.toString() + "]";
	}
	
}
