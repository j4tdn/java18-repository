package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Trader;
import bean.Transaction;
import model.TransactionData;

public class TransactionManagement {
	public static void main(String[] args) {

		List<Transaction> transactions = TransactionData.getTransactions();
		List<Trader> traders = TransactionData.getAllTraders();
		transactions.forEach(System.out::println);
		findByYearAndSortByValue(transactions, 2011);
		findGreater300AndSortByTraderCity(transactions);
		findTraderInCambridge(traders);
	}
	public static void findByYearAndSortByValue(List<Transaction> transactions,int year) {
		System.out.println("Transaction in "+year);
		List<Transaction> result = new ArrayList<>();
		for(Transaction transaction : transactions) {
			if(transaction.getYear() == year) {
				result.add(transaction);
			}
		}
		result.sort(Comparator.comparing(Transaction::getValue));
		result.forEach(System.out::println);
	}
//	public static int condition(Transaction s1,Transaction s2){
//		Trader t1 = s1.getTrader();
//		Trader t2 = s2.getTrader();
//		return t1.getCity().compareTo(t2.getCity());
//	};
	public static void findGreater300AndSortByTraderCity(List<Transaction> transactions) {
		System.out.println("Transaction has value greater than 300");
		List<Transaction> result = new ArrayList<>();
		for(Transaction transaction : transactions) {
			if(transaction.getValue() > 300) {
				result.add(transaction);
			}
		}
		result.sort((Transaction s1,Transaction s2)->{
			Trader t1 = s1.getTrader();
			Trader t2 = s2.getTrader();
			return t1.getCity().compareTo(t2.getCity());
		});
		result.forEach(System.out::println);
	}
	public static void findTraderInCambridge(List<Trader> traders) {
		System.out.println("Transaction in Cambridge");
		List<Trader> result = new ArrayList<>();
		for(Trader trader : traders) {
			if(trader.getCity() == "Cambridge") {
				result.add(trader);
			}
		}
		result.sort((Trader s1, Trader s2)->{
			return s2.getName().compareTo(s1.getName());
		});
		result.forEach(System.out::println);
	}
}
