package control;


import java.time.YearMonth;
import java.util.Scanner;

/**
 * while --> kiểm tra từ điều kiện đầu tiên
 * 
 * do while --> body(do{}) ít nhất thực hiện một lần 
 *          --> bỏ qua lần kiểm tra điều kiện đầu tiên
 * 
 *
 */

public class Ex05LoopDoWhile {
       public static void main(String[] args) {
		     //B1 : Nhập vào năm sinh
    	     //B2 : Nếu nhập đúng --> In ra tuổi của bạn --> thoát chương trình
    	     //B3 : Nếu nhập sai  --> yêu cầu nhập lại --> quạy lại B2
    	   int wrongTimes = 0;
    	   Scanner ip = new Scanner(System.in);
    	   
    	   
    	   //System.out.print("Enter your YOB: ");
    	   String preYob = "";
    	   do {
    		   //TOÁN TỬ 3 NGÔI
    		   String suffix = wrongTimes > 0 ? "(" + wrongTimes + "):" : ":";
    		   // nhập lại
    		   System.out.println("Please enter valid YOB" + suffix);
    		   preYob = ip.nextLine();
    		   if(isNumber(preYob)) {
    			   break;
    		   }
    	       wrongTimes++;
    	       if(wrongTimes == 3);{
    	               System.out.println("WrongTime = 3 .... Exit ...");
    	               System.exit(0); //dừng hẳn chương trình
    	      }
    	   }while(true);
    	   
    	   int yob = Integer.parseInt(preYob);
    	   
    	   int currentYear = YearMonth.now().getYear(); 
    	   System.out.println("Current year: " + currentYear);
    	   
    	   System.out.println("==> Your age: " + (currentYear - yob));
       }	   
        private static boolean isInValidNumber(String text) {
        	return !isNumber(text);
        }
	
       // text: ""
       // text: "123"        --> true
       //     : "a123"       --> false
       //     : "123x189"    --> false
       // 123x789 ==> lenght = 7
       //             index  = [0 , 7)
       
       private static boolean isNumber(String text) {
    	   if(text.length()==0) {
    		   return false;
    	   }
    	   for(int i = 0; i < text.length(); i++) {
    		   char letter = text.charAt(i);
    		   if(letter < '0' || letter > '9') {
    			   return false;
    			   
    		   }
    	   }
    	   return true;
       }
     
}
