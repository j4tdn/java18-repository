package control;

public class Ex02SwitchCaseDemo {
//ctrl shift O xóa phần dư
	/*
	 * Đề : api error numbers
	 * cho biết status(int) = ? ==> 500 --> Internal Error
	 *                          ==> 404 --> Not Found
	 *                          ==> 400 --> Bad Request
	 *                          ==> ... --> unkown error
	 */
	public static void main(String[] args) {
		 int status = 500; // 404 400 ...
		 
		 String desc = "";
		 
		switch (status){
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
			desc ="Unkown Error";
		}
		System.out.println("switch case desc ==> "+ desc);
	}
}
