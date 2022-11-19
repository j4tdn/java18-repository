package been;

public class Item {
	//non-static
		public int id;
		public String name;
		public double salesPrice;
		
		// Hàm khởi tạo mặc định
		// Khởi tạo ra một đối tượng cho class hieenh tại
		// ==> trả về KDL Item
		
		public Item() {
		}

		public Item(int pId, String pName, double pSalesPrice) {
			this.id = pId;
			this.name = pName;
			this.salesPrice = pSalesPrice;
			
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.id + ", " + this.name + ", " + this.salesPrice ;
		}
}
