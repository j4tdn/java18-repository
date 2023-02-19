package view;

public class Ex03 {
	public static void main(String[] args) {
		String s = "  Welcome to JAVA10 class  ";
		System.out.println(revert(s));

	}

	private static String revert(String s) {
		s = s.strip();
		String[] words = s.split(" ");

		StringBuilder result = new StringBuilder();
		for (String word : words) {
			String[] letters = word.split("");
			StringBuilder reverseWord = new StringBuilder();
			for (int i = letters.length - 1; i >= 0; i--) {
				reverseWord.append(letters[i]);
			}
			result.append(reverseWord + " ");
			reverseWord.delete(0, reverseWord.length());
		}
		return result.toString().strip();
	}
}
