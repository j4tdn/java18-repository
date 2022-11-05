package data.object;

import bean.Item; // vì sao import mới dùng được
                  // chỉ ra mình dùng Item ở đâu

public class Ex02IttemDemo {
     public static void main(String[] args) {
		// Item có 3 thuộc tính: id, name , salesPrice(giá bán)
    	 // int     : KDL ==> int a = 5 (KDL nguyên thủy có 1  thông tin bên trong)
    	 // Integer : KDL ==> Integer b= new Integer(5)
    	 // Item    :KDL
    	 // new Item: đối tượng(giá trị)(ô nhớ HEAP)
    	 // Khi new Item thì nó  sẽ 
    	 //                          : tạo ra 1 ô nhớ HEAP
    	 //                          : giá trị măc định cho các thuộc tính
    	 
    	 
    	 
    	 Item i1 = null;
    	 Item i2 = new Item(); // đang làm ở ô H14
    	                       // new Item là đói tượng lưu trữ ở heap có 3 thông tin bên trong, những đối tượng này truyền vào i2
    	 
    	 // Lỗi -- NPE
    	 //System.out.println("i1 id: "   + i1.id);                     

         i2.id = 123;
         i2.name = "Item A123";
         
         
         System.out.println("i2 id: " +i2.id);
    	 System.out.println("i2 name: " + i2.name);
    	 System.out.println("i2 sp:"    + i2.salesPrice);
    	 
    	 //Tạo 1 đối tượng đặt tên biến là i3 có
    	 // id = 234, name = "Item B234", salesPrice = 20d
    	 // rồi in ra
    	 
    	 Item i3 = new Item(); //Khai báo i3 và khởi tạo ô nhớ
    	 i3.id= 234;           // gán giá trị
    	 i3.name="Item B234";  // gán giá trị
    	 i3.salesPrice= 20d;   // gán giá trị
    	 
    	
    	 
    	 
    	 System.out.println("i3 id: " +i3.id);
    	 System.out.println("i3 name: " +i3.name);
    	 System.out.println("i3 sp: " +i3.salesPrice);
    	  
    	
    	 
         Item i4= new Item(345, "Item C345", 30d);
         System.out.println("i4 ==> " +i4);
         //System.out.println("i4 ==> " +i4.toString());
         
         
       //Khái báo, khỏi tạo và gán giá trị vào
    	 Integer a1 = new Integer(125);
    	 System.out.println("a1 ==> " +a1);
    	 //System.out.println("a1 ==> " +a1.toString());
    	 
    	 
    	 //java class mặc định kế thừa từ class 'Object'
    	 //class Ohject ==> toString()
    	 //toString ==> getClas().getname() +"@" +hashcode()
    	 
    	 //Khi in ra biêns
    	 //KDL NT: giá trị ở STACK
    	 //KDL ĐT: tự đôngk gọi hàm to String của class Object
	}
		
}

