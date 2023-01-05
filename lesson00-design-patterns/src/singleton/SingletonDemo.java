package singleton;

import java.util.Calendar;
import java.util.Locale;

public class SingletonDemo {
	
	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getInstance();
		s1.value = 99;
		System.out.println("s1 code: " + System.identityHashCode(s1));
		System.out.println("s1 value: " + s1.value);
		
		SingletonClass s2 = SingletonClass.getInstance();
		System.out.println("s2 code: " + System.identityHashCode(s2));
		System.out.println("s2 value: " + s2.value);
		
		Calendar c = Calendar.getInstance();
		System.out.println("c: " + c);
		
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		
		System.out.println("default locale: " + Locale.getDefault());
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("month/year: " + month + "/" + year);
		
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int weekOfYear  = c.get(Calendar.WEEK_OF_YEAR);
		
		System.out.println("dayOfMonth: " + dayOfMonth);
		System.out.println("dayOfYear: " + dayOfYear);
		System.out.println("weekOfYear: " + weekOfYear);
		
		c.set(Calendar.YEAR, 2020);
		
		int fdow = c.getFirstDayOfWeek();
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		System.out.println("fdow: " + fdow);
		System.out.println("daysInMonth: " + daysInMonth);
		System.out.println("daysInYear: " + daysInYear);
		
		
		
	}
}
