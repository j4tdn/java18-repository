package Ex03;

import java.util.Scanner;

import bean.Vehicle;

public class Ex03App {
	public static void main(String[] args) {
		Vehicle[] vehicle = new Vehicle[100];
		int choice;
		Vehicle vhe;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Nhap thong tin va tao N doi tuong xe:");
			System.out.println("2.Xuat bang ke khai tien thue truoc ba cua cac xe.");
			System.out.println("3.Thoat chuong trinh.");
			choice = Integer.parseInt(sc.nextLine());
			if (choice == 1) {
				System.out.println("Nhap so doi tuong muon tao (N>0) :");
				int n = Integer.parseInt(sc.nextLine());
				vehicle = input(n);

			}
			if (choice == 2) {

				System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia",
						"Thue phai nop");
				System.out.println(
						"==============================================================================================");
				for (Vehicle veh : vehicle) {
					if (veh == null) {
						break;
					}
					show(veh);
				}

			}
			if (choice == 3) {
				System.exit(0);
			}
		} while (choice >= 1 && choice <= 3);

	}

	public static double tax(Vehicle v) {
		double tax;
		if (100 < v.getCapacity()) {
			tax = v.getPrice() / 100;
		} else if (v.getCapacity() <= 200) {
			tax = v.getPrice() * 3 / 100;
		} else {
			tax = v.getPrice() * 5 / 100;
		}
		return tax;

	}

	public static void show(Vehicle v) {
		System.out.printf("%-20s%-20s%-20s%-20s%s\n", v.getNameCarOwner(), v.getModel(), v.getCapacity(), v.getPrice(),
				tax(v));
	}

	public static Vehicle[] input(int n) {
		Vehicle[] vhe = new Vehicle[100];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Namecarowner:");
			String nameCarOwner = sc.nextLine();
			System.out.println("Enter Model:");
			String model = sc.nextLine();
			System.out.println("Enter Capacityr:");
			int capacity = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Price:");
			double price = Double.parseDouble(sc.nextLine());
			Vehicle vehicle = new Vehicle(nameCarOwner, model, capacity, price);
			vhe[i] = vehicle;
		}
		return vhe;
	}
}
