package control;

public class Ex02SwitchCaseDemo {
	public static void main(String[] args) {
		int status = 500;

		String desc = "";
		if (status == 500) {
			desc = "Internal Error";
		} else if (status == 404) {
			desc = "not Found";
		} else if (status == 400) {
			desc = "Bad Request";
		} else {
			desc = "Unknown Error";
		}
		System.out.println("if else desc ==> " + desc);

		switch (status) {
		case 500:
			desc = "Internal Error";
			break;
		case 404:
			desc = "not found";
			break;
		case 400:
			desc = "Bad Request";
			break;
		default:
			desc = "Unknow Error";
			break;
		}
		System.out.println("switch  case desc ==> " + desc);
	}

}
