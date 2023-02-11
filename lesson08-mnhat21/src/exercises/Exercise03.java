package exercises;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Pattern;

public class Exercise03 {
	public static void main(String[] args) {
		String s = "Học sinh anh Quyền";

		System.out.println(removeAccent(s));
	}
	
	private static String removeAccent(String s) {
		String temp = Normalizer.normalize(s, Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(temp).replaceAll("");
	}
}	
