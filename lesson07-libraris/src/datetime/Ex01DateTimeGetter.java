package datetime;

import java.util.Date;

public class Ex01DateTimeGetter {
   public static void main(String[] args) {
	 //server --> setup --> UTC +7 --> sys-time-->sys-time of UTC+7
	 //select country/timezone --> sys-time at selection timezone
	 // epoch time --> standard base time: 01:01:1970 00.00.00
	  //unix time --> base time --> add/subtract/duration time
	 System.out.println("0.Lấy thông tin thời gian hiện tại với [timezone]");
	 //Date date = new Date();
	 Date date = new Date(8000000);
	 
	 
	 //Date date = new
	 System.out.println(date);
	 
}  
}
