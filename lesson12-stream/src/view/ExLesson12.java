package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import bean.Trader;
import bean.Transaction;

public class ExLesson12 {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul","Cambridge");
		Trader mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
				);
		methodOne(transactions);
		methodTwo(transactions);
		methodThree(transactions);
		methodFour(transactions);
		methodFive(transactions);
		methodSix(transactions);
		methodSeven(transactions);
		methodEight(transactions);
		methodNight(transactions);
		methodTen(transactions);
	}
	private static void methodOne(List<Transaction> transactions) {
		List<Transaction> trans = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if(transaction.getTransactionYear() ==2011) {
				trans.add(transaction);
			}
		}
		trans.sort(Comparator.comparing(Transaction::getTransactionValue));
		System.out.println("All transactions in the year 2011 and sort them by value");
		trans.forEach(System.out::println);
		System.out.println("----------------------------------");
	}
	private static void methodTwo(List<Transaction> transactions) {
		List<Transaction> trans = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if(transaction.getTransactionValue()>300) {
				trans.add(transaction);
			}
		}
		trans.sort(Comparator.comparing(Transaction::getTrader,Comparator.comparing(Trader::getCity)));
		System.out.println("All transactions have value greater than 300 and sort them by trader’s city");
		trans.forEach(System.out::println);
		System.out.println("----------------------------------");
	}
	private static void methodThree(List<Transaction> transactions) {
		Set<String> city = new TreeSet<>();
		for (Transaction transaction : transactions) {
				city.add(transaction.getTrader().getCity());
		}
		System.out.println("All the unique cities where the traders work");
		city.forEach(System.out::println);
		System.out.println("----------------------------------");
	}
	private static void methodFour(List<Transaction> transactions) {
		List<Trader> traders = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if(transaction.getTrader().getCity().equals("Cambridge")) {
				traders.add(transaction.getTrader());
			}
		}
		traders.sort(Comparator.comparing(Trader::getName));
		Collections.reverse(traders);
		Set<Trader> sTraders = new LinkedHashSet<>(traders);
		System.out.println("All traders from Cambridge and sort them by name desc");
		sTraders.forEach(System.out::println);
		System.out.println("----------------------------------");
	}
	private static void methodFive(List<Transaction> transactions) {
		List<String> lName = new ArrayList<>();
		for (Transaction transaction : transactions) {
			lName.add(transaction.getTrader().getName());
		}
		Collections.sort(lName);
		Set<String> sName = new LinkedHashSet<>(lName);
		System.out.println("Return a string of all traders’ names sorted alphabetically");
		sName.forEach(System.out::println);
		System.out.println("----------------------------------");
	}
	private static void methodSix(List<Transaction> transactions) {
		List<Trader> trader = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if(transaction.getTrader().getCity().equals("Milan")) {
				trader.add(transaction.getTrader());
			}
		}
		Set<Trader> sName = new LinkedHashSet<>(trader);
		System.out.println("Any traders based in Milan");
		sName.forEach(System.out::println);
		System.out.println("----------------------------------");
	}
	private static void methodSeven(List<Transaction> transactions) {
		List<Trader> trader = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if(transaction.getTrader().getCity().equals("Milan")) {
				trader.add(transaction.getTrader());
			}
		}
		Set<Trader> sName = new LinkedHashSet<>(trader);
		System.out.println(sName.size()+" traders in Milan !");
		System.out.println("----------------------------------");
	}
	private static void methodEight(List<Transaction> transactions) {
		List<Transaction> trans = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if(transaction.getTrader().getCity().equals("Cambridge")) {
				trans.add(transaction);
			}
		}
		System.out.println("Print all transactions’ values from the traders living in Cambridge");
		trans.forEach(System.out::println);
		System.out.println("----------------------------------");
	}
	private static void methodNight(List<Transaction> transactions) {
		List<Transaction> trans = transactions;
		trans.sort(Comparator.comparing(Transaction::getTransactionValue));
		System.out.println("The highest value of all the transactions : "+trans.get(trans.size()-1));
		System.out.println("----------------------------------");
	}
	private static void methodTen(List<Transaction> transactions) {
		List<Transaction> trans = transactions;
		trans.sort(Comparator.comparing(Transaction::getTransactionValue));
		System.out.println("The transaction with the smallest value : "+trans.get(0));
	}
	
	
	
}
