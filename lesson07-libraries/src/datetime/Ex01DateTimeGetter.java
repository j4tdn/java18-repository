package datetime;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Ex01: + 0. Lấy thông tin thời gian hiện tại với [timezone] 
 * + 1.Ngày/tháng/năm 
 * + 2. Giờ 12-24:phút:giây 
 * + 3. Thứ ngày, tuần/ngày trong tháng,năm 
 * + 4. Đếm số ngày, tháng, năm hiện tại >> Calendar 
 * + 5. Kiểm tra năm hiện tại có phải năm nhuận không 
 * + 6. Ngày đầu tiên trong tuần là thứ mấy với locale 
 * + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy 
 * ==> In ra danh sách các ngày trong tuần hiện tại
 * 
 * ==> Epoch time: là standard base time: 01.01.1970 00:00:00 Hay còn gọi là
 * unix time Và dựa vào st
 *
 */
public class Ex01DateTimeGetter {
	public static void main(String[] args) {
		// server khi setup sẽ set múi giờ nào
		// Khi in ra sys-time thì sẽ ra thời gian của múi giờ đó

		// Chọn (select) country/timezone --> sys-time at selection timezone

		long currentTimeInMs = System.currentTimeMillis();
		System.out.println("Current time in ms: " + currentTimeInMs);

		System.out.println("Lấy thông tin thời gian hiện tại với [timezone]");

		Date date = new Date();

		// Date date = new Date(long date); <-- long date là thời gian truyền
		// mls vào, sẽ được cộng thêm số mls đó vào epoch time

		System.out.println("Date: " + date);

		// Locale.setDefault(new Locale("vi","VN"));

		// Since JAVA 1.1
		// Calendar --> singleton at getting time
		// Tại 1 thời điểm, nếu getInstance bao nhiêu lần thì
		// nó cũng chỉ tạo 1 ô nhớ trên HEAP và tạo 1 đối tượng
		Calendar c = Calendar.getInstance();
		System.out.println("c: " + c);

		// MONTH -> 0 (Jan) -> 11 (Dec)
		System.out.println("default locate: " + Locale.getDefault());

		// YEAR = 2023, MONTH=0 --> quá nhiều thuộc tính nên nó hông hỗ trợ c.getYear
		int day = c.get(Calendar.DATE);
		int year = c.get(Calendar.YEAR); // ~~ c.getYear()
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("Date/Month/Year: " + day + "/" + month + "/" + year);

		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);

		c.set(Calendar.YEAR, 2022);
		System.out.println("Set c: " + c);

		// day (s) in month/year: số ngày trong tháng/năm
		int fdow = c.get(Calendar.YEAR);
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("maxDayOfMonth: " + daysInMonth);

		System.out.println("\n------------------------\n");

		///////////////////////////////////////////////
		System.out.println("default time zone: " + TimeZone.getDefault());
		TimeZone msTz = TimeZone.getTimeZone("Europe/Moscow");
		Calendar cAtMoscow = Calendar.getInstance(msTz);
		System.out.println("cAtMoscow: " + cAtMoscow);
		
		//printTzIds();

		// 3. Thứ ngày, tuần/ ngày trong tháng, năm
		// Thứ hai --> Chủ nhật

		int dow = cAtMoscow.get(Calendar.DAY_OF_WEEK);

		String[] weekDayAsString = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };
		String weekday = weekDayAsString[dow - 1];
		System.out.println("Weekday: " + weekday);

		// 5. Kiểm tra năm hiện tại có phải năm nhuận không
		int currentYear = Year.now().getValue();
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(2022));
	
	// 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy 
	//==> In ra danh sáchcác ngày trong tuần hiện tại
	
	Calendar cInVn	= Calendar.getInstance(new Locale("vi", "VN"));
	cInVn.set(Calendar.DAY_OF_MONTH, 4);
	
	Calendar cfdow = getDayOfFdow(cInVn);
	System.out.println("d/m/y: "  + cfdow.get(Calendar.DAY_OF_MONTH)
							+ "/" + (cfdow.get(Calendar.MONTH) + 1)
							+ "/" + cfdow.get(Calendar.YEAR));
	
	System.out.println("=== current week days ===");
	prinCurrentWeekDays(cInVn);
	
	}
	
	private static void prinCurrentWeekDays(Calendar c) {
		Calendar start = getDayOfFdow(c);
		
		Calendar end = Calendar.getInstance();
		end.setTimeInMillis(start.getTimeInMillis());
		end.add(Calendar.WEEK_OF_MONTH, 1);
		
		for(Calendar running = start;
				running.before(end);
				running.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.println("d/m/y: "  + running.get(Calendar.DAY_OF_MONTH)
							+ "/" + (running.get(Calendar.MONTH) + 1)
							+ "/" + running.get(Calendar.YEAR));
		}
	}
	
	private static Calendar getDayOfFdow(Calendar c) {
		Calendar cr = Calendar.getInstance();
		cr.setTimeInMillis(c.getTimeInMillis());
		int dow = cr.get(Calendar.DAY_OF_WEEK);
		int fdow = cr.getFirstDayOfWeek();
		cr.add(Calendar.DAY_OF_MONTH, fdow - dow +1);
		if (dow == Calendar.SUNDAY) {
			cr.add(Calendar.DAY_OF_MONTH, -7);
		}
		return cr;
	}
	
	private static void printTzIds() {
		System.out.println("TimeZone Ids: ");
		System.out.println("==========");
		String[] tzIds = TimeZone.getAvailableIDs();
		for (String tzId : tzIds) {
			System.out.println(tzId);
		}
	}

}
