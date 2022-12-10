package ex04;

import java.time.LocalDate;

/**
 * Viết chương trình quản lý nhân sự tại công ty A gồm các loại nhân sự sau đây.
 * a. Giám đốc: họ tên, ngày sinh, hệ số lương, hệ số chức vụ. 
 * b. Trưởng phòng: họ tên, ngày sinh, hệ số lương, số lượng nhân viên quản lý 
 * c. Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị(phòng/ban)
 */

public class Manager extends Employee {
	private int numberOfStaff;

	public Manager() {
	}

	public Manager(String fullname, LocalDate dateOfBirth, double coefficientsSalary, int numberOfStaff) {
		super(fullname, dateOfBirth, coefficientsSalary);
		this.numberOfStaff = numberOfStaff;
	}

	public int getNumberOfStaff() {
		return numberOfStaff;
	}

	public void setNumberOfStaff(int numberOfStaff) {
		this.numberOfStaff = numberOfStaff;
	}

	@Override
	public String toString() {
		return "Manager [numberOfStaff=" + numberOfStaff + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double getSalary() {
		return getCoefficientsSalary() * 2200000;
	}

}
