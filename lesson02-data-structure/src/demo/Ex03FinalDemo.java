package demo;

import bean.Item;

public class Ex03FinalDemo {
    public static void main(String[] args) {
        final  int digit = 14;
//        digit = 20;
        final Item i  = new Item(1,"Item 1",123);
        Item i2  = new Item(2,"Item 2",234);
        i.name="Item 4";
        System.out.println(i);


    }
}