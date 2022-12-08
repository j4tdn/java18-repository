package exercise04;

import java.sql.Date;

public class CompanyDemo {
	public static void main(String[] args) {
		Employee e1 = new Staff("Kevin", Date.valueOf("1991-06-28"), 2.5f, "Center Attack Midfield");
		Employee e2 = new Staff("Leo", Date.valueOf("1987-06-24"), 3.5f, "Right Wing");
		Employee e3 = new HeadOfDepartment("Pep", Date.valueOf("1971-01-18"), 5.5f, 20);
		Employee e4 = new Director("Mubarak", Date.valueOf("1975-01-01"), 10f, 8f);
		Employee[] employees = {e1, e2, e3, e4};
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		System.out.println("===============================");
		for(Employee e : employees) {
			System.out.println(e.calcSalary());
		}
	}
}
