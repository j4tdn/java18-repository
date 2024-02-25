package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class java18_quyle_java {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		ip.nextLine();
		ArrayList<String> integers = new ArrayList<>(); 
		for(int i = 0; i < n; i++) {
			String s = ip.nextLine();
			xuli(s, integers);
		}
		integers.sort((a,b) -> {
			if(a.length() > b.length()) {
				return 1;
			}else if(a.length() < b.length()) {
				return -1;
			}
			if(a.length() == b.length()) {
				for(int i = 0; i < a.length(); i++) {
					if(a.charAt(i) > b.charAt(i)) {
						return 1;
					}else if(a.charAt(i) < b.charAt(i)){
						return -1;
					}
				}
			}
			return 1;
		});
		integers.forEach(x -> System.out.println(x));
	}
	
	public static void xuli(String s, ArrayList<String> integers) {
		String a = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				a += s.charAt(i);
				//System.out.println(s.charAt(i));
			}else if(a != "") {
				a = LoaiSo0vonghia(a);
				integers.add(a);
				a = "";
			}
		}
		if(a != "") {
			a = LoaiSo0vonghia(a);
			integers.add(a);
		}
	}
	
	public static String LoaiSo0vonghia(String s) {
		int l = 0;
		int k = s.length();
		String x = "";
		if(k > 1) {
			for(int i = 0; i < k; i++) {
				if(s.charAt(i) == '0') {
					l++;
				}
				if(l == k) {
					return "0";
				}
				if(s.charAt(i) != '0') {
					break;
				}
			}
		}
		for(int i = l; i < k; i++) {
			x += s.charAt(i);
		}
		return x;
	}
	
}
