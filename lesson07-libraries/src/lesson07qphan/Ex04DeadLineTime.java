package lesson07qphan;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex04DeadLineTime {
	public static void main(String[] args) {
		LocalDate runningDate = LocalDate.of(2022, 6, 7);
		int counter = 0;

		while (true) {
			// runningDate ko phai T7, CN & k phai ngay le
			if (isWeekendDay(runningDate) || isHoliday(runningDate)) {
				System.out.println("-----> Off: " + runningDate + " WD " + runningDate.getDayOfWeek());
			} else {
				counter++;
				System.out.println(counter + ". Working Date: " + runningDate + " WD " + runningDate.getDayOfWeek());
				if (counter == 110) {
					System.out.println("Deadline: " + runningDate);
					break;
				}
			}
			runningDate = runningDate.plusDays(1);
		}
	}

	private static boolean isWeekendDay(LocalDate ldate) {
		return ldate.getDayOfWeek() == DayOfWeek.SATURDAY || ldate.getDayOfWeek() == DayOfWeek.SUNDAY;
	}

	private static boolean isHoliday(LocalDate ldate) {
		// B1: Số ngày nghỉ lễ ở quốc gia của nhóm phát triển
		LocalDate[] holidays = getVnmeseHoliday();

		// B2: Xem ldate có thuộc các ngày đó ko
		for (LocalDate holiday : holidays) {
			if (holiday.getDayOfMonth() == ldate.getDayOfMonth() && holiday.getMonth() == ldate.getMonth()) {
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
				LocalDate.of(ignoredYear, 9, 4), };
	}
}
