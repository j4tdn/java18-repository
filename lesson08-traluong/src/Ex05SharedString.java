import java.util.Arrays;

public class Ex05SharedString {
	public static void main(String[] args) {
		String s1 = "ABCEDEABCABCD";
		String s2 = "ABCEDCBBCABCDEFH";
		System.out.println("Biggest shared string ==> " + findSharedString(s1, s2));
	}
	public static String findSharedString(String s1, String s2) {
		String temp = "";
		String[] stack = new String[s1.length()];
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			while (s1.charAt(i) == s2.charAt(i)) {
				System.out.println("i --> " + i);
				temp += s1.charAt(i);
				i++;
				if (i > s1.length() - 1) break;
				
			}
			if(temp == null) temp = " "; 
			stack[count] = temp;
			temp = "";
			count++;
		}
		String[] result = new String[count];
		count = 0;
		for (String e:stack) {
			if (e != null) {
				result[count] = e;
				count++;
			}
		}
		return findLargestElement(result);
	}
	public static String findLargestElement(String[] arr) {
		String result = arr[0];
		for (String e: arr) {
			if (e.length()>result.length()) {
				result = e;
			}
		}
		return result;
	}
}
