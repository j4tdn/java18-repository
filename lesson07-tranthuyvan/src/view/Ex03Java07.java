package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/**
 * Viết chương trình, mỗi chức năng một phương thức
 * 1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
 * 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
 * 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
 * 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
 * 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
 * 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
 */

public class Ex03Java07 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		df.setTimeZone(TimeZone.getTimeZone("Japan"));
		String datetime = df.format(c.getTime());

		System.out.println("1. Current time in Japan: " + datetime);
		System.out.println("2. The last date of current month: " + getLastDate(c));
		getFirstAndLastDow(c);
		System.out.println("4. It is week number " + c.get(Calendar.WEEK_OF_YEAR) + " of the year.");
		addDay(c);
		live(c);
	}

	private static void live(Calendar date) {
		Calendar dayOfBirth = Calendar.getInstance();
		dayOfBirth.set(1997, 05, 21);

		Calendar now = Calendar.getInstance();

		if (now.before(dayOfBirth)) {
			throw new IllegalArgumentException("Day of birth must be less than now (time)");
		}

		long dayOfBirthInMs = dayOfBirth.getTimeInMillis();
		long nowInMs = now.getTimeInMillis();

		long duration = nowInMs - dayOfBirthInMs;

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		System.out.println("6. I have lived " + days + " days.");
	}

	private static void addDay(Calendar date) {
		Calendar addingDay = Calendar.getInstance();
		addingDay.setTimeInMillis(date.getTimeInMillis());
		addingDay.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println("5. The date after adding 20 days is: " + addingDay.get(Calendar.DAY_OF_MONTH) + "/"
				           + (addingDay.get(Calendar.MONTH) + 1) + "/" + addingDay.get(Calendar.YEAR));

	}

	private static void getFirstAndLastDow(Calendar date) {
		Calendar first = Calendar.getInstance();
		first.setTimeInMillis(date.getTimeInMillis());
		int dow = first.get(Calendar.DAY_OF_WEEK);
		int fdow = first.getFirstDayOfWeek();
		first.add(Calendar.DAY_OF_MONTH, fdow - dow);
		if (dow == Calendar.SUNDAY) {
			first.add(Calendar.WEEK_OF_YEAR, -1);
		}
		System.out.println("3. First day of week: " + first.get(Calendar.DAY_OF_MONTH) + "/"
				           + (first.get(Calendar.MONTH) + 1) + "/" + first.get(Calendar.YEAR));

		Calendar last = Calendar.getInstance();
		last.setTimeInMillis(date.getTimeInMillis());
		last.add(Calendar.DAY_OF_MONTH, fdow - dow + 6);
		System.out.println("3. Last day of week: " + last.get(Calendar.DAY_OF_MONTH) + "/"
				           + (last.get(Calendar.MONTH) + 1) + "/" + last.get(Calendar.YEAR));

	}

	private static String getLastDate(Calendar c) {
		int day = c.getActualMaximum(Calendar.DATE);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		return day + "/" + month + "/" + year;
	}

}
