package view;

/**
 * Bài 4:  Hôm nay ngày 07/06/2022. Nhóm A nhận được dự án từ khách hàng B. Yêu cầu thực hiện
		   các chức năng của dự án trong vòng 110 ngày. Biết rằng Thứ 7, Chủ nhật được xem như ngày nghỉ
		   nên không tính vào trong thời gian thực hiện 110 ngày, không tính các ngày nghỉ lễ theo luật quốc
		   gia của nhóm phát triển dự án. Hỏi ngày mấy nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B.
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JUNE, 07);
		Calendar c1 = Calendar.getInstance();
		c1.setFirstDayOfWeek(2);
		c1.setTimeInMillis(c.getTimeInMillis());
		int dl = 110;
		do {
			c1.add(Calendar.DAY_OF_MONTH, 1);
			if (check(c1)) {
				dl--;
			}
		} while (dl != 0);
		System.out.println("Ngày nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B: " + format(c1));
	}

	public static boolean check(Calendar c) {
		int dow = c.get(Calendar.DAY_OF_WEEK);
		if (dow == 7 || dow == 1) {
			return false;
		}
		return true;
	}

	public static String format(Calendar c) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String date = df.format(c.getTime());
		return date;
	}
}
