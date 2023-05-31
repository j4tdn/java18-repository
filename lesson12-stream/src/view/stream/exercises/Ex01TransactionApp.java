package view.stream.exercises;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import static utils.PrintUtils.print;

import java.util.List;
import java.util.stream.Collectors;

import bean.Transaction;
import model.DataModel;

public class Ex01TransactionApp {
	public static void main(String[] args) {
		
		List<Transaction> transactions = DataModel.getTransactions();
		
		
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city 
		
		// 3. What are all the unique cities where the traders work?
		
		// 4. Find all transactions of traders from Cambridge and sort them by trader name descending.
		// Transaction::getValue           = t -> t.getValue()
		// Transaction::getTrader::getName = t -> t.getTrader().getName()
		print(
			"4. Find all transactions of traders from Cambridge and sort them by trader name descending",
			transactions.stream()
				.filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
				// .sorted(Comparator.comparing(Transaction::getValue))
				.sorted(comparing(t -> t.getTrader().getName(), reverseOrder()))
				.collect(Collectors.toList())
			);
		
		// JDBC --> Java Database Connectivity
		
		// ORM Framework --> Object Relational Mapping Framework --> built from JDBC
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		
		// 6. Are any traders based in Milan?
		
		// 7. Count the number of traders in Milan.
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		
		// 9. What’s the highest value of all the transactions?
		
		// 10. Find the transaction with the smallest value
	}
}
