package builder;

import builder.User.Builder;

public class UserAdv {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	
	private UserAdv() {
		// TODO Auto-generated constructor stub
	}
	
	public static UserAdv newInstance() {
		return new UserAdv();
	}
	
	public UserAdv withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	public UserAdv withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public UserAdv withAge(int age) {
		this.age = age;
		return this;
	}
	
	public UserAdv withPhone(String phone) {
		this.phone = phone;
		return this;
	}
	
	public UserAdv withAddress(String address) {
		this.address = address;
		return this;
	}

	@Override
	public String toString() {
		return "UserAdv [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	
}
