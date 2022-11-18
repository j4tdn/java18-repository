package Ex03Vehicle;

public class Ex03App {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Nguyen thu loan", "Future Neo", 100, 35000000.0);
		Vehicle v2 = new Vehicle("Nguyen thu loan", "Ford Ranger", 3000, 250000000.0);
		Vehicle v3 = new Vehicle("Nguyen Minh Triet", "Landscape", 1500, 1000000000.0);
		
		System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
		System.out.println("==============================================================================================");
		show(v1);
		show(v2);
		show(v3);
	}
	
	public static double tax(Vehicle v) {
		int tax;
		if (100 < v.getCapacity()) {
			tax = v.getCapacity()/100;
		}
		else if (v.getCapacity() <= 200) {
			tax = v.getCapacity()*3/100;
		}
		else {
			tax = v.getCapacity()*5/100;
		}
		return tax;
		
	}
	
	public static void show(Vehicle v) {
		System.out.printf("%-20s%-20s%-20s%-20s%s\n",v.getName(), v.getModel(), v.getCapacity(), v.getPrice(), tax(v));
	}

}


