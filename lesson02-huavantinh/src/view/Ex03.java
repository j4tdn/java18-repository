package view;
import java.util.Iterator;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = ip.nextInt();
		System.out.println(n + "!= " + fact(n));
		}
	private static int fact(int n) {
		int f = 1;
		while(n > 1) {
			f *= n--;
		}
		return f;
	}
	}

