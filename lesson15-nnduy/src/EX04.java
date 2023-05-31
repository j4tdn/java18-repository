import java.util.Scanner;

public class EX04 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi ký tự: ");
        String str = scanner.nextLine();

        // Tạo một mảng đếm để đếm số lần xuất hiện của các ký tự
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Tìm giá trị lớn nhất trong mảng đếm
        int maxCount = 0;
        char maxChar = ' ';
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) i;
            }
        }

        System.out.println("Ký tự " + maxChar + " xuất hiện nhiều nhất trong chuỗi với số lần là " + maxCount);
    }

}
