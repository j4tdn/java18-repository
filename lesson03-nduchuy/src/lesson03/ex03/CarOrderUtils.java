package lesson03.ex03;


public class CarOrderUtils {
	public static double tax(CarOrder carOrder) {
		double tax = 0;
		for(Car car: carOrder.getCar()) {
			if(car.getCapacity()<100) {
				tax+=car.getPrice()*0.01;
			}else if(car.getCapacity()<200) {
				tax+=car.getPrice()*0.03;
			}else {
				tax+=car.getPrice()*0.05;
			}
		}
		return tax;
	}
	public static void show(CarOrder carOrder) {
		for(Car car: carOrder.getCar()) {
			System.out.printf("%-20s%-20s%-20s%-20s%s\n",carOrder.getCustomer().getName(),car.getType(),car.getCapacity(),car.getPrice(),CarOrderUtils.tax(carOrder));
		}
	}
}
