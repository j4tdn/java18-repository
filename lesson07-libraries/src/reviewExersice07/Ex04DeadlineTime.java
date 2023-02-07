package reviewExersice07;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex04DeadlineTime {
	public static void main(String[] args) {
		LocalDate runningDate = LocalDate.of(2022, 6, 7);

		int counter = 0;

		while (true) {
			if (isWeekendDay(runningDate) || isHoliday(runningDate)) {
				System.out.println("--> Off " + runningDate + " WD " + runningDate.getDayOfWeek());
			} else {
				counter++;
				System.out.println(counter + ". Working Date: " + runningDate);
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
		// B1: Số ngày nghỉ lễ ở quốc gia đó của nhóm phát triển
		LocalDate[] holidays = getVnmeseHoliday();

		// B2: Xem ldate có thuộc các ngày đó không
		for (LocalDate holiday : holidays) {
			if (holiday.getDayOfMonth() == ldate.getDayOfMonth() && holiday.getMonth() == ldate.getMonth()) {
				return true;
			}
		}
		return false;
	}

	private static LocalDate[] getVnmeseHoliday() {
		int ignoredYear = 0;
		return new LocalDate[] {
			LocalDate.of(ignoredYear, 1, 1), 	
			LocalDate.of(ignoredYear, 1, 2), 	
			LocalDate.of(ignoredYear, 1, 3), 	
			LocalDate.of(ignoredYear, 1, 29), 	
			LocalDate.of(ignoredYear, 1, 30), 	
			LocalDate.of(ignoredYear, 1, 31), 	
			LocalDate.of(ignoredYear, 2, 1), 	
			LocalDate.of(ignoredYear, 2, 2), 	
			LocalDate.of(ignoredYear, 2, 3), 	
			LocalDate.of(ignoredYear, 2, 4), 	
			LocalDate.of(ignoredYear, 2, 5), 	
			LocalDate.of(ignoredYear, 2, 6), 	
			LocalDate.of(ignoredYear, 4, 10), 	
			LocalDate.of(ignoredYear, 4, 11), 	
			LocalDate.of(ignoredYear, 4, 30), 	
			LocalDate.of(ignoredYear, 5, 1), 	
			LocalDate.of(ignoredYear, 5, 2), 	
			LocalDate.of(ignoredYear, 5, 3),
			LocalDate.of(ignoredYear, 9, 1),
			LocalDate.of(ignoredYear, 9, 2),
		};
	}

}
