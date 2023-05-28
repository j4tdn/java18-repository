package exam;

import java.util.Scanner;

public class Bt02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Age you: ");
        int age = scanner.nextInt();
        System.out.println("Time you sleep:");
        System.out.print("Hours: ");
        int hours = scanner.nextInt();
        System.out.print("Minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Time you start sleep (Hours): ");
        int sleepStart = scanner.nextInt();

        int remainingHours = minimumSleepTime(age) - hours -1;
        int remainingMinutes = 60 - minutes;

        int wakeUpHour = (sleepStart + remainingHours) % 24;

        System.out.println("You should wakeup at: " + wakeUpHour + "H" + remainingMinutes);
    }

    private static int minimumSleepTime(int age) {
        if (age >= 1 && age <= 3) {
            return 20;
        } else if (age >= 4 && age <= 13) {
            return 11;
        } else if (age >= 14 && age <= 17) {
            return 9;
        } else if (age >= 18 && age <= 64) {
            return 8;
        } else if (age >= 65) {
            return 7;
        } else {
            return 0;
        }
    }
}
