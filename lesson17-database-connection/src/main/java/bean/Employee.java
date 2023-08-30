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
	public Employee(Integer id, String name, LocalDate dateOfBirth, String address, String phone, Boolean gender,
			String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
		this.email = email;
		this.password = password;
	}
	public Employee(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public static Employee of() {
		return new Employee();
	}
	public Integer getId() {
		return id;
	}
	public Employee withId(Integer id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Employee withName(String name) {
		this.name = name;
		return this;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public Employee withDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}
	public String getAddress() {
		return address;
	}
	public Employee withAddress(String address) {
		this.address = address;
		return this;
	}
	public String getPhone() {
		return phone;
	}
	public Employee withPhone(String phone) {
		this.phone = phone;
		return this;
	}
	public Boolean getGender() {
		return gender;
	}
	public Employee withGender(Boolean gender) {
		this.gender = gender;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public Employee withEmail(String email) {
		this.email = email;
		return this;
	}
	public String getPassword() {
		return password;
	}
	public Employee withPassword(String password) {
		this.password = password;
		return this;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", phone=" + phone + ", gender=" + gender + ", email=" + email + ", password=" + password + "]";
	}
	
	
	

}
