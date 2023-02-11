package math.random.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 
 * Using: class Random (Support for int, float, double) 
 * 	      or class Math (float, double)
 * 
 * + Random number
 * + Random element(s) in array, list
 * + Shuffle (xáo, trộn)
 *
 */
public class Ex02RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("Random number: " + rd.nextInt(10));
		
		// random a number from 'from(6)' to 'to(10)'
		System.out.println("Random number from 6 to 10: " + (6 + rd.nextInt(5)));
		
		// rd.nextFloat() <==> Math.random() --> [0.0 -> 1.0)*10 --> [0->10)
		System.out.println("Random number: " + (rd.nextFloat()*10));
		
		String[] students = {"A", "B", "C", "D", "E"};
		System.out.println("Rand student " + students[rd.nextInt(students.length)]);
		
		List<String> cards = Arrays.asList("");
		
	}
	// private static List<Card> newCards() {
	//	String[] items = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		//String[] atts = {"Cơ", "Rô", "Chuồn", "Bích"};
		
		// List<Card> cards = new ArrayList<>();

	}
	
	public static class Card {
		private String item; // 3 4 5 J Q A 2
		private String att; // Cơ, rô, chuồn, bích
		
		public Card() {
		}

		public Card(String item, String att) {
			super();
			this.item = item;
			this.att = att;
		}
		
	}
}
