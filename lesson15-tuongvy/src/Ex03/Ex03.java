package Ex03;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String str1 = "Word";
        String str2 = "ord";
        
        if (daongu(str1, str2)) {
        	System.out.println("true");
        }
        else {
			System.out.println("false");
		}
	}
	
	public static boolean daongu(String str1, String str2) {
        
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1, charArray2);
    }

}
