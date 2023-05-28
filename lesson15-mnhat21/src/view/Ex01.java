package view;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double input = 0;
        int errorCount = 0;

        while (true) {
            System.out.print("Input : ");
            input = ip.nextDouble();

            if (input != 0 && input % 1 != 0) {
                break;
            }

            errorCount++;
            if (errorCount > 3) {
                System.out.println("Try again later");
                return;
            }

            System.out.println("Try again");
        }

        int numerator = (int) (input * 100000);
        int denominator = 100000;
        int greatestCD = greatestCD(numerator, denominator);

        numerator /= greatestCD;
        denominator /= greatestCD;

        System.out.println(input + " = " + numerator + "/" + denominator);

    }

    private static int greatestCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestCD(b, a % b);
    }

}
