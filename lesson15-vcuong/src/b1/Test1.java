package b1;

import java.util.Scanner;

public class Test1 {

    private static final int MAX_TRIES = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tries = 0;
        double num = 0.0;

        while (tries < MAX_TRIES) {
            try {
                System.out.print("Nhập vào một số thực có phần thập phân khác 0: ");
                num = scanner.nextDouble();

                if (Double.compare(Math.floor(num), num) == 0) {
                    System.out.println("Số của bạn không có phần thập phân! Hãy nhập lại.");
                }
                else if (num < 0) {
                    System.out.println("Số của bạn là số âm! Hãy nhập lại.");
                }
                else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Đây không phải là một số thực! Hãy nhập lại.");
            }

            tries++;
        }

        if (tries == MAX_TRIES) {
            System.out.println("Bạn đã nhập sai quá nhiều lần! Kết thúc chương trình.");
            return;
        }

        int tuSo, mauSo;
        String[] parts = Double.toString(num).split("\\.");

        tuSo = Integer.parseInt(parts[1]);
        mauSo = (int) Math.pow(10, parts[1].length());

        int ucln = tim_ucln(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;

        System.out.printf("Phân số tối giản của số thập phân %.2f là %d/%d", num, tuSo, mauSo);
    }

    public static int tim_ucln(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}
