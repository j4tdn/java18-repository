package builder;

import builder.User.Builder;

public class UserBuilder {
	public static void main(String[] args) {
		// --> Tạo ra đối tượng cho User
		// --> Sử dụng Builder
		User user = User.Builder().setFirstName("Tra");
		
	}
}
