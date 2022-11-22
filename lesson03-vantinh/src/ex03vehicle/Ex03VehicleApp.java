package ex03vehicle;

public class Ex03VehicleApp {
	public static void main(String[] args) {

		Vehicle v1 = new Vehicle("Nguyen Thi Thu Loan", "Future neo", 100, 35000000);
		Vehicle v2 = new Vehicle("Le Minh Tinh", "Ford Ranger", 3000, 255000000);
		Vehicle v3 = new Vehicle("Nuyen Minh Triet", "Landscape", 15000, 1000000000);

		System.out.printf( "%-20s%-20s%-20s%-20s%-20s\n", "Ten chu xe   " , "Loai xe   " , "Dung tich   " , " Tri gia   " , "Thue phai nop    ");
		System.out.println("==========================================================");

		show(v1);
		show(v2);
		show(v3);

	}

	public static double tax(Vehicle v) {
		int tax;
		if (100 < v.getCc()) {
			tax = v.getPrice()/100;
		}
		else if (v.getCc() <= 200) {
			tax = v.getPrice()*3/100;
		}
		else {
			tax = v.getPrice()*5/100;
		}
		return tax;
	}
	
	public static void show(Vehicle v) {
		System.out.printf("%-20s%-20s%-20s%-20s%s\n",v.getName(), v.getModel(),v.getCc(), v.getPrice(), tax(v));
	}
}
