package data.object;

import bean.Item;

public class Ex03DataStorage {
    public static void main(String[] args) {
        Item i1 =new Item(1,"Item 1",11);
        Item i2 =new Item(2,"Item 2",12);
        System.out.println("i1 ->"+i1);
        System.out.println("i2 ->"+i2);
        modify(i1);
        System.out.println("i1 ->"+i1.id);

    }

    private static void modify(Item item) {
        item.id = 99;
        item = new Item(77,"Item 77",77);
        item.id = 88;
    }
}
