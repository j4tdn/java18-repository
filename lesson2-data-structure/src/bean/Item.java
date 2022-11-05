package bean;
 /*
  * Class  : Kdl đối tượng
  * class  : có thể chứ nhiều thông tin
  * class : giá trị của class là đối tượng (ô nhớ ở HEAP)
  * Mỗi đối tượng sẽ có giá trị của các thuoctinh khác nhau
  * Khai báo dữ liệu mặt hàng(class) gồm
  * ==> những cái này là thuộc tính (attribues)
  * + mã mặt hàng
  * + tên mặt hàng
  * + giá bán
  */

public class Item {
	
      public int id;
      public String name;
      public double salesPrice;
	
    // hàm :public static int sum()  
      
	// Hàm "khởi tạo" mặc định "mình không tạo nhưng vẫn có)
    // Hàm khởi tạo giúp tạo ra một đối tượng cho class hiện tại
    // ==> thuộc KDL của hiện tại
      // ==> trả về KDL Item
    
      public Item() {
    	  
      }
      
      //external :  Item i4 = new Item(345, "Item C345",30);
      public  Item(int pId, String pName, double pSalesPrice) {
    	  this.id = pId;
    	  this.name = pName;
    	  this.salesPrice = pSalesPrice;
      }
	@Override  //(địnhk nghĩa lại từ cha)
	           //i1.toString()
	//i2.toString()
	//i3.toString() ==>id=234
	//i4.toString() ==>id 345
	// muốn in ra id,name, salesPrice
	//this : biến hiện tại đang gọi tos
	public String toString() {
		return this.id + "," + this.name +"," +this.salesPrice;
	}
}