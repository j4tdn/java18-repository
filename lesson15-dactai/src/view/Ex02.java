package view;

import java.time.LocalTime;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập số tuổi: ");
		int age = in.nextInt();
		Double mean;
		
		System.out.print("Nhập thời gian đã ngủ trong ngày: ");
		String timeSleep = in.next();
		
		System.out.print("Nhập thời gian bắt đầu ngủ: ");
		String startTime = in.next();
		
		LocalTime timeSleepLocal = LocalTime.of(Integer.parseInt(timeSleep.substring(0, timeSleep.lastIndexOf(":"))), 
												Integer.parseInt(timeSleep.substring(timeSleep.lastIndexOf(":")+1)));
		
		LocalTime starTimeLocal = LocalTime.of(Integer.parseInt(startTime.substring(0, startTime.lastIndexOf(":"))), 
				Integer.parseInt(startTime.substring(startTime.lastIndexOf(":")+1)));
		
		
		System.out.println(timeSleepLocal);
		System.out.println(starTimeLocal);
		
	}
}
