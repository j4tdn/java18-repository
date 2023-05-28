package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		Map<Integer, Integer> obj = new HashMap<>();
		for(int i = 1; i <=65; i++) {
			if(i<=3) {
				obj.put(i, 20);
			} else if(i<=13) {
				obj.put(i, 11);
			} else if(i<=17) {
				obj.put(i, 9);
			} else if(i <= 64) {
				obj.put(i, 8);
			} else {
				obj.put(i, 7);
			}
		}
		
		//printf(obj);
		System.out.print("nhập tuổi: ");
		int age = Integer.parseInt(ip.nextLine());
		System.out.print("số giờ: ");
		int hour = Integer.parseInt(ip.nextLine());
		System.out.print("số phút: ");
		int minute = Integer.parseInt(ip.nextLine());
		System.out.print("Thời gian bắt đầu ngủ: ");
		int start = Integer.parseInt(ip.nextLine());
		
		System.out.println("Bạn nên thức dậy lúc: " + TimeWakeUp(obj, age, hour, minute, start));
		
	}
	
	private static String TimeWakeUp(Map<Integer, Integer> obj, int age, int hour, int minute, int start) {
		int h = obj.get(age);
		h *=60;
		h -= hour*60 + minute;
		int h1 = h/60; // lấy phần giờ
		int h2 = h%60; // lấy phần phút
		
		int hourWakeup = start + h1;
		if(hourWakeup > 24) {
			hourWakeup -= 24;
		}
		return String.valueOf(hourWakeup) + "H" + String.valueOf(h2);
		
		
	}
	
	
	
	private static void printf(Map<Integer, Integer> map) {
		// array, list --> for index, for each, iterate(iterable - collection)
		// map --> loop by key, value, entry
		Set<Integer> keySet = map.keySet();
		for (Integer key: keySet) {
			System.out.println(key + " --> " + map.get(key));
		}
	}
}
