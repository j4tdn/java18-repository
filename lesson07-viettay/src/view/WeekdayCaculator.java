package view;

import java.time.LocalDate;
import java.util.Scanner;

import utils.DateUtils;

public class WeekdayCaculator {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String input = "";
		LocalDate localDate = null;
		do {
			System.out.print("Enter D-M-Y(dd/MM/yyyy): ");
			input = ip.nextLine();
			localDate = DateUtils.stringToLocalDate(input);
			if (localDate != null) {
				break;
			}
		} while (true);

		int dom = localDate.getDayOfMonth();
		int doy = localDate.getDayOfYear();

		System.out.println(
				dom + " " + localDate.getMonth() + " " + localDate.getYear() + " is a " + localDate.getDayOfWeek());
		System.out.println(
				"It is day number " + doy + " of the year, " + (localDate.lengthOfYear() - doy) + " days left");
		System.out.println("It is " + localDate.getDayOfWeek() + " number " + (doy / 7 + 1) + " out of "
				+ (localDate.lengthOfYear() / 7) + " in " + localDate.getYear());
		System.out.println("It is " + localDate.getDayOfWeek() + " number " + (dom / 7 + 1) + " out of "
				+ (localDate.lengthOfMonth() / 7) + " in " + localDate.getMonth() + " " + localDate.getYear());
		System.out.println("Year " + localDate.getYear() + " has " + localDate.lengthOfYear() + " days");
		System.out.println(
				localDate.getMonth() + " " + localDate.getYear() + " has " + localDate.lengthOfMonth() + " days");
	}

}
