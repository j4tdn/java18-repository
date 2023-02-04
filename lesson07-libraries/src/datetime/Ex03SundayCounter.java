package datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex03SundayCounter {
	
	private static final String PATTERN = "dd.MM.yyyy";
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.OCTOBER, 26);
		printf("input", c);
		
		// B1: Tìm được ngày đầu tiên của tháng hiện tại
		Calendar firstDayOfMonth = clone(c, 1);
		printf("firstDayOfMonth", firstDayOfMonth);
		
		// B2: tìm ngày cuối cùng của tháng hiện tại
		Calendar lastDayOfMonth = clone(c, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		printf("lastDayOfMonth", lastDayOfMonth);
		
		//B3: Duyệt từ ngày đầu đến cuối
		// nếu ngày nào là SUNDAY thì in ra
		
		lastDayOfMonth.add(Calendar.DAY_OF_MONTH, 1); // first day ò new month
		for(Calendar day = firstDayOfMonth; day.before(lastDayOfMonth);) {
			if(Calendar.SUNDAY == day.get(Calendar.DAY_OF_WEEK)) {
				printf("", day);
				day.add(Calendar.WEEK_OF_MONTH, 1);
			} else {
				day.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
	}
	
	private static Calendar clone(Calendar source, int dayOfMonth) {
		Calendar target = Calendar.getInstance();
		target.setTime(source.getTime());
		target.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		return target;
	}
	
	private static void printf(final String prefix, Calendar c) {
		System.out.println(prefix + " --> " + DateUtils.calendarToString(c, prefix));
	}
}
