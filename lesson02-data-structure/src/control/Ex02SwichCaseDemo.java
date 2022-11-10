package control;

public class Ex02SwichCaseDemo {
	/*
	 * Ex: API error number
	 * status(int) = ? ==> 500 --> Internal Error
	 * 				   ==> 404 --> Not found
	 * 				   ==> 400 --> Bad request
	 * 				   ==> ... --> unknown error 
	 */
	
	public static void main(String[] args) {
		int status = 400;
		
		String desc = "";
		
		switch (status) {
		case 500: {
			desc = "Internal Error";
			break;
		}
		case 404: {
			desc = "Not found";
			break;
		}
		case 400: {
			desc = "Bad request";
			break;
		}
		default:
			desc = "Unknown error";
		}
		System.out.println("description ==> " + desc);
		
	}

}
