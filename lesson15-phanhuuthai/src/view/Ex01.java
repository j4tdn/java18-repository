package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double number = 0.0;
        int count = 0;

        while (true) {
            System.out.print("Nhập vào một số thực có phần thập phân khác 0: ");
            String input = scanner.nextLine();

            try {
                number = Double.parseDouble(input);
                if (number % 1 == 0) {
                    System.out.println("Số bạn nhập không phải số thập phân lớn hơn 0. Vui lòng nhập lại.");
                    count++;
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại.");
                count++;
            }

            if (count >= 3) {
                System.out.println("Số lần nhập sai quá 3 lần. Kết thúc chương trình.");
                System.exit(0);
            }
        }

        System.out.println("Số thực vừa nhập: " + number);
        
        
    }
	
//	private static String MinimalistFractions(double num) {
//		//num = 
//	}
}
