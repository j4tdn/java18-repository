//package test;
//
//import bean.Trader;
//import bean.Transaction;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Homework {
//    public static void main(String[] args) {
//        List<Transaction> transactionList = createListTransaction();
//        List<Transaction> hw1 = hw02(transactionList);
//        List<String> hw3 = hw03(transactionList);
//        List<String> hw5 = hw05(transactionList);
//        System.out.println(hw5);
//        System.out.println(hw09(transactionList));
//    }
//
//    private static List<Transaction> createListTransaction (){
//        Trader raoul = new Trader("Raoul", "Cambridge");
//        Trader mairo = new Trader("Mario", "Milan");
//        Trader alan = new Trader("Alan", "Cambridge");
//        Trader brian = new Trader("Brian", "Cambridge");
//
//        List<Transaction> transaction = Arrays.asList(
//                new Transaction(brian, 2011, 300),
//                new Transaction(raoul, 2012, 1000),
//                new Transaction(raoul, 2011, 400),
//                new Transaction(mairo, 2012, 710),
//                new Transaction(mairo, 2014, 100),
//                new Transaction(alan, 2012, 950)
//        );
//        return transaction;
//    }
//
//    // 1. Find all transactions in the year 2011 and sort them by value (small to high).
//    private static List<Transaction> hw01 (List<Transaction> transactionList){
//        List<Transaction> results = new ArrayList<>();
//        transactionList.forEach(transaction -> {
//            if(transaction.getYear() == 2011){
//                results.add(transaction);
//            }
//        });
//        results.sort((o1, o2) -> o1.getValue() - o2.getValue());
//        return results;
//    }
//
//    // 2. Find all transactions have value greater than 300 and sort them by trader’s city
//    private static List<Transaction> hw02 (List<Transaction> transactionList){
//        List<Transaction> results = new ArrayList<>();
//        transactionList.forEach(transaction -> {
//            if(transaction.getValue() > 300){
//                results.add(transaction);
//            }
//        });
//        results.sort((o1, o2)-> o1.getTrader().getCity().compareTo(o2.getTrader().getCity()));
//        return results;
//    }
//
//    // 3. What are all the unique cities where the traders work?
//    private static List<String> hw03 (List<Transaction> transactionList){
//        List<String> results = new ArrayList<>();
//        transactionList.forEach(transaction -> {
//            boolean check = true;
//            for(String city : results){
//                if(transaction.getTrader().getCity() == city){
//                    check = false;
//                    break;
//                }
//            }
//            if(check){
//                results.add(transaction.getTrader().getCity());
//            }
//        });
//        return results;
//    }
//
//    // 4. Find all traders from Cambridge and sort them by name desc.
//    private static List<Trader> hw04 (List<Transaction> transactionList){
//        List<Trader> results = new ArrayList<>();
//        transactionList.forEach(transaction -> {
//            if(transaction.getTrader().getCity().equals("Cambridge")){
//                results.add(transaction.getTrader());
//            }
//        });
//        results.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
//        return results;
//    }
//
//    // 5. Return a string of all traders’ names sorted alphabetically.
//    private static List<String> hw05 (List<Transaction> transactionList){
//        List<String> results = new ArrayList<>();
//        transactionList.forEach(transaction -> {
//            boolean check = true;
//            for(String name : results){
//                if(transaction.getTrader().getName().equals(name)){
//                    check = false;
//                    break;
//                }
//            }
//            if(check){
//                results.add(transaction.getTrader().getName());
//            }
//        });
//        results.sort((o1, o2) -> o1.compareTo(o2));
//        return results;
//    }
//
//    // 6. Are any traders based in Milan?
//    private static boolean hw06 (List<Transaction> transactionList, String city){
//        for(Transaction transaction : transactionList){
//            if(transaction.getTrader().getCity().equals(city)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    // 7. Are any traders based in Milan?
//    private static int hw07 (List<Transaction> transactionList, String city){
//        int count = 0;
//        for(Transaction transaction : transactionList){
//            if(transaction.getTrader().getCity().equals(city)){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    // 8. Print all transactions’ values from the traders living in Cambridge.
//    private static void hw08 (List<Transaction> transactionList, String city){
//        transactionList.forEach(transaction -> {
//            if(transaction.getTrader().getCity().equals(city)){
//                System.out.print(transaction.getValue() + " ");
//            }
//        });
//    }
//
//    // 9. What’s the highest value of all the transactions?
//    private static int hw09 (List<Transaction> transactionList){
//        int result = transactionList.get(0).getValue();
//        for(Transaction transaction : transactionList){
//            int value = transaction.getValue();
//            if(value > result){
//                result = value;
//            }
//        }
//        return result;
//    }
//
//    // 10. Find the transaction with the smallest value.
//    private static Transaction hw10 (List<Transaction> transactionList){
//        Transaction result = transactionList.get(0);
//        for(Transaction transaction : transactionList){
//            int value = transaction.getValue();
//            if(value < result.getValue()){
//                result = transaction;
//            }
//        }
//        return result;
//    }
//}
