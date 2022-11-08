package control;

import java.util.Scanner;

public class Ex02SwitchCaseDemo {

	public static void main(String[] args) {
		/*
		 * status ==> 500 --> Internal Error
		 * 		  ==> 404 --> Not Found
		 * 		  ==> 400 --> Bad Request
		 * 		  ....	  --> unknown error
		 * */
		String desc = "";
		int status = 500;
		
		switch (status){
		case 500:
			desc = "Internal Error";
			break;
		case 404:
			desc = "Not Found";
			break;
		case 400:
			desc = "Internal Error";
			break;
		default:
			desc = "unknown error";
		}
		
		System.out.println(desc);
	}

}
