package control;

import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

/**
 * while --> Kiểm tra từ điều kiện đầu
 * 
 * do_while --> body(do{}) ít nhất thực hiện 1 lần
 * 			--> bỏ qua lần kiểm tra điều kiện dầu tiên
 * 
 * @author ASUS
 *
 */
public class Ex05LoopDoWhile {
	public static void main(String[] args) {
		// Nhập vào năm sinh và in ra tuổi của bạn
				// Nêu nhập thành công --> in ra tuổi của bạn
				// nếu nhập sai thì --> yêu cầu nhập lại
				
				int wrongTimes = 0;
				Scanner ip = new Scanner(System.in);

				//System.out.print("Enter your YOB: ");
				
				String preYob = "";
				
				do{
					String a = wrongTimes > 0 ? "(" + wrongTimes + "): " : ": ";
					System.out.print("Enter your YOB"+ a);
					preYob = ip.nextLine();
					if(isNumber(preYob)) {
						break;
					}
					wrongTimes++;
					if(wrongTimes == 3)
					{
						System.out.println("wrong times = 3 ... Exit ...");
						System.exit(0);
					}
				}while(true) ;
				
				int yob = Integer.parseInt(preYob);
				
				

				int currentYear = YearMonth.now().getYear();
				System.out.println("Current year: " + currentYear);
				System.out.println("Your age: " + (currentYear - yob));

			}
			
			private static boolean isNumber(String text) {
				if(text.length()==0) {
					return false;
				}
				for(int i = 0;i < text.length(); i++) {
					char letter = text.charAt(i);
					if (letter < '0' || letter > '9') {
						return false;
					}
				}
				return true;
			}
	} 
		
