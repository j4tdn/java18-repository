package view.stream.execrises;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

import java.util.List;
import java.util.stream.Collectors;

import bean.Transaction;
import model.DataModel;
import utils.PrintUtils;

public class Ex01TransactionApp {
	public static void main(String[] args) {
		List<Transaction> transactions = DataModel.getTransactions();
		
//		1. Find all transactions in the year 2011 and sort them by value (small to high).
//		2. Find all transactions have value greater than 300 and sort them by trader’s city
//		3. What are all the unique cities where the traders work?
//		4. Find all traders from Cambridge and sort them by name desc.
//		5. Return a string of all traders’ names sorted alphabetically.
//		6. Are any traders based in Milan?
//		7. Count the number of traders in Milan.
//		8. Print all transactions’ values from the traders living in Cambridge.
//		9. What’s the highest value of all the transactions?
//		10. Find the transaction with the smallest value.
		PrintUtils.print("1. Find all transactions in the year 2011 and sort them by value (small to high)", transactions.stream().filter(t -> t.getYear() == 2011).sorted(comparing(Transaction::getValue)).collect(Collectors.toList()));
		PrintUtils.print("2. Find all transactions have value greater than 300 and sort them by trader’s city", transactions.stream().filter(t -> t.getValue() > 300).sorted(comparing(t -> t.getTrader().getCity())).collect(Collectors.toList()));
		PrintUtils.print("3. What are all the unique cities where the traders work", transactions.stream().map(t -> t.getTrader().getCity()).distinct().collect(Collectors.toList()));
		PrintUtils.print("4. Find all transactions of traders from Cambridge and sort them by trader name desc", 
				transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity()))
				.sorted(comparing(t -> t.getTrader().getName(), reverseOrder()))
				.collect(Collectors.toList()));
	}
}
