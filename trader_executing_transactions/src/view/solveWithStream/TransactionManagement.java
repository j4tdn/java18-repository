package view.solveWithStream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.TransactionData;

public class TransactionManagement {
	public static void main(String[] args) {
		List<Transaction> transactions = TransactionData.getTransactions();
		List<Trader> traders = TransactionData.getAllTraders();
		
	}
	public static  List<Transaction> findByYearAndSortByValue(List<Transaction> transactions){
		return transactions.stream().filter(e->e.getYear()==2011).collect(Collectors.toList());
	}
}
