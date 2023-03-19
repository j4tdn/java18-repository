package view;

import java.util.Arrays;
import java.util.Scanner;

public class MissIT {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String N = ip.nextLine();
		int a = Integer.parseInt(N);
		String[] arrs = new String[a];
		int count = 0;
		for(int i = 0; i < a; i++) {
			String in = ip.nextLine();
			arrs[count++] = in;
		}
		Candidate[] candidates = new Candidate[10];
		count = 0;
		for(int j = 0; j < arrs.length; j++) {
			String[] temp = arrs[j].split(" ");
			for(int k = 1; k < Integer.parseInt(temp[0]) + 1; k++) {
				boolean check = true;
				for(int l = 0; l < candidates.length; l++) {
					if(candidates[l] != null && temp[k].equals(candidates[l].getId())) {
						check = false;
						break;
					}
				}
				if(check == true) {
					candidates[count] = new Candidate();
					candidates[count++].setId(temp[k]);
				}
			}
		}
		candidates = Arrays.copyOfRange(candidates, 0, count);
		
		
		for(int i = 0; i < arrs.length; i++) {
			String[] temp = arrs[i].split(" ");
			for(int j = 1; j <= Integer.parseInt(temp[0]); j++) {
				for(Candidate c : candidates) {
					if(c.getId().equals(temp[j])) {
						switch (j) {
						case 1:
							c.setScore(c.getScore() + 3);;
							break;
						
						case 2:
							c.setScore(c.getScore() + 2);;
							break;
							
						case 3:
							c.setScore(c.getScore() + 1);;
							break;

						default:
							break;
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(candidates));
	}
}
