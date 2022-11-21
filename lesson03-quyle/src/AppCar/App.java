package AppCar;

public class App {
	public static void main(String[] args) {
		Customer KH1 = new Customer("123", "Nguyễn Thu Loan", "223", "Quảng Trị");
		Customer KH2 = new Customer("234", "Lê Minh Tính", "213", "Quảng Nam");
		Customer KH3 = new Customer("345", "Nguyễn Minh Triết", "523", "Huế");
		Customer KH4 = new Customer("456", "Lê Hữu Quý", "273", "Quảng Nam");

		Car c1 = new Car("Future Neo", "Blu", 35000000, 100);
		Car c2 = new Car("Ford Ranger", "Black", 250000000, 3000);
		Car c3 = new Car("Landscape", "White", 1000000000, 1500);

		UsingCar P1 = new UsingCar(c1, KH1);
		UsingCar P2 = new UsingCar(c2, KH2);
		UsingCar P3 = new UsingCar(c3, KH3);
		OutPut.OutPut();
		String title = "Tên chủ xe        Loại xe       Dung tích    Trị giá         Thuế phải nộp";
		for (int i = 0; i < title.length(); i++) {
			System.out.print("=");
		}
		System.out.println("");

		OutPut.OutPuta(P1);
		OutPut.OutPuta(P2);
		OutPut.OutPuta(P3);

	}
}
