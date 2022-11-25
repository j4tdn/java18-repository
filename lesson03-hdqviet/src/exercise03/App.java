package exercise03;

public class App {
	public static void main(String[] args) {
		Vehicle c1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 3500000);
		Vehicle c2 = new Vehicle("Le Minh Tính", "Ford Ranger", 3000, 250000000);
		Vehicle c3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 100000000);
		
		System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		
		VehicleUtils.export(c1);
		VehicleUtils.export(c2);
		VehicleUtils.export(c3);
	}
}
