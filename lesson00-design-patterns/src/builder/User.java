package builder;

import java.lang.module.ModuleDescriptor.Builder;

public class User {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	
	public static Builder buider() {
		return new Builder();
	}
	
	private User() {

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
		return "Builder [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	private User(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	
	// Sử dụng builder để tạo đối tượng cho User
	// Tạo đối tượng (khởi tạo giá trị cho các thuộc tính)
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
		
		public User build() {
			return new User(this);
		}

	}
}
