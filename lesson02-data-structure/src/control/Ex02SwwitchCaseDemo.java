package control;

public class Ex02SwwitchCaseDemo {
	public static void main(String[] args) {
		int status = 500;
		String desc = "";
		switch (status) {
		case 500:
			desc = "Internal Error";
			break;
		case 404:
			desc = "Not fount";
			break;
		case 400:
			desc = "Bed request";
			break;
		default:
			desc = "Unknonwn Erro";
		}
		System.out.println("switch case desc " + desc);
	}

}
