package data.object;

import bean.Item;

public class Ex02ItemDemo {
      public static void main(String[] args) {
            //ItemLid,name,salesPrice 
    	    //int:KDL ==>int a=5;
    	     //Item:KDL
    	  //new Item():đối tượng(giá trị )(ô nhớ HEAP)
    	  //tạo ra 1 ô nhớ ở HEAP
    	  //gán giá trị mặc định vào cho các thuộc tính
    	Item i4= new Item(345,"B345",30d);
    	System.out.println(i4);
     }
}
