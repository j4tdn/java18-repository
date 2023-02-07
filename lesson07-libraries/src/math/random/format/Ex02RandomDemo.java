package math.random.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Using: class Random(int, float, double), Math(float, double)
 * + Random number
 * + Random element(s) in array, list
 * + Shuffle(xáo, trộn)
 */
public class Ex02RandomDemo {
	// 1 2 3 -- shuffle - 1 3 2 || 1 2 3 || 2 1 3
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("randNumber: " + rd.nextInt(10));
		
		// random a number from 'from(6)' to 'to(10)'
		System.out.println("randNumber from 6 to 10: " + (6 + rd.nextInt(5)));
		
		// rd.nextFloat() <==> Math.random() ==> [0.0 -> 1.0) * 10 --> [0 -> 10)
		System.out.println("randFNumber: " + (rd.nextFloat() * 10));
		
		String[] students = {"Teo", "Nam", "An", "Le", "Van"};
		System.out.println("rand student: " + students[rd.nextInt(students.length)]);
	
		System.out.println("__ ** === New Cards === ** __");
		List<Card> cards = newCards();
		cards.forEach(System.out::println);
		
		System.out.println("__ ** === Shuffle === ** __");
		Collections.shuffle(cards);
		cards.forEach(System.out::println);
	}
	
	private static List<Card> newCards() {
		String[] items = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		String[] atts = {"Cơ", "Rô", "Chuồn", "Bích"};
		
		List<Card> cards = new ArrayList<>();
		for (String item: items) {
			for (String att: atts) {
				cards.add(new Card(item, att));
			}
		}
		
		return cards;
	}
	
	public static class Card {
		private String item; // 3 4 5 J Q K A 2
		private String att; // Cơ, Rô, Chuồn, Bích
		
		public Card() {
		}

		public Card(String item, String att) {
			this.item = item;
			this.att = att;
		}

		public String getItem() {
			return item;
		}

		public void setItem(String item) {
			this.item = item;
		}

		public String getAtt() {
			return att;
		}

		public void setAtt(String att) {
			this.att = att;
		}

		@Override
		public String toString() {
			return item + " " + att;
		}
	}
}
