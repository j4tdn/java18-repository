package control;

public class Ex02SwitchCaseDemo {
	public static void main(String[] args) {
		int status = 500;
		String desc = "";
		switch (status) {
		case 500:
			desc = "Internal Error";
			break;
		case 404:
			desc = "Not Found";
			break;
		case 400:
			desc = "Bad Request";
			break;

		default:
			desc = "Unkown Error";
			break;
		}
		
		System.out.println(desc);
	}
}
