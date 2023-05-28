package builder;

public class UserbuilderDemo {
	public static void main(String[] args) {

		User user = User.builder() // 1 đối tượng builder
			.withFirstName("Teo")
			.withLastName("Le")
			.withAge(28)
			.build();
		
		System.out.println("===> " + user);
		
		System.out.println("========= 2nd level ============");
		UserAdv userAdv = UserAdv.newInstance()
					.withFirstName("Nam")
					.withAge(36)
					.withAddress("chuongcho");
		System.out.println("userAdv ===> " + userAdv);
	}
}
