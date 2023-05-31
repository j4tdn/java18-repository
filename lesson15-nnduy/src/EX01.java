import java.util.Scanner;

public class EX01 {
	public static int findGCD(int a, int b) {
        // Tìm ước chung lớn nhất của a và b
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        double x = 0;

        while (count < 3) {
            try {
                System.out.print("Nhập vào một số thực khác 0: ");
                x = scanner.nextDouble();

                if (x == 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                count++;
                System.out.println("Giá trị nhập vào không hợp lệ. Vui lòng nhập lại.");
            }
        }

        if (count == 3) {
            System.out.println("Quá nhiều lần nhập sai. Kết thúc chương trình.");
        } else {
            int numerator = (int) (x * 1000000);
            int denominator = 1000000;
            int common_divisor = findGCD(numerator, denominator);
            numerator /= common_divisor;
            denominator /= common_divisor;
            System.out.printf("Phân số tối giản của %.6f là: %d/%d", x, numerator, denominator);
        }

        scanner.close();
    }
}
