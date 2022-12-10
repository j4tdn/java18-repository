package ex04;

import java.time.LocalDate;

/**
 * Viết chương trình quản lý nhân sự tại công ty A gồm các loại nhân sự sau đây.
 * a. Giám đốc: họ tên, ngày sinh, hệ số lương, hệ số chức vụ. 
 * b. Trưởng phòng: họ tên, ngày sinh, hệ số lương, số lượng nhân viên quản lý 
 * c. Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị(phòng/ban)
 */

public class Director extends Employee {
	private double jobCoefficient;

	public Director() {
	}

	public Director(String fullname, LocalDate dateOfBirth, double coefficientsSalary, double jobCoefficient) {
		super(fullname, dateOfBirth, coefficientsSalary);
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
	public double getSalary() {
		return (getCoefficientsSalary() + jobCoefficient) * 3000000;
	}

}
