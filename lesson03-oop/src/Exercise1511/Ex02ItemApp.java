package Exercise1511;

public class Ex02ItemApp {
	public static void main(String[] args) {
		Iteam item1 = new Iteam(1,"My goi", 3.500, "Da Nang");
		Iteam item2 = new Iteam(1,"Pho goi", 4.500, "Da Nang");
		double s = item1.getSalePrice() + item2.getSalePrice();
		System.out.println("Tong so tien 2 mon la: " +s );
	}
}
