package view;

public class Ex03 {
	public static void main(String[] args) {
		String str = "Welcome     to JAVA10   class";
		String strFilted = filterFreeSpace(str);
		String [] listString = strFilted.split(" ");
		String [] listRevertedString = new String[listString.length];
		int count = 0;
		 
		for (String s:listString) {
			listRevertedString[count++] = revert(s);
		}
		
		System.out.println("Reverted string --> ");
		for (String s:listRevertedString) {
			System.out.print(s);
			System.out.print(" ");
		}	
	}
	private static String filterFreeSpace(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c != ' ') {
				result += c;
			} else {
				if (str.charAt(i-1) == ' ') {
					continue;
				} else {
					result += c;
				}
			}
			
		}
		return result;
	}
	private static String revert(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			result += c;
		}
		return result;
	}

}
