package bean;

import java.time.LocalDateTime;

public class Employee {
	
	private Integer id;
	private String name;
	private LocalDateTime dateOfBirth;
	private String address;
	private String phone;
	private Boolean gender;
	private String email;
	private String passWord;
	public Integer getId() {
		return id;
	}
	public void WithId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDateTime dateOfBirth) {
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
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public Employee() {
	}
	
	public Employee(String email, String passWord) {
//		super();
		this.email = email;
		this.passWord = passWord;
	}
	public Employee(Integer id, String name, LocalDateTime dateOfBirth, String address, String phone, Boolean gender,
			String email, String passWord) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
		this.email = email;
		this.passWord = passWord;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", phone=" + phone + ", gender=" + gender + ", email=" + email + ", passWord=" + passWord + "]";
	}
	
	
}
