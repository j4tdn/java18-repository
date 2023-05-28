package view;

import java.util.Scanner;

/**
Bài 2: Bạn nên thức dậy vào lúc mấy giờ sau mỗi đêm
Các tổ chức nghiên cứu về giấc ngủ uy tín đã đưa ra khuyến cáo về thời gian ngủ hợp lý
theo lứa tuổi như sau
Đối tượng						 Độ tuổi (tuổi) Thời gian ngủ tối thiểu (giờ/ngày)
Trẻ mới sinh 						1 - 3 		20
Trẻ nhỏ 							4 - 13 		10 - 12
Thanh thiếu niên 					14 - 17 	8 - 10
Thanh niên và người trưởng thành 	18 - 64 	7 - 9
Người lớn tuổi 						65 			7 - 8

Viết chương trình mô phỏng bài toán như sau
B1. Nhập tuổi hiện tại của bạn
B2. Nhập thời gian đã ngủ trong ngày (giờ-phút)
B3. Nhập thời gian bắt đầu ngủ
B4. In ra thời gian bạn nên thức dậy để có một sức khỏe tốt
Example:
Tuổi: 22
Thời gian đã ngủ
+ Số giờ : 1
+ Số phút: 15
Thời gian bắt đầu ngủ: 23H

Bạn nên thức dậy lúc: 5H45
Giải thích
==========================
Tuổi 22 => Cần ngủ 7-9H / ngày => Trung bình: 8H = (7+9) / 2
Đã ngủ: 1H15P
Còn lại: 8H - 1H15P = 6H45P
Đi ngủ: 23H
=> Bạn nên thức dậy: 23H + 6H45 = 5H45 sáng
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập tuổi hiện tại của bạn: ");
		int age = ip.nextInt();
		System.out.println("Nhập thời gian đã ngủ trong ngày:");
		System.out.print("Số giờ: ");
		int h = ip.nextInt();
		System.out.print("Số phút: ");
		int m = ip.nextInt();
		System.out.print("Nhập thời gian bắt đầu ngủ: ");
		int sleepStartTime = ip.nextInt();
		int recommendedSleepTime = check(age);
		int totalMinutesSlept = h * 60 + m;
		int remainingMinutes = recommendedSleepTime * 60 - totalMinutesSlept;
		int wakeUpHours = (sleepStartTime + remainingMinutes / 60) % 24;
		int wakeUpMinutes = remainingMinutes % 60;
		System.out.println("Bạn nên thức dậy lúc: " + wakeUpHours + "H" + wakeUpMinutes + "P");
	}

	private static int check(int age) {
		if (age >= 1 && age <= 3) {
			return 20;
		}
		if (age < 14) {
			return 11;
		}
		if (age < 18) {
			return 9;
		}
		if (age < 65) {
			return 8;
		}
		return 7;
	}
}
