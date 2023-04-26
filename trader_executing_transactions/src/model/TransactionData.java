package model;

import java.util.Arrays;
import java.util.List;

import bean.Trader;
import bean.Transaction;


public class TransactionData {
	public TransactionData() {
		// TODO Auto-generated constructor stub
	}
	public static List<Transaction> getTransactions() {
		Trader Raoul = new Trader("Raoul", "Cambridge");
		Trader Mario = new Trader("Mario", "Milan");
		Trader Alan = new Trader("Alan", "Cambridge");
		Trader Brian = new Trader("Brian", "Cambridge");
		return Arrays.asList(new Transaction(Brian, 2011, 300),
				new Transaction(Raoul, 2011, 400), new Transaction(Raoul, 2012, 1000),
				new Transaction(Mario, 2012, 200), new Transaction(Mario, 2012, 1000),
				new Transaction(Alan, 2012, 950));
	}public static List<Trader> getAllTraders() {
		Trader Raoul = new Trader("Raoul", "Cambridge");
		Trader Mario = new Trader("Mario", "Milan");
		Trader Alan = new Trader("Alan", "Cambridge");
		Trader Brian = new Trader("Brian", "Cambridge");
		return Arrays.asList(Raoul,Mario,Alan,Brian);
	}
}
