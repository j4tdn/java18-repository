package view;

public class Ex02 {
	public static void main(String[] args) {
		
		String str1 = "aa6b546c6e22h,aa6b326c6e22h:";
		
		Integer[] numbersFromStr1 = getNumberFromString(str1);
		
			
		System.out.println("Max integer from String: " + getMaxIntegerOf(numbersFromStr1));
	
		/*
		System.out.println("Number from string: ");
		for (Integer i:numbersFromStr1) {
			if (i != null) {
				System.out.println(i);
			}
		}
		System.out.println("Number from string 2: ");
		for (Integer i:numbersFromStr2) {
			if (i != null) {
				System.out.println(i);
			}
		} */
	}
	private static Integer[] getNumberFromString( String str) {
		Integer[] listNumber = new Integer[str.length()];
		str += "a";
		String numAsString = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <='9') {
				numAsString += c;
			} else {
				if (numAsString != "") {
					listNumber[count++] = Integer.parseInt(numAsString);
					numAsString = "";
				};
			} 
		}
		
		return listNumber;
	}
	private static Integer getMaxIntegerOf(Integer[] listNum) {
		Integer max = 0;
		for (Integer i:listNum) {
			if (i != null) {
				if (i > max) {
					max = i;
				}
			}
		}
			
		return max;
	}
}
