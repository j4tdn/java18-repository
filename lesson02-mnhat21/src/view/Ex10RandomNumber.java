package view;

import java.util.Random;

public class Ex10RandomNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		int i1 = 20 + rand.nextInt(11);
		
		int i2 = 20 + rand.nextInt(11);
		while (i2 == i1) {
			i2 = 20 + rand.nextInt(11);
		}
		int i3 = 20 + rand.nextInt(11);
		while (i3 == i1 || i3 == i2) {
			i3 = 20 + rand.nextInt(11);
		}
		int i4 = 20 + rand.nextInt(11);
		while (i4 == i1 || i4 == i2 || i4 == i3) {
			i3 = 20 + rand.nextInt(11);
		}
		int i5 = 20 + rand.nextInt(11);
		while (i5 == i1 || i5 == i2 || i5 == i3 || i5 == i4) {
			i5 = 20 + rand.nextInt(11);
		}
		System.out.println("Random number from 20 to 30 --> " + i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5);
	}
}
