package view.solveWithStream;

import java.util.List;

import bean.Trader;
import bean.Transaction;
import model.TransactionData;

public class TransactionManagement {
	public static void main(String[] args) {
		List<Transaction> transactions = TransactionData.getTransactions();
		List<Trader> traders = TransactionData.getAllTraders();
		transactions.forEach(System.out::println);
	}
}
