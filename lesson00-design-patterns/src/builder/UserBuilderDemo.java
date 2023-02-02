package builder;

public class UserBuilderDemo {
	public static void main(String[] args) {
		User user = User.buider()
			.withFirstName("Nguyen")
			.withAge(21)
			.withPhone("0399482114")
			.build();
		
		System.out.println("User --> " + user);
	}
}
