package ex04;

import java.time.LocalDate;

/**
 * Viết chương trình quản lý nhân sự tại công ty A gồm các loại nhân sự sau đây.
 * a. Giám đốc: họ tên, ngày sinh, hệ số lương, hệ số chức vụ. 
 * b. Trưởng phòng: họ tên, ngày sinh, hệ số lương, số lượng nhân viên quản lý 
 * c. Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị(phòng/ban)
 */

public class Staff extends Employee {
	private String department;
	
	public Staff() {
	}

	public Staff(String fullname, LocalDate dateOfBirth, double coefficientsSalary, String department) {
		super(fullname, dateOfBirth, coefficientsSalary);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Staff [department=" + department + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double getSalary() {
		return getCoefficientsSalary()*1250000;
	}

}
