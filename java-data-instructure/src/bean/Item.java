package bean;

/*
 *class : KDL đối tượng,có thể chứa nhiều thông tin,
 giá trị của class là đối tượng(ô nhớ ở HEAP),mỗi đối tượng sẽ có giá trị của các tt khác nhau
 
 Khai báo KDL mặt hàng() gồm : 
 ==>atributes(thuộc tính)
 +mã mặt hàng
 +tên mặt hàng 
 +giá bán
 */
public class Item {
	//non-static
    public int id;
    public String name;
    public double salesPrice;
    
    //Hàm"khởi tạo"mặc định
    //Khởi tạo ra một đối tượng cho class hiện tại
    //==>trả về KDL item 
    public Item(int pId, String pName, double pSalesPrice) {
        this.id=pId;
        this.name=pName;
        this.salesPrice=pSalesPrice;
    }
    @Override //(định nghĩa lại từ cha
    public String toString() {
    	// TODO Auto-generated method stub
    	return this.id+", "+ this.name+"; "+this.salesPrice;
    }

}
