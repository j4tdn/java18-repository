import java.util.Scanner;

public class Ex02NameFormatter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = null;
		System.out.println("Enter a name: ");
		name = sc.nextLine();
		System.out.println("Formatted name ==> " + nameFormatter(name));
	}
	public static String nameFormatter(String str) {
		String name = str.toLowerCase();
		name = name.strip();
		name = " " + name;
		char[] ch_name = name.toCharArray();
		
		for (int i = 0; i < ch_name.length; i++) {
			if (ch_name[i] == ' ') {
				if (ch_name[i+1] == ' ') {
					break;
				}
				ch_name[i+1] = Character.toUpperCase(ch_name[i+1]) ;
			}
		}
		name = "";
		for (int i = 0; i < ch_name.length; i++) {
			name += Character.valueOf(ch_name[i]);
		}
		return name;
	}
}
