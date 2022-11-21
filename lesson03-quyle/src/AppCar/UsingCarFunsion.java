package AppCar;

public class UsingCarFunsion {
	public static float calculate(UsingCar usingCar) {
		int totalOfMoney = 0;
		Car us = usingCar.getCar();
		totalOfMoney = us.getCost();
		if (us.getCc() > 200) {
			totalOfMoney = (int) (totalOfMoney * 0.05);
		}
		if (us.getCc() <= 200 && us.getCc() >= 100) {
			totalOfMoney = (int) (totalOfMoney * 0.03);
		}
		if (us.getCc() < 100) {
			totalOfMoney = (int) (totalOfMoney * 0.01);
		}
		return totalOfMoney;
	}

}
