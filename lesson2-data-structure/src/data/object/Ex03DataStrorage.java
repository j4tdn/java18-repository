package data.object;

import bean.Item;

public class Ex03DataStrorage {
       public static void main(String[] args) {
    	     
		     Item i1 = new Item(1,"Item 1", 11); //HA
		     Item i2 = new Item(2,"Item 2", 12); //HB
		     
		     System.out.println("i1 ->"+ i1);
		     System.out.println("i2 ->"+ i2);
		     
		     //Toán tử = (gán) ==> gán ở STACK
		     i1 = i2; //i1(HB) I2(HB)
		     i2 = i1; //i1(HB) I2(HB)
		     
		     System.out.println("i1 id: " +i1.id);//2
		     
		     
		  modify(i1); //HB
		  System.out.println("modified i1 -->" +i1);
		  //id         : 99
		  //name       :Item2
		  //salesPrice :12
		  // cách làm : i1 đang trỏ đến HB
     
       }
       //modfify(i1(H1))
       private static void update(Item item) { //item vẫn là H1
    	   Item ic = item;        //Gán item cho ic nên ic = H1 modify(i1,item,ic(H1)
    	   item=new Item();       // item(H2) Tạo ô nhớ mới là H2
    	   item.id =33;           // H2(33)
    	   item.name = "Item 33"; //H2(33, Item 33)
    	   item = ic;             // Gán ic cho item => ic = H1
    	   item.id = 22;          // Gán 22 cho item.id = 22 nên item(H1(22))
       }
       //HB : 2,"Item 2", 12
       //HC : 77, Item 77, 77d
       // Item item(HB) = i1(HB); (lấy i1 gán với item nên nó cũng là HB)
       // item.id = 99; cập nhật lại id nên 
           // HB :99 ,"Item 2", 12
       //item = new Item(77, "Item 77", 77d); tạo ra ô nhớ HC
           // sau đó thành  Item item(HC) = i1(HB)
       //item.id=88 => HC : 88, Item 77, 77d
       private static void modify(Item item) {
    	   item.id = 99;
    	   item = new Item(77, "Item 77", 77d); //HC
    	   item.id = 88;
    	   
       }
}
