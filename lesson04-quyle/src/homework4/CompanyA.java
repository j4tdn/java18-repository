package homework4;

public class CompanyA {
	private String name;
	private String dateOfBirth;
	private double coefficientsSalary;

	public CompanyA() {
	}

	public CompanyA(String name, String dateOfBirth, double coefficientsSalary) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return "name : " + name + ", dateOfBirth : " + dateOfBirth + ", coefficientsSalary : " + coefficientsSalary + " ";
	}
	

}
