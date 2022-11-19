package lesson03.ex03;

public class CarApp {
	public static void main(String[] args) {
		Customer cs1 = new Customer("Nguyễn Thu Loan", 35);
		Customer cs2 = new Customer("Lê Minh Tính", 25);
		Customer cs3 = new Customer("Nguyễn Minh Triết", 55);
		
		Car c1 = new Car("Future Neo", 100, 35000000);
		Car c2 = new Car("Ford Ranger", 3000, 250000000);
		Car c3 = new Car("LandScape", 1500, 1000000000);
		
		CarOrder co1 = new CarOrder(cs1,new Car[] {c1});
		CarOrder co2 = new CarOrder(cs2,new Car[] {c2});
		CarOrder co3 = new CarOrder(cs3,new Car[] {c3});
		
		System.out.printf("%-20s%-20s%-20s%-20s%s\n","Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println("====================================================================================================");
		
		CarOrderUtils.show(co1);
		CarOrderUtils.show(co2);
		CarOrderUtils.show(co3);
	}
}
