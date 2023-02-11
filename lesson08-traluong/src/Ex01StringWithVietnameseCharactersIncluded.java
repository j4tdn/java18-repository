import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Ex01StringWithVietnameseCharactersIncluded {
    public static PrintStream Stream = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Charset utf8Charset = Charset.forName("UTF-8");
		try {
			Stream = new PrintStream(System.out, true, utf8Charset.name());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String str = null;
		System.out.println("Enter your text: ");
		str = sc.nextLine();
		System.out.println("Characters line by line ==>");
		printCharByLine(str);
		System.out.println("\n Reverted String by char ==>");
		printRevertedStringByChar(str);
		System.out.println("\n Reverted String by word ==>");
		printRevertedStringByWord(str);
	}
	public static void printCharByLine(String str) {
		str = str.replaceAll(" ", "");
		for (int i = 0; i < str.length(); i++) {
			Stream.print(str.charAt(i));
			Stream.print("\n");
		}
	}
	public static void printWordByLine(String str) {
		str = str.replaceAll(" ", "\n");
		Stream.print(str);
	}
	public static void printRevertedStringByChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			Stream.print(str.charAt(str.length()-i - 1));
		}
	}
	public static void printRevertedStringByWord(String str) {
		String[] arrStr = str.split(" ");
		for (int i = 0; i < arrStr.length; i++) {
			Stream.print(arrStr[arrStr.length -i - 1]);
			Stream.print(" ");
		}
	}
}