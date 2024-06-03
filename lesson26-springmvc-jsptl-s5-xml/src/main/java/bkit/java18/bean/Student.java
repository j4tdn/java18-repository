package bkit.java18.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	
	@NotNull(message="Id is required")
	private String id;
	
	@NotNull(message="Name is required")
	private String name;
	
	@NotNull(message="Phone is required")
	@Size(max = 20, message = "Max length is 20 letters")
	private String phone;
	
	public Student() {
	}

	public Student(String id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
}
