package control;

import java.time.YearMonth;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;
/**
 * while: kiem tra tu dieu kien dau tien
 * do while: thuc hien it nhat 1 lan
 * bo qu alan kiem tra dau tien
 *
 */

public class Ex05LoopDoWhile {
          public static void main(String[] args) {
			int wrongTimes=0;
        	Scanner ip = new Scanner(System.in);
			
			String preYob="";
	        do {
	        	String suffix=wrongTimes > 0?"(" + wrongTimes +"):" : ":";
	        	System.out.print("please enter Valid YOB"+ suffix);
	        	preYob=ip.nextLine();
	        	if(isNumber(preYob)) {
	        		break;
	        	}
	        	wrongTimes++;
	        	if(wrongTimes ==3) {
	        		System.out.println("wongtimes =3...End");
	        		System.exit(0);
	        	}
	        }	while(true);
			int yob=Integer.parseInt(preYob);
			int currentYear= YearMonth.now().getYear();
			System.out.print(" Current year :" + currentYear);
			System.out.print("\n y age" + (currentYear - yob));
			  
			}
          private static boolean isNumber(String text) {
        	  if(text.length()==0) {
        		  return false;
        	  }
        	  for (int i=0;i<text.length();i++) {
        		  char letter = text.charAt(i);
        		  if(letter <'0'||letter>'9') {
        			return false;  
        		  }
        			  
        	  }
        	  return true;
        	  }
           private static boolean isInValidNumber(String text) {
        	    return !isNumber(text);   
           }
           
          }
		

