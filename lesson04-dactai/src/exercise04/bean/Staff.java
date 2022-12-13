package exercise04.bean;

public abstract class Staff {
	private String name;
	private String dob;
	private float coefficientsSalary;
	
	public Staff() {
		// TODO Auto-generated constructor stub
	}
	
	public Staff(String name, String dob, float coefficientsSalary) {
		super();
		this.name = name;
		this.dob = dob;
		this.coefficientsSalary = coefficientsSalary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}
	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return "name: " + name + ", dob: " + dob + ", coefficientsSalary: " + coefficientsSalary;
	}
	
	public abstract float calSalary();
	
	

}
