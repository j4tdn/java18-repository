package ex04;

import java.time.LocalDate;

/**
 * Viết chương trình quản lý nhân sự tại công ty A gồm các loại nhân sự sau đây.
 * a. Giám đốc: họ tên, ngày sinh, hệ số lương, hệ số chức vụ. 
 * b. Trưởng phòng: họ tên, ngày sinh, hệ số lương, số lượng nhân viên quản lý 
 * c. Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị(phòng/ban)
 */

public abstract class Employee {
	private String fullname;
	private LocalDate dateOfBirth;
	private double coefficientsSalary;

	public Employee() {
	}

	public Employee(String fullname, LocalDate dateOfBirth, double coefficientsSalary) {
		this.fullname = fullname;
		this.dateOfBirth = dateOfBirth;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
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
		return "Employee [fullname=" + fullname + ", dateOfBirth=" + dateOfBirth + ", coefficientsSalary="
				+ coefficientsSalary + "]";
	}

	public abstract double getSalary();

}
