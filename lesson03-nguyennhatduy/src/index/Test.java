package index;

import java.util.Scanner;

import Homework.Vehicle;

public class Test {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Duy", "Future Neo", 100, 35000000);
		Vehicle v2 = new Vehicle("Cương", "ếch chiên bơ", 3000, 250000000);
		Vehicle v3 = new Vehicle("acd", "Version", 1500, 1000000000);

		System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
		System.out.println("==============================================================================================");
		show(v1);
		show(v2);
		show(v3);

	}

	public static double tax(Vehicle v) {
		int tax;
		if (100 < v.getCapacity()) {
			tax = v.getCapacity() * 1 / 100;
		} else if (v.getCapacity() <= 200) {
			tax = v.getCapacity() * 3 / 100;
		} else {
			tax = v.getCapacity() * 5 / 100;
		}
		return tax;

	}

	private static void show(Vehicle v) {
		// TODO Auto-generated method stub
		System.out.printf("%-20s%-20s%-20s%-20s%s\n",v.getName(), v.getModel(), v.getCapacity(), v.getPrice(), tax(v));

	}
}
