package exam;

import java.util.Scanner;

public class Bt01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double number;
        int dem = 0;

        while (true) {
            System.out.print("Enter number (double): ");
            number = scanner.nextDouble();
            if (number != 0 && number % 1 != 0) {
                break;
            }
            dem++;
            if (dem >= 3) {
                System.out.println("You have entered incorrectly too many times");
                return;
            }
            System.out.println("The number you entered is not valid. Please enter.");
        }

        int ts = (int) (number * 100);
        int ms = 100 / gcd(100, ts);
        ts /= gcd(100, ts);

        System.out.println(number + " -->" + ts + "/" + ms);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

