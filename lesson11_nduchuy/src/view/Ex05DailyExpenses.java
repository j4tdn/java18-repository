package view;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ex05DailyExpenses {
	public static void main(String[] args) {
		Map<String, Double> expenses = new TreeMap<>();
		expenses.put("Drink Coffee", 20000d);
		expenses.put("Have Breafast", 30000d);
		expenses.put("Have Lunch", 70000d);
		expenses.put("Have Dinner", 60000d);
		expenses.put("Gym", 10000d);
//		expenseBiggerThan500(expenses);
//		sortByExpenseName(expenses);
		sortByExpenseValue(expenses);
	}

	public static void sortByExpenseName(Map<String, Double> expenses) {
		Map<String, Double> sortedExpenses = new TreeMap<>((k1, k2) -> {
			return k1.compareTo(k2);
		});
		sortedExpenses.putAll(expenses);
		System.out.println("=====Sort By Key=====");
		Set<Map.Entry<String, Double>> entrySet = expenses.entrySet();
		for (Map.Entry<String, Double> entry : entrySet) {
			System.out.println(entry.toString());
		}
		System.out.println("===============================================");
	}
	
	
	
	
	public static void expenseBiggerThan500(Map<String, Double> expenses) {
		Set<Map.Entry<String, Double>> entrySet = expenses.entrySet();
		System.out.println("=====Expense bigger than 50000=====");
		for (Map.Entry<String, Double> entry : entrySet) {
			if (entry.getValue() > 50000) {
				System.out.println(entry.toString());
			}
		}
		System.out.println("===============================================");
	}

	public static void sortByExpenseValue(Map<String, Double> expenses) {
		Map<String, Double> sortedExpenses = new TreeMap<>((k1, k2) -> {
			return expenses.get(k2).compareTo(expenses.get(k1));
		});
		sortedExpenses.putAll(expenses);
		System.out.println("=====Sort By Value=====");
		Set<Map.Entry<String, Double>> entrySet = sortedExpenses.entrySet();
		for (Map.Entry<String, Double> entry : entrySet) {
			System.out.println(entry.toString());
		}
		System.out.println("===============================================");
	}
}
