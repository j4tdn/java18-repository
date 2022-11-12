package view;
/**
 * 
 * 	Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.
	Tham khảo công thức: https://bit.ly/3oZDzNm
 *
 */
public class Ex09FindPrime {
	public static void main(String[] args) {
		int number = -1;
		int i = 0;
		do {
			number++;
			if (Ex08CheckPrime.checkPrime(number)) {
				i++;
			}
		} while (i <= 200);
		System.out.println("Frime(200) is " + number);
	}

}
