package bean;

import java.time.LocalDate;

public class Employee {
	
	private Integer id;
	private String name;
	private LocalDate dateOfBirth;
	private String address;
	private String phone;
	private Boolean gender;
	private String email;
	private String password;
	
	public Employee() {
	}
	
	

	public Employee(String email, String password) {
		this.email = email;
		this.password = password;
	}


	public Employee(Integer id, String name, LocalDate dateOfBirth, String address, String phone, Boolean gender,
			String email, String password) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
		this.email = email;
		this.password = password;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public Boolean getGender() {
		return gender;
	}



	public void setGender(Boolean gender) {
		this.gender = gender;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", phone=" + phone + ", gender=" + gender + ", email=" + email + "]";
	}
}