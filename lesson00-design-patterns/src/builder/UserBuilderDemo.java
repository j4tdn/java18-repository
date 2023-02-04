package builder;

public class UserBuilderDemo {
	public static void main(String[] args) {
		// --> Tạo ra đối tượng cho User
		
		// --> Sử dụng Builder --> tạo ra đối tượng
		
		// Gán giá trị trong Builder về User
		
		User user = User.builder() // 1 đối tượng builder
			.withFirstName("Teo")
			.withLastName("Le")
			.withAge(28)
			.build();
		
		System.out.println("===> " + user);
		
		System.out.println("========= 2nd level ============");
		UserAdv userAdv = UserAdv.newInstance()
					.withFirstName("Nam")
					.withAge(36);
		System.out.println("userAdv ===> " + userAdv);
		
	}
}
