package view;
/**
 Bài 1: Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
		Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
		In ra mỗi kí tự trên một dòng
		In ra mỗi từ trên mỗi dòng
		In ra chuỗi đảo ngược theo kí tự
		In ra chuỗi đảo ngược theo từ
 */
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập vào một chuỗi kí tự bất kì: ");
		String string = ip.nextLine();
		System.out.println("1. In ra mỗi kí tự trên một dòng");
		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i));
		}
		System.out.println("2. In ra mỗi từ trên mỗi dòng");
		String[] words = string.split("\\s");
		for (String w : words) {
			System.out.println(w);
		}
		System.out.println("3. In ra chuỗi đảo ngược theo kí tự");
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.println(string.charAt(i));
		}
		System.out.println("4. In ra chuỗi đảo ngược theo từ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}

	}
}
