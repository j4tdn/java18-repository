package vehicle.tax;

public class TaxPayingApp {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Lamborghini Aventador", "LB1", 250, 1000000);
		Vehicle v2 = new Vehicle("Range Rover", "RR3", 170, 150000);
		Vehicle v3 = new Vehicle("Mercedez E400", "250", 150, 200000);
		Vehicle v4 = new Vehicle("Super Cub", "C1", 50, 1000);
		Vehicle v5 = new Vehicle("Porche P4", "PP4", 210, 750000);

		Owner o1 = new Owner("Kevin", "123", "New York");
		Owner o2 = new Owner("Leo", "456", "California");
		Owner o3 = new Owner("Yang", "789", "Texas");
		Owner o4 = new Owner("Shin", "891", "New Jersey");

		TaxPaying tp1 = new TaxPaying(o1, v5);
		TaxPaying tp2 = new TaxPaying(o2, v1);
		TaxPaying tp3 = new TaxPaying(o3, v4);
		TaxPaying tp4 = new TaxPaying(o4, v3);
		TaxPaying[] tps = { tp1, tp2, tp3, tp4 };

		showBoard(tps);
	}

	public static void showBoard(TaxPaying[] tps) {
		System.out.printf("%-20s%-25s%-20s%-20s%s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println(
				"==================================================================================================");
		for (TaxPaying tp : tps) {
			tp.export();
		}
	}
}
