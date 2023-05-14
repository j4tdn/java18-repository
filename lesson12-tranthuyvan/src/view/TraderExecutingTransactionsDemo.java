package view;

import static model.DataModel.getTraders;
import static model.DataModel.getTransactions;
import static utils.PrintUtils.print;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

/**
 * Question: Build an application ‘trader executing transactions’ for your manager to
 * manage all system activities and answer following queries:
	1. Find all transactions in the year 2011 and sort them by value (small to high).
	2. Find all transactions have value greater than 300 and sort them by trader’s city
	3. What are all the unique cities where the traders work?
	4. Find all traders from Cambridge and sort them by name desc.
	5. Return a string of all traders’ names sorted alphabetically.
	6. Are any traders based in Milan?
	7. Count the number of traders in Milan.
	8. Print all transactions’ values from the traders living in Cambridge.
	9. What’s the highest value of all the transactions?
	10. Find the transaction with the smallest value.
 */

public class TraderExecutingTransactionsDemo {
	public static void main(String[] args) {
		List<Trader> traders = getTraders();
		List<Transaction> transactions = getTransactions();
		
		List<Transaction> transByYear = transactions.stream()
								       .filter(tran -> tran.getYear() == 2011)
								       .sorted(Comparator.comparing(Transaction::getYear))
								       .collect(Collectors.toList());
		print("1. Find all transactions in the year 2011 and sort them by value (small to high)", transByYear);
		
		List<Transaction> transByValue = transactions.stream()
										.filter(tran -> tran.getValue() > 300)
										.sorted(Comparator.comparing(tran -> tran.getTrader().getCity()))
										.collect(Collectors.toList());
		print("2. Find all transactions have value greater than 300 and sort them by trader’s city", transByValue);		
		
		List<String> uniqueCities = traders.stream()
				.map(Trader::getCity)
				.distinct()
				.collect(Collectors.toList());
		print("3. What are all the unique cities where the traders work?", uniqueCities);	
		
		List<Trader> traderByCity = traders.stream()
				.filter(trader -> "Cambridge".equals(trader.getCity()))
				.sorted(Comparator.comparing(Trader::getName, Comparator.reverseOrder()))
				.collect(Collectors.toList());
		print("4. Find all traders from Cambridge and sort them by name desc", traderByCity);	
		
		String traderNames = traders.stream()
							.map(Trader::getName)
							.sorted()
							.collect(Collectors.joining(", "));
		System.out.println("\n5. Return a string of all traders’ names sorted alphabetically");
		System.out.println("-------------------------------");
		System.out.println(traderNames);
		System.out.println("------------------//////////////-----------------\n");
		
		boolean isMilan = traders.stream()
						.anyMatch(trader -> "Milan".equals(trader.getCity()));	
		System.out.println("\n6. Are any traders based in Milan?");
		System.out.println("-------------------------------");
		System.out.println(isMilan);
		System.out.println("------------------//////////////-----------------\n");
		
		long tradersInMilan = traders.stream()
							.filter(trader -> "Milan".equals(trader.getCity()))
							.count();	
		System.out.println("\n7. Count the number of traders in Milan");
		System.out.println("-------------------------------");
		System.out.println(tradersInMilan);
		System.out.println("------------------//////////////-----------------\n");
		
		List<Transaction> transInCity = transactions.stream()
				.filter(tran -> "Cambridge".equals(tran.getTrader().getCity()))
				.collect(Collectors.toList());
		print("8. Print all transactions’ values from the traders living in Cambridge", transInCity);	
	
		int highestValueOfTrans = transactions.stream()
								.map(Transaction::getValue)
								.reduce(Integer.MIN_VALUE, Math::max);
		System.out.println("\n9. What’s the highest value of all the transactions?");
		System.out.println("-------------------------------");
		System.out.println(highestValueOfTrans);
		System.out.println("------------------//////////////-----------------\n");
		
		Optional<Transaction> tranWithSmallestValue = transactions.stream()
												.min(Comparator.comparingInt(Transaction::getValue));	
		System.out.println("\n10. Find the transaction with the smallest value");
		System.out.println("-------------------------------");
		System.out.println(tranWithSmallestValue);
		System.out.println("------------------//////////////-----------------\n");		
	}
}