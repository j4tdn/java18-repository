import java.util.Scanner;

public class Ex03MakeNoMarkSentences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String markedText = null;
		System.out.println("Enter your sentences: ");
		String vnVowels = "|aáàảãạăằắảãạâầấẩẫậ|dđ|iìíỉĩị|yỳýỷỹỵ|uùúủũụưừứửữự|eèéẻẽẹêềếểễệ|oòóỏõọơờớởỡợôồốổỗộ";
		markedText = sc.nextLine();
		
		System.out.println("code --> " + textUnmarker(markedText, vnVowels));
	}
	public static String textUnmarker(String text, String pool) {
		
		char[] ch = text.toCharArray();
		String result = "";
		int index = 1;
		for (int i = 0; i < ch.length; i++) {
				index = pool.indexOf(ch[i]);
				if (index > 0) {
					int j = index;
					while (pool.charAt(j) != '|') {
						j--;
					}
					result += pool.charAt(j+1);
				}
				else result += ch[i];		
			}
		
		return result;
	}
}