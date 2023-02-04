package exercises;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RelationshipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.print("Enter the start date and time of the relationship (yyyy-MM-dd HH:mm): ");
        LocalDateTime startDateTime = LocalDateTime.parse(input.nextLine(), formatter);
        LocalDateTime endDateTime = LocalDateTime.now();

        System.out.print("Has the relationship ended? (yes/no): ");
        if (input.nextLine().equals("yes")) {
            System.out.print("Enter the end date and time of the relationship (yyyy-MM-dd HH:mm): ");
            endDateTime = LocalDateTime.parse(input.nextLine(), formatter);
        }
        else {
        	System.out.println("The ended date and time of the relationship (yyyy-MM-dd HH:mm): " + endDateTime);
        }

        Duration duration = Duration.between(startDateTime, endDateTime);
        long days = duration.toDays();
        long weeks = days / 7;
        long daysInWeek = days % 7;
        long years = days / 365;
        long months = (days % 365) / 30;
        long daysInMonth = (days % 365) % 30;
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        System.out.println("The relationship started on day " + (startDateTime.getDayOfWeek().getValue() + 1) + " of the week.");
        System.out.println("The relationship has lasted " + years + " years, " + months + " months, " + daysInMonth + " days, " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
    }
}
