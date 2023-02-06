package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Ex04Deadline {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JUNE, 07);
		Calendar result = Calendar.getInstance();
		result.setFirstDayOfWeek(2);
		result.setTimeInMillis(c.getTimeInMillis());
		int deadline = 110;
		do {
			result.add(Calendar.DAY_OF_MONTH, 1);
			if (result.get(Calendar.DAY_OF_WEEK) != 1 || result.get(Calendar.DAY_OF_WEEK) != 7) {
				c.add(Calendar.DAY_OF_MONTH, 1);
				deadline--;
			}
		} while (deadline != 0);
		System.out.println("Nhóm A sẽ phải bàn giao sản phẩm vào: " + format(result));
	}

	public static String format(Calendar c) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String date = df.format(c.getTime());
		return date;
	}


}
