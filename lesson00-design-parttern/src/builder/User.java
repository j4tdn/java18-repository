package builder;
/*
 * Vấn đề: Tạo đối tượng từ class với yêu cầu
 * 	+ Tập hợp (khác nhau) các thuộc tính từ class đó
 * ==> phải tạo rất nhiều hàm khởi tạo
 * 
 * 
 */


public class User {
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;
	
	private User() {
		
	} 
	private User(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = age;
		this.phone = builder.phone;
		this.address = builder.address;
	}
	
	public static class Builder {
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String address;

		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public Builder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			return new User(this);
		}	
}
}
