import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập tuổi hiện tại
        System.out.print("Nhập tuổi hiện tại của bạn: ");
        int age = scanner.nextInt();

        // Bước 2: Nhập thời gian đã ngủ trong ngày
        System.out.print("Nhập thời gian đã ngủ trong ngày (giờ-phút), ví dụ: 7-30: ");
        String sleepTime = scanner.next();
        int sleepHours = Integer.parseInt(sleepTime.split("-")[0]);
        int sleepMinutes = Integer.parseInt(sleepTime.split("-")[1]);

        // Bước 3: Nhập thời gian bắt đầu ngủ
        System.out.print("Nhập thời gian bắt đầu ngủ (giờ-phút), ví dụ: 22-30: ");
        String sleepStart = scanner.next();
        int startHours = Integer.parseInt(sleepStart.split("-")[0]);
        int startMinutes = Integer.parseInt(sleepStart.split("-")[1]);

        // Tính tổng thời gian ngủ (tính theo phút)
        int totalMinutes = (startHours * 60 + startMinutes) - (sleepHours * 60 + sleepMinutes);
        if (totalMinutes < 0) {
            totalMinutes += 1440; // Nếu thời gian ngủ được nhập vào vượt qua ngày hôm đó
        }

        // Tính thời gian nên thức dậy
        int wakeHours = (startHours + (totalMinutes / 60)) % 24;
        int wakeMinutes = totalMinutes % 60;

        // Tính thời gian nên thức dậy cho người lớn và trẻ em
        if (age < 18) {
            wakeHours -= 1; // Nếu độ tuổi dưới 18, thời gian nên thức dậy sẽ sớm hơn 1 giờ so với người lớn
        } else {
            wakeHours += 1; // Nếu độ tuổi từ 18 trở lên, thời gian nên thức dậy sẽ muộn hơn 1 giờ so với trẻ em
        }

        // In ra thời gian nên thức dậy
        System.out.printf("Bạn nên thức dậy vào lúc %02d:%02d", wakeHours, wakeMinutes);
        scanner.close();
    }
}
