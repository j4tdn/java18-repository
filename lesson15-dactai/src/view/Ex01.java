package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Double number = input();
		String numberString = number.toString();
		System.out.println(numberString);
		String pre = numberString.substring(0, numberString.lastIndexOf("."));
		String post = numberString.substring(numberString.lastIndexOf(".") + 1);
		int tu = Integer.parseInt(pre + post);
		Double mau = Math.pow(10.0, post.length());
		System.out.println(tu);
		int UCLN = findUCLN(Integer.parseInt(pre),Integer.parseInt(post));
		System.out.println("Phân số tối giản của " + number + ": " + (tu/UCLN) + "/" + (mau/UCLN)
							);
		
	}
	
    public static int findUCLN(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findUCLN(b, a % b);
        }
    }
	
	private static Double input() {
		Scanner in = new Scanner(System.in);
		int wrongTimes = 0;
		Double number;
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "): " : ":";
			System.out.print("Enter number" + suffix);
			number = in.nextDouble();
			String numberString = number.toString();
			if(number > 1.0d) {
				break;
			}
			
			wrongTimes++;
			if(wrongTimes == 3) {
				System.out.println("Wrong times = 3...Exit...");
				System.exit(0);
			}
		} while(true);
		return number;
	}
}
