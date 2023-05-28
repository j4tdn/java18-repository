package view.stream.exercise;

import bean.Transaction;
import model.DataModel;
import utils.PrintUtils;

import java.util.List;
import java.util.stream.Collectors;

public class Ex01TransactionApp {
    public static void main(String[] args) {
        List<Transaction> transactions = DataModel.getTransactions();

        // 1. Find all transactions in the year 2011 and sort them by value (small to high).
        PrintUtils.Print("1. Find all transactions in the year 2011 and sort them by value (small to high).",
                transactions.stream().filter(transaction -> transaction.getYear() == 2011).sorted((o1, o2) -> Math.toIntExact(o1.getValue() - o2.getValue()))
                        .collect(Collectors.toList()));

        // 2. Find all transactions have value greater than 300 and sort them by trader’s city
        PrintUtils.Print("2. Find all transactions have value greater than 300 and sort them by trader’s city",
                transactions.stream().filter(transaction -> transaction.getValue() > 300)
                        .sorted(((o1, o2) -> o1.getTrader().getCity().compareTo(o2.getTrader().getCity())))
                        .collect(Collectors.toList()));

        // 3. What are all the unique cities where the traders work?
        PrintUtils.Print("3. What are all the unique cities where the traders work? ",
                transactions.stream().distinct().collect(Collectors.groupingBy(t -> t.getTrader().getCity())));

        // 4. Find all traders from Cambridge and sort them by name desc.
        PrintUtils.Print("4. Find all traders from Cambridge and sort them by name desc.",
                transactions.stream().filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                        .sorted((o1, o2) -> o1.getTrader().getName().compareTo(o2.getTrader().getName()))
                        .collect(Collectors.toList()));

    }
}
