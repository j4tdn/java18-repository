package bean;
/*
*Khai bao kieu du lieu Item gom : (ma mat hang , ten mat hang , gia ban)=>attributes
*class : KDL đối tượng
*class : có thẻ chưa nhiều thông tin
*class : giá trị của class là một đối tượng(ô nhớ ở HEAP)
 */
public class Item {
    public int id;
    public String name;
    public double salesPrice;
    //Hàm khởi tạo ra 1 đối tượng cho class hiện tại
    //==> trả về kiểu dữ liệu Item
    public  Item()
    {

    }

    public Item(int id, String name, double salesPrice) {
        this.id = id;
        this.name = name;
        this.salesPrice = salesPrice;
    }

    @Override //(định nghĩa lại từ lớp cha)

    public String toString() {
        return id + ", "+name +", "+salesPrice;
    }
}
