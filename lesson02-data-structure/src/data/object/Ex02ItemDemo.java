package data.object;

import bean.Item;

public class Ex02ItemDemo {
    public static void main(String[] args) {
        //Item: ID,NAME,salesPrice
        //new Item() : giá trị -đối tượng -ô nhớ ở Heap
        //+tạo ra ô nhớ
        //+gán giá trị mặc định vào cho các thuộc tính
        Item i1 = null;
        Item i2 = new Item();
        //System.out.println("i1 id:"+i1.id);
        //lỗi NPE
        i2.name = "Item A15";

        i2.id = 15;
        System.out.println("i2 id:"+i2.id);
        System.out.println("i2 id:"+i2.name);
        System.out.println("i2 id:"+i2.salesPrice);
        Item i3 = new Item();
        i3.id=234;
        i3.name = "Item A234";
        i3.salesPrice =20d;
        System.out.println("i3 id:"+i3.id);
        System.out.println("i3 id:"+i3.name);
        System.out.println("i3 id:"+i3.salesPrice);
        Item i4 = new Item(345,"Item C345",40);
        System.out.println("i4 id:"+i4.id);
        System.out.println("i4 id:"+i4.name);
        System.out.println("i4 id:"+i4.salesPrice);
        System.out.println("i4 :"+i4);
    }
}
