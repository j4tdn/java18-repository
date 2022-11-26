package excercises;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wrongTimes = 0;
		String preNumber = "";
		
		do {
			wrongTimes++;
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "): " : ": ";
			System.out.print("Please enter valid number" + suffix);

			preNumber = sc.nextLine();
			if (isNumber(preNumber)) {
				if (Integer.parseInt(preNumber) > 0) {
					break;
				}
			}

			if (wrongTimes == 5) {
				System.out.println("Over five times ===> Lock");
				System.exit(0);
			}
		} while (true);
		
		int number = Integer.parseInt(preNumber);
		System.out.println(number+" = "+convertBinary(number));
		sc.close();
	}

	private static boolean isNumber(String text) {
		if (text.length() == 0) {
			return false;
		}
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}

	private static String convertBinary(int num){
		int binary[] = new int[40];
        int index = 0;
        String string = "";
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        for(int i = index-1;i >= 0;i--){
            string += binary[i];
        }
        return string;
	}
}
