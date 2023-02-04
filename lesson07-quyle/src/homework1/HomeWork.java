package homework1;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("year : \n");
		int y=ip.nextInt();
		System.out.print("month : \n");
		int M=ip.nextInt();
		System.out.print("day : \n");
		int d=ip.nextInt();
		System.out.print("hour : \n");
		int h=ip.nextInt();
		System.out.print("minute : \n");
		int m=ip.nextInt();
		System.out.print("second : \n");
		int s=ip.nextInt();
		LocalDateTime oldLocalDayTime = LocalDateTime.of(y, M, d, h, m, s);
		DayOfWeek thu =oldLocalDayTime.getDayOfWeek();
		System.out.println("ngay quen nhau --> " + pasretostring(oldLocalDayTime));
		System.out.println(thu);
		System.out.println("nhập 1 nếu còn quen");
		System.out.println("nhập 2 nếu đã chia tay");
		do {
			System.out.print("nhap n : ");
			int n=ip.nextInt();
			if(n==1) {
				LocalDateTime nowLocalDayTime = LocalDateTime.now();
				Period period = localdate(oldLocalDayTime, nowLocalDayTime);
				Duration duration = localtime(oldLocalDayTime, nowLocalDayTime);
				if(duration.isNegative()) {
					duration = duration.plusDays(1);
					period = period.minusDays(1);
				}
				System.out.println(unit(period.getYears(), " year ")
								+ unit(period.getMonths(), " month ")
								+ unit(period.getDays(), " day ")
								+ unit(duration.toHoursPart(), " hour ")
								+ unit(duration.toMinutesPart(), " minute ")
								+ unit(duration.toSecondsPart(), " second "));
				break;
			}
			else if(n==2) {
				System.out.println("nhap thoi gian chia tay");
				System.out.print("year : \n");
				int a=ip.nextInt();
				System.out.print("month : \n");
				int b=ip.nextInt();
				System.out.print("day : \n");
				int c=ip.nextInt();
				System.out.print("hour : \n");
				int D=ip.nextInt();
				System.out.print("minute : \n");
				int e=ip.nextInt();
				System.out.print("second : \n");
				int f=ip.nextInt();
				LocalDateTime ctLocalDayTime = LocalDateTime.of(a, b, c, D, e, f);
				Period period = localdate(oldLocalDayTime, ctLocalDayTime);
				Duration duration = localtime(oldLocalDayTime, ctLocalDayTime);
				if(duration.isNegative()) {
					duration = duration.plusDays(1);
					period = period.minusDays(1);
				}
				System.out.println(unit(period.getYears(), " year ")
						+ unit(period.getMonths(), " month ")
						+ unit(period.getDays(), " day ")
						+ unit(duration.toHoursPart(), " hour ")
						+ unit(duration.toMinutesPart(), " minute ")
						+ unit(duration.toSecondsPart(), " second "));
				break;
			}
		}while(true);
		
	}
	
	private static Period localdate (LocalDateTime n,LocalDateTime m) {
		LocalDate a= n.toLocalDate();
		LocalDate b= m.toLocalDate();
		Period period = Period.between(a, b);
		return period;
	}
	private static Duration localtime(LocalDateTime n,LocalDateTime m) {
		LocalTime a=n.toLocalTime();
		LocalTime b=m.toLocalTime();
		Duration duration = Duration.between(a, b);
		return duration;
	}
	private static  String pasretostring(LocalDateTime a) {
		DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy HH::mm::ss");
		return DTF.format(a);
	}
	private static String unit(int value ,String unit) {
		return value == 0 ? "" : value + unit;
	}
}
