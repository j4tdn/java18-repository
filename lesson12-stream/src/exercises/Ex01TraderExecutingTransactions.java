package exercises;

/**
 * Question: Build an application ‘trader executing transactions’ for your manager to
 * manage all system activities and answer following queries:
	1. Find all transactions in the year 2011 and sort them by value (small to high).
	2. Find all transactions have value greater than 300 and sort them by trader’s city
	3. What are all the unique cities where the traders work?
	4. Find all traders from Cambridge and sort them by name desc.
	5. Return a string of all traders’ names sorted alphabetically.
	6. Are any traders based in Milan?
	7. Count the number of traders in Milan.
	8. Print all transactions’ values from the traders living in Cambridge.
	9. What’s the highest value of all the transactions?
	10. Find the transaction with the smallest value.
 */

/*
public class Ex01TraderExecutingTransactions {
	public static void main(String[] args) {
		//List<Trader> traders = DataModel.getTraders();
		List<Transaction> trans = DataModel.getTransactions();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> transByYear = filter(trans, tran -> tran.getYear() == 2011);
		transByYear.sort(comparing(Transaction::getValue));
		transByYear.forEach(System.out::println);
		System.out.println("==================================\n");
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> transByValue = filter(trans, tran -> tran.getValue() > 300);
		transByValue.sort(comparing(Transaction::getTrader, comparing(Trader::getCity)));
		transByValue.forEach(System.out::println);
		System.out.println("==================================\n"); 
		
		// 3. What are all the unique cities where the traders work?
		Set<String> uniqueCities = findUniqueCities(trans);
		System.out.println("All the unique cities where the traders work --> " + uniqueCities);
		System.out.println("==================================\n"); 
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> traderFromCam = filter(traders, trader -> "Cambridge".equals(trader.getCity()));
		traderFromCam.sort(comparing(Trader::getName, reverseOrder()));
		traderFromCam.forEach(System.out::println);
		System.out.println("==================================\n"); 
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		String names = getTraderNames(traders);
		System.out.println("All traders’ names sorted alphabetically --> " + names);
		System.out.println("==================================\n"); 
		
		// 6. Are any traders based in Milan?
		boolean anyTraderFromMilan = anyTraderBasedInMilan(traders);
		System.out.println("Are any traders based in Milan? --> " + anyTraderFromMilan);
		System.out.println("==================================\n"); 
		
		// 7. Count the number of traders in Milan.
		int count = countTradersInMilan(traders);
		System.out.println("The number of traders in Milan --> " + count);
		System.out.println("==================================\n"); 
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		List<Transaction> tranValues = filter(trans, tran -> "Cambridge".equals(tran.getTrader().getCity()));
		tranValues.forEach(System.out::println);
		System.out.println("==================================\n"); 
		
		// 9. What’s the highest value of all the transactions?
		//int maxValue = findMaxValue(trans);
		//System.out.println("The highest value of all the transactions --> " + maxValue);
		//System.out.println("==================================\n"); 
		
		// 10. Find the transaction with the smallest value.
		//int minValue = findMinValue(trans);
		//System.out.println("The smallest value of all the transactions --> " + minValue);
	}

	private static <E> List<E> filter(List<E> lists, Predicate<E> predicate) {
		List<E> result = new ArrayList<>();
		for (E list : lists) {
			if (predicate.test(list)) {
				result.add(list);
			}
		}
		return result;
	}
	
	private static Set<String> findUniqueCities(List<Transaction> trans) {
	    Set<String> cities = new HashSet<>();
	    for (Transaction tran : trans) {
	        cities.add(tran.getTrader().getCity());
	    }
	    return cities;
	}
	
	private static String getTraderNames(List<Trader> traders) {
		traders.sort(comparing(Trader::getName));

		StringBuilder sb = new StringBuilder();
		for (Trader trader : traders) {
			sb.append(trader.getName()).append(", ");
		}
		return sb.toString().trim();
	}
	
	private static boolean anyTraderBasedInMilan(List<Trader> traders) {
	    for (Trader trader : traders) {
	        if ("Milan".equals(trader.getCity())) {
	            return true;
	        }
	    }
	    return false;
	}
	
	private static int countTradersInMilan(List<Trader> traders) {
		int count = 0; 
		for (Trader trader : traders) {
			if ("Milan".equals(trader.getCity())) {
				count++;
			}
		}
		return count;
	}
	
	/*
	private static int findMaxValue(List<Transaction> trans) {
		int max = Integer.MIN_VALUE;
		for (Transaction tran : trans) {
			if (tran.getValue() > max) {
				max = tran.getValue();
			}
		}
		return max;
	}
	
	private static int findMinValue(List<Transaction> trans) {
		int min = Integer.MAX_VALUE;
		for (Transaction tran : trans) {
			if (tran.getValue() < min) {
				min = tran.getValue();
			}
		}
		return min;
	}
	}
	*/


