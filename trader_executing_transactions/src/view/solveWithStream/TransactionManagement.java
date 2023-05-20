package view.solveWithStream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.TransactionData;
import utils.PrintUtils;

public class TransactionManagement {
	public static void main(String[] args) {
		List<Transaction> transactions = TransactionData.getTransactions();
		PrintUtils.print("1. Find all transactions in the year 2011 and sort them by value",
				findByYearAndSortByValue(transactions));
		PrintUtils.print("2. Find all transactions have value greater than 300 and sort them by trader’s city",
				findGreater300AndSortByTraderCity(transactions));
		PrintUtils.print("3. What are all the unique cities where the traders work?", transactions.stream()
				.map(Transaction::getTrader).map(Trader::getCity).distinct().collect(Collectors.toList()));
		PrintUtils.print("4. Find all traders from Cambridge and sort them by name desc.",
				transactions.stream().filter(trans -> trans.getTrader().getCity().equals("Cambridge"))
						.sorted(Comparator.comparing(Transaction::getTrader,
								Comparator.comparing(Trader::getName, Comparator.reverseOrder()	)))
						.collect(Collectors.toList()));
		PrintUtils.print("5. Return a string of all traders’ names sorted alphabetically.", transactions.stream()
				.map(Transaction::getTrader).map(Trader::getName).distinct().collect(Collectors.toList()));
		PrintUtils.print("6. Are any traders based in Milan?",
				transactions.stream().map((Transaction trans) -> trans.getTrader())
						.filter(trader -> trader.getCity() == "Milan").map(Trader::getName).distinct().collect(Collectors.toList()));
		PrintUtils.print("7. Count the number of traders in Milan.", transactions.stream().map((Transaction trans) -> trans.getTrader())
				.filter(trader -> trader.getCity() == "Milan").map(Trader::getName).distinct().collect(Collectors.toList()).size());
	}

	public static List<Transaction> findByYearAndSortByValue(List<Transaction> transactions) {
		return transactions.stream().filter(e -> e.getYear() == 2011).sorted((o1, o2) -> o2.getValue() - o1.getValue())
				.collect(Collectors.toList());
	}

	public static List<Transaction> findGreater300AndSortByTraderCity(List<Transaction> transactions) {
		return transactions.stream().filter(e -> e.getValue() > 300)
				.sorted((o1, o2) -> o1.getTrader().getCity().compareTo(o2.getTrader().getCity()))
				.collect(Collectors.toList());
	}
}
