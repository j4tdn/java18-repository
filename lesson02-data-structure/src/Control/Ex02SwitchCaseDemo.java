package Control;

public class Ex02SwitchCaseDemo {
	public static void main(String[] args) {
		// khi các biểu thức if esle cho toán tử ==
		// --> thay thế bằng switch case
		int status = 500;
		String desc = "";
		switch (status) {
		case 500:
			desc = "Intenal Error";
			break;
		case 404:
			desc = "Not found";
			break;
		case 400:
			desc = "Bad request";
			break;
		default:
			desc = "Unknown Error";		
		}
		System.out.println("switch case desc ==> " + desc);
	}
}
