package ex04personalmanagement;

public class Personal {
	private String name;
	private String dob;
	private double cofficientsSalary;
	
	public Personal() {
	}

	public Personal(String name, String dob, double cofficientsSalary) {
		super();
		this.name = name;
		this.dob = dob;
		this.cofficientsSalary = cofficientsSalary;
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

	public double getCofficientsSalary() {
		return cofficientsSalary;
	}

	public void setCofficientsSalary(double cofficientsSalary) {
		this.cofficientsSalary = cofficientsSalary;
	}

	@Override
	public String toString() {
		return "Personal [name=" + name + ", dob=" + dob + ", cofficientsSalary=" + cofficientsSalary + "]";
	}
	
	public double calSalary() {
		return getCofficientsSalary();
	}
}
