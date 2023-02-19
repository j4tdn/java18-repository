package math.random.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex02RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("random: " + rd.nextInt(10));
		
		System.out.println("randnumber from 6 to 10: " + (6 + rd.nextInt(5)));
		
		System.out.println("randFnumber: " + (rd.nextFloat() * 10));
		
		String[] students = {"teo", "Nam", "an", "le", "van"};
		System.out.println("rand student: " + students[rd.nextInt(students.length)]);
		
		List<String> cards = Arrays.asList("");
	}
	private static List<Card> newCard(){
		String[] items = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		String[] atts = {"Cơ", "Rô", "Chuồn", "Bích"};
		
		List<Card> cards = new ArrayList<>();
		for (String item: items) {
			for (String att: atts) {
				cards.add(new Card());
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