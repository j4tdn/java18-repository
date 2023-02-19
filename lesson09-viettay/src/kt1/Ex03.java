package kt1;
/**
 Bài 3: Cho dãy kí tự chứa các kí tự thường và khoảng trắng.
		Viết chương trình loại bỏ khoảng trắng thừa và đảo chuỗi như sau:
		Example: input: Welcome to JAVA10 class
		output: emocleW ot 01AVAJ ssalc
		Method signature: revert(String s) >> String
 */
public class Ex03 {
	public static void main(String[] args) {
		String input = "   Welcome   to JAVA10  class  ";
		StringBuilder sb = new StringBuilder();
		String[] arrs = input.strip().split("\\s+");
		for (String arr : arrs) {
			sb.append(reverseString(arr)).append(" ");
		}
		System.out.println(sb.toString().strip());
	}

	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
