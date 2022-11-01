package bean;
/*
 Khai báo kiểu dữ liệu mặt hàng (class) gồm:
 		==> attibutes (thuộc tính)
  		+ mã mặt hàng
  		+ tên mặt hàng
  		+ giá bán
 */
public class Item {
	
	public int id ;
	public String name ; 
	public double salesPrice ; 
	
	public Item ( ) {
		
		
	}
	  
	public Item (int pId , String pName , double pSalesPrice) {
		
		this.id = pId ; 
		this.name = pName ; 
		this.salesPrice = pSalesPrice ;
	}	
	@Override
	public String toString() {
		
		return this.id + "," + this.name +"," + this.salesPrice ;  
	
	}
	
	}


