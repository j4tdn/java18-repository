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
		PrintUtils.printf("1. ", findByYearAndSortByValue(transactions));
		PrintUtils.printf("2. ", findGreater300AndSortByTraderCity(transactions));
		PrintUtils.printf("3. ", transactions.stream().map(Transaction::getTrader).map(Trader::getCity).distinct()
				.collect(Collectors.toList()));
		PrintUtils.printf("4. ",
				transactions.stream().filter(trans -> trans.getTrader().getCity().equals("Cambridge"))
						.sorted(Comparator.comparing(Transaction::getTrader, Comparator.comparing(Trader::getName,Comparator.reverseOrder())))
						.collect(Collectors.toList()));

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
