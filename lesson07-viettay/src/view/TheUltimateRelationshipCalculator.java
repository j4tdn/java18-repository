package view;

/**
 * Bài 1: Xây dựng ứng dụng The Ultimate Relationship Calculator
		 Nhập thời gian bắt đầu hẹn hò của 2 người.
		 Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại
		 Nhấn Enter để thực hiện tính toán. Hỏi
		 Ngày bắt đầu hẹn họ là ngày thứ mấy.
		 Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây
 */
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

import utils.DateUtils;

public class TheUltimateRelationshipCalculator {
	private static final String PATTERN = "dd.MM.yyyy HH:mm:ss";

	public static void main(String[] args) {
		// 01.10.2018 08:21:25
		// 05.12.2021 10:12:17
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập thời gian bắt đầu hẹn hò của 2 người: ");
		String start = ip.nextLine();
		LocalDateTime startldt = DateUtils.stringToLocalDateTime(start, PATTERN);
		LocalDateTime endldt = null;
		System.out.print("Chia tay chưa (Rồi/Chưa): ");
		String ans = ip.nextLine();
		if (ans.equals("Rồi")) {
			System.out.print("Nhập ngày chia tay: ");
			String end = ip.nextLine();
			endldt = DateUtils.stringToLocalDateTime(end, PATTERN);
		} else {
			endldt = LocalDateTime.now();
		}
		if (endldt.isBefore(startldt)) {
			throw new IllegalArgumentException("Day of birth must be less than now (time)");
		}
		System.out.print("Ngày hẹn hò đầu tiên là ngày thứ: " + startldt.toLocalDate().getDayOfWeek() + "\n");

		LocalDate ldateStart = startldt.toLocalDate();
		LocalDate ldateEnd = endldt.toLocalDate();

		Period period = Period.between(ldateStart, ldateEnd);

		LocalTime ltimeStart = startldt.toLocalTime();
		LocalTime ltimeEnd = endldt.toLocalTime();

		Duration duration = Duration.between(ltimeStart, ltimeEnd);

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}

		System.out.println("Mối tình đã bắt đầu được: " + getUnit(period.getYears(), " years ")
				+ getUnit(period.getMonths(), " months ") + getUnit(period.getDays(), " days ")
				+ getUnit(duration.toHoursPart(), " hours ") + getUnit(duration.toMinutesPart(), " minutes ")
				+ getUnit(duration.toSecondsPart(), " seconds "));
	}

	public static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}

}
