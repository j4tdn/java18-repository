package excercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex02DetailDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		System.out.print("Enter month: ");
		int month = sc.nextInt();
		System.out.print("Enter day: ");
		int day = sc.nextInt();
		LocalDate checkDate = LocalDate.of(year, month, day);
		System.out.println(checkDate.getDayOfMonth() + " " + checkDate.getMonth() + " " + checkDate.getYear() + " is a "
				+ checkDate.getDayOfWeek());
		detailDay(checkDate);
	}

	public static void detailDay(LocalDate checkDate) {
		long totalDay = ChronoUnit.DAYS.between(LocalDate.of(checkDate.getYear(), 1, 1),
				LocalDate.of(checkDate.getYear(), 12, 31)) + 1;
		System.out.println("It is day number " + checkDate.getDayOfYear() + " of the year, "
				+ (totalDay - checkDate.getDayOfYear()) + " days left");
	}
//
//	public static int validateDay() {
//		Scanner sc = new Scanner(System.in);
//		int num;
//		do {
//			System.out.print("Enter a number: ");
//			while (!sc.hasNextInt()) {
//				System.out.println("Invalid input, try again: ");
//				sc.next();
//			}
//			num = sc.nextInt();
//		} while (num >= 13 || num <= 0);
//		return num;
//	}
//
//	public static int validateMonth() {
//		Scanner sc = new Scanner(System.in);
//		int num;
//		do {
//			System.out.print("Enter a number: ");
//			while (!sc.hasNextInt()) {
//				System.out.println("Invalid input, try again: ");
//				sc.next();
//			}
//			num = sc.nextInt();
//		} while (num >= 13 || num <= 0);
//		return num;
//	}
//
//	public static int validateYear() {
//		Scanner sc = new Scanner(System.in);
//		int num;
//		do {
//			System.out.print("Enter a number: ");
//			while (!sc.hasNextInt()) {
//				System.out.println("Invalid input, try again: ");
//				sc.next();
//			}
//			num = sc.nextInt();
//		} while (num <= 0);
//		return num;
//	}
}
