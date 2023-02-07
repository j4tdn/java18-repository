package builder;

/**
 * UserAdv is builder of User contains User properties
 * or User object(contains properties) inside
 *
 * @author qphan
 */
public class UserAdv {
	private String firstName;
	private String lastName; 
	private int age;
	private String phone;
	private String address;
	
	// firstName, lastName, phone
	// firstName, lastName, address
	
	private UserAdv() {
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
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "UserAdv [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
}
