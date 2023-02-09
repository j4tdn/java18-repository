package exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Ex04DeadlineTime {
	public static void main(String[] args) {
		LocalDate runningDate = LocalDate.of(2022, 6, 7);
		int counter = 0;
		while (true) {
			// runningDate không phải thứ 7, CN. k phải ngày lễ
			if (isWeekenDay(runningDate) || isHoliday(runningDate)) {
				System.out.println("-----> DayOff: " + runningDate + " WD " + runningDate.getDayOfWeek());
			} else {
				counter++;
				System.out.println(counter + ". Working Date: " + runningDate);
				if (counter == 110) {
					System.out.println("Dealine: " + runningDate);
					break;
				}
			}
			runningDate = runningDate.plusDays(1);
		}
	}

	private static boolean isWeekenDay(LocalDate ldate) {
		return ldate.getDayOfWeek() == DayOfWeek.SATURDAY || ldate.getDayOfWeek() == DayOfWeek.SUNDAY;
	}

	private static boolean isHoliday(LocalDate ldate) {
		// B1: Số ngày nghĩ lể ở quốc gia đó của nhóm phát triển
		LocalDate[] holidays = getVnmeseHoliday();
		// Xem cái ldate có thuộc các ngày đó không
		for (LocalDate holiday : holidays) {
			if (holiday.getMonth() == ldate.getMonth() && holiday.getDayOfMonth() == ldate.getDayOfMonth()) {
				return true;
			}
		}
		return false;

	}

	private static LocalDate[] getVnmeseHoliday() {
		int ignoredYear = 0;
		return new LocalDate[] { LocalDate.of(ignoredYear, 1, 1), LocalDate.of(ignoredYear, 1, 2),
				LocalDate.of(ignoredYear, 1, 21), LocalDate.of(ignoredYear, 1, 22), LocalDate.of(ignoredYear, 1, 23),
				LocalDate.of(ignoredYear, 1, 24), LocalDate.of(ignoredYear, 1, 25), LocalDate.of(ignoredYear, 1, 26),
				LocalDate.of(ignoredYear, 1, 27), LocalDate.of(ignoredYear, 4, 29), LocalDate.of(ignoredYear, 4, 30),
				LocalDate.of(ignoredYear, 5, 1), LocalDate.of(ignoredYear, 5, 2), LocalDate.of(ignoredYear, 9, 2),
				LocalDate.of(ignoredYear, 9, 4) };
	}
}
