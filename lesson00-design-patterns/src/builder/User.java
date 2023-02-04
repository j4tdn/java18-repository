package builder;

/**
 * Vấn đề: Tạo đối tượng từ class với yêu cầu
 * + tập hợp (khác nhau) các thuộc tính từ class đó
 *  ==> Phải tạo rất nhiều hàm khởi tạo(các hàm đó trùng số lượng
 *  tham số + KDL (ko cho phép))
 *  
 * 
 * ==> Builder pattern --> Sử dụng class khác(builder) để 
 * tạo ra(build) đối tượng cho class của mình
 *
 */

public class User {
	private String firstName;
	private String lastName; 
	private int age;
	private String phone;
	private String address;
	
	public static Builder builder() {
		return new Builder();
	}
	
	private User() {
	}
	
	private User(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
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
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	// Sử dụng Builder để tạo ra đối tượng cho User
	// Tạo đối tượng(khởi tạo và gán giá trị cho các thuộc tính)
	public static class Builder {
		private String firstName;
		private String lastName; 
		private int age;
		private String phone;
		private String address;
		
		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public Builder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public Builder withAge(int age) {
			this.age = age;
			return this;
		}
		
		public Builder withPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}
		
		// current builder
		public User build() {
			return new User(this);
		}
		
		
	}
}
