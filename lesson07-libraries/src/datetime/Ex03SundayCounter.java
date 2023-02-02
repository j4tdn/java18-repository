package datetime;

import java.util.Calendar;

import utils.DateTimeUtils;

public class Ex03SundayCounter {
	
	private static final String PATTERN = "dd/MM/yyy";
	
	public static void main(String[] args) {
		
		int count = 0;
		
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.OCTOBER, 26);
		System.out.println("c --> " + DateTimeUtils.calendarToString(c, PATTERN));
		
		// B1 : Tìm ngày đầu tiên của tháng hiện tại
		Calendar firstDayOfMonth = Calendar.getInstance();
		firstDayOfMonth.setTime(c.getTime());
		firstDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
		
		// B2 : Tìm ngày cuối cùng của tháng hiện tại
		Calendar lastDayOfMonth = Calendar.getInstance();
		lastDayOfMonth.setTime(c.getTime());
		lastDayOfMonth.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		// B3 : Duyệt từ ngày đầu tiên -> cuối cùng, nếu ngày nào là CN thì count ++
		for(Calendar running = firstDayOfMonth; running.before(lastDayOfMonth); running.add(Calendar.DAY_OF_MONTH, 1)) {
			if(running.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(DateTimeUtils.calendarToString(running, PATTERN));
				count++;
			}
		}
		System.out.println(count);
	}
}
