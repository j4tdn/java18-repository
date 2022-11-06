package control;

public class Ex02SwithCaseDemo {
	/*
	EX: api error number
	CHo biết status(int) = ? ==> 500 --> Internal Error
							 ==> 404 --> Not Found
							 ==> 400 --> Bad request
							 ...     --> unknown error
	*/ 
	public static void main(String[] args) {
		// Khi các biểu thức if else chỉ có toán tử == -> có thể thay bằng Switch case
		int status = 40/0;
		
		String desc = "";
		switch (status) {
		case 500:
			desc = "Internal Error";
			break;
		case 404:
			desc = "Not found";
			break;
		case 400:
			desc = "Bad request";
			break;
		default:
			desc = "Unknown error";
		}
		System.out.println("if else desc = " + desc);
		
	}
}
