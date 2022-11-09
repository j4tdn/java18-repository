package control;

import javax.sound.midi.Soundbank;

public class Ex04LoopDoWhile {
	public static void main(String[] args) {
		int n = 12;
		//--> su dung while
		// B1. Neu BTDK == true ==> thuc hien phan body ==> B2
		// B2 Quay lai B1
		int i = 0;
		while(i < n) {
			System.out.println(i++ + " ");
		}
		
		System.out.println("\n========================");
		
		i = 0;
		while(true) {
			System.out.println(i++ + " ");
			if(i == n) {
				break;
			}
		
		}
		System.out.println("\nFinish...");
	}

}
