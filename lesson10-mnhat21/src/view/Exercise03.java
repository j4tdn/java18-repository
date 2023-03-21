package view;

import bean.Item;

import java.util.ArrayList;
import java.util.List;

public class Exercise03 {
    public static void main(String[] args) {
        ArrayList<Item> itemList = itemList();
        System.out.println(highestSalesPriceItem(itemList));

    }

    public static ArrayList<Item> itemList(){
        ArrayList<Item> itemList = new ArrayList<>(List.of(
                new Item(1, "A", 25, 101),
                new Item(2, "B", 90, 102),
                new Item(1, "C", 88, 102),
                new Item(1, "D", 40, 101),
                new Item(1, "E", 60, 102),
                new Item(1, "F", 18, 101),
                new Item(1, "G", 77, 102)
        ));
        return itemList;
    }

    public static ArrayList<Item> highestSalesPriceItem(ArrayList<Item> input){
        ArrayList<Item> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < input.size(); i++){
            boolean check = true;
            for(int j = 0; j < temp.size(); j++){
                if(temp.get(j) != null && input.get(i).getStoreId() == temp.get(j)){
                    check = false;
                    break;
                }
            }
            if(check == true){
                temp.add(input.get(i).getStoreId());
            }
        }
        for(int i = 0; i < temp.size(); i++){
            double max = -9999;
            Item maxSalesPrice = new Item();
            for(int j = 0; j < input.size(); j++){
                if(input.get(j).getStoreId() == temp.get(i) && input.get(j).getSalesPrice() > max){
                    max = input.get(j).getSalesPrice();
                    maxSalesPrice = input.get(j);
                }
            }
            result.add(maxSalesPrice);
        }
        return result;
    }
}
