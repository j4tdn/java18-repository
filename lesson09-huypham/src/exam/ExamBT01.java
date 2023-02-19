package exam;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamBT01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter s1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter s2:");
		String s2 = sc.nextLine();
		
		String[] arr1 = s1.split(" ");
		String[] arr2 = s2.split(" ");
		
		List<Integer> commonElements = new ArrayList<>();
		for(int i = 0; i<arr1.length; i++) {
			for(int j =0; j<arr2.length; j++) {
				if(Integer.parseInt(arr1[i])==Integer.parseInt(arr2[j])) {
					System.out.print(arr1[i] + " ");
					//commonElements.add(Integer.parseInt(arr1[i]));
					break;
				}
			}
		}
	}
}
