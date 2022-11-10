package control;

//import java.lang.runtime.SwitchBootstraps;

public class Ex02SwichCaseDemo {
	public static void main(String[] args) {
		int status = 404;
		String desc = "";
		switch (status) {
		case 500:
			desc = "Intenal Error";
			break;
		case 404:
			desc = "Not Found";
			break;
		case 400:
			desc = "Bad Request";
			break;
		default:
			desc = "UnKnown Error";
		}
		System.out.println(desc);
	}
	
	

	

}
