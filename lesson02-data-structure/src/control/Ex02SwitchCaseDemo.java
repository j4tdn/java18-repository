package control;

public class Ex02SwitchCaseDemo {
	public static void main(String[] args) {
		int status = 500;
		String desc = "";
		switch (status) {
		case 500:
			desc ="Internal Error";
			break;
		case 404:
			desc ="NOT";
			break;
		case 400:
			desc ="BAD";
			break;

		default:
			desc =" Unknown";
		}
		System.out.println("switch case desc : " + desc);
	}
}
