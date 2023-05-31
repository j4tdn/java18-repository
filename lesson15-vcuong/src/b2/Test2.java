package b2;

import java.util.Scanner;

public class Test2 {
    private static final int[][] ageToSleepHours = {
            {0, 20}, // trẻ sơ sinh (1-3 tuổi) ngủ tối thiểu 20h/ngày
            {4, 10}, // trẻ nhỏ (4-13 tuổi) 10-12 tiếng
            {14, 8}, // thanh thiếu niên (14-17 tuổi) ngủ tối thiểu 8-10h/ngày
            {18, 7}, // thanh niên và người trưởng thành (18-64 tuổi) ngủ tối thiểu 7-9h/ngày
            {65, 7} // người lớn tuổi (trên 65 tuổi) ngủ tối thiểu 7-8h/ngày
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tuổi hiện tại của bạn: ");
        int age = scanner.nextInt();

        System.out.println("Nhập thời gian đã ngủ trong ngày:");
        System.out.print("  Số giờ: ");
        int hours = scanner.nextInt();
        System.out.print("  Số phút: ");
        int minutes = scanner.nextInt();

        System.out.print("Nhập thời gian bắt đầu ngủ (HH): ");
        int startHour = scanner.nextInt();

        int recommendedWakeUpHour = getRecommendedWakeUpHour(age, hours, minutes, startHour);
        int recommendedWakeUpMinute = getRecommendedWakeUpMinute(minutes);
        System.out.printf("Bạn nên thức dậy lúc %dH%d", recommendedWakeUpHour, recommendedWakeUpMinute);
    }

    public static int getRecommendedWakeUpHour(int age, int hours, int minutes, int startHour) {
        int totalSleepMinutes = hours * 60 + minutes;

        int recommendedMinSleep = ageToSleepHours[0][1];
        for (int i = 1; i < ageToSleepHours.length; i++) {
            if (age <= ageToSleepHours[i][0]) {
                recommendedMinSleep = ageToSleepHours[i][1];
                break;
            }
        }

        int recommendedSleepMinutes = recommendedMinSleep * 60;
        int wakeUpMinutes = (startHour * 60) + totalSleepMinutes + recommendedSleepMinutes;
        int recommendedWakeUpHour = wakeUpMinutes / 60;

        return recommendedWakeUpHour > 24 ? recommendedWakeUpHour - 24 : recommendedWakeUpHour;
    }

    public static int getRecommendedWakeUpMinute(int minutes) {
        int recommendedWakeUpMinute = minutes;
        if (recommendedWakeUpMinute >= 60) {
            recommendedWakeUpMinute -= 60;
        }

        return recommendedWakeUpMinute;
    }
}
