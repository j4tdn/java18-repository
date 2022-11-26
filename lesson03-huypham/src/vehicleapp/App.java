package vehicleapp;

public class App {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Huy Hay Ho", "Cup Én", 50, 150000, 0);
		Vehicle v2 = new Vehicle("�?ức �?�? �?en", "Sirius", 150, 25000, 0);
		Vehicle v3 = new Vehicle("Thái Thúi Thủm", "Winner", 250, 40000, 0);

		v1.findTax();
		v2.findTax();
		v3.findTax();

		System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println(
				"===============================================================================================");

		v1.show();
		v2.show();
		v3.show();
	}
}
