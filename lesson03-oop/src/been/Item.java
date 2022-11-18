package been;

public class Item {        // Những thông tin nào cần public thì hãy dùng punlic
	                       // còn  thông thường những thông tin thì cho private để class quản lý thông tin riêng của nó

       private int id;    
       private String name;
       private double salesPrice;
       private String origin;
  
      
       public Item(int id, String name, double salesPrice, String origin) {
    	   this.id = id;
    	   this.name = name;
    	   this.salesPrice = salesPrice;
    	   this.origin = origin;
       }
       //setter
       //r1.id = 10;
       public void setId(int id) {
    	   this.id = id;
       }
       //getter
       public int getId() {
    	   return this.id;
       }
       public void setName(String name) {
    	   this.name = name;
       }
       public String getName() {
    	   return this.name ;
       }
       public void setSalesPrice(double salesPrice) {
    	   this.salesPrice = salesPrice;
       }
       public double getSalesPrice() {
    	   return this.salesPrice ;
       }
       public void setOrigin(String origin) {
    	   this.origin = origin;
       }
       public String getOrigin() {
    	   return this.origin;
       }
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", origin=" + origin + "]";
	}
   
}

