package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("nhập chuỗi: ");
		String s = ip.nextLine();
		System.out.println(permutation(s));
	}
	
	public static ArrayList<String> permutation(String s) {
	    ArrayList<String> res = new ArrayList<String>();
	    if (s.length() == 1) {
	        res.add(s);
	    } else if (s.length() > 1) {
	        int lastIndex = s.length() - 1;
	        String last = s.substring(lastIndex);
	        String rest = s.substring(0, lastIndex);
	        res = merge(permutation(rest), last);
	    }
	    return res;
	}
	 
	
	public static ArrayList<String> merge(ArrayList<String> list, String c) {
	    ArrayList<String> res = new ArrayList<>();
	    for (String s : list) {
	        for (int i = 0; i <= s.length(); ++i) {
	            String ps = new StringBuffer(s).insert(i, c).toString();
	            res.add(ps);
	        }
	    }
	    return res;
	}
}
