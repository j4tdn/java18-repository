package excercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex05DailyExpense {
	public static void main(String[] args) {
		Map<String, Double> expenses = mockData();
		Map<String, Double> expenseMoreThan = expenses.entrySet().stream()
				.filter(expense -> expense.getValue() > 50000d)
				.collect(Collectors.toMap(expense -> expense.getKey(), expense -> expense.getValue()));
		printf(expenses);
		System.out.println("Expense more than 50000 ================");
		printf(expenseMoreThan);
//		 Map<String, Double> sortedExpenses = expenses.entrySet().stream()
//	                .sorted(Comparator.comparing(Map.Entry::getKey,Comparator.reverseOrder()))
//	                .collect(Collectors.toMap(
//	                        Map.Entry::getKey,
//	                        Map.Entry::getValue,
//	                        (oldValue, newValue) -> oldValue,
//	                        LinkedHashMap::new
//	                ));
		//TÌM NHỮNG CHI TIÊU LỚN HƠN 
        Map<String, Double> sortedExpenses = expenses.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByKey().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, //Khi trung key thì sẽ biết lấy key nào
                        LinkedHashMap::new
                ));
		System.out.println("Sort by key=====================");
		printf(sortedExpenses);
	}
	
	private static Map<String, Double> mockData() {
		Map<String, Double> result = new LinkedHashMap<>();
		result.put("Have Breafast and Drink Coffe", 20000d);
		result.put("Rent Hotel", 100000d);
		result.put("Buy ConDoms", 80000d);
		result.put("Go to Gym", 15000d);
		result.put("See Movie", 200000d);
		return result;
	}

	private static void printf(Map<String, Double> map) {
		// array, list --> for index, for each, iterate(iterable - collection)
		// map --> loop by key, value, entry
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + " --> " + map.get(key));
		}
	}
}
