package datetime;

import java.util.Calendar;
import java.util.Date;

public class Ex01DateTimeGetter {
	public static void main(String[] args) {
		//sever --> setup --> UTC+7
		//sys-time --> sys-time of UTC+7
		
		//epoch time --> standard base time: 01:01:1970 00:00:00
		//unix time --> base time --> add/subtract/duration time
		long currentTimeInMs = System.currentTimeMillis();
		System.out.println("Curent time in millis: " + currentTimeInMs);
		
		System.out.println("0, Lấy thông tin thời gian hiện tại với [timezone]");
		//Date date = new Date();
		Date date = new Date(currentTimeInMs);
		//Date dateAsString = new Date("");
		System.out.println("date: " + date);
		
		//Since JAVA 1.1
		//Calendar --> Singleton(unique) at getting time
		Calendar calendar = Calendar.getInstance();
		
		//Singleton: creational desigin pattern
		// normal class --> 1-N objects
		// singleton class --> 1 object
		
		
	}
}
