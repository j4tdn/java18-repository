package bean;

/*
 * Class : KDL Doi tuong
 * Class: co the chua nhieu thong tin
 * Class: Gia tri cua class laf doi tuong(o nho o HEAD)
 * Moi doi tuong se co gia tri tt khac nhau 
 * 
 Khai bao kieu du lieu mat hang gom 
 ==> attributes(thuoc tinh)
 + ma mat hang 
 + ten mat hang
 + gia ban
 */

public class Item {

	public int id;
	public String name;
	public double salesPrice;

	// Ham khoi tao
	public Item() {

	}
	
	public Item(int pId, String pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
		
	}
	
	@Override
	public String toString() {
		return this.id + "," + this.name + "," + this.salesPrice;
	}
	

}
