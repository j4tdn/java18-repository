package demo;

import been.Item;

public class Ex02ItemApp {
      public static void main(String[] args) {
		
    	  Item item1 = new Item(1,"Item1",100, "Viet Nam");
          Item item2 = new Item(2,"Item2",200, "Lao");
    	  double t1 =totalOfSalesPrice(item1, item2);
    	  System.out.println("TT của item1, item2 ==> "+ t1);
    	  
    	  
    	  Item item3 = new Item(1,"Item3",150, "Viet Nam");
          Item item4 = new Item(2,"Item4",250, "Lao");
    	  double t2 =totalOfSalesPrice(item3, item4);
    	  System.out.println("TT của item3, item4 ==> "+ t2);
     	  
    	  
    }
     private static double totalOfSalesPrice(Item item1, Item item2) {
    	 return item1.getSalesPrice() + item2.getSalesPrice();
     }
}
