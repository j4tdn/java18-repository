package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import utils.PrintUtils;

public class Ex01TransactionDemo {
	public static void main(String[] args) {
		Trader raoul = new Trader(1,"Raoul","Cambridge");
		Trader mario = new Trader(2,"Mario","Milan");
		Trader alan = new Trader(3,"Alan","Cambridge");
		Trader brian = new Trader(4,"Brian","Cambridge");
		List<Transaction> transactions = Arrays.asList(
				new Transaction(55,brian, 2011, 300L),
				new Transaction(66,raoul, 2012, 1000L),
				new Transaction(77,raoul, 2011, 400L),
				new Transaction(88,mario, 2012, 710L),
				new Transaction(99,mario, 2012, 700L),
				new Transaction(44,alan, 2012, 950L)
				);
		PrintUtils.print("1.Find all transactions in the year 2011 and sort them by value (small to high).",
				transactions.stream().filter(e->e.getTransactionYear()==2011).sorted(Comparator.comparing(Transaction::getTransactionValue)).collect(Collectors.toList()));
		PrintUtils.print("2.Find all transactions have value greater than 300 and sort them by trader’s city",
				transactions.stream().filter(e->e.getTransactionValue()>300).sorted(Comparator.comparing(Transaction::getTrader,Comparator.comparing(Trader::getCity))).collect(Collectors.toList()));
		PrintUtils.print("3.All the unique cities where the traders work", transactions.stream().map(Transaction::getTrader).map(Trader::getCity).distinct().collect(Collectors.toList()));
		PrintUtils.print("4.Find all trasactions of traders from Cambridge and sort them by tradername desc.", transactions.stream()
				.filter(e->e.getTrader().getCity().equals("Cambridge")).sorted(Comparator.comparing(t->t.getTrader().getName(),Comparator.reverseOrder())).collect(Collectors.toList()));
		PrintUtils.print("5.Return a string of all traders’ names sorted alphabetically.", transactions.stream()
				.map(Transaction::getTrader).map(Trader::getName).distinct().sorted().collect(Collectors.toList()));
		System.out.println("6.Are any traders based in Milan :"+ (transactions.stream().map(Transaction::getTrader).filter(e->e.getCity().equals("Milan")).distinct().count()>0?"Yes":"No"));
		System.out.println("7.Count the number of traders in Milan."+ transactions.stream().map(Transaction::getTrader).filter(e->e.getCity().equals("Milan")).distinct().count());
		PrintUtils.print("8.Print all transactions’ values from the traders living in Cambridge.", transactions.stream()
				.filter(e->e.getTrader().getCity().equals("Cambridge")).map(Transaction::getTransactionValue).collect(Collectors.toList()));
		PrintUtils.print("9.What’s the highest value of all the transactions?", transactions.stream().sorted(Comparator.comparing(Transaction::getTransactionValue).reversed()).map(Transaction::getTransactionValue).limit(1).collect(Collectors.toList()));
		PrintUtils.print("10.Find the transaction with the smallest value.", transactions.stream().sorted(Comparator.comparing(Transaction::getTransactionValue)).limit(1).collect(Collectors.toList()));
	}
}
