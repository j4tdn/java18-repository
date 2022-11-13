package control;

public class Ex02SwitchCaseDemo {
	/**
	 Ex03: api error numbers
		Cho biết status(int) = ? ==> 500 --> Internal Error
		                         ==> 404 --> Not Found
							     ==> 400 --> Bad Request 
							     ....    --> unknown error
	 */
	public static void main(String[] args) {
		// Khi các biểu thức if else cho toán tử ==
		// --> thay thế bằng switch case
		int status = 500; // 404 400 ...
		
		// switch case (without break) --> if if if
		// switch case (break) --> if else if else if else
		
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
			desc = "Unknown Error";
		}
		System.out.println("switch case desc ===> " + desc);
		
		if (status == 500) {
			desc = "Internal Error";
		} else if (status == 404) {
			desc = "Not Found";
		} else if (status == 400) {
			desc = "Bad Request";
		} else {
			desc = "Unknown Error";
		}
		System.out.println("if else desc ===> " + desc);
	}
}
