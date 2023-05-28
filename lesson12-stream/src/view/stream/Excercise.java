package view.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Trader;
import bean.Transaction;
import model.DataModel;
import util.PrintUtils;

public class Excercise {
	public static void main(String[] args) {
		PrintUtils.print("1. Find all transactions in the year 2011 and sort them by value (small to high).", DataModel.getTransactions()
				.stream()
				.filter(e -> e.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList()));
		
		PrintUtils.print("2. Find all transactions have value greater than 300 and sort them by trader’s city", 
				DataModel.getTransactions().stream()
				.filter(e -> e.getValue() > 300)
				.sorted(Comparator.comparing(Transaction::getCityTrader)));
	
		PrintUtils.print("3. What are all the unique cities where the traders work?", 
				DataModel.getTransactions().stream()
				.map(Transaction::getCityTrader)
				.distinct().collect(Collectors.toList()));
		
		PrintUtils.print("4. Find all traders from Cambridge and sort them by name desc.",
				DataModel.getTransactions().stream()
				.filter(e -> e.getCityTrader().equals("Cambridge"))
				.sorted(Comparator.comparing(Transaction::getNameTrader, Comparator.reverseOrder()))
				.collect(Collectors.toList()));
	}
}
