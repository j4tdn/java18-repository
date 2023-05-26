package bean;

import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * Khi một đối tượng được ghi vào 
	 * --> ghi kèm theo serialVersionUID
	 * --> để khi lấy ra thì biết lấy ra giá trị thuộc tính của đối tượng nào
	 * (TH các class có chung thuộc tính)
	 */
	private static final long serialVersionUID = -1242569029488869499L;
	private int id;
	private transient String name; // nếu thêm transient --> thông tin này sẽ không được hiển thị
	private double salary;

	public Employee() {
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
