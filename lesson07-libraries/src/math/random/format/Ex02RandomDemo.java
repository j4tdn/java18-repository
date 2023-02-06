package math.random.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Using : class Random(int, float, double), Math(float, double)
 * + Random number
 * + Random element(s) in array, list
 * + Shuffle (xáo, trộn) 
 * @author PC
 *
 */

public class Ex02RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("randNumber : " + rd.nextInt(10));
		
		// random a number from 'from(6)' to 'to(10)'
		System.out.println(6 + rd.nextInt(5));
		
		// rd.nextFloat() == Math.random() ==> [0.0 -> 1.0) * 10 --> [0.0 --> 10.0)
		System.out.println("randFNumber: " + rd.nextFloat() * 10);
		
		String[] students = {"Teo", "Nam", "An", "Le", "Van"};
		System.out.println("Random student : " + students[rd.nextInt(students.length)]);
		
		System.out.println("==== New Cards ====");
		List<String> cards = Arrays.asList("");
		
 	}
	
	private static List<Card> newCards(){
		String[] items = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		String[] atts = {"Heart", "Diamond", "club", "spade"};
		
		List<Card> cards = new ArrayList<>();
		for(String item : items) {
			for(String att : atts) {
				cards.add(new Card(item,att));
			}
		}
		return null;
	}
	
	public static class Card {
		private String item;
		private String att;
		
		public Card(String item, String att) {
			this.item = item;
			this.att = att;
		}
		
	}
}
