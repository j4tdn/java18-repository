package view;
/**
 Bài 3: Viết chương trình nhập vào chuỗi TIẾNG VIỆT có dấu bất kì sau đó xuất ra kết quả là chuỗi không dấu.
		Input: Em có yêu anh không anh để anh biết còn chờ
		Em xin lỗi em đã có thái độ không đúng với anh
		Output: Em co yeu anh khong de anh biet con cho
		Em xin loi em da co thai do khong dung voi anh
 */
import java.util.Scanner;
import java.text.Normalizer;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập vào chuỗi TIẾNG VIỆT có dấu: ");
		String string = ip.nextLine();
		string = Normalizer.normalize(string, Normalizer.Form.NFD);
		System.out.println("Result: " + string.replaceAll("\\p{M}", ""));
	}
}
