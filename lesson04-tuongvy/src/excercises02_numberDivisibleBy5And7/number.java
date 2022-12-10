package excercises02_numberDivisibleBy5And7;

import java.util.Scanner;
import java.util.Vector;

public class number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		
		check(A);
	}
	
	public static  void check(int[] A) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Integer> v3 = new Vector<Integer>();
		
		for(int a : A) {
			if (a % 7 == 0 && a % 5 != 0) {
				v1.add(a);
			}
			else if (a % 5 == 0 && a % 7 != 0) {
				v3.add(a);
			}
			else {
				v2.add(a);
			}
		}
		for(int i = 0; i < v1.size(); i++) {
			System.out.print(v1.get(i) + " ");
		}
		
		for(int i = 0; i < v2.size(); i++) {
			System.out.print(v2.get(i) + " ");
		}
		
		for(int i = 0; i < v3.size(); i++) {
			System.out.print(v3.get(i) + " ");
		}
	}
	
	
}
