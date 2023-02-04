package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Hôm nay ngày 07/06/2022. Nhóm A nhận được dự án từ khách hàng B. Yêu cầu thực hiện
 * các chức năng của dự án trong vòng 110 ngày. Biết rằng Thứ 7, Chủ nhật được xem như ngày nghỉ
 * nên không tính vào trong thời gian thực hiện 110 ngày, không tính các ngày nghỉ lễ theo luật quốc
 * gia của nhóm phát triển dự án. Hỏi ngày mấy nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B.
 */

public class Ex04Project {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JUNE, 07);
		Calendar c1 = Calendar.getInstance();
		c1.setFirstDayOfWeek(2);
		c1.setTimeInMillis(c.getTimeInMillis());
		int deadline = 110;
		do {
			c1.add(Calendar.DAY_OF_MONTH, 1);
			if (satisfy(c1)) {
				c.add(Calendar.DAY_OF_MONTH, 1);
				deadline--;
			}
		} while (deadline != 0);
		System.out.println("Nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B vào: " + format(c1));
	}

	public static String format(Calendar c) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String date = df.format(c.getTime());
		return date;
	}

	public static boolean satisfy(Calendar c) {
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int month = c.get(Calendar.MONTH) + 1;
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		if (dayOfWeek == 7 || dayOfWeek == 1) {
			return false;
		} else if (month == 9) {
			if (dayOfMonth == 1 || dayOfMonth == 2) {
				return false;
			}
		}
		return true;
	}

}
