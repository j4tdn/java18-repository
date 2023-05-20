package views;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;
import utils.PrintUtils;

public class StreamExercise {
	public static void main(String[] args) {
		List<Trader> traderList = DataModel.getTraders();
		List<Transaction> trasactionList = DataModel.getTransactions();
		
		List<Transaction> No1 = trasactionList.stream()
								.filter(t -> t.getYear() == 2011)
								.sorted(Comparator.comparing(Transaction::getValue))
								.collect(Collectors.toList());
		PrintUtils.print("1. Find all transactions in the year 2011 and sort them by value (small to high).", No1);
		
		List<Transaction> No2 = trasactionList.stream()
				.filter(t -> t.getValue() > 300)
				.sorted(Comparator.comparing((Transaction t) -> t.getTrader().getCity()))
				.collect(Collectors.toList());
		PrintUtils.print("2. Find all transactions have value greater than 300 and sort them by trader’s city", No2);
		
        List<String> No3 = trasactionList.stream()
                            .map(transaction -> transaction.getTrader().getCity())
                            .distinct()
                            .collect(Collectors.toList());

		PrintUtils.print("3. Find all the unique cities where the traders work?", No3);
		
        List<String> No4 = traderList.stream()
                .filter(t -> t.getCity() == "Cambridge")
                .sorted(Comparator.comparing(Trader::getName).reversed())
                .map(Trader::getName)
                .collect(Collectors.toList());

        PrintUtils.print("4. Find all traders from Cambridge and sort them by name desc.", No4);
        
        String No5 = traderList.stream()
                .sorted(Comparator.comparing(Trader::getName))
                .map(Trader::getName)
                .reduce("",(a,b) ->(a + " " + b).strip());

        System.out.println("5. Return a string of all traders’ names sorted alphabetically." + "\n" +No5);
        
        boolean No6 = trasactionList.stream()
                .map(Transaction::getTrader).distinct()
                .anyMatch(t -> t.getCity() == "Milan");

        System.out.println("6. Are any traders based in Milan?" + "\n" +No6);
        
        long No7 = trasactionList.stream()
                .map(Transaction::getTrader).distinct()
                .filter(t -> t.getCity() == "Milan")
                .count();

        System.out.println("7. Count the number of traders in Milan." + "\n" +No7);
        
        List<Integer> No8 = trasactionList.stream()
                .filter(t -> t.getTrader().getCity() == "Cambridge")
                .map(Transaction::getValue)
                .collect(Collectors.toList());

        System.out.println("8. Print all transactions’ values from the traders living in Cambridge." + "\n" +No8);
        
        Integer No9 = trasactionList.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue)
                .get();

        System.out.println("9. What’s the highest value of all the transactions?" + "\n" +No9);
        
        Transaction No10 = trasactionList.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .get();

        System.out.println("10. Find the transaction with the smallest value." + "\n" +No10);
 	}

}
