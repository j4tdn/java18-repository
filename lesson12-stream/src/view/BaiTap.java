//package view;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import bean.Trader;
//import bean.Transaction;
//
//public class BaiTap {
//	public static void main(String[] args) {
//		Trader raoul = new Trader("Raoul", "Cambridge");
//		Trader mario = new Trader("Mario", "Milan");
//		Trader alan = new Trader("Alan", "Cambridge");
//		Trader brian = new Trader("Brian", "Cambridge");
//		
//		List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
//
//		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
//				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
//				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2011, 300));
//		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).");
//		Ex01(transactions);
//		
//		System.out.println("\n=====================================\n");
//		System.out.println("2. Find all transactions have value greater than 300 and sort them by trader’s city");
//		Ex02(transactions);
//		
//		System.out.println("\n=====================================\n");
//		System.out.println("3. What are all the unique cities where the traders work?");
//		Ex03(transactions);
//		
//		System.out.println("\n=====================================\n");
//		System.out.println("4. Find all traders from Cambridge and sort them by name desc.");
//		Ex04(traders);
//		
//		System.out.println("\n=====================================\n");
//		System.out.println("5. Return a string of all traders’ names sorted alphabetically.");
//		Ex05(traders);
//		
//		System.out.println("\n=====================================\n");
//		System.out.println("6. Are any traders based in Milan?");
//		Ex06(traders);
//		
//		System.out.println("\n=====================================\n");
//		System.out.println("7. Count the number of traders in Milan.");
//		Ex07(traders);
//		
//		System.out.println("\n=====================================\n");
//		System.out.println("8. Print all transactions’ values from the traders living in Cambridge.");
//		Ex08(transactions);
//		
//		System.out.println("\n=====================================\n");
//		System.out.println("9. What’s the highest value of all the transactions?");
//		Ex09(transactions);
//		
//		System.out.println("\n=====================================\n");
//		System.out.println("10. Find the transaction with the smallest value.");
//		Ex10(transactions);
//	}
//
//	private static void Ex01(List<Transaction> transactions) {
//		List<Transaction> trans = new ArrayList<>();
//		for (Transaction transaction : transactions) {
//			if (transaction.getYear() == 2011) {
//				trans.add(transaction);
//			}
//		}
//		trans.sort(Comparator.comparing(Transaction::getValue));
//		trans.forEach(System.out::println);
//	}
//	
//	private static void Ex02(List<Transaction> transactions) {
//		List<Transaction> trans = new ArrayList<>();
//		for (Transaction transaction : transactions) {
//			if (transaction.getValue() > 300) {
//				trans.add(transaction);
//			}
//		}
//		trans.sort(Comparator.comparing(Transaction::getCityTrader));
//		trans.forEach(System.out::println);
//	}
//	
//	private static void Ex03(List<Transaction> transactions) {
//		Set<String> trans = new HashSet<>();
//		for (Transaction transaction : transactions) {
//			trans.add(transaction.getCityTrader());
//		}
//		trans.forEach(System.out::println);
//	}
//	
//	private static void Ex04(List<Trader> traders) {
//		List<Trader> tras = new ArrayList<>();
//		for (Trader trader : traders) {
//			if ("Cambridge".equals(trader.getCity())) {
//				tras.add(trader);
//			}
//		}
//		tras.sort(Comparator.comparing(Trader::getName, Collections.reverseOrder()));
//		tras.forEach(System.out::println);
//	}
//	
//	private static void Ex05(List<Trader> traders) {
//		List<String> tras = new ArrayList<>();
//		for (Trader trader : traders) {
//				tras.add(trader.getName());
//		}
//		Collections.sort(tras);
//		tras.forEach(System.out::println);
//	}
//	
//	private static void Ex06(List<Trader> traders) {
//		boolean check = false;
//		for (Trader trader : traders) {
//			if ("Milan".equals(trader.getCity())) {
//				check = true;
//			}
//		}
//		if(check == true) {
//			System.out.println("YES");
//		} else {
//			System.out.println("NO");
//		}
//	}
//	
//	private static void Ex07(List<Trader> traders) {
//		int count = 0;
//		for (Trader trader : traders) {
//			if ("Milan".equals(trader.getCity())) {
//				count++;
//			}
//		}
//		System.out.println("There are " + count + " traders based in Milan");
//	}
//	
//	private static void Ex08(List<Transaction> transactions) {
//		List<Integer> values = new ArrayList<>();
//		for (Transaction transaction : transactions) {
//			if ("Cambridge".equals(transaction.getCityTrader())) {
//				values.add(transaction.getValue());
//			}
//		}
//		values.forEach(System.out::println);
//	}
//	
//	private static void Ex09(List<Transaction> transactions) {
//		transactions.sort(Comparator.comparing(Transaction::getValue, Collections.reverseOrder()));
//		System.out.println("highest value of all the transactions: " + transactions.get(0).getValue());
//	}
//	
//	private static void Ex10(List<Transaction> transactions) {
//		List<Transaction> trans = new ArrayList<>();
//		transactions.sort(Comparator.comparing(Transaction::getValue));
//		System.out.println("transaction with the smallest value: " + transactions.get(0));
//	}
//}
