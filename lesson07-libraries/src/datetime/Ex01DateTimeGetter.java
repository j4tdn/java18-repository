package datetime;

import java.util.Date;

public class Ex01DateTimeGetter {
	public static void main(String[] args) {
		long currentTimeInMs = System.currentTimeMillis();
		System.out.println("Current time in ms: " + currentTimeInMs);
		
		System.out.println("0. Lay thong tin thoi gian hien tai");
		Date date = new Date(currentTimeInMs);
		System.out.println("date: " + date);
		
	}
}
