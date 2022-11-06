package control;

public class Ex02SwitchCaseDemo {
	public static void main(String[] args) {
		int status = 404; // 404 400...
		
		String desc = "";
		
		switch(status) {
		case 500:
			desc = "Internal Error";
			break;
		case 404:
			desc = "Not found";
			break;
		case 400:
			desc = "Bad Request";
			break;
		default:
			desc = "Unknown Error";
		}
		System.out.println("switch case desc: " + desc);
	}
}
